class Node<T> {

    Node<T> next;
    T data;

    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
};