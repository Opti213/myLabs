#include <iostream>

using namespace std;

class human{
    int age;
    virtual void  say(){};
};

class humanA : public  human
{
    void say() override {cout <<"hi" << endl;}
};

class humanB : public  human{
    void say() override {cout <<"by" << endl;}
};

int main() {
    return 0;
}