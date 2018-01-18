#include <iostream>

using namespace std;

void increment_pointed(int* p) {
    /*
    Increments the value pointed to by p.
    */
    (*p)++;
}

void increment_value(int i) {
    /*
    Increments the value i. Then discards it.
    */
    i++;
}

int main() {
    int* j = new int;
    *j = 7;

    cout << "Fyrst er *j=" << *j << endl;
    increment_value(*j);
    cout << "Eftir að kallað er á increment_value er *j=" << *j << " (óbreytt)" << endl;
    increment_pointed(j);
    cout << "Eftir að kallað er á increment_pointed er *j=" << *j << endl;

    delete j;

    return 0;
}