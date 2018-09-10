#ifndef LAB_01C_COMPLEX_H
#define LAB_01C_COMPLEX_H

#include <iostream>

class Complex{
private:
    int R, J;
public:
    void set();
    void show();

    Complex operator+(Complex z2);
    Complex operator-(Complex z2);
    Complex operator*(Complex z2);
    Complex operator/(Complex z2);
    Complex operator=(Complex z2);
    Complex operator++();
};

#endif //LAB_01C_COMPLEX_H
