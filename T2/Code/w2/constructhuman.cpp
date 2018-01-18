#include <iostream>
#include <string>

using namespace std;

class Human {
   private:
    string name;
    int age;

   public:
    Human(string humansName, int humansAge) {
        this->name = humansName;
        this->age = humansAge;
        cout << "Overloaded constructor creates ";
        cout << this->name;
        cout << " of age " << this->age << endl;
    }

    void IntroduceSelf() {
        cout << "I am " + name << " and am ";
        cout << age << " years old" << endl;
    }
};

int main() {
    Human firstMan("Adam", 25);
    Human firstWoman("Eve", 28);
    firstMan.IntroduceSelf();
    firstWoman.IntroduceSelf();
}