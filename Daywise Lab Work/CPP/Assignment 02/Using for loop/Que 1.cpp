#include <iostream>
// find factor
using namespace std;
int main()
{
    int num;
    cout << "Enter a positive integer: ";
    cin >> num;

    
    for (int i=1; i<=num; ++i)
    {
        if (num%i == 0)
        {
            cout << i <<" ";
        }
       
    } 

   return 0;
}   
