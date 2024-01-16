#include <iostream>
using namespace std;

int main() 
{
    int num;
    cout << "Enter a number ";
    cin >> num;

    num = (num < 0) ? -num : num;

    int b;
    int result = 0;

    do {
        b = num % 10;
        result = result + b;
        num = num / 10;
    } while (num > 0);

    cout << "The sum of digits is: " << result << endl;

    return 0;
}
