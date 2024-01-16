#include <iostream>
// product of all digit of a positive integer
using namespace std;

int main() 
{
    int num;
    cout << "Enter a number: ";
    cin >> num;

    int b;
    int result = 1;

    while (num>1)
    {
        b = num%10;
        result = result * b;
        num = num/10;
    }
    cout << "The product of integer is: "<< result << endl;
}