#include <map>
#include <iostream>
#include <string>

using namespace std;

int main() {
    map<string, string> dns; // Vörpun frá vefslóðum til ip-talna

    dns.insert(make_pair("hi.is", "130.208.165.207")); // Nýtt lykils-gildis par skilgreint
    dns["island.is"] = "128.140.233.18"; // jafngilt línunni að ofan

    // Ein leið til að skrifa stök töflunnar út
    for (auto domain : dns) {
        cout << domain.first << ": " << domain.second << endl;
    }
}