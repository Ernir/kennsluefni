/*
 Example program on notation for displaying doubles.
 Based on http://www.cplusplus.com/reference/iomanip/setprecision/
 */

#include <iomanip>   // std::setprecision
#include <iostream>  // std::cout, std::fixed

int main() {
    double f = 3.14159;
    std::cout << std::fixed;  // See also: http://www.cplusplus.com/reference/ios/fixed/
    std::cout << std::setprecision(5) << f << '\n';
    std::cout << std::setprecision(9) << f << '\n';
    std::cout << std::scientific;
    std::cout << std::setprecision(5) << f << '\n';
    std::cout << std::setprecision(9) << f << '\n';
    return 0;
}