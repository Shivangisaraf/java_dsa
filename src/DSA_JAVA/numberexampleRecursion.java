package DSA_JAVA;

public class numberexampleRecursion {
    public static void main(String[] args) {
        print1(1);
    }
    static void no1(int n){
        System.out.println(n);
        no2(2);
    }
    static void no2(int n){
        System.out.println(n);
        no3(3);
    }
    static void no3(int n){
        System.out.println(n);
        no4(4);
    }
    static void no4(int n){
        System.out.println(n);
        no5(5);
    }
    static void no5(int n){
        System.out.println(n);
    }

    //after recursion
    static void print1(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print1(n+1);
    }
}
