#include <iostream>
#include <vector>
#include <string>

using namespace std;

void lsd(vector<string> &a) {
    // Hér þarf að fylla inn í!
}

int main() {
    /*
     * Performs testing on the lsd method
     */

    vector<string> words;
    string s;
    while (getline(cin, s)) {
        words.push_back(s);
    }

    lsd(words);

    for (s : words) {
        cout << s << endl;
    }
}