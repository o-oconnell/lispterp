import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Arrays;
import java.lang.Math;
import java.util.stream.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;

// Parameterizing with Object allows typechecking
// at each return.
public class EvalVisitor extends LispBaseVisitor<Object> {

    // Symbol table
    Map<String, Object> memory = new HashMap<String, Object>();
    Map<String, FunctionSymbol> funcDefs = new HashMap<>();

    // Call stack
    Stack<FunctionSymbol> callStack = new Stack<>();    

    public boolean isNumeric(String s) {
	try {
	    Double.parseDouble(s);
	    return true;
	} catch (Exception e) {
	    return false;
	}
    }

    private Object resolve(String s) {
	// If it's in the formals of the topmost function symbol, return its corresponding actual
	if (callStack.size() > 0 && callStack.peek().formalsToActuals.containsKey(s)) {
	    return callStack.peek().formalsToActuals.get(s);
	} else { // Otherwise, check in the global memory space
	    if (memory.containsKey(s)) { return memory.get(s); }
	    else if (isNumeric(s)) { return Integer.parseInt(s); }
	    else { return s; }
	}
    }

    private void define(String s, Object value) {
	if (callStack.size() > 0) {
	    callStack.peek().formalsToActuals.put(s, value);
	} else {
	    memory.put(s, value);
	}
    }
    
    @Override
    public Object visitInp(LispParser.InpContext ctx) {
	Object value = visit(ctx.expr());

	if (value instanceof Integer) {
	    System.out.print(value);
	} else if (value instanceof LispItem) {
	    ((LispItem)value).print(); 
	} else if (value instanceof Boolean) {
	    if (value.equals(true)) System.out.print("T");
	    else System.out.print("NIL");
	} else if (value instanceof Double) {
	    System.out.print(value);
	} else if (value instanceof FunctionSymbol) {
	    System.out.print("(FUNCTION: " + ((FunctionSymbol)value).name + " (");
	    for (int i = 0; i < ((FunctionSymbol)value).formals.size(); ++i) {
		System.out.print(((FunctionSymbol)value).formals.get(i));
		if (i != ((FunctionSymbol)value).formals.size() - 1)
		    System.out.print(" ");
	    }
	    System.out.print("))");
	} else if (value instanceof String) {
	    System.out.print((String)value);
	}
	
	return null;
    }

    @Override
    public Object visitMapcar(LispParser.MapcarContext ctx) {

	// If the passed function is built in, we just need to execute it on each element
	String funcName = ((LispItem)visit(ctx.unevaluatedId())).atom;
	FunctionSymbol f = funcDefs.get(funcName);
	if (f == null) {
	    System.out.println("Error. " + funcName + " is not defined.");
	    return null;
	}

	List<LispItem> lisps = ctx.list().stream()
	    .map(l -> ((LispItem)visit(l)))
	    .collect(Collectors.toList());

	Integer minLen = lisps.stream()
	    .mapToInt(l -> l.atoms.size())
	    .min()
	    .getAsInt();

	LispItem result = new LispItem(false, "", new LinkedList<>());
	
	if (lisps.size() != f.formals.size()) {
	    System.out.println("Actual param quantity does not match formals. Fail.");
	    return null;
	} else {
	    for (int i = 0; i < minLen; ++i) {
		// Set actual params of function
		for (int j = 0; j < f.formals.size(); ++j) {
		    f.formalsToActuals.put(f.formals.get(j),
					   Integer.valueOf(lisps.get(j).atoms.get(i).atom));
		}
		
		// Push function onto stack
		callStack.push(f);

		// Get return value by visiting the function's body
		Object ret =  visit(f.body);

		// Pop function from stack
		callStack.pop();
		
		// Put return value into a new list
		result.atoms.add(new LispItem(true, String.valueOf(ret), null));
	    }
	}
	
	return result;
    }

    @Override
    public Object visitLambda(LispParser.LambdaContext ctx) {
	List<String> args = ctx.ide().stream()
	    .map(arg -> arg.getText())
	    .collect(Collectors.toList());
	
	return new FunctionSymbol("LAMBDA", args, ctx.expr());
    }
    
