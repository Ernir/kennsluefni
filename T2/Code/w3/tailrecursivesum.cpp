#include <iostream>
using namespace std;

long tailrecsum(long n, long s = 0) { // Halaendurkvæmt 
    if (n <= 0) {
        return s;
    } else {
        return tailrecsum(n-1,s+n); // Útreikningum lokið!
    }
}

int main() {
    long i;
    cin >> i;
    cout << tailrecsum(i) << endl;
    return 0;
}