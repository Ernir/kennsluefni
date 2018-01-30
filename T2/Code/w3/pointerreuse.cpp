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
        cout << "Kallað á eyði fyrir hnút í minnissvæði " << this << endl;
    }
};

int main() {
    Node* node1 = new Node(1, nullptr);
    Node* node2 = new Node(2, nullptr);
    cout << "node1 vísar á " << node1 << endl;
    cout << "node2 vísar á " << node2 << endl;
    delete node1;
    node1 = node2;
    cout << "node1 vísar á " << node1 << endl;
    cout << "node2 vísar á " << node2 << endl;
    delete node2;

    return 0;
}
