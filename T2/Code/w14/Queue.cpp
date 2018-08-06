#include <iostream>

using namespace std;

template <class T>
class Queue {
   private:
    class Node {
       public:
        T data;
        Node* next;

        Node(T data, Node* next) {
            this->data = data;
            this->next = next;
        }
    };

    Node* first = nullptr;
    Node* last = nullptr;

   public:
    Queue() {}

    void enqueue(T data) {
        // Hér þarf að bæta við kóða!
    }

    T dequeue() {
        if (this->isEmpty()) {
            throw underflow_error("No items in Queue");
        }
        // Hér þarf að bæta við kóða!
    }

    bool isEmpty() { return this->first == nullptr; }
};

int main(){};