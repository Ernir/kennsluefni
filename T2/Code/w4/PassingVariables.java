import edu.princeton.cs.algs4.StdOut;

public class PassingVariables {

    private static void incrementInt(int i) {
        i++;
    }

    private static void incrementInt(MyInt myInt) {
        myInt.increment();
    }

    public static void main(String[] args) {
        MyInt myInt = new MyInt(1);
        incrementInt(myInt);
        StdOut.println(myInt.getData());

        int primitiveInt = 1;
        incrementInt(primitiveInt);
        StdOut.println(primitiveInt);
    }

}
