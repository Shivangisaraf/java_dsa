package DSA_JAVA;

public class floorBS {
//floor->greatest element smaller than or equal to the target
    public static void main(String[]args){
    int[]arr={1,2,3,4,6,7,8,9};
    int target=5;
    int ans=search(arr,target);
        System.out.println("nearest index: "+ans);
}
    static int search(int[]arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return  end;
        //loop break start=end+1;
    }
}
