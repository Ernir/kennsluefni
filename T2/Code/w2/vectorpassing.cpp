#include <iostream>
#include <vector>

using namespace std;

vector<double> pizzaArea(vector<double> sizes, int numSizes) {

    const double pi = 3.14;
    vector<double> areas(3);

    for (int i = 0; i < numSizes; i++) {
        areas[i] = sizes[i] * sizes[i] * pi;
    }
    return areas;
}

int main() {

    int numSizes = 3;
    vector<double> pizzaSizes {9, 12, 15};
    vector<double> areas(numSizes);

    // Fill up the areas vector
    areas = pizzaArea(pizzaSizes, numSizes);

    // Inspect what happened
    for (int i = 0; i < numSizes; i++) {
        cout << areas[i] << " ";
    }
    cout << endl;

    return 0;
}