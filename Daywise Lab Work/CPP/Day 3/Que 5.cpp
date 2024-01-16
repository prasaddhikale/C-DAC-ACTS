#include <iostream>
// first digit of a positive integer
using namespace std;

int main()
{
    int num;
    cout << "Enter a number: ";
    cin >> num;

    int b;
    while(num>0)
    {
        b = num%10;
        num = num/10;
    }
    cout << b << endl;

    return 0;
}