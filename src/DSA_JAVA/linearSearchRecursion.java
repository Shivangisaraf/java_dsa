package DSA_JAVA;

import java.util.ArrayList;

public class linearSearchRecursion {
    public static void main(String[] args) {
     int[]arr={2,3,1,4,4,5};
     int target=4;
        System.out.println(search(arr,target,0));
        System.out.println(searchindex(arr,target,0));
        System.out.println(searchFromLast(arr,target,arr.length-1));
        ArrayList<Integer> ans=searchArray(arr,target,0,new ArrayList<>());
        System.out.println(ans);
    }
    static boolean search(int[]arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target|| search(arr,target,index+1);
    }
    static int searchindex(int[]arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
       if(arr[index]==target){
           return index;
       }
       return searchindex(arr,target,index+1);
    }
    static int searchFromLast(int[]arr,int target,int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return searchFromLast(arr,target,index-1);
    }
    //to get all the target like if there are two similar integers using array list
    static ArrayList<Integer> list=new ArrayList<>();
    static ArrayList<Integer> searchArray(int[]arr,int target,int index,ArrayList<Integer>list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return  searchArray(arr, target, index + 1, list);
    }
}
