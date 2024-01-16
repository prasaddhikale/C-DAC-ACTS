

#include <iostream>
using namespace std;
bool isPrime(int num);
void rangePrime(int a,int b);
int main(){
    int num1,num2;
	std::cout<<"Enter a positive number: ";
	std::cin>>num1;
	std::cout<<"Enter a positive number: ";
	std::cin>>num2;

	rangePrime(num1,num2);
        
return 0;
}

void rangePrime(int a,int b){
	std::cout<<"The prime numbers between "<<a<<" and "<<b<<" both inclusive are: ";
	for (int i=a;i<=b;i++){
		(isPrime(i)==1)?std::cout<<i<<" ":std::cout<<"";
	}
}


bool isPrime(int num){

	for(int i=2;i<=num/2;i++){
	if(num%i==0) return 0;
	}
	return 1;
}
