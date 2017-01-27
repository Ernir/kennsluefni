#include <iostream>
using namespace std;

long recsum(long n) { // Útreikningur á sum_{i=0}^n i
    if (n <= 0) {
        return 0;
    } else {
        return n + recsum(n-1); // Útreikningum ekki lokið
    }
}

int main() {
    long i;
    cin >> i;
    cout << recsum(i) << endl;
    return 0;
}