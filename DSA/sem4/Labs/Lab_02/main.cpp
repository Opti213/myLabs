#include <iostream>
#include <vector>
#include <tgmath.h>

using namespace std;

struct Node {
    int data;
    Node *left, *right;
};

class Tree {
public:

    int counter;
    Node *root;
    vector<Node *> arr;

    void add(int data) {
        Node *nNode = newNode(data);
        arr.push_back(nNode);
        for (Node *node : arr) {
            if (node->left == NULL) {
                node->left = nNode;
                counter++;
                return;
            } else if (node->right == NULL) {
                node->right = nNode;
                counter++;
                return;
            }
        }
    }

    void add(vector<int> myArr) {
        for (int num : myArr) {
            add(num);
        }
    }

    Node *newNode(int data) {
        Node *node = (Node *) malloc(sizeof(Node));
        node->data = data;
        node->left = node->right = NULL;
        return (node);
    }

    int getDeep() {
        return (int) log2(counter)+1;
    }

    void treeToString() {
        int tmpCounter = 0;
        for (int i = 0; i < getDeep(); ++i) { // levels
            for (int k = 0; k < getDeep() - (1 + i); k++) cout << "  "; //space pre-elements
            for (int j = 0; j < pow(2, i); ++j) { // elements on level
                cout << arr[tmpCounter]->data << "  ";
                tmpCounter++;
                if(tmpCounter == counter) return;
            }
            cout << endl;
        }
    }

    //constructors
    Tree(int data) {
        counter = 0;
        root = newNode(data);
    }

    Tree() {
        counter = 0;
    }

    //else funcs
    void simpleItin() {
        root->left = newNode(2);
        root->right = newNode(3);
        root->left->left = newNode(4);
        root->left->right = newNode(5);
        root->right->right = newNode(6);
    }

    void treeToString(Node *root, string &str) {

        if (root == NULL)
            return;


        str.push_back(root->data + '0');


        if (!root->left && !root->right)
            return;

        str.push_back('(');
        treeToString(root->left, str);
        str.push_back(')');

        if (root->right) {
            str.push_back('(');
            treeToString(root->right, str);
            str.push_back(')');
        }
    }


};

int main() {
    vector<int> testData = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    Tree tree; //init
    tree.add(testData); //add test data
    tree.treeToString(); // task

    return 0;
}