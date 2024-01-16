#include <iostream>
// find factor
using namespace std;
int main()
{
    int number;
    cout << "Enter the number: ";
    cin >> number;

    int n=1;
    while(n <= number)
    {
        if(number%n == 0)
        { 
            cout << n << " " ;
        }
        n++;
    }
    return 0;
}