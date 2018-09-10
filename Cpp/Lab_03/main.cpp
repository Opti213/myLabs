#include <iostream>

using namespace std;

class child {
private:
    char firstname[20];
    char lastname[20];
    int age;
public:
    void info(){
    cout << "age:"<<  this->age << "\n" << "first name:" << this->firstname <<"\n" << "last name:" << this ->lastname << endl;
    }
    void say(){
        char str[100];
        cout << "what do want to say?\n";
        cin >> str;
        cout <<"you are saing:"<< str << endl;
    }
    void set(){
        cout << "write first name\n";
        cin >> this->firstname;
        cout << "write last name\n";
        cin >> this->lastname;
        cout << "write age\n";
        cin >> this->age;
    }
    child(){
        set();
        info();
    }
};

int main() {
    child obj1;
    child obj2;
    return 0;
}