package DSA_JAVA;

public class SkipAString {
    public static void main(String[] args) {
        System.out.println(skip("abshellondfn"));
        System.out.println(skipHellNotHello("abshellondfn"));
    }
   static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("hello")){
            return skip(up.substring(5));
        }
        else{
            return up.charAt(0)+skip(up.substring(1));
        }
   }
    static String skipHellNotHello(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("hell") && !up.startsWith("hello")){
            return skipHellNotHello(up.substring(3));
        }
        else{
            return up.charAt(0)+skipHellNotHello(up.substring(1));
        }
    }
}
