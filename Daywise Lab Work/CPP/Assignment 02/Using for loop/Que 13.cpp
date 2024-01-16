#include <iostream>
// Print the digits in the number as words.
using namespace std;

int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;

    int digit;

    for (; n>0; n = n/10)
    {
        digit = n%10;

        switch (digit)
        {
        case 0:
            cout << "zero ";
            break;
        case 1:
            cout << "one ";
            break;
        case 2:
            cout << "two ";
            break;
        case 3:
            cout << "three ";
            break;
        case 4:
            cout << "four ";
            break;
        case 5:
            cout << "five ";
            break;
        case 6:
            cout << "six ";
            break;
        case 7:
            cout << "seven ";
            break;
        case 8:
            cout << "eight ";
            break;
        case 9:
            cout << "nine ";
            break;
        }
    }

    return 0;
}
