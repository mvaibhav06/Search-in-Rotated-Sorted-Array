package DSA;

import java.util.Arrays;

public class SearchInRotatedArray {

    public static int getIndex(int[] nums, int target){


        int low = 0;
        int high = nums.length -1;
        while (low < high){

            int mid = (low+high)/2;

            if (nums[mid] > nums[high]){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        int a = binarySearch(0,low-1, nums, target);
        int b = binarySearch(low,nums.length-1,nums,target);
        if(a != -1) return a;
        return b;
    }

    public static  int binarySearch(int low, int high, int[] nums, int target){
        while (low<=high){
            int mid = (low+high)/2;

            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,1,2,3};
//        System.out.println(getIndex(nums,8));
        getIndex(nums,8);
    }
}
