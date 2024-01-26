package DSA_JAVA;

import java.util.Arrays;
public class InsertionSort {
    public static void main(String[]args){
        int[]arr={34,78,-12,0,33};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void sort(int[]arr){
        for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[]nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
