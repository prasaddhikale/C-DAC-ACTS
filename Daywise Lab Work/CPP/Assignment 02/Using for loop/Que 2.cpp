#include <iostream>
using namespace std;

int main()
{
    int num,rev=0;
    cout << "Enter the number :";
    cin >> num;


    for( ; num!=0; num = num/10)
    {
        int d;
        d = num%10;
        rev = rev*10+  d;
    }
    cout << "Reverse number is :" << rev << endl;

    return 0;
}