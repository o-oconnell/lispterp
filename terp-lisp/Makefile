
.PHONY: all test


all: Lisp.g4 EvalVisitor.java FunctionSymbol.java LispItem.java
	java -jar antlr-4.9.3-complete.jar -no-listener -visitor Lisp.g4 && javac -cp antlr-4.9.3-complete.jar *.java

test: all
	java -cp antlr-4.9.3-complete.jar:. Runner test.txt

run: all
	java -cp antlr-4.9.3-complete.jar:. Runner

clean:
	rm *.class
