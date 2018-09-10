#include <iostream>

using namespace std;

class Animal{
private:
    int Heals;
public:
    void getHeals(){cout << "Heals of this animal: " << Heals << endl;};
    Animal() : Heals(1){};
    Animal(int a) : Heals(a){};
};

class Dog : public Animal{
public:
    void voice(){cout << "ruff" << endl;};
};

class Cat : public Animal{
public:
    void voice(){cout << "nya" << endl;};
    Cat(): Animal(9){};
};


int main() {
    Dog bro;
    bro.getHeals();
    bro.voice();
    cout << endl;
    Cat neko;
    neko.getHeals();
    neko.voice();
    return 0;
}