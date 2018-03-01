import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class BSTTest {

    public static void main(String[] args) {
        /*
        Prófar min og max aðferðirnar í BST.java.
        */
        int n = 100;
        Integer[] a = new Integer[n];
        for (Integer i = 0; i < n; i++) {
            a[i] = i;
        }
        StdRandom.setSeed(28022018); // Samræmum slembitölugjafana
        StdRandom.shuffle(a); // Látum lyklana vera slembiraðaðar heiltölur
        BST<Integer, Integer> bst = new BST<>();
        for (Integer i = 0; i < n; i++) { // Látum gildin vera heiltölur í vaxandi innsetningarröð
            bst.put(a[i], i);
        }
        StdOut.println("Lægsti lykillinn í töflunni er:          " + bst.min());
        StdOut.println("Gildið sem samsvarar lægsta lyklinum er: " + bst.get(bst.min()));
        StdOut.println("Hæsti lykillinn í töflunni er:           " + bst.max());
        StdOut.println("Gildið sem samsvarar hæsta lyklinum er:  " + bst.get(bst.max()));

    }
}