#include <iostream>

using namespace std;

double* pizzaArea(double* areas, double* sizes, int numSizes) {
    /*
    Calculates the areas
    Inputs:
      areas: pointer to an array of doubles representing pizza radiuses
      sizes: pointer to an array of doubles to be filled with areas
      numSizes: integer number of elements in the arrays
    Output:
      areas: pointer to a now-populated array of doubles
    */
    const double pi = 3.14;

    for (int i = 0; i < numSizes; i++) {
        areas[i] = sizes[i] * sizes[i] * pi;
    }
    return areas;
}

int main() {

    int numSizes = 3;
    // Reserve numSpaces blocks of memory on the heap
    double* pizzaSizes = new double[numSizes] {9, 12, 15};
    double* areas = new double[numSizes];

    // Fill up the areas array
    areas = pizzaArea(areas, pizzaSizes, numSizes);

    // Inspect what happened
    for (int i = 0; i < numSizes; i++) {
        cout << areas[i] << " ";
    }
    cout << endl;

    delete pizzaSizes;
    delete areas;

    return 0;
}