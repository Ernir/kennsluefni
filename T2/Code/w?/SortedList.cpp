#include <iostream>

using namespace std;

class Node {
public:
    /*
     * Represents a generic "node" for storing an integer in a singly-linked list
     */
    Node *next;
    int data;

    Node(int data, Node *next) {
        this->data = data;
        this->next = next;
    }
};

class SortedList {
    /*
     * Represents a singly-linked list of integers in sorted order
     */

public:

    ~SortedList() {
        /*
         * Destructor.
         * The list may include a trail of dynamically allocated Nodes.
         * These must be cleaned up.
         */
        Node *temp;
        while (!this->isEmpty()) {
            temp = this->head;
            this->head = this->head->next;
            delete temp;
        }
    }

    void sortedInsert(int n) {
        // Hingað þarf að koma ykkar eigin aðferð!
    }

    void print() {
        /*
         * Prints out the list's values in a single, space-seperarated line
         */
        for (Node *node = this->head; node != nullptr; node = node->next) {
            cout << node->data << " ";
        }
        cout << endl;
    }

    bool isEmpty() {
        /*
         * True if this list contains no nodes, false otherwise
         */
        return this->head == nullptr;
    }

private:
    Node *head = nullptr;

};


int main() {

    SortedList *myList = new SortedList();

    myList->sortedInsert(2); // Checking if we can initialize a list
    myList->print(); // Should print "2"
    myList->sortedInsert(1); // Checking if we can prepend to a list
    myList->print(); // Should print "1 2"
    myList->sortedInsert(4); // Checking if we can append to a list
    myList->print(); // Should print "1 2 4"
    myList->sortedInsert(3); // Checking if we can insert into the middle of a list
    myList->print(); // Should print "1 2 3 4"

    delete myList;
    return 0;
}