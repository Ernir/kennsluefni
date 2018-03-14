#include <iostream>

/*
 * ATH: Á sumum vélum þarf að afkommenta aðra eða báðar af eftirfarandi 
 * línum til að forritið þýðist umkvörtunarlaust.
 */
// #include <time.h>
extern clock_t clock(void);

using namespace std;

int fibo(int n) {
    /*
     * Vond útfærsla á útreikningi á n-tu Fibonacci tölunni.
     * Valin til að við sjáum örlítið langan keyrslutíma.
     */
    if (n < 1) {
        return 0;
    } else if (n == 1) {
        return 1;
    } else {
        return fibo(n - 1) + fibo(n - 2);
    }
}

int main() {
    // Tímamælum útreikning á 20. Fibonacci tölunni
    int n = 30;
    clock_t c1,c2;
    c1 = clock();
    fibo(n);
    c2 = clock();
    cout << "Útreikningi á fib(" << n << ") lokið á " << (c2 - c1) << " klukkupúlsum" << endl;
    return 0;
}
