#include <iostream>
using namespace std ;
bool search(int nums[], int n, int element);

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
    cout<<"Enter the elements that you want to search : ";
    int element;
    cin>>element;
    bool check = search(nums,n,element);
    if (check == true)
    cout<<"Element is present";
    else
    cout<<"Element is not present";
    
}
bool search(int nums[], int n, int element){

    for(int i=0;i<n;i++){
        if(nums[i]==element)
            return true;
    }
    return false;


}