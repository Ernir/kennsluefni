#include <iostream>

using namespace std;

int main() {

    int numSizes = 3;
    // pizzaSizes is a pointer to the first element!
    int *pizzaSizes = new int[numSizes]{9, 12, 15};

    // getting Pizza size values
    // by incrementing the pointer
    cout << *pizzaSizes << " ";
    pizzaSizes++;
    cout << *pizzaSizes << " ";
    pizzaSizes++;
    cout << *pizzaSizes << endl;

    // resetting pointer to first elements
    pizzaSizes--;
    pizzaSizes--;

    // same traversal, now using [ ]
    for (int i = 0; i < numSizes; i++) {
        cout << pizzaSizes[i] << " ";
    }
    cout << endl;

    return 0;
}