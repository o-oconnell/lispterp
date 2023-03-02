import java.util.List;
public class LispItem {

    public boolean isAtom;
    public String atom;
    public List<LispItem> atoms;

    public LispItem(boolean isAtom, String atom, List<LispItem> atoms) {
	this.isAtom = isAtom;
	if (isAtom == true) {
	    this.atom = atom;
	} else {
	    this.atoms = atoms;
	}
    }

    public void print() {
	if (isAtom == true) {
	    System.out.print(atom);
	} else {
	    System.out.print("(");

	    for (int i = 0; i < atoms.size(); ++i) {
		atoms.get(i).print();
		if (i != atoms.size() - 1) {
		    System.out.print(" ");
		}
	    }
	    System.out.print(")");
	}
    }
}
