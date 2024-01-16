#include <iostream>
using namespace std;

int main()
{
    int num, digit;

    cout << "Enter the number: ";
    cin >> num;
    cout << "Enter the digit you want to search: ";
    cin >> digit;

    int count = 0;

    do {
        int b = num % 10;
        if (b == digit)
        {
            count++;
        }
        num = num / 10;
    } while (num > 0);

    cout << "The digit " << digit << " appears " << count << " times in the number." << endl;

    return 0;
}
