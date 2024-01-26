package DSA_JAVA;

import java.util.ArrayList;
public class ArrayListRecursion {
    public static void main(String[] args) {
    int []arr={1,2,3,4,4,5};
        System.out.println(find(arr,4,0));
    }
    static ArrayList<Integer> find(int[]arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==target){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow=find(arr,target,index+1);
        list.addAll(ansFromBelow);

        return list;
    }
}
