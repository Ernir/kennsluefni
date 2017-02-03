import edu.princeton.cs.algs4.StdOut;

public class ObjectInstantiation {

    public static void main(String[] args) {

        A a = new A(); // Tilvik af heimasmíðuðum klasa búið til
        int primitiveInt = 1; // "Primitive" talan 1
        Integer boxedInt = new Integer(2); // Kallað beint á smið fyrir Integer klasann
        Integer autoBoxedInt = 2; // Virkar þökk sé "autoboxing"

        if (primitiveInt == 1) {
            StdOut.println("Runs if the int values are \"==\"");
        }
        //if (primitiveInt.equals(1)) Villa!

        if(boxedInt == autoBoxedInt) {
            StdOut.println("Runs if the Integer values are \"==\"");
        }
        if (boxedInt.equals(autoBoxedInt)) {
            StdOut.println("Runs if the Integer values are \"equal\"");
        }
    }
}
