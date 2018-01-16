#include <iostream>

using namespace std;

class Node {
   public:
    Node* next;
    int data;

    Node(int data, Node* next) {
        this->data = data;
        this->next = next;
    }
};

int length(Node* head) {
    return 0;  // Hér þarf að skrifa kóða
}

Node* search(Node* head, int n) {
    return nullptr;  // Hér þarf að skrifa kóða
}

int main() {
    // Skilgreining lista sem inniheldur heiltölur
    Node* n5 = new Node(3, nullptr);
    Node* n4 = new Node(1, n5);
    Node* n3 = new Node(4, n4);
    Node* n2 = new Node(1, n3);
    Node* n1 = new Node(5, n2);
    Node* head = new Node(9, n1);

    cout << "Lengd listans er:                    6" << endl;
    cout << "Lengdin sem lengdarfallið skilar er: " << length(head) << endl;
    cout << endl;

    cout << "Lengd tóma listans er:               0" << endl;
    cout << "Lengdin sem lengdarfallið skilar er: " << length(nullptr) << endl;
    cout << endl;

    cout << "Minnissvæðið sem inniheldur hnút með gögnin \"3\" er:        " << n5 << endl;
    cout << "Minnissvæðið sem leitaraðferðin finnur með leit að \"3\" er: " << search(head, 3) << endl;
    cout << endl;

    cout << "Ekkert minnissvæði inniheldur hnút með gögnin \"6\"." << endl;
    cout << "Minnissvæðið sem leitaraðferðin finnur með leit að \"6\" er: " << search(head, 6) << endl;

    delete head;
    delete n1;
    delete n2;
    delete n3;
    delete n4;
    delete n5;

    return 0;
}