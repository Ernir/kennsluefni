import edu.princeton.cs.algs4.StdOut;

public class Cyclic {

    public static boolean isCyclic(String s, String t) {
        // Hér þarf að fylla inn í!
        return true;
    }

    public static void main(String[] args) {
        /*
         * Performs testing on the isCyclic method
         */
        String s = "synidaemi";
        String t = "nidaemisy";

        StdOut.println(isCyclic(s, t)); // Should print true

        s = "synidaemi";
        t = "imeadinys";

        StdOut.println(isCyclic(s, t)); // Should print false

        s = "synidaemi";
        t = "synidaemi";

        StdOut.println(isCyclic(s, t)); // Should print true

        s = "synidaemi";
        t = "synidaem";

        StdOut.println(isCyclic(s, t)); // Should print false
    }
}
