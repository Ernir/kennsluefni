#include <iostream>

using namespace std;

// Heiltala tekin inn sem gildi
void foo(int n) {
    n++; // Hefur engin áhrif utan fallsins
}

// Heiltala tekin inn sem vísun
void bar(int& m) {
    m++;
}

int main() {
    int i = 1;
    foo(i);
    cout << i << endl; // Skrifar út "1"

    int j = 1;
    bar(j);
    cout << j << endl; // Skrifar út "2"
}