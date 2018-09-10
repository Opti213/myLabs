#include <iostream>
#include "Complex.h"

using namespace std;


int main() {
    Complex z1, z2, zres;
    cout << "first num\n";
    z1.set();
    cout << "second num\n";
    z2.set();
    zres = z1 + z2;
    cout << "\nz1 + z2:\n";
    zres.show();
    zres = z1 - z2;
    cout << "\nz1 - z2:\n";
    zres.show();
    zres = z1 * z2;
    cout << "\nz1*z2:\n";
    zres.show();
    zres = z1 / z2;
    cout << "\nz1 / z2:\n";
    zres.show();

    string str;
    cin >> str;
    cout << stod(str);

    return 0;
}