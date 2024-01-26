package DSA_JAVA;

public class LinearBinarySearch {
    public static void main(String[]args){
     int[]arr={18,12,-7,3,14,28};
     int target=12;
     int ans=linearSearch(arr,target);
    System.out.println("target is at index:"+ ans);

    System.out.println("Minimum number in the arrays is:"+min(arr));
    }
    static int linearSearch(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        int start=0;
        for(int i=start;i<arr.length;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
    //find the minimum number in the array;
    static int min(int[]arr){
        int low=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<low){
                low=arr[i];
            }
        }
        return low;
    }

}
