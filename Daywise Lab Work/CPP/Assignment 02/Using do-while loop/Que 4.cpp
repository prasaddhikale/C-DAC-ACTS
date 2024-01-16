#include <iostream>
using namespace std;

int main() {
    int p, q;
    cout << "Enter p and q: ";
    cin >> p >> q;

    int i = p;

    do {
        int count = 0;

        if (i == 1) 
        {
            i++;
            continue;
        }

        int j = 2;
        do {
            if (i % j == 0) 
            {
                count++;
                break;
            }
            j++;
        } while (j <= i / 2);

        if (count == 0) 
        {
            cout << i << " ";
        }

        i++;
    } while (i <= q);

    cout << endl;

    return 0;
}
