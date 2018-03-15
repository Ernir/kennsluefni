import edu.princeton.cs.algs4.StdOut;

public class PrintHashes {
    public static void main(String[] args) {
        StdOut.println(".hashCode() fyrir heiltöluna 3:     " + new Integer(3).hashCode());
        StdOut.println(".hashCode() fyrir true:             " + Boolean.TRUE.hashCode());
        StdOut.println(".hashCode() fyrir double-töluna 3:  " + new Double(3).hashCode());
        StdOut.println(".hashCode() fyrir strenginn \"call\": "  + "call".hashCode());
    }
}