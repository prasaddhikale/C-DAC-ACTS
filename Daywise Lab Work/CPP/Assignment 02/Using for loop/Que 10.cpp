#include <iostream>
// perfect number or not
using namespace std;

int main() 
{
    int num;
    cout << "Enter a number: ";
    cin >> num;

    int sum = 0;

    for (int n=1; n<num; n++) 
    {
        if (num%n == 0)
        {
            sum = sum+n;
        }
    }

    if (num == sum) 
    {
        cout << "This is a perfect number." << endl;
    }
    else 
    {
        cout << "This is not a perfect number." << endl;
    }

    return 0;
}