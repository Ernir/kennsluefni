#include <map>
#include <unordered_map>
#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

// Til að fá VS Code til að hætta að væla. Sjá time.h.
extern clock_t clock (void) __THROW;

using namespace std;

int main() {
    vector<string> words;
    vector<string> wordsShuffled;

    /*
     * Hér þarf að gefa vigrunum gildi.
     * Ef nota á fleiri vigra væri viðeigandi að gefa þeim gildi hér líka.
     */

    // Gefið dæmi: Tímamæling á innsetningu í map
    map<string, int> myMap;
    clock_t c;
    c = clock();
    for (int i = 0; i < wordsShuffled.size(); i++) {
        myMap.insert(pair<string, int>(wordsShuffled[i], i));
    }
    cout << "Innsetningu strengja í map lokið á: " << (clock() - c) << " klukkupúlsum" << endl;

    /*
     * Hér þarf að framkvæma hinar prófanirnar sjö
     */
    return 0;
}
