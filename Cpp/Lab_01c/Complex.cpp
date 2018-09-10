#include <iostream>
#include "Complex.h"

using namespace std;

void Complex::set(){
    cout << "write R\n";
    cin >> R;
    cout << endl;
    cout << "write J\n";
    cin >> J;
    cout << endl;
}

void Complex::show() {
    cout << R <<" + " <<  J << "i" << endl;
}

Complex Complex::operator+(Complex z2){
    Complex res;
    res.R = R + z2.R;
    res.J = J + z2.J;
    return res;
}

Complex Complex::operator-(Complex z2){
    Complex res;
    res.R = R - z2.R;
    res.J = J - z2.J;
    return res;
}

Complex Complex::operator*(Complex z2){
    Complex res;
    res.R = R * z2.R - (J*z2.J);
    res.J = R * z2.J + z2.R * J;
    return res;
}

Complex Complex::operator/(Complex z2){
    Complex res;
    res.R = R * z2.R + (J*z2.J);
    res.J = z2.R * J - R * z2.J;
    return res;
}

Complex Complex::operator=(Complex z2){
    Complex res;
    res.R = R = z2.R;
    res.J = J = z2.J;
    return res;
}

Complex Complex::operator++(){
    R++;
    return Complex();
}