#include "Complex.h"
#include <iostream>

using namespace std;

double *sum (double *a, double *b){
    double c[2];
    double *pc = c;
    *pc = *a + *b;
    *(pc+1) = *(a+1) + *(b+1);
    return pc;
}

double *dif (double *a, double *b){
    double c[2];
    double *pc = c;
    *pc = *a - *b;
    *(pc+1) = *(a+1) - *(b+1);
    return pc;
}

double *div (double *a, double *b){
    double c[2];
    double *pc = &c[0];
    *pc = *a / *b;
    *(pc+1) = *(a+1) / *(b+1);
    return pc;
}

double *mul (double *a, double *b){
    double c[2];
    double *pc = &c[0];
    *pc = (*a) * (*b);
    *(pc+1) = (*(a+1)) * (*(b+1));
    return pc;
}
