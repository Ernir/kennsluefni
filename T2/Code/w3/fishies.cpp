#include <iostream>

using namespace std;

class Fish {
   public:
    bool isFreshWaterFish;

    void swim() {
        if (isFreshWaterFish)
            cout << "Swims in lake" << endl;
        else
            cout << "Swims in sea" << endl;
    }
};

class Tuna : public Fish {
   public:
    Tuna() { isFreshWaterFish = false; }
};

class Carp : public Fish {
   public:
    Carp() { isFreshWaterFish = true; }
};

int main() {
    Carp myLunch;
    Tuna myDinner;
    cout << "About my food:" << endl;
    cout << "Lunch: ";
    myLunch.swim();
    cout << "Dinner: ";
    myDinner.swim();
    return 0;
}

/* SOURCE: Sam's Teach Yourself C++ in One Hour a Day, Lesson 10 */