#include <iostream>

using namespace std;

int main(){
    int number = 10;
    int &reference = number;

    cout<<"before"<<endl;
    cout<<number<<endl;
    cout<<reference<<endl;

    reference = 15;

    cout<<"after"<<endl;
    cout<<number<<endl;
    cout<<reference<<endl;

    return 0;
}