    @Override
    public Object visitSqrt(LispParser.SqrtContext ctx) {
	Integer val = (Integer)visit(ctx.getChild(2));
	return Math.sqrt(val);
    }
    
    @Override
    public Object visitExp(LispParser.ExpContext ctx) {
	Integer val = (Integer)visit(ctx.getChild(2));
	return Math.exp(val);
    }

    @Override
    public Object visitPow(LispParser.PowContext ctx) {
	Integer operand = (Integer)visit(ctx.getChild(2));
	Integer exponent = (Integer)visit(ctx.getChild(3));
	return Math.pow(operand, exponent);
    }
    
    @Override
    public Object visitIfstat(LispParser.IfstatContext ctx) {
	Boolean predicate = (Boolean)visit(ctx.getChild(2));
	if (predicate == true) {
	    return visit(ctx.getChild(3));
	} else {
	    return visit(ctx.getChild(4));
	}
    }

    @Override
    public Object visitSet(LispParser.SetContext ctx) {
	String id = ctx.ide().getText();
	
	if (resolve(id) == null) { // ID must have been defined already
	    return null;
	} else {
	    Object val = visit(ctx.getChild(3));
	    define(id, val);
	    return val;
	}
    }
    
    @Override
    public Object visitAnd(LispParser.AndContext ctx) {
	Boolean left = (Boolean)visit(ctx.getChild(2));
	Boolean right = (Boolean)visit(ctx.getChild(3));
	
	if (left && right) { return true; }
	else { return false; }
    }
    
    @Override
    public Object visitOr(LispParser.OrContext ctx) {
	Boolean left = (Boolean)visit(ctx.getChild(2));
	Boolean right = (Boolean)visit(ctx.getChild(3));
	
	if (left || right) { return true; }
	else { return false; }
    }
    
    @Override
    public Object visitNot(LispParser.NotContext ctx) {
    	Boolean child = (Boolean)visit(ctx.getChild(2));
	return !child;
    }

    @Override
    public Object visitLessThan(LispParser.LessThanContext ctx) {
	Integer left = (Integer)visit(ctx.getChild(2));
	Integer right = (Integer)visit(ctx.getChild(3));
	
	if (left < right) { return true; }
	else { return false; }
    }

    @Override
    public Object visitGreaterThan(LispParser.GreaterThanContext ctx) {
	Integer left = (Integer)visit(ctx.getChild(2));
	Integer right = (Integer)visit(ctx.getChild(3));
	
	if (left > right) { return true; }
	else { return false; }
    }

    @Override
    public Object visitLeq(LispParser.LeqContext ctx) {
	Integer left = (Integer)visit(ctx.getChild(2));
	Integer right = (Integer)visit(ctx.getChild(3));
	
	if (left <= right) { return true; }
	else { return false; }
    }

    @Override
    public Object visitGeq(LispParser.GeqContext ctx) {
	Integer left = (Integer)visit(ctx.getChild(2));
	Integer right = (Integer)visit(ctx.getChild(3));
	
	if (left >= right) { return true; }
	else { return false; }
    }
    
    @Override
    public Object visitEq(LispParser.EqContext ctx) {
	Integer left = (Integer)visit(ctx.getChild(2));
	Integer right = (Integer)visit(ctx.getChild(3));
	
	if (left == right) { return true; }
	else { return false; }

    }
    
    @Override
    public Object visitNeq(LispParser.NeqContext ctx) {
    	Integer left = (Integer)visit(ctx.getChild(2));
	Integer right = (Integer)visit(ctx.getChild(3));
	
	if (left != right) { return true; }
	else { return false; }
    }
    
    @Override public Object visitTrueBool(LispParser.TrueBoolContext ctx) { return true; }
    @Override public Object visitFalseBool(LispParser.FalseBoolContext ctx) { return false; }

