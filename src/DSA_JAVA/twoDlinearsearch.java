package DSA_JAVA;

import java.util.Arrays;
//check
public class twoDlinearsearch {
    public static void main(String[]args){
        int[][]arr={
                {1,2,3,4,5},
                {23, 56, 78, 90},
                {55,89,24}
        };
        int target=56;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
        static int[] search(int[][]arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
