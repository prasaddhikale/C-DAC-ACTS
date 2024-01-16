#include <iostream>
using namespace std ;

int minOfArray(int *nums, int n);
void arrayInput(int *nums, int n);

int main(){
    int nums[100];
    cout<<" Enter the number of elements in the array : ";
    int n;
    cin>>n;
    
    arrayInput(nums,n);
    int minnumber = minOfArray(nums,n);

    cout<<"minimum number entered is : "<<minnumber;
    
}

void arrayInput(int *nums, int n){
    cout<<" Enter the all the numbers : ";
    for(int i=0;i<n;i++){
        cin>>nums[i];
    }
}
int minOfArray(int *nums,int n){
    int i=0;
    int min=nums[0];

    for( i=0; i<n; i++){
        if(nums[i]<min)
            min=nums[i];
    }
    return min;
}

