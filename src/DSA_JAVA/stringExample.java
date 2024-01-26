package DSA_JAVA;

public class stringExample {
    public static void main(String[] args) {
        String a="Shivangi";
        System.out.println(a);
        a="Shiv";
        System.out.println(a);

        String ab="Shivangi";
        String ba="Shivangi";//refering to the same object
        System.out.println(ab.equals(ba));//(ab==ba)

        String aa=new String("Shivangi");
        String bb=new String("Shivangi");//creating new object
        System.out.println("on creating new object:");
        System.out.println(aa==bb);
        System.out.println("to check the values");//.equals method
        System.out.println(aa.equals(bb));

        //to print the index character ->>>charAt is used
        System.out.println(bb.charAt(5));
    }
}
