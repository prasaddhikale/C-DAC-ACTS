#include <iostream>
using namespace std;

int main()
{
    int num;
    int count = 0;
    int digit;
    
    cout << "Enter the number: ";
    cin >> num;
    cout << "Enter the digit you want to search: ";
    cin >> digit;

    for (; num>0; num = num/10)
    {
        int b = num%10;
        if (b == digit)
        {
            count++;
        }
    }

    cout << "The digit " << digit << " appears in " << count << " times in the number." << endl;

    return 0;
}
