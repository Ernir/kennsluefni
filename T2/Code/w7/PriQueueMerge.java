import edu.princeton.cs.algs4.MaxPQ;
import edu.princeton.cs.algs4.StdOut;

class PriQueueMerge {

    public static <Key> MaxPQ<Key> merge(MaxPQ<Key> pq1, MaxPQ<Key> pq2) {
        // Þessi aðferð á að skila nýrri forgangsbiðröð sem inniheldur öll stök sem voru í forgangsbiðröðunum pq1 og pq2
        // Er hægt að gera það án þess að eyðileggja pq1 og pq2?
        return null; // Þessu þarf að breyta!
    }

    public static void main(String[] args) {
        /*
         * Performs a test on the merge method for priority queues.
         */

        // Creating a PQ of odd numbers
        MaxPQ<Integer> odds = new MaxPQ<>();
        for (Integer i = 1; i < 10; i += 2) {
            odds.insert(i);
        }
        // Creating a PQ of even numbers
        MaxPQ<Integer> evens = new MaxPQ<>();
        for (Integer j = 0; j < 10; j += 2) {
            evens.insert(j);
        }
        // Performing the merger
        MaxPQ<Integer> numbersBelow10 = merge(odds, evens);
        while (!numbersBelow10.isEmpty()) {
            StdOut.print(numbersBelow10.delMax() + " ");
        }
        StdOut.println("");
    }

}