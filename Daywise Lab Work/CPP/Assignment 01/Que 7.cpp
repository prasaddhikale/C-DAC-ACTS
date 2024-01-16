#include <iostream>
// sum of digit of a negative integer
using namespace std;

int main() 
{
    int num;
    cout << "Enter a number ";
    cin >> num;

    if (num < 0)
    {
        num = num * (-1);
    }

    int b;
    int result = 0;

    while (num > 0)
    {
        b = num % 10;
        result = result + b;
        num = num / 10;
    }
    cout << "The sum of digit is:"<< result << endl;

}