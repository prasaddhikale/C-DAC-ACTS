#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;
 
    int b;
    int res = 0;

    for(; n>0 ; )
    {
        b = n%10;
        res = res+b;
        n = n/10;
    }
    cout << "The sum of the digits is: " << res << endl;

    return 0;
}
