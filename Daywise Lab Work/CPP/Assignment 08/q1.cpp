#include<iostream>

class BigInt{
	int num;

public:
	BigInt(){}
	BigInt(int n): num(n){}
	BigInt(BigInt& obj2){
		num=obj2.num;
	}

	BigInt operator+(BigInt obj2){
		BigInt result;
		result.num = num + obj2.num;
		return result;
	}
	
	int operator+(int num2){
		int result;
		result = num + num2;
		return result;
	}

	BigInt operator-(BigInt obj2){
		BigInt result;
		result.num = num - obj2.num;
		return result;
	}
	int operator-(int num2){
		int result;
		result = num - num2;
		return result;
	}

	BigInt operator*(BigInt obj2){
		BigInt result;
		result.num = num * obj2.num;
		return result;
	}

	int operator*(int num2){
		int result;
		result = num * num2;
		return result;
	}

	BigInt operator/(BigInt obj2){
		BigInt result;
		if(obj2.num!=0){
		result.num = num + obj2.num;}
		else{
			std::cout<<"Error! Divisor is 0";
		}
		return result;
	}

	int operator/(int num2){
		int result;
		if(num2!=0){
		result = num + num2;}
		else{
			std::cout<<"Error! Divisor is 0";
		}
		return result;
	}

	BigInt operator++(){
		++num;
		return *this;
	}
	
	BigInt operator++(int){
		BigInt res(*this);
		++num;
		return res;
	}

	int getValue(){
		return num;
	}

	void setNum(int num){
		this->num=num;
	}
	friend int operator+(int number, BigInt& obj);
};

int operator+(int number, BigInt& obj){
	return obj+number;
}int operator-(int number, BigInt& obj){
	return obj-number;
}int operator*(int number, BigInt& obj){
	return obj*number;
}int operator/(int number, BigInt& obj){
	return obj/number;
}


int main(){
	BigInt i(5);
	std::cout<<"The value of i is "<<i.getValue()<<std::endl;
	
	BigInt j(9);
	std::cout<<"The value of j is "<<j.getValue()<<std::endl;
	
	BigInt add=i+j;
	BigInt subtract=i-j;
	BigInt multiply=i*j;
	BigInt divide=i/j;
	
	std::cout<<"The addition of "<<i.getValue()<<" and "<<j.getValue()<<" is "<<add.getValue()<<std::endl;
	std::cout<<"The subtraction of "<<i.getValue()<<" and "<<j.getValue()<<" is "<<subtract.getValue()<<std::endl;
	std::cout<<"The multiplication of "<<i.getValue()<<" and "<<j.getValue()<<" is "<<multiply.getValue()<<std::endl;
	std::cout<<"The division of "<<i.getValue()<<" and "<<j.getValue()<<" is "<<divide.getValue()<<std::endl;
	std::cout<<"The preincrement of "<<i.getValue();
	BigInt preincrement=++i;
	std::cout<<" gives value "<<preincrement.getValue()<<"\n";

	std::cout<<"The postincrement of "<<i.getValue();
	BigInt postincrement=i++;
	std::cout<<" gives value "<<postincrement.getValue()<<"\n";
	
	std::cout<<i+5<<std::endl;
	std::cout<<i-5<<std::endl;
	std::cout<<i*5<<std::endl;
	std::cout<<i/5<<std::endl;

	return 0;


}
