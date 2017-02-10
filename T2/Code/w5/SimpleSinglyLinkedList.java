public class SimpleSinglyLinkedList<T> {
    /*
    Represents a singly linked list of generic Nodes.
     */

    private Node<T> head = null;
    private int n = 0;

    public int size() {
        /*
        Returns the number of nodes in this list.
        Updated in insert().
         */
        return this.n;
    }

    @Override
    public String toString() {
        /*
        Prints out the toString() representations of this list's nodes in a single line, space-separated.
         */
        Node<T> node = this.head;
        String representation = "";
        while (node != null) {
            representation += node.data.toString() + " "; // We're bleeding performance here!
            node = node.next;
        }
        return representation;
    }

    public void insert(int index, T data) {
        /*
        Creates a new node containing the data T, and inserts it so that its new index will be 0.
         */
        if (index < 0 || this.size() < index) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }

        if (this.head == null) { // Case 1 - initializing an empty list
            this.head = new Node<>(data, null);
        } else if (index == 0) { // Case 2 - prepending to nonempty list
            this.head = new Node<>(data, this.head);
        } else { // Case 3 and 4 - inserting in the middle of a list or at its end
            Node<T> node = this.head;
            int i = 0;
            while (node.next != null && i < index - 1) {
                node = node.next;
                i++;
            }
            node.next = new Node<>(data, node.next);
        }
        this.n++;
    }


    public static void main(String[] args) {

    }
}
