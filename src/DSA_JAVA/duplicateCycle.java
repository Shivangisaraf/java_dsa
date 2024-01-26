package DSA_JAVA;

import java.util.Arrays;
public class duplicateCycle {
    public static void main(String[] args) {
        int []arr={1,3,4,2,2};
        sort(arr);
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[]arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                int correct=arr[i]-1;
                if (arr[i] != arr[correct]) {
                    swap(arr,i,correct);
                }
                else{
                    return new int[]{arr[i]};
                }
            }
        }
        return new int[]{-1};
    }
    static void swap(int[]arr,int a ,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
