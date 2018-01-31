#include <iostream>
#include <stdexcept>

using namespace std;

template <class T>
class SinglyLinkedList {
   private:
    class Node {
       public:
        Node* next;
        T data;

        Node(T data, Node* next) {
            this->data = data;
            this->next = next;
        }

        ~Node() {
            if (this->next != nullptr) {
                delete this->next;
            }
        }
    };

    Node* head;
    int length;

   public:
    SinglyLinkedList() {
        this->head = nullptr;
        this->length = 0;
    }

    ~SinglyLinkedList() { delete this->head; }

    int size() { return this->length; }

    void display() {
        for (Node* node = this->head; node != nullptr; node = node->next) {
            cout << node->data << " -> ";
        }
        cout << "Ø" << endl;
    }

    void prepend(T c) {
        this->head = new Node(c, this->head);
        this->length += 1;
    }

    void reverse() {
    }
};

int main() {
    // Skilgreining lista sem inniheldur tákn
    SinglyLinkedList<char> list;
    list.prepend('G');
    list.prepend('3');
    list.prepend('0');
    list.prepend('2');
    list.prepend('L');
    list.prepend('O');
    list.prepend('T');

    list.display();

    list.reverse();

    list.display();

    return 0;
}