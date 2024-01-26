package DSA_JAVA;

import java.util.Arrays;
public class practice {
    public static void main(String[]args){
        int [][]arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(arr,37)));
    }
    static int[] search(int[][]arr,int target){
        int r=0;
        int col=arr.length-1;

        while(r<arr.length && col>0){
            if(target==arr[r][col]){
                return new int[]{r,col};
            }
            else if(target<arr[r][col]){
                col--;
            }
            else{
                r++;
            }
        }
        return new int []{-1,-1};
    }
}
