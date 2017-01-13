#include <iostream>

using namespace std;

int main() {
    char sayHello[] = {'H', 'e', 'l', 'l', 'o', '\0'};
    cout << sayHello << endl;
    cout << "Size of array: " << sizeof(sayHello) << endl;
    cout << "Replacing char with null" << endl;
    sayHello[2] = '\0';
    cout << sayHello << endl;
    cout << "Size of array: " << sizeof(sayHello) << endl;
    return 0;
}