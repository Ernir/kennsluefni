#include <iostream>

using namespace std;

int main() {
    int age = 30;
    int* pointsToAge = &age;
    cout << "age is " << age << endl;
    // Use & to find the address in memory
    cout << "age is located at: " << pointsToAge << endl;
    return 0;
}