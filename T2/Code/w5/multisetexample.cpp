#include <iostream>
#include <set>

using namespace std;

int main() {
    // Dæmi um skilgreiningu á skjóðu í C++, innsetningu og ítrun
    multiset<int> ms;
    ms.insert(1);
    ms.insert(4);
    ms.insert(2);
    ms.insert(3);
    ms.insert(2);
    for (auto i : ms) {
        cout << i << " ";
    }
    cout << endl;
}