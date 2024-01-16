#include <iostream>
// sum between N nd M
using namespace std;

int main()
{
    int n, m, result=0;
    cout << "Enter N and M: ";
    cin >> n >> m;

    int i = n;

    while(i<=m)
    {
        result = result+i;
        i++;
    }
    cout << "sum of the number between " << n << " and " << m << " is " << result <<endl;

    return 0; 
}