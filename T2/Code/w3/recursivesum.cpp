#include <iostream>
using namespace std;

int recsum(int n) {  // Útreikningur á sum_{i=0}^n i
    if (n <= 0) {
        return 0;
    } else {
        return n + recsum(n - 1);  // Útreikningum ekki lokið
    }
}

int main() {
    int i;
    cin >> i;
    cout << recsum(i) << endl;
    return 0;
}