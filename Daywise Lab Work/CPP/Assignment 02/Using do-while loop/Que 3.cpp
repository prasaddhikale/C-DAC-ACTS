#include <iostream>
using namespace std;

int main() 
{
    int n, m, result = 0;
    cout << "Enter N and M: ";
    cin >> n >> m;

    int i = n;

    do {
        result += i;
        i++;
    } while (i <= m);

    cout << "Sum of the numbers between " << n << " and " << m << " is " << result << endl;

    return 0;
}
