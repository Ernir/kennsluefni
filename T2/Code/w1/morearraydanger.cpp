#include <iostream>
int main() {
    int v[] = {3, 2, 1};
    int i = 3;
    while (v[i] == 0) {
        i++;
    }
    std::cout << v[i] << std::endl;
    return 0;
}
