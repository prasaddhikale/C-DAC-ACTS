#include <iostream>
// product of all digit of a positive integer
using namespace std;

int main() 
{
    int num, res, digit;
    cout << "Enter a number: ";
    cin >> num;
    cout << "Enter a number of digits: ";
    cin >> digit;

    int n1=num;

    for( ; num>0; num = num/10)
    {
       int b = num%10;
        res = b*b*b + res;
    }
    if(res == n1)
    {
        cout << "It is an armstrong number." << endl;
    }
    else
    {
        cout << "It is not an armstrong number. " <<endl;
    }
    return 0;
}