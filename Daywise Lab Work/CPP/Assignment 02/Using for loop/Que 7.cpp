#include <iostream>
// sum of digit of a positive and negative integer
using namespace std;

int main() 
{
    int num;
    cout << "Enter a number ";
    cin >> num;

    int result = 0;
    for(; num>0; num = num/10) 
    {
        int digit = num%10;
        result = result+digit;
    }
    cout << "The sum of digits is: " << result << endl;

    return 0;
}