#include <iostream>
using namespace std;

int main() 
{
    int num;
    cout << "Enter a number: ";
    cin >> num;

    int product = 1;

    do {
        int digit = num % 10;
        product = product * digit;
        num = num / 10;
    } while (num > 0);

    cout << "The product of digits is: " << product << std::endl;

    return 0;
}
