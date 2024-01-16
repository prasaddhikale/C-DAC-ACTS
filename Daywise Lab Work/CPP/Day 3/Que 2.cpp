#include <iostream>
// reverse the number
using namespace std;
int main()
{
    int i, rev=0;
    cout << "Enter the number: ";
    cin >> i;

    while(i > 0)
{
    rev = (rev*10)+i%10;
    i = i/10;
    
}
    cout << "Reverse number is: " << rev << endl;

    return 0;

}