package com.learnstreamapi.NUMBER;
//Given an array of integers, write a function that returns the "kth" largest element in the
// array. Note that it is the kth largest element in the sorted order, not the kth distinct
// element.Example: For the array [3,2,1,5,6,4] and k = 2, the output should be 5.
import java.util.Arrays;

public class KthLargestElement {

    public static int findKthLargest(int [] nums, int k){

        Arrays.sort(nums);
        return nums[nums.length-k];
    }

    public static void main(String[] args) {

        int [] arr ={2,3,1,5,4,6};
        int k =2;
        int result =findKthLargest(arr,k);

        System.out.println("kth latgest element "+result);
    }
}
