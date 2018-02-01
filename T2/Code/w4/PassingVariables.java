import edu.princeton.cs.algs4.StdOut;

public class PassingVariables {

    private static void incrementInt(int i) {
        i++;
    }

    private static void incrementInt(IntegerBox myInt) {
        myInt.increment();
    }

    public static void main(String[] args) {
        IntegerBox myInt = new IntegerBox(1);
        incrementInt(myInt);
        StdOut.println(myInt.get());

        int primitiveInt = 1;
        incrementInt(primitiveInt);
        StdOut.println(primitiveInt);
    }

}
