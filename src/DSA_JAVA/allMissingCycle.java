package DSA_JAVA;

import java.util.Arrays;
public class allMissingCycle {
    //find all the missing number in the array
    public static void main(String[] args) {
    int []arr={4,3,2,7,8,2,3,1};
    sort(arr);
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[]sort(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        //find missing number
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                return new int[]{index+1};
            }
        }
        return new int[]{arr.length};
    }
    static void swap(int[]arr,int a ,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
