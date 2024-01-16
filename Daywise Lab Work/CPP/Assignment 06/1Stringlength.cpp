/*Given a string, return its length.
int Strlen(char s[]);
*/

#include <iostream>
using namespace std;

int Strlen(char s[]);
int main(){
    char arr[100];

    cout<<"enter the string";
    cin>>arr ;
    cout<<"\nlength of string is" <<Strlen(arr); 


    return 0;
}

int Strlen(char s[]){
    int i=0;
    
    while(s[i]!='\0'){
        i++;
        

    }
    return i;

}









