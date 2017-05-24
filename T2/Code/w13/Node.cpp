class Node {
    /*
     * Represents a node for use in a singly linked list
     */
public:
    int data;
    Node* next;

    Node(int data, Node* next) {
        this->data = data;
        this->next = next;
    }
};