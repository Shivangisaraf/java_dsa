package DSA_JAVA;

public class pattern1 {
    public static void main(String[] args) {
        patternno1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
    }

    static void patternno1(int n) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row=0;row<2*n;row++){
           int colsinrow=row>n?2*n-row:row;
           for(int col=0;col<colsinrow;col++){
               System.out.print("* ");
           }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int row=0; row<2*n; row++){
            int colinrow=row>n?2*n-row:row;
            int space=n-colinrow;
            for(int s=0;s<space;s++){
                System.out.print(" ");
            }
            for(int col=0;col<colinrow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


