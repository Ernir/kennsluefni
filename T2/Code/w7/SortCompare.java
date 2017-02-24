import edu.princeton.cs.algs4.*;
import edu.princeton.cs.algs4.Insertion;

public class SortCompare {


    public static void main(String[] args) {
        /* Times insertion sort, merge sort and quicksort when run on numbers read from stdin.
         *
         * Example usage:
         * $ java SortCompare < numbers.txt
         */



        /*
         * Initial setup
         */

        // Reading numerical data from StdIn
        Integer[] originalInts = new Integer[100000];

        for (int i = 0; i < 100000; i++) {
            originalInts[i] = StdIn.readInt();
        }

        // Creating empty containers of various sizes
        Integer[] ints100k = new Integer[100000];
        Integer[] ints10k = new Integer[10000];
        Integer[] ints1h = new Integer[100];
        Integer[] ints10 = new Integer[10];

        // Calling methods on trivial arrays before actually measuring to reduce startup time
        Insertion.sort(new Integer[]{});
        Merge.sort(new Integer[]{});
        Quick.sort(new Integer[]{});
        long before, after;

        /*
         * 10 int sorting
         */

        // Insertion sort, 10 ints
        System.arraycopy(originalInts, 0, ints10, 0, 10);
        before = System.nanoTime();
        Insertion.sort(ints10);
        after = System.nanoTime();
        StdOut.println("Sorted 10 ints with insertion sort in:     " + (after - before) / 1000 + " μs");

        // Merge sort, 10 ints
        System.arraycopy(originalInts, 0, ints10, 0, 10);
        before = System.nanoTime();
        Merge.sort(ints10);
        after = System.nanoTime();
        StdOut.println("Sorted 10 ints with merge sort in:         " + (after - before) / 1000 + " μs");

        // Quicksort, 10 ints
        System.arraycopy(originalInts, 0, ints10, 0, 10);
        before = System.nanoTime();
        Quick.sort(ints10);
        after = System.nanoTime();
        StdOut.println("Sorted 10 ints with quicksort in:          " + (after - before) / 1000 + " μs");

        /*
         * 100 int sorting
         */

        // Insertion sort, 100 ints
        System.arraycopy(originalInts, 0, ints1h, 0, 100);
        before = System.nanoTime();
        Insertion.sort(ints1h);
        after = System.nanoTime();
        StdOut.println("Sorted 100 ints with insertion sort in:    " + (after - before) / 1000 + " μs");

        // Merge sort, 100 ints
        System.arraycopy(originalInts, 0, ints1h, 0, 100);
        before = System.nanoTime();
        Merge.sort(ints1h);
        after = System.nanoTime();
        StdOut.println("Sorted 100 ints with merge sort in:        " + (after - before) / 1000 + " μs");

        // Quicksort, 100 ints
        System.arraycopy(originalInts, 0, ints1h, 0, 100);
        before = System.nanoTime();
        Quick.sort(ints1h);
        after = System.nanoTime();
        StdOut.println("Sorted 100 ints with quicksort in:         " + (after - before) / 1000 + " μs");

        /*
         * 10000 int sorting
         */

        // Insertion sort, 10000 ints
        System.arraycopy(originalInts, 0, ints10k, 0, 10000);
        before = System.nanoTime();
        Insertion.sort(ints10k);
        after = System.nanoTime();
        StdOut.println("Sorted 10000 ints with insertion sort in:  " + (after - before) / 1000 + " μs");

        // Merge sort, 10000 ints
        System.arraycopy(originalInts, 0, ints10k, 0, 10000);
        before = System.nanoTime();
        Merge.sort(ints10k);
        after = System.nanoTime();
        StdOut.println("Sorted 10000 ints with merge sort in:      " + (after - before) / 1000 + " μs");

        // Quicksort, 10000 ints
        System.arraycopy(originalInts, 0, ints10k, 0, 10000);
        before = System.nanoTime();
        Quick.sort(ints10k);
        after = System.nanoTime();
        StdOut.println("Sorted 10000 ints with quicksort in:       " + (after - before) / 1000 + " μs");

        /*
         * 100000 int sorting
         */

        // Insertion sort, 100000 ints
        System.arraycopy(originalInts, 0, ints100k, 0, 100000);
        before = System.nanoTime();
        Insertion.sort(ints100k);
        after = System.nanoTime();
        StdOut.println("Sorted 100000 ints with insertion sort in: " + (after - before) / 1000 + " μs");

        // Merge sort, 100000 ints
        System.arraycopy(originalInts, 0, ints100k, 0, 100000);
        before = System.nanoTime();
        Merge.sort(ints100k);
        after = System.nanoTime();
        StdOut.println("Sorted 100000 ints with merge sort in:     " + (after - before) / 1000 + " μs");

        // Quicksort, 100000 ints
        System.arraycopy(originalInts, 0, ints100k, 0, 100000);
        before = System.nanoTime();
        Merge.sort(ints100k);
        after = System.nanoTime();
        StdOut.println("Sorted 100000 ints with quicksort in:      " + (after - before) / 1000 + " μs");

        // Insertion sort, 100000 presorted ints
        before = System.nanoTime();
        Insertion.sort(ints100k);
        after = System.nanoTime();
        StdOut.println("Sorted 100000 presorted ints with insertion sort in: " + (after - before) / 1000 + " μs");

        /*
        Results:

        Sorted 10 ints with insertion sort in:     26 μs
        Sorted 10 ints with merge sort in:         55 μs
        Sorted 10 ints with quicksort in:          48 μs
        Sorted 100 ints with insertion sort in:    597 μs
        Sorted 100 ints with merge sort in:        95 μs
        Sorted 100 ints with quicksort in:         169 μs
        Sorted 10000 ints with insertion sort in:  138062 μs
        Sorted 10000 ints with merge sort in:      3967 μs
        Sorted 10000 ints with quicksort in:       6914 μs
        Sorted 100000 ints with insertion sort in: 15739601 μs
        Sorted 100000 ints with merge sort in:     92562 μs
        Sorted 100000 ints with quicksort in:      21583 μs
        Sorted 100000 presorted ints with insertion sort in: 635 μs

         */
    }
}
