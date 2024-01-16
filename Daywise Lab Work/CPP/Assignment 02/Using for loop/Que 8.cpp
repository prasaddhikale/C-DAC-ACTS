#include <iostream>
// product of all digit of a positive integer
using namespace std;

int main() 
{
    int num;
    cout << "Enter a number: ";
    cin >> num;

    int result = 1;

    for(; num>0; num = num/10) 
    {
        int digit = num%10;
        result = result*digit;
    }

    cout << "The product of the integer is: " << result << endl;

    return 0;
}