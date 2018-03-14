class Stack {
    /*
    Represents a LIFO Stack of arbitrary size, using a linked list
    */
private:
    Node* head = nullptr;

public:

    void push(int n) {
        // Adds a new integer to the Stack
        this->head = new Node(n, this->head);
    }

    int pop() {
        // Removes and returns the latest integer to be pushed to the stack
        if (this->isEmpty()) {
            throw underflow_error("Attempted to pop from an empty Stack");
        }
        ???
    }

    bool isEmpty() {
        return this->head == nullptr;
    }
};