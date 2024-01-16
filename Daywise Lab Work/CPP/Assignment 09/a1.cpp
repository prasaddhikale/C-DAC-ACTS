
#include <iostream>
#include<cstring>
using namespace std;


class String{
	private:			
		char *arr;
		int size;
	public :
		String():size(10)			
		{	arr=creatememory(size);
			arr="default";
		}
		String ( char*ch)
		{   int length=strlen(ch);
			arr=creatememory(length+1);
			strcpy(arr,ch);
		}
		String(String &obj)
		{ size=obj.size;
			arr=creatememory(size);
			strcpy(arr,obj.arr);
			}	
			String operator=(String &obj)
	{  

				size=obj.size;
				delete[] arr;
				arr=creatememory(size);
				strcpy(arr,obj.arr);
				this->display();
				return *this;
			}
			~String()			//destructor
			{
				cout<<"\n memory is free ";
				cout<<endl;
				delete[] arr;		//memory free
			}
			char* creatememory(int n)
			{
				char *ch=new char[n];
				return ch;
			}
			void display()
			{   for(int i=0;arr[i]!='\0';i++)
				{
				
				cout<<arr[i];
				}
				cout<<endl;
			}
};
int main(){
	 String s1("Tejas");
	 cout<<"\n perametrized string is :- ";
	 s1.display();
	String s2(s1);
	cout<<"\n after the deep copy from copy constructor, string is :- ";
	s2.display();
	String s3;
	cout<<"\n the default string is :- ";
	s3.display();
	s3=s1;
	cout<<"\n the deep copy from assignment operator, the resultend string is :-  ";
	s3.display();

	
return 0;
}

