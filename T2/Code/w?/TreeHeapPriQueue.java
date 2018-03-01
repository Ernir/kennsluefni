import edu.princeton.cs.algs4.StdOut;

// ATHS TIL NEMENDA: Nauðsynlegt er að útfæra aðferðirnar deleteMax og put.
// Sink og swim aðferðirnar er ekki nauðsynlegt að útfæra, hrúgunni má endurraða sem hluta af innsetningu
// og eyðingu ef það hentar betur.
// Leyfilegt er að útfæra fleiri aðferðir ef með þarf. Ekki þarf að nota allar aðferðirnar eða eiginleikana sem
// gefnir eru, en útfærslan þarf að vera þekkjanleg sem hrúga útfærð með hnútum og tengingum þeirra á milli.


public class TreeHeapPriQueue {
    /*
     * Represents a heap-based max-TreeHeapPriQueue of Strings.
     * The heap's values are stored in private nodes, the root being the maximum.
     * All levels are complete save for (possibly) the lowest.
     */
    private Node root;

    private static class Node {
        private String data;
        private Node left, right;
        private Node parent;
        int height;

        public Node(String val) {
            this.data = val;
            this.height = 0;
        }
    }

    public TreeHeapPriQueue() {
        /*
         * Initializes an empty priority queue
         */
        this.root = null;
    }

    public String deleteMax() {
        // Hér þarf að skrifa aðferð sem fjarlægir þann streng úr forgangsbiðröðinni
        // sem hefur hefur hæsta gildið skv. compareTo.
        return "";
    }

    public void put(String s) {
        // Hér þarf að skrifa aðferð sem setur nýjan streng í forgangsbiðröðina.
    }

    private static void sink(Node node) {
        // Hér *má* skrifa aðferð til að sökkva hnút sem hefur of lágt gildi miðað við staðsetningu hans í hrúgunni.
    }

    private static void swim(Node node) {
        // Hér *má* skrifa aðferð til að fleyta upp hnút sem hefur of hátt gildi miðað við staðsetningu hans í hrúgunni.
    }

    /***********************************************************************************
     * Nauðsynlegar hjálparaðferðir
     * Hér að neðan eru gefnar hjálparaðferðir sem eru nauðsynlegar fyrir keyrsludæmið.
     ***********************************************************************************/

    public boolean isEmpty() {
        return this.root == null;
    }

    private static void showHeap(int level, Node node) {
        /*
         * Writes a representation of a portion of the node's internal heap.
         * Use for debugging!
         */
        if (level > 0) {
            for (int i = 0; i < level * 2; i++)
                StdOut.print(" ");
        }

        if (node == null) { // Represent an empty node with "-"
            StdOut.println("-");
            return;
        }

        if (node.left != null || node.right != null) {
            StdOut.println("(" + node.data); // If the node has children, group them in parenthesis

            showHeap(level + 1, node.left); // Recursively display children
            showHeap(level + 1, node.right);

            for (int i = 0; i < level * 2; i++)
                StdOut.print(" "); // Print spaces for proper indentation

            StdOut.println(")");

        } else {
            StdOut.println(node.data);
        }
    }

    private void showHeap() {
        /*
         * Writes a representation of the priqueues' internal heap to StdOut.
         * Use for debugging!
         */
        showHeap(0, this.root);
        StdOut.println();
    }

    /*******************************************************************************
     * Valkvæmar hjálparaðferðir
     * Hér fyrir neðan eru hjálparaðferðir eru gefnar en þarf ekki endilega að nota.
     *******************************************************************************/

    private static boolean isLeaf(Node x) {
        return x.left == null && x.right == null;
    }

    private static int height(Node x) {
        if (x == null) {
            return -1;
        }
        return x.height;
    }

    private static void swap(Node a, Node b) {
        /*
         * Swaps the *data* of the given nodes.
         */
        String tmp = a.data;
        a.data = b.data;
        b.data = tmp;
    }

    public static void main(String[] args) {
        TreeHeapPriQueue pq = new TreeHeapPriQueue();

        pq.put("E");
        pq.put("A");
        pq.put("S");
        pq.put("Y");
        pq.put("Q");
        pq.put("U");
        pq.put("E");
        pq.put("S");
        pq.put("T");
        pq.put("I");
        pq.put("O");
        pq.put("N");

        pq.showHeap();

        System.out.println("------------");

        while (!pq.isEmpty()) {
            System.out.println("Removing: " + pq.deleteMax());
            System.out.println("Internal heap after removal:");
            pq.showHeap();
        }
    }
}