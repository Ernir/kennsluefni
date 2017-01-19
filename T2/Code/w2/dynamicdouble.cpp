#include <iostream>

using namespace std;

/*
Example program from:
https://www.tutorialspoint.com/cplusplus/cpp_dynamic_memory.htm
*/

int main() {

    double *pvalue = NULL; // Pointer initialized with null
    pvalue = new double;   // Request memory for the variable

    *pvalue = 29494.99;    // Store value at allocated address
    cout << "Value of pvalue : " << *pvalue << endl;

    delete pvalue;         // free up the memory.

    return 0;
}