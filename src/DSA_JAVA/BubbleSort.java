package DSA_JAVA;

import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
    int[]nums={89,45,23,99,47,13,5};
    bubble(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void bubble(int[]arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
                //already swapped no need to check for other elements;
            }
        }
    }
}
