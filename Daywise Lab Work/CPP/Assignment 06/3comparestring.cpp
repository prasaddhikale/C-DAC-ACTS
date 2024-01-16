#include <iostream>
using namespace std;

bool compare(char s1[], char s2[]);
int main()
{
    char s1[20];
    cout << "Enter a string 1: ";
    cin >> s1;

    char s2[20];
    cout << "Enter a string 2: ";
    cin >> s2;

    bool check = compare(s1,s2);
    if(check)
        cout << "Equal";
    else
        cout << "Not Equal";

    return 0;
}
bool compare(char s1[], char s2[])
{
    for(int i = 0; s1[i] != '\0' || s2[i] != '\0'; i++)
    {
        if(s1[i] != s2[i])

        return false;
    }
        return true;
}