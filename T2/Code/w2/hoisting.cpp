/*
 * Forrit skrifað til að bregðast við nemendafyrirspurn um JS-style "hoisting"
 */

#include <iostream>
using namespace std;

void foo(); // "Forward declaration"
void bar() { cout << "bar" << endl; foo();}
void foo() { cout << "foo" << endl; }

int main() {
    bar();
    return 0;
}