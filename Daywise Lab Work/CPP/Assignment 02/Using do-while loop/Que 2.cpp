#include <iostream>
using namespace std;

int main() 
{
    int num, revnum = 0;

    cout << "Enter a number: ";
    cin >> num;

    do {
        int digit = num % 10; 
        revnum = (revnum * 10) + digit;
        num = num / 10;
    } while (num != 0);

    cout << "Reversed number is: " << revnum << endl;

    return 0;
}
