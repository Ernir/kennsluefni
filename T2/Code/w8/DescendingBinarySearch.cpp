#include <iostream>
#include <vector>

using namespace std;


int descendingBinarySearch(vector<int> v, int key) {
    // Skilar sætisnúmeri tölunnar key í lækkandi vigrinum v, sé key í v.
    // Skilar -1 sé key ekki í v.
    return -1;
}

int main() {
    /*
     * Performs testing on the descendingBinarySearch method
     */
    vector<int> tenDescending = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}; // 10 is a decent number
    vector<int> eightDescending = {8, 7, 6, 5, 4, 3, 2, 1}; // A number that is a power of 2
    vector<int> fiveDescending = {8, 6, 4, 2, 0}; // A number that is odd
    vector<int> oneDescending = {0};
    vector<int> noDescending = {};

    /*
     * In every case, we should see a series of ascending integers of the same length as the vector in question
     */
    for(int i: tenDescending) {
        cout << descendingBinarySearch(tenDescending, i) << " ";
    }
    cout << endl;
    for(int i: eightDescending) {
        cout << descendingBinarySearch(eightDescending, i) << " ";
    }
    cout << endl;
    for(int i: fiveDescending) {
        cout << descendingBinarySearch(fiveDescending, i) << " ";
    }
    cout << endl;
    for(int i: oneDescending) {
        cout << descendingBinarySearch(oneDescending, i) << " ";
    }
    cout << endl;
    for(int i: noDescending) {
        cout << descendingBinarySearch(noDescending, i) << " ";
    }
    cout << endl;
}
