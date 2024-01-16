#include <iostream>
using namespace std;

int main()
{
    int num;
    cout << "Enter a number: ";
    cin >> num;

    int firstDigit;
    do {
        firstDigit = num % 10;
        num = num / 10;
    } while (num > 0);

    cout << "The first digit is: " << firstDigit << endl;

    return 0;
}
