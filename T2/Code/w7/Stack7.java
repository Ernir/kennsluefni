import edu.princeton.cs.algs4.MaxPQ;
import edu.princeton.cs.algs4.StdOut;

class Stack7<Item> {
    /*
    A priqueue-based stack of generic Items.
     */

    private MaxPQ<Element> priQ;
    // Hér koma fleiri tilviksbreytur ef með þarf

    public Stack7() {
        // Þessu þarf að breyta!
    }

    public void push(Item item) {
        // Þessu þarf að breyta!
    }

    public Item pop() {
        return (Item) new Object(); // Þessu þarf að breyta!
    }

    public boolean isEmpty() {
        return true; // Þessu þarf að breyta!
    }

    public int size() {
        return 0; // Þessu þarf að breyta!
    }

    private static class Element<Key> implements Comparable<Element<Key>> {
        /*
        Class representing a pair, where one item is a generic key, and
        the other is a priority. Can be placed into a priority queue.
         */
        Integer priority;
        Key key;

        Element(Integer priority, Key key) {
            this.priority = priority;
            this.key = key;
        }

        @Override
        public int compareTo(Element<Key> element) {
            /*
            For use in a priqueue, elements must be Comparable.
            This defers implementation to Integer comparisons.
             */
            return this.priority.compareTo(element.priority);
        }
    }


    public static void main(String[] args) {
        /*
        Performs method testing for the PriQueue-based Stack class.
         */
        Stack7<String> stack = new Stack7<>();
        stack.push("!");
        stack.push("N");
        stack.push("N");
        stack.push("A");
        stack.push("B");
        stack.push("U");
        stack.push("S");
        stack.push("T");
        stack.push("Z"); // Oops, typo
        stack.pop(); // Fixing it
        stack.push("Í");
        stack.push("P");
        stack.push("S");
        stack.push("A");
        stack.push("N");
        stack.push("A");
        stack.push("N");
        stack.push("A");

        for (int i = 0; i < 6; i++ ) { // Testing repeated popping
            StdOut.print(stack.pop());
        }
        while(stack.size() > 5) { // Testing the size() method
            stack.pop();
        }
        while(!stack.isEmpty()) { // Testing the empty() method
            StdOut.print(stack.pop());
        }
        StdOut.println(""); // Closing the line, which should now read "ANANASBANN!"

    }


};