#include <iostream>
#include <vector>

using namespace std;

int main() {
    vector<int> vec(3); // dynamic array of int
    vec[0] = 365; vec[1] = -421; vec[2] = 789;

    cout << "Number of ints: " << vec.size() << endl;
    cout << "Enter another element to insert" << endl;
    int newValue = 0;
    cin >> newValue;
    vec.push_back(newValue);
    cout << "Number of ints: " << vec.size() << endl;
    cout << "Last element in array: ";
    cout << vec[vec.size() - 1] << endl;
    return 0;
}