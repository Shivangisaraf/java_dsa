package DSA_2;
import java.util.Scanner;
public class S_digits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=7746;
        int count=0;
        while(n>0){
           count= count+1;
           n=n/10;
        }
        System.out.println(count);
    }

}
