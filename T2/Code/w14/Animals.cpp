#include <iostream>
using namespace std;

class Animal {
   public:
    void move() { cout << "Animal moves!" << endl; }
};
class Dog : public Animal {
   public:
    void move() { cout << "Dog runs!" << endl; }
};
void makeanimalmove(Animal* animal) {
    animal->move();
}
int main() {
    Dog yeller;
    makeanimalmove(&yeller);
    return 0;
}