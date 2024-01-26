package DSA_JAVA;

import java.util.Arrays;
public class MissingNumberCyclic {
    public static void main(String[] args) {
   int []arr={0,1,2,4};
   sorted(arr);
        System.out.println(Arrays.toString(sorted(arr)));
    }
    static int[] sorted(int[]arr){
        int i=0;
        while(i<arr.length) {
           int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return new int[]{index};
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
