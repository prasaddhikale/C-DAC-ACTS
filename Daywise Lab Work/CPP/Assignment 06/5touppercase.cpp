#include<iostream>
using namespace std;

void strupper(char a[],char b[]){
    for (int i=0; a[i]!='\0';i++){
        if((a[i]>= 97 && a[i]<=122)){
            b[i]=a[i]-32;

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
    strupper(a,b);

    return 0;
}