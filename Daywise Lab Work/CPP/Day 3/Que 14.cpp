    #include <bits/stdc++.h>
    using namespace std;
    

    int main()
    {
        int n;
        cout << "Enter a number: " << endl;
        cin >> n;

        string units[20] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        string tens[10] = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        string ans = "";

        int t;
        if(n >= 10000000)
        {
            t = n/10000000;
            if(t)
            {
                if(t>19)
                {
                    ans = ans + tens[t/10] + " " + units[t%10] + " Crore ";
                }
                else
                {
                    ans = ans + units[t] + " Crore ";
                }
            }
        }
        n = n%10000000;
        
        if(n >= 100000)
        {
            t = (n/100000) % 100;
            if(t)
            {
                if(t>19)
                {
                    ans = ans + tens[t/10] + " " + units[t%10] + " Lakh ";
                }
                else
                {
                    ans = ans + units[t] + " Lakh ";
                }
            }
        }
        
        n = n%100000;
        if(n>=1000)
        {
            t = (n/1000)%100;
            if(t)
            {
                if(t>19)
                {
                    ans = ans + tens[t/10] + " " + units[t%10] + " Thousand ";
                }
                else
                {
                    ans = ans + units[t] + " Thousand ";
                }
            }
        }
        
        n = n%1000;
        if(n >= 100)
        {
            t = (n/100);
            if(t)
            {
                ans = ans + units[t] + " Hundred ";
            }
        }

        n = n % 100;
        if(n<100)
        {
            t = n%100;
            if(t){
                if(t>19)
                {
                    ans = ans + "and " +  tens[t/10] + " " + units[t%10];
                }
                else    
                    ans = ans + "and " + units[t] ;
            }
        }
        cout << ans;

        return 0;
    }