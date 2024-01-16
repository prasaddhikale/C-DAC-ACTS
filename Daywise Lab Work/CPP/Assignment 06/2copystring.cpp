/*Copy the source string "src" into destination string "dest".
void StrCpy(char dest[], char src[]);*/



#include <iostream>
using namespace std;

void StrCpy(char dest[], char src[]);
int main(){
    char arr[100];
    cout<<"Enter a String : ";
    cin>>arr;
    char dest[100];
    StrCpy(dest,arr);
    cout<<endl<<dest;
    return 0;
}


void StrCpy(char dest[], char src[]){
    for(int i=0;src[i]!='\0';i++){
        dest[i]=src[i];
    }

   
}







