package DSA_2;

import org.w3c.dom.ls.LSOutput;

public class sumOfNumbers {
    public static void main(String[] args) {
        System.out.println(sum2(3));
    }
    //parameter
    static void sum(int i,int sum){
        if(i==0){
            System.out.println(sum);
            return;
        }
        sum(i-1,sum+i);
    }

    //function
    static int sum2(int n){
        if(n==0){
            return 0;
        }
        return n+ sum2(n-1);

    }
}
