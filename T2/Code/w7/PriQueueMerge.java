import edu.princeton.cs.algs4.MaxPQ;
import edu.princeton.cs.algs4.StdOut;

class PriQueueMerge {

    public static <Key> MaxPQ<Key> merge(MaxPQ<Key> pq1, MaxPQ<Key> pq2) {
        // Þessi aðferð á að skila nýrri forgangsbiðröð sem inniheldur öll stök sem voru í forgangsbiðröðunum <pq1> og <pq2>.

        // Spurningar til að hugsa um: Eyðileggjast forgangsbiðraðirnar sem teknar eru inn í þessari útfærslu? Er það nauðsynlegt?
        
        return new MaxPQ<Key>(); // Þessu þarf að breyta!
    }

    public static void main(String[] args) {
        /*
         * Prófar sameiningaraðferðina fyrir forgangsbiðraðir
         */

        // Búum til forgangsbiðröð oddatalna
        MaxPQ<Integer> odds = new MaxPQ<>();
        for (Integer i = 1; i < 10; i += 2) {
            odds.insert(i);
        }
        // Búum til forgangsbiðröð sléttra talna
        MaxPQ<Integer> evens = new MaxPQ<>();
        for (Integer j = 0; j < 10; j += 2) {
            evens.insert(j);
        }
        // Skoðum niðurstöðu sameiningarinnar
        MaxPQ<Integer> numbersBelow10 = merge(odds, evens);
        while (!numbersBelow10.isEmpty()) {
            StdOut.print(numbersBelow10.delMax() + " ");
        }
        StdOut.println("");
    }

}