    @Override
    public Object visitCons(LispParser.ConsContext ctx) {
	LispItem left = (LispItem)visit(ctx.getChild(2));
	LispItem right = (LispItem)visit(ctx.getChild(3));
	
	List<LispItem> atoms;
	if (right.isAtom == true) {
	    atoms = new LinkedList<>();
	} else {
	    atoms = new LinkedList<>(right.atoms);
	}
	
	atoms.add(0, left);
	
	return new LispItem(false, null, atoms);
    }

    @Override
    public Object visitUnevaluatedId(LispParser.UnevaluatedIdContext ctx) {
	return new LispItem(true, (String)visit(ctx.getChild(1)), null);
    }
    
    @Override
    public Object visitCar(LispParser.CarContext ctx) {
	// The third value matched is an evaluatable expr
	// (calling "visit" on non-parser rules does not actually work, also
	// cdr must be capable of taking expr to handle nested cdr/car)
  
	LispItem list = (LispItem)visit(ctx.getChild(2));
	if (list.isAtom == true) {
	    System.out.println("Fail. Cannot car an atom.");
	    return null;
	} else if (list.atoms.size() == 0) {
	    System.out.println("Fail. Cannot car an empty list.");
	    return null;
	} else {

	    // Return either atom or a list
	    LispItem first = list.atoms.get(0);
	    if (first.isAtom == true) {
		// Works because strings are immutable, so constructor will copy first.atom
		return new LispItem(true, first.atom, null);
	    } else {
		return new LispItem(false, null, new LinkedList<LispItem>(first.atoms));
	    }
	}
    }


    @Override
    public Object visitCdr(LispParser.CdrContext ctx) {
	// The third value matched is an evaluatable expr
	// (calling "visit" on non-parser rules does not actually work, also
	// cdr must be capable of taking expr to handle nested cdr/car)
	LispItem list = (LispItem)visit(ctx.getChild(2));
	LispItem listCopy = null;
	if (list.isAtom == true) {
	    System.out.println("Fail. Cannot cdr an atom.");
	} else if (list.atoms.size() == 0) {
	    System.out.println("Fail. Cannot cdr an empty list.");
	} else {
	    listCopy = new LispItem(false, null, new LinkedList<LispItem>(list.atoms));
	    listCopy.atoms.remove(0);
	}
	return listCopy;
    }

    // (define ID expr)
    @Override
    public Object visitDefine(LispParser.DefineContext ctx) {
	Object value = visit(ctx.getChild(3));
	define(ctx.ide().getText(), value);
	return value;
    }

    @Override
    public Object visitInt(LispParser.IntContext ctx) {
	Integer value = Integer.valueOf(ctx.INT().getText());
	return value;
    }

    @Override
    public Object visitIde(LispParser.IdeContext ctx) {
	Object resolvedValue = resolve(ctx.getChild(0).getText());
	return resolvedValue;
    }


    @Override
    public Object visitId(LispParser.IdContext ctx) {
	Object resolvedValue = resolve(ctx.ide().getText());
	return resolvedValue;
    }
    
    // Create a new function symbol in the global map
    // Iterate through each formal param, and add it to the params
    // in the function symbol.
    @Override
    public Object visitDefun(LispParser.DefunContext ctx) {
	List<LispParser.IdeContext> ids = ctx.ide();
	
	String name;
	if (ids.size() > 0) {
	    name = ids.get(0).getText();
	} else {
	    System.out.println("Function name was undefined");
	    return null;
	}

	// Zero or more ids after the first are parameters
	List<String> formals = new LinkedList<>();
	for (int i = 1; i < ids.size(); ++i) {
	    formals.add(ids.get(i).getText());
	}

	ParseTree body = ctx.expr();
	FunctionSymbol fs = new FunctionSymbol(name, formals, body);
	funcDefs.put(name, fs);

	return fs;
    }

