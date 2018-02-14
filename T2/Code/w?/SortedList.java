import edu.princeton.cs.algs4.StdOut;

class SortedList {
    /*
     * Represents a singly-linked list of Comparables in sorted order
     */


    public void sortedInsert(Comparable data) {
        // Hingað þarf að koma ykkar eigin aðferð!
    }

    @Override
    public String toString() {
        /*
         * Returns a String representing the list's values as single, space-seperarated line
         */

        String string = "";
        for (Node node = this.head; node != null; node = node.next) {
            string += node.data.toString() + " ";
        }
        return string;
    }

    private Node head = null;

    private static class Node {
        /*
         * Node class storing data which can be compared using Comparable semantics
         */
        Node next;
        Comparable data;

        Node(Comparable data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String args[]) {

        SortedList myList = new SortedList();

        myList.sortedInsert(2); // Checking if we can initialize a list
        StdOut.println(myList.toString()); // Should print "2"
        myList.sortedInsert(1); // Checking if we can prepend to a list
        StdOut.println(myList.toString()); // Should print "1 2"
        myList.sortedInsert(4); // Checking if we can append to a list
        StdOut.println(myList.toString()); // Should print "1 2 4"
        myList.sortedInsert(3); // Checking if we can insert into the middle of a list
        StdOut.println(myList.toString()); // Should print "1 2 3 4"

    }
}