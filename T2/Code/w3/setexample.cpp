#include <iostream>
#include <set>
#include <string>

using namespace std;

int main() {

    // Showcasing the creation of std::set objects

    set <int> setOfInts; 
    set <string> setOfStrings {"Halló", "Hæ", "Bless"};

    setOfInts.insert(5);
    setOfInts.insert(3);
    setOfInts.insert(2);
    setOfInts.insert(3); // Nothing happens


    // Using range-based loops and automatic typing!
    for (auto item : setOfInts) {
        cout << item << endl;
    }

    return 0;
}