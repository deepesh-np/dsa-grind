// Last updated: 03/06/2025, 09:54:27
class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        int st =1;
        int end =arr.size()-2;
        int mid;
        while(st<=end){
             mid=st+(end-st)/2;
             if(arr[mid-1] < arr[mid] &&  arr[mid] > arr[mid+1]){
                  return mid ;
             } else if ( arr[mid-1] < arr[mid+1]){
                st = mid + 1;
             }else{ 
              end = mid - 1;
             }
        } return -1;
    }
};