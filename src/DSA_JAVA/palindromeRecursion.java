package DSA_JAVA;

public class palindromeRecursion {
    public static void main(String[] args) {
        System.out.println(palindrome(123321));
    }
    static boolean palindrome(int n){
     return n==rev(n);
    }
    static int sum=0;
    static int rev(int n){
   if(n==0){
       return sum;
   }
   int rem=n%10;
   sum=sum*10+rem;

  return rev(n/10);
    }
}
