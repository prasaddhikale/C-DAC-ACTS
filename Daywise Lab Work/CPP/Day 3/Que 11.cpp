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

    int n1;
    n1 = num;
    res = 0;
    int b;

    while(num > 0)
    {
        b = num%10;
        res = b*b*b + res;
        num = num/10; 
    }
    if(res == n1)
    {
        cout << "It is an armstrong number." << endl;
    } 
    else
    {
        cout << "It is not an armstrong number." << endl;
    }
    return 0;

}