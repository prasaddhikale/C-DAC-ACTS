#include <iostream>
using namespace std ;
int maxOfArray(int nums[], int n);
int minOfArray(int *nums,int n);
int secondLargest(int * nums,int n);
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
    
    cout<<"second largest number entered is : "<<secondLargest(nums,n);
    
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
int minOfArray(int *nums,int n){
    int i=0;
    int min=nums[0];

    for( i=0; i<n; i++){
        if(nums[i]<min)
            min=nums[i];
    }
    return min;
}

int secondLargest(int * nums,int n){
    int maxnumber = maxOfArray(nums,n);//Max of the array stored in maxnumber
    int secondLargest = minOfArray(nums, n);//min of array stored as initial result

    for(int i=0;i<n;i++){
        if(maxnumber==nums[i])//If curent element of the array is the maximum element of the array, skip assignment, go to next number in array.
            continue;
        if(nums[i]>secondLargest)    //If result is less than current element in array, assign current element to result.
            secondLargest = nums[i];
        
    }
    return secondLargest;
} 