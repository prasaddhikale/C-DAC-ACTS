#include <iostream>
using namespace std;

int main ()
{
    int n;
    cout << "Enter the number:";
    cin >> n;

    int digit = 0;
    for(; n>0 ;)
    {
        digit = n%10;
        n = n/10;
    }
    cout << "First digit in positive integer is: " << digit << endl;

    return 0;
}  
