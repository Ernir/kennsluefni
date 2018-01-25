#include <iostream>

using namespace std;

class LegoTower {
   public:
    LegoTower(){};

    LegoTower(int height, int numPips) {
        this->height = height;
        this->numPips = numPips;
    }

    // Overload + operator to add two LegoTower objects.
    // The resulting tower will have the combined height
    // of and the lesser of their number of pips.
    LegoTower operator+(LegoTower lt) {
        LegoTower legoTower;
        legoTower.height = this->height + lt.height;
        legoTower.numPips = min(this->numPips, lt.numPips);
        return legoTower;
    }

    int numPips;
    int height;
};

int main() {
    LegoTower lt1(1, 4);
    LegoTower lt2(2, 2);

    LegoTower lt3 = lt1 + lt2;

    cout << lt3.height << endl;

    return 0;
}

/* SOURCE: Unknown. */