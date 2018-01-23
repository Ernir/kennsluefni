/*
    Forrit skrifað til að bregðast við nemendafyrirspurn um muninn á stdout og stderr.
    
    Sjá t.d. endurbeiningu:
    
    $ g++ stderrexample.cpp -o stderrexampl
    $ ./stderrexample
    Halló heimur!
    Bless, grimmi heimur!
    $ ./stderrexample > skra.txt
    Bless, grimmi heimur!
    $ cat skra.txt # Skoðum innihald skra.txt
    Halló heimur!
    
 */


#include <iostream>

int main() {
    std::cout << "Halló heimur!" << std::endl;
    std::cerr << "Bless, grimmi heimur!" << std::endl;
    return 0;
}
