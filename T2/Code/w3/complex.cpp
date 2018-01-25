#include <iostream>

using namespace std;

class Complex {
    /*
    Represents a complex number, with real and imaginary parts.
    */
   private:
    double real;
    double imag;

   public:
    Complex(double r, double i) {
        this->real = r;
        this->imag = i;
    }

    Complex operator+(Complex comp) {
        /*
        Performs complex addition of the Complex numbers *this and comp.
        */
        double a = this->real;
        double b = this->imag;
        double c = comp.real;
        double d = comp.imag;
        return Complex(a + c, b + d);
    }

    Complex operator-(Complex comp) {
        /*
        Performs complex subtraction of the Complex numbers *this and comp.
        */
        double a = this->real;
        double b = this->imag;
        double c = comp.real;
        double d = comp.imag;
        return Complex(a - c, b - d);
    }

    Complex operator-() { return Complex(-this->real, -this->imag); }

    Complex operator*(Complex comp) {
        /*
        Performs complex multiplication of the Complex numbers *this and comp.
        */
        double a = this->real;
        double b = this->imag;
        double c = comp.real;
        double d = comp.imag;
        return Complex(a * c - b * d, b * c + a * d);
    }

    Complex conjugate() {
        /*
        Calculates the complex conjugate of the Complex number *this.
        */
        return Complex(this->real, -this->imag);
    }

    friend ostream& operator<<(std::ostream& os, Complex f);
};

ostream& operator<<(ostream& os, Complex f) {
    /*
    Allows displaying the complex number f in a + bi format on the stream os
    */
    os << f.real;
    if (0 < f.imag) {
        os << " + " << f.imag << "i";
    } else if (f.imag < 0) {
        os << " - " << -f.imag << "i";
    }
    return os;
}

int main() {
    Complex z(-3.5, 2);
    Complex w(-1, 3);

    cout << "           z er: " << z << endl;
    cout << "           w er: " << w << endl;
    cout << "     (z + w) er: " << (z + w) << endl;
    cout << "     (z - w) er: " << (z - w) << endl;
    cout << "          -z er: " << -z << endl;
    cout << "     (z * w) er: " << (z * w) << endl;
    cout << "Samokatala z er: " << z.conjugate() << endl;

    cout << "i * i er: ";
    Complex c = Complex(0, 1) * Complex(0, 1);
    cout << c << endl;
    return 0;
}