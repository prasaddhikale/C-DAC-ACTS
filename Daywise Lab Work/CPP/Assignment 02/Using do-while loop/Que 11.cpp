#include <iostream>
using namespace std;

int main() 
{
    int num, res = 0, digit;
    cout << "Enter a number: ";
    cin >> num;

    int originalNum = num;

    int b;

    do {
        b = num % 10;
        res = res + (b * b * b);
        num = num / 10;
    } while (num != 0);

    if (res == originalNum)
    {
        cout << "It is an Armstrong number." << endl;
    }
    else
    {
        cout << "It is not an Armstrong number." << endl;
    }

    return 0;
}
