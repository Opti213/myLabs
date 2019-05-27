#include <iostream>
#include <set>
#include <vector>
#include <bits/algorithmfwd.h>

using namespace std;

int max_road =10000;
int city_index;

int getSumm(int arr[3]){
    int summ = 0;
    for(int i = 0;i<3 ;i++){
        summ+=arr[i];
    }
    return summ;
}


int main() {
    char cities[3] = {'A', 'B', 'C'};
    int roadsToA[4] = {0, 0, 0};
    int roadsToB[4] = {0, 0, 0};
    int roadsToC[4] = {0, 0, 0};
    int summlenth[3] = {0, 0, 0};

    cout << "There are 3 cities : A,B and C;\n";

    cout << "Enter the length of road[A-B]\n";
    cin >> roadsToA[1];
    roadsToB[0] = roadsToA[1];

    cout << "\nEnter the length of road[A-C]\n";
    cin >> roadsToA[2];
    roadsToC[0] = roadsToA[2];

    cout << "\nEnter the length of road[B-C]\n";
    cin >> roadsToB[2];
    roadsToC[1] = roadsToB[2];

    cout << "\tA\tB\tC\nA:";
    for (int i = 0; i < 3; i++) {
        cout << "\t" << roadsToA[i];
        summlenth[0] += roadsToA[i];
    }
    cout << "\t- summary length: " << summlenth[0];
    cout << "\n\n";

    cout << "\nB:";
    for (int i = 0; i < 3; i++) {
        cout << "\t" << roadsToB[i];
        summlenth[1] += roadsToB[i];
    }
    cout << "\t- summary length: " << summlenth[1];
    cout << "\n\n";

    cout << "\nC:";
    for (int i = 0; i < 3; i++) {
        cout << "\t" << roadsToC[i];
        summlenth[2] += roadsToC[i];
    }
    cout << "\t- summary length: " << summlenth[2];

    for (int i = 0; i < 3; i++) {
        if (max_road > summlenth[i]) {
            max_road = summlenth[i];
            city_index = i;
        }
    }

    cout << "\nThe shortest road summ is " << max_road << " for city " << cities[city_index];
    return 0;
}