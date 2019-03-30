#include <iostream>
#include "vector"
#include <bits/stdc++.h>

class mList{
public:
    class Node {
    public:
        int data;
        Node *next;
        Node(int num) {
            data = num;
        }
    };

    int size;
    Node *head;
    Node *first;
    Node *last;
    Node *EOL;

    void add(int num) {
        Node *tmp = new Node(num);
        if (size == 0) {
            first = last = head =  tmp;
            size++;
        } else {
            last->next = tmp;
            last = tmp;
            size++;
        }
    }

    mList() {
        size = 0;
        first = last = head = EOL = nullptr;
    }

    mList(std::vector<int> array) {
        size = 0;
        for (int i = 0; i < array.size(); i++){
            add(array[i]);
        }
    }

    int get(int num){
        head = first;
        for (int i = 0; i < num; ++i) {
            head = head->next;
        }
        return head->data;
    }

    std::vector<int> allPositive(){
        head = first;
        std::vector<int> res;
        for (int i = 0; i < size; ++i) {
            if (head->data > 0) res.push_back(head->data);
            head = head->next;
        }
        return res;
    }

    std::vector<int> allEven(){
        head = first;
        std::vector<int> res;
        for (int i = 0; i < size; ++i) {
            if (head->data%2==0) res.push_back(head->data);
            head = head->next;
        }
        return res;
    }

    std::vector<int> allEvenAndPositive(){
        head = first;
        std::vector<int> res;
        for (int i = 0; i < size; ++i) {
            if ((head->data%2==0) || (head->data > 0)) res.push_back(head->data);
            head = head->next;
        }
        return res;
    }

    void print(){
        head = first;
        for (int i = 0; i < size; ++i) {
            std::cout << head->data;
            head = head->next;
        }
    }

    void task1(){
        std::vector<int> tmp = this->allPositive();
        std::sort(tmp.begin(), tmp.end());
        mList res(tmp);
        res.print();
    }

    void task2(){
        std::vector<int> tmp = this->allEven();
        std::sort(tmp.begin(), tmp.end());
        mList res(tmp);
        res.print();
    }
    void task3(){
        std::vector<int> tmp = this->allEvenAndPositive();
        std::sort(tmp.begin(), tmp.end());
        mList res(tmp);
        res.print();
    }
};

using namespace std;

int main() {
    vector<int> v = {0,1,2,3,4,5,6,7,8,9,-1,-2,-3,-4};
    reverse(v.begin(), v.end());
    for (int i = 0; i < v.size(); ++i) {
        cout << v[i];
    }
    cout << endl;
    mList list(v);
    list.task1();
    cout << endl;
    list.task2();
    cout << endl;
    list.task3();
    cout << endl;

    vector<int> v2 = list.allEven();
    return 0;
}