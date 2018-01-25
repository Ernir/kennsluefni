#include <iostream>
#include <string>

using namespace std;

void constructString() { // Showcase of two methods of string construction

    string explicitCall("We can pass a literal.");
    string smart = "The string constructor is smart!";
    cout << explicitCall << endl;
    cout << smart << endl;
}

void arrayAccess() { // Shows array-style access and modification

    string vertical = "vertical";
    vertical[3] = 'T';
    for (int i = 0; i < vertical.size(); i++) {
        cout << vertical[i] << endl;
    }
}

void stringComparison() { // Showcasing string comparisons

    string firstCat = "Brandur";
    string secondCat = "Brandur";
    cout << (firstCat == secondCat) << endl;
}

void charComparison() { // Comparing character comparisons to string comparisions! :)

    char firstDog[] = {'S', 'n', 'a', 't', 'i', '\0'};
    char secondDog[] = {'S', 'n', 'a', 't', 'i', '\0'};
    cout << (firstDog == secondDog) << endl;
}

void substring() { // Example of extracting a substring from another string

    string magic = "ABRACADABRA!";
    string cadab = magic.substr(4, 5);
    std::cout << cadab << endl;
}

int main() {
    constructString();
    arrayAccess();
    stringComparison();
    charComparison();
    substring();

    return 0;
}



