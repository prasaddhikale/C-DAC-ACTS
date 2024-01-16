#include <iostream>
using namespace std;

int main() 
{
    int number;
    cout << "Enter the number: ";
    cin >> number;

    int n = 1;
    do {
        if (number % n == 0) 
        {
            cout << n << " ";
        }
        n++;
    } while (n <= number);

    return 0;
}
