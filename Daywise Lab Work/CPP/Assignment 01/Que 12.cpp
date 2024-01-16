#include<iostream>
using namespace std ;

int main()
{
    int num;
    int count = 0;
    int digit;

    cout << "Enter the number: ";
    cin >> num;
    cout << "Enter the digit you want to search: ";
    cin >> digit;

    int b;

    while(num > 0)
    {
        b = num%10;
        if(b == digit)
        {
            count++;
        }
        num = num/10;
    }
    cout << "The digit " << digit << " appears in " << count << " times in the number." << endl;
    
    return 0;
    
}