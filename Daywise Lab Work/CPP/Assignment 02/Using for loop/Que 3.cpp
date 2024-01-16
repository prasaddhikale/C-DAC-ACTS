#include <iostream>
using namespace std;

int main()
{
    int n, m, res=0;
    cout << "Enter N and M :";
    cin >> n >> m;

    int i;
    for(i=n; i<=m; ++i)
    {
        res = res+i;
    }
    cout << "sum of the number between " << n << " and " << m << " is " << res << endl;

    return 0;
}