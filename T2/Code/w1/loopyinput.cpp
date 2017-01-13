#include <iostream>
#include <string>

using namespace std;

int main() {
    int n = 0;
    int i;
    while (cin >> i) {
        n += i;
    }
    cout << n << endl;
    return 0;
}