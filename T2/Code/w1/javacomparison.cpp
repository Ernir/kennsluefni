#include <iostream>


bool flipBool(int n) {
    bool b = true;
    // Snúum sanngildi b við n sinnum
    for (int i = 0; i < n; i++ ) {
        b = !b;
    }
    return b;
}

bool isEven(int k) {
    return k % 2 == 0;
}


int main() {
    std::cout << flipBool(2) << std::endl;
    return 0;
}
