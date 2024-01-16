#include <iostream>
using namespace std;

int main()
{
    int num;
    cout << "Enter a number: ";
    cin >> num;

    int sum = 0;
    int digit;

    do {
        digit = num % 10;
        sum = sum + digit;
        num = num / 10;
    } while (num != 0);

    cout << "The sum of the digits is: " << sum << std::endl;

    return 0;
}
