#include <iostream>

using namespace std;

class Fraction {
    /*
    Táknar almennt brot með teljara (e. numerator) og nefnara (e. denominator)//
    Represents a fraction with a numerator and denominator
    */
   private:
    double num;
    double den;

   public:
    Fraction(double n, double d) {
        // Í þessa aðferð þarf að bæta við kóða
        this->num = n;
        this->den = d;
    }

    void display() { cout << "Þessari útskrift þarf að breyta" << endl; }

    Fraction plus(Fraction f) {
        // Í þessa aðferð þarf að bæta við kóða
        return Fraction(1, 1);  // Skilum alltaf brotinu 1/1 núna
    }

    void reduce() {
        // Í þessa aðferð þarf að bæta við kóða
    }
};

int main() {
    cout << "Leggjum saman brotin 1/2 og 1/3 og birtum niðurstöðuna:" << endl;
    Fraction a(1, 2);
    Fraction b(1, 3);
    Fraction c = a.plus(b);
    c.display();
    cout << endl;

    cout << "Búum til og birtum brotið 4/6:" << endl;
    Fraction d(4, 6);
    d.display();
    cout << "Styttum brotið 4/6 og birtum það aftur:" << endl;
    d.reduce();
    d.display();
    cout << endl;

    cout << "Búum til brot með 0 í nefnara:" << endl;
    Fraction e(2, 0);
    return 0;
}