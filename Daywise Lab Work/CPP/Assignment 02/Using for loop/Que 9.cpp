#include <iostream>
// check if its palindrome or not
using namespace std;

int main() 
{
    int num;
    cout << "Enter a number: ";
    cin >> num;

    int n1 = num;
    int revnum = 0;

    for(; num>0; num = num/10) 
    {
        int digit = num%10;
        revnum = revnum*10+digit;
    }

    if (revnum == n1) 
    {
        cout << "It is a palindrome number." << endl;
    }
    else 
    {
        cout << "It is not a palindrome number." << endl;
    }

    return 0;
}