    @Override
    public Object visitFuncall(LispParser.FuncallContext ctx) {

	FunctionSymbol f;
	Object closure = visit(ctx.getChild(1));
	if (closure instanceof String || closure instanceof Integer) {
	    f = funcDefs.get(closure);
	    if (f == null) {
		System.out.println(ctx.getChild(1).getText()
				   + " is not a function name; try using a symbol instead");
		return null;
	    }
	} else { // Otherwise, it should be a lambda function
	    f = (FunctionSymbol) closure;
	}

	List<LispParser.ExprContext> paramIDs = ctx.expr();
	if ((paramIDs.size() - 1) != f.formals.size()) {
	    System.out.println("Actual param quantity does not match formals. Fail.");
	    return null;
	}

	// Evaluate each expression, then place as actual parameter
	for (int i = 1; i < paramIDs.size(); ++i) {
	    Object o = visit(paramIDs.get(i));
	    f.formalsToActuals.put(f.formals.get(i-1), o);
	}
	
	// Push the function symbol onto the stack for variable resolution
	callStack.push(f);
	
	// Evaluate the contents of the function, resolving variable references
	// in the topmost function scope first
	Object retval = visit(f.body);

	// Pop the scope
	callStack.pop();
	
	return retval;
    }

    public Object visitAdd(LispParser.AddContext ctx) {
	int sum = 0;
	for (int i = 0; i < ctx.getChildCount(); ++i) {
	    Object val = visit(ctx.getChild(i));
	    if (val instanceof Integer) {
		sum += (Integer)val;
	    }
	}
	
	return sum;
    }

    public Object visitSub(LispParser.SubContext ctx) {
	List<LispParser.ExprContext> exprs = ctx.expr();

	
	Integer sum = (Integer) visit(exprs.get(0));

	if (exprs.size() < 2) {
	    return -1 * sum;
	}

	for (int i = 1; i < exprs.size(); ++i) {
	    sum -= (Integer) visit(exprs.get(i));
	}
	
	return sum;
    }
    
    public Object visitMul(LispParser.MulContext ctx) {
	List<LispParser.ExprContext> exprs = ctx.expr();
	
	Integer prod = (Integer) visit(exprs.get(0));

	if (exprs.size() < 2) {
	    return prod;
	}
	
	for (int i = 1; i < exprs.size(); ++i) {
	    prod *= (Integer) visit(exprs.get(i));
	}
	
	return prod;
    }

    public Object visitDiv(LispParser.DivContext ctx) {
	List<LispParser.ExprContext> exprs = ctx.expr();
	
	Integer quot = (Integer) visit(exprs.get(0));

	if (exprs.size() < 2) {
	    return quot;
	}
	
	for (int i = 1; i < exprs.size(); ++i) {

	    if ( ((Integer)visit(exprs.get(i))).equals(0)) {
		return "(ERROR divided by zero)";
	    }
	    
	    quot /= (Integer) visit(exprs.get(i));
	}
	
	return quot;
    }

    // Iterate through the list elements, make a new LispList object
    // which contains LispLists and LispAtoms
    @SuppressWarnings("unchecked")
    public Object visitList(LispParser.ListContext ctx) {
	List<LispItem> lisps = new LinkedList<>();

	for (int i = 0; i < ctx.getChildCount(); ++i) {
	    ParseTree p = ctx.getChild(i);

	    if (p instanceof LispParser.NestedListContext) {
		List<LispItem> res = (List<LispItem>)visit(p);
		lisps.add(new LispItem(false, null, res));
	    } else if (p instanceof LispParser.AtomContext) {
		lisps.add((LispItem)visit(p));
	    }
	}
	
	return new LispItem(false, null, lisps);
    }

    @SuppressWarnings("unchecked")
    public Object visitNestedList(LispParser.NestedListContext ctx) {
	List<LispItem> lisps = new LinkedList<>();

	for (int i = 0; i < ctx.getChildCount(); ++i) {
	    ParseTree p = ctx.getChild(i);
	    
	    if (p instanceof LispParser.NestedListContext) {


		lisps.add(new LispItem(false, null, (List<LispItem>)visit(p)));
	    } else if (p instanceof LispParser.AtomContext) {
		lisps.add((LispItem)visit(p));
	    }
	}
	
	return lisps;
    }

    public Object visitAtom(LispParser.AtomContext ctx) {
	String val = ctx.getChild(0).getText();
	return new LispItem(true, val, null);
    }
}
    
