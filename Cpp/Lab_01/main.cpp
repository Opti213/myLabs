#include <iostream>
#include "Complex.h"

using namespace std;

int main() {
    double a, b;
    double *p1, *p2, *res;
    char ch;

    cout << "Write R and J of first num";
    cin >> a >> b;
    cout << endl;
    double arr1[] = {a, b};
    p1 = &arr1[0];

    cout << "Write R and J of second num";
    cin >> a >> b;
    cout << endl;
    double arr2[] = {a, b};
    p2 = &arr2[0];

    cout << "Write a action(+ or -)";
    cin >> ch;
    cout << endl;
    switch(ch) {
        case '+':
            res = sum(p1, p2);
            cout << *res << " " <<  *(res+1) << endl;
        break;
        case '-':
            res = dif(p1, p2);
            cout << *res << " " << *(res + 1) << endl;
        break;
    }
    return 0;
}