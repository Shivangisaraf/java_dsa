package DSA_2;

public class OnetoNRecursion {
    public static void main(String[] args) {
        print2(0,10);
    }
    static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n);

    }
    static void print2(int i,int n){
        if(i>n){
            return ;
        }
        System.out.println(i);
        print2(i+1,n);
    }
}
