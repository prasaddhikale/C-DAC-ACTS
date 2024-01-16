#include <iostream>
// prime no between two positive integer
using namespace std;

int main() 
{
    int p, q;
    cout << "Enter p and q ";
    cin >> p >> q;

    int count;

    for(int i=p; i<=q; i++)
    {
        count = 0;
        if(i==1)
             continue;
        for(int j=2; j<=i/2; j++)
        {
            if(i%j == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            cout << i << " " << endl;
        }     
    }
    cout << " " << endl;
    return 0;
}