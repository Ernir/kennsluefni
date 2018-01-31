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

    ~Node() {
        if (this->next != nullptr) {
            delete this->next;
        }
    }
};

int length(Node* head) {
    /*
    head: bendir á hnút sem táknar upphaf eintengds lista
    skilar: lengd listans
     */
    if (head != nullptr) {
        return 1 + length(head->next);
    } else {
        return 0;
    }
}

bool hasCycle(Node* head) {
    /*
    head: bendir á upphaf eintengds lista
    skilar: sönnu ef listinn inniheldur hringvísun, annars ósönnu
    */
    Node* turtle = head;
    Node* hare = head;

    while (turtle && hare && hare->next) {
        turtle = turtle->next;
        hare = hare->next->next;

        if (turtle == hare) {
            return true;
        }
    }
    return false;
}

int main() {
    int n;
    srand(time(nullptr));  // Notum klukkuna til að upphafsstilla slembitölugjafann

    // Búum til lista með 100 til 1000 hnútum
    n = rand() % 900 + 100;
    Node* head1 = new Node(rand(), nullptr);
    Node* node = head1;
    for (int i = 0; i < n; i++) {
        node->next = new Node(rand(), nullptr);
        node = node->next;
    }
    if (hasCycle(head1)) {
        cout << "Listinn inniheldur hring" << endl;
    } else {
        cout << "Listinn er af lengd " << length(head1) << endl;
    }
    delete head1;

    // Búum til annan jafn langan lista, en í þetta skipti tengjum við hann í hring
    Node* head2 = new Node(rand(), nullptr);
    node = head2;
    for (int i = 0; i < n; i++) {
        node->next = new Node(rand(), nullptr);
        node = node->next;
    }
    node->next = head2;  // Tengjum listann í hring

    if (hasCycle(head2)) {
        cout << "Listinn inniheldur hring" << endl;
    } else {
        cout << length(head2) << endl;
    }

    // Aths: Við sleppum því að eyða hringtengda listanum vegna bókhaldsvandræðanna.
    return 0;
}