#include <iostream>
using namespace std;

int reverse(int num);
void palindromeCheck(int a);
int main(){
    int num;
	std::cout<<"Enter a positive number: ";
	std::cin>>num;
    palindromeCheck(num);
return 0;
}


int reverse(int num){
       int rev=0;
	while(num!=0){
	       rev=rev*10 + num%10;
	       num=num/10;
	}
	return rev;
}
void palindromeCheck(int a){
	std::cout<<"The number "<<a;
	(reverse(a)==a)?std::cout<<" is palindrome":std::cout<<" is not a palindrome";
}