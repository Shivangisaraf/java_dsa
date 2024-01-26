package DSA_JAVA;

public class orderAgnostic {
    public static void main(String[]args){
        int[]arr={23,13,94,3,2};
        int target=94;
        int ans=Agnostic(arr,target);
        System.out.println("index:"+ans);
    }
    static int Agnostic(int[]arr,int target){
        int start=0;
        int end=arr.length-1;

        boolean isAsc=arr[start]<=arr[end];
        while(start<=end){
            int mid=start=(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
