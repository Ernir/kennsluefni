#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void quicksort(vector<int> &v) {
// Hingað þarf að koma útfærsla á quicksort!
// Mælt er með því að fylgja hugmyndunum í Quick.java.
}

int main() {
    /*
     * Performs testing on the quicksort method
     */
    // Showing we can sort an empty vector
    vector<int> vector0 = {};
    int N = 0;
    cout << " 0 staka vigur fyrir röðun: ";
    for (int i : vector0) {
        cout << i << " ";
    }
    cout << endl;
    quicksort(vector0); // The actual sort
    cout << " 0 staka vigur eftir röðun: ";
    for (int i : vector0) {
        cout << i << " ";
    }
    cout << endl;

    // Showing we can sort a 1-element vector
    vector<int> vector1 = {5};
    N = 1;
    cout << " 1 staks vigur fyrir röðun: ";
    for (int i : vector1) {
        cout << i << " ";
    }
    cout << endl;
    quicksort(vector1); // The actual sort
    cout << " 1 staks vigur eftir röðun: ";
    for (int i : vector1) {
        cout << i << " ";
    }
    cout << endl;

    // Showing we can sort a short, "random" vector
    vector<int> array10 = {5, 8, 7, 2, 3, 9, 1, 4, 6, 0};
    N = 10;
    cout << "10 staka vigur fyrir röðun: ";
    for (int i : array10) {
        cout << i << " ";
    }
    cout << endl;
    quicksort(array10); // The actual sort
    cout << "10 staka vigur eftir röðun: ";
    for (int i : array10) {
        cout << i << " ";
    }
    cout << endl;

    // Showing we can sort a short vector in descending order
    vector<int> array10a = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    cout << "10 staka vigur fyrir röðun: ";
    for (int i : array10a) {
        cout << i << " ";
    }
    cout << endl;
    quicksort(array10a); // The actual sort
    cout << "10 staka vigur eftir röðun: ";
    for (int i : array10a) {
        cout << i << " ";
    }
    cout << endl;
}
