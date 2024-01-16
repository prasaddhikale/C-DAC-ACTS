#include<iostream>
using namespace std;

void strlower(char a[],char b[]){
    for (int i=0; a[i]!='\0';i++){
        if((a[i]>= 65 && a[i]<=90)){
            b[i]=a[i]+32;

        }
        else
        b[i]=a[i];
    }
    cout<<b;
}
int main(){
    char a[100],b[100];
    cout<<"Enter a string : ";
    cin>>a;
    strlower(a,b);

    return 0;
}