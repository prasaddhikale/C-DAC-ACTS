#include <iostream>
using namespace std;

void swap(int &a, int &b);
void swap(float &a, float &b);
void swap(char &a, char &b);
void swap(bool &a, bool &b);
void swap(double &a, double &b);

int main()
{
    int num1, num2;
    cout << "Enter num1 and num2: ";
    cin >> num1 >> num2;
    cout << "Before swap: num1 = " << num1 << ", num2 = " << num2 << endl;
    swap(num1, num2);
    cout << "after swap: num1 = " << num1 << ", num2 = " << num2 << endl;
    return 0; 
}

void swap(int &a, int &b)
{
    int temp = a;
     a = b;
     b = temp;
}
void swap(float &a, float &b)
{
     float temp = a;
     a = b;
     b = temp;
}
void swap(char &a, char &b)
{
     char temp = a;
     a = b;
     b = temp;
}
void swap(bool &a, bool &b)
{
     bool temp = a;
     a = b;
     b = temp;
}
void swap(double &a,double &b)
{
     double temp = a;
     a = b;
     b = temp;
}