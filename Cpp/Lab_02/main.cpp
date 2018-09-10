#include <iostream>
#include <string.h>

using namespace std;
void func() {
    cout << "i'm the first fnc" << endl;
}
void func2(){
    cout << "i'm not the first fnc" << endl;
}
void make(void (*a)()){
    a();
}

void (*pf)() = func;
void (*pf2)() = func2;

int main() {
int i;
    cin >> i;
    cout << endl;
    make(i == 1 ? *pf : *pf2);
    return 0;
}