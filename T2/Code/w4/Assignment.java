import edu.princeton.cs.algs4.StdOut;

public class Assignment {
    public static void main(String[] args) {
        MyInt first = new MyInt(1);
        first.increment();
        MyInt second = first;
        second.increment();
        StdOut.println(first.getData());
        StdOut.println(second.getData());

    }
}
