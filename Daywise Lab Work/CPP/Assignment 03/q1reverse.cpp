#include<iostream>
int reverse(int);
bool isPrime(int);
int getNum();
void rangePrime(int, int);
void palindromeCheck(int);

int main()
{
	int num;
	std::cout<<"Enter a positive number: ";
	std::cin>>num;
	int rev=reverse(num);
    
    std::cout<<"Reversed number is " << rev; 
	// bool iPrime = isPrime(num2);
	// std::cout<<"The reverse of "<<num1 <<" is "<<rev<<std::endl;
	// std::cout<<"The number "<<num1;
	// (iPrime) ?std::cout<< " is Prime" : std::cout<<" is not Prime";
	// rangePrime(num1,num2);
	// palindromeCheck(num1);
}



int reverse(int num){
       int rev=0;
	while(num!=0){
	       rev=rev*10 + num%10;
	       num=num/10;
	}
	return rev;
}