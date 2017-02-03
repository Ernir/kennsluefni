import edu.princeton.cs.algs4.StdOut;

public class StaticExample {

    private static void foo() { // Klasaaðferð
        StdOut.println("Foo ran!");
    }

    private void bar() { // Tilviksaðferð
        StdOut.println("Bar ran!");
    }

    public static void main(String[] args) {
        StaticExample se = new StaticExample(); // Tilvik búið til
        foo(); // Í lagi
        // bar(); // villa
        se.foo(); // Undarlegt, en keyrist!
        se.bar(); // Í lagi
    }
}
