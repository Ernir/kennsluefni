#include <iostream>

using namespace std;

class Stack {
    /*
    Táknar LIFO hlaða af ótiltekinni stærð, útfærður með eintengdum hnútum.
    Allar aðgerðir taka fastan tíma.
    */

   public:
    Stack() {
        /*
        Smiður, upphafsstillir tóman hlaða.
        */
    }

    ~Stack() {
        /*
        Eyðir, gætir þess að hnútahalanum sé eytt.
        */
    }

    void push(int n) {
        /*
        Bætir heiltölunni n efst á hlaðann.
        */
    }

    int pop() {
        /*
        Fjarlægir þá tölu sem styst hefur verið á hlaðanum og skilar henni 
        */
        if (false) {
            throw underflow_error("Reynt var að fjarlægja efsta stak af tómum hlaða");
        }
        return 0;
    }

    int peek() {
        /*
        Skilar gildi þeirrar tölu sem styst hefur verið á hlaðanum en skilur við hlaðann í sama ástandi
        */
        if (false) {
            throw underflow_error("Reynt var að kíkja á efsta stak tóms hlaða");
        }
        return 0;
    }

    bool isEmpty() {
        /*
        Skilar sönnu innihaldi hlaðinn engar tölur
        */
        return true;
    }
};

int main() {
    Stack s;
    cout << "Setjum tölurnar 1, 2 og 4 á hlaðann s." << endl;
    s.push(1);
    s.push(2);
    s.push(4);
    cout << "Stelum efsta stakinu, " << s.pop() << ", af s." << endl;
    cout << "Setjum tölurnar 8, 16 og 32 á s." << endl;
    s.push(8);
    s.push(16);
    s.push(32);

    cout << "Kíkjum á efsta stak s, það er " << s.peek() << "." << endl;

    cout << "Fjarlægjum nú tölurnar af s: " << endl;
    while (!s.isEmpty()) {
        cout << s.pop() << " ";
    }
    cout << endl;

    try {
        s.peek();
    } catch (underflow_error e) {
        cout << "Ekki tókst að kíkja á s, enda tómur" << endl;
    }

    try {
        s.pop();
    } catch (underflow_error e) {
        cout << "Ekki tókst að fjarlægja stak af s, enda tómur" << endl;
    }

    return 0;
}