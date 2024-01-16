#include <iostream>
using namespace std;

class Date
{
    int day;
    int month;
    int year;

public:
    Date();
    Date(int d, int m, int y) : day(d), month(m), year(y) {}

    void Read()
    {
        cout << "enter day: ";
        cin >> this->day;
        cin >> this->month;
        cin >> this->year;
    };

    void Write()
    {
        cout << this->day << " ";
        cout << this->month << " ";
        cout << this->year << " \n ";
    };

    void operator+(int i)
    {
        this->day = this->day + i;
    }
    void operator-(int i)
    {
        this->day = this->day - i;
    }
    void operator-(Date d2)
    {
        this->day = this->day - d2.day;
        this->month = this->month - d2.month;
        this->year = this->year - d2.year;
    }

    bool operator==(Date obj2)
    {
        if (this->day == obj2.day && this->month == obj2.month && this->year == obj2.year)
        {
            cout << "Both dates are equal";
            return true;
        }
        else
        {
            cout << "not equal \n";
            return false;
        }
    }

    Date operator++(){
        this->day ++;
        return *this;
    }
    Date operator++(int){
        return *this;
        ++ this->day;
    }
};

int main()
{
Date d1(17, 5, 23);
Date d2(25, 6, 23);
d1+7;
d1.Write();
d1-3;
d1.Write();
d1-d2;
d1.Write();
d1++;
++d1;

return 0;
}
			//end programm
