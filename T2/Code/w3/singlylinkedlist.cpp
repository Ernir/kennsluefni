#include <iostream>
#include <stdexcept>

using namespace std;

class SinglyLinkedList {
   private:
    class Node {
       public:
        Node* next;
        char data;

        Node(char data, Node* next) {
            this->data = data;
            this->next = next;
        }
    };

    Node* head;
    int length;

   public:
    SinglyLinkedList() {
        this->head = nullptr;
        this->length = 0;
    }

    ~SinglyLinkedList() {
        // Hér þarf að bæta við kóða.
        // Almennt er óþarfi að láta eyði skrifa út, en hér er það gert til að við sjáum að á hann sé kallað:
        cout << "Kallað hefur verið á eyðinn fyrir listann" << endl;
    }

    int size() { return this->length; }

    void display() {
        for (Node* node = this->head; node != nullptr; node = node->next) {
            cout << node->data << " -> ";
        }
        cout << "Ø" << endl;
    }

    void prepend(char c) {
        // Hér þarf að bæta við kóða
    }

    char operator[](int n) {
        // Hér þarf að bæta við kóða
        
        // Allir listar eru of stuttir þegar engir eru hnútarnir
        throw out_of_range("Index out of range");
    }
};

int main() {
    // Skilgreining lista sem inniheldur tákn
    SinglyLinkedList list;
    list.prepend('G');
    list.prepend('3');
    list.prepend('0');
    list.prepend('2');
    list.prepend('L');
    list.prepend('O');
    list.prepend('T');

    list.display();

    cout << "Stak 0 í listanum er " << list[0] << endl;
    cout << "Stak 3 í listanum er " << list[3] << endl;

    return 0;
}