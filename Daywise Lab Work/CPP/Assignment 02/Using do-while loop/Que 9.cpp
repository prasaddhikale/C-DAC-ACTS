#include <iostream>
using namespace std;

int main() 
{
    int num;
    cout << "Enter a number: ";
    cin >> num;

    int b;
    int n1 = num;
    int result = 0;

    do {
        b = num % 10;
        result = result * 10 + b;
        num = num / 10;
    } while (num > 0);

    if (result == n1)
    {
        cout << "It is a palindrome number." << endl;
    }
    else
    {
        cout << "It is not a palindrome number." << endl;
    }

    return 0;
}
