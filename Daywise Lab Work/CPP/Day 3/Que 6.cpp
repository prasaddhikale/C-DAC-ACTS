#include <iostream>
// sum of digit of a positive integer
using namespace std;

int main() 
{
    int num;
    cout << "Enter a number: ";
    cin >> num;

    int b;
    int result = 0;

    while (num > 0) 
    {
        b = num % 10;
        result = result + b;
        num = num / 10;
    }

    cout << "The sum of the digits is: " << result << endl;

    return 0;
}