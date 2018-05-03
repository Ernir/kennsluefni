class Node {
   public:
    char data;
    Node* next;

    Node(char data, Node* next) {
        this->data = data;
        this->next = next;
    }
};

class SinglyLinkedList {
   private:
    Node* head = nullptr;
    int length = 0;

   public:
    void remove(int index) {
        // Skrifið þessa aðferð!
    }
};