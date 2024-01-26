package DSA_2;

public class ReverseNumber {
    public static void main(String[] args) {
//        int revno=0;
//        int n=0;
//        while(n>0){
//            int last=n%10;
//            n=n/10;
//            revno=(revno*10)+last;
       // }
        print2Rev(0,10);
    }
    static void print(int i,int n){
        if(i<n){
            return;
        }

        System.out.println(i);
        print(i-1,n);
    }
    //backtracking
    static void print2(int i,int n){
        if(i<1){
            return;
        }
        print2(i-1,n);
        System.out.println(i);
    }
    static void print2Rev(int i,int n){
        if(i>n){
            return ;
        }
        System.out.println(n);
        print2Rev(i,n-1);
    }
}
