package DSA_JAVA;

public class binarySearchRecursion {
    public static void main(String[] args) {
    int[]arr={1,2,3,4,5,6,7,8,9};
    int target=4;
        System.out.println(binary(arr,target,0,arr.length-1));
    }
    static int binary(int[]arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;

        if(arr[m]==target){
            return m;
        }
        else if(target<arr[m]){
            return binary(arr,target,s,m-1);
        }
        return binary(arr,target,m+1,e);

    }
}
