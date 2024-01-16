#include <iostream>
using namespace std ;
int maxOfArray(int *nums, int n);
void arrayInput(int *nums, int n){
    cout<<" Enter the all the numbers : ";
    for(int i=0;i<n;i++){
        cin>>nums[i];
    }
}
int main(){
    int nums[100];
    cout<<" Enter the number of elements in the array : ";
    int n;
    cin>>n;
    

    arrayInput(nums,n);
    int maxnumber = maxOfArray(nums,n);

    cout<<"maximum number entered is : "<<maxnumber;
    
}


int maxOfArray(int *nums,int n){
    int i=0;
    int max=0;

    for( i=0; i<n; i++){
        if(nums[i]>max)
            max=nums[i];
    }
    return max;
}

