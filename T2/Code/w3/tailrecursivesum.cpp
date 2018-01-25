#include <iostream>
using namespace std;

int tailrecsum(int n, int s = 0) {  // Halaendurkvæmt
    if (n <= 0) {
        return s;
    } else {
        return tailrecsum(n - 1, s + n);  // Útreikningum lokið!
    }
}

int main() {
    int i;
    cin >> i;
    cout << tailrecsum(i) << endl;
    return 0;
}