#include <iostream>
#include <vector>

using namespace std;

/*
  Dæmi um nokkrar mismunandi gerðir af lykkjum í C++
 */

int main() {
    vector<int> v = {0, 1, 2, 3, 4, 5};

    // Eftirfarandi þrjár lykkjur hafa sömu virkni
    for (int i = 0; i < v.size(); i++) {
        cout << v[i] << " ";
    }
    cout << endl;

    for (int i : v) {
        cout << i << " ";
    }
    cout << endl;

    for (auto i : v) {
        cout << i << " ";
    }
    cout << endl;
}