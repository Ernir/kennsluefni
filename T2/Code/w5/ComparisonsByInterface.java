import edu.princeton.cs.algs4.StdOut;

public class ComparisonsByInterface {
    /*
    Dæmi um hagnýtingu á Comparable
     */
    private static boolean less(Comparable v, Comparable w) {
        // Ber saman tvö Comparable
        return v.compareTo(w) < 0;
    }

    public static void main(String[] args) {

        Double f1 = 1.4;
        Double f2 = 1.2;

        Integer i1 = 2;
        Integer i2 = 4;

        Node n1 = new Node<Character>('E', null);
        Node n2 = new Node<Character>('R', null);

        StdOut.println(less(f1, f2));
        StdOut.println(less(i1, i2));
        // Næsta lína getur ekki virkað, því (þessi) Node klasi útfærir ekki Comparable
        // StdOut.println(less(n1, n2));
    }

}