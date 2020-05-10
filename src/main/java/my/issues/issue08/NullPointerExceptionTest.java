package my.issues.issue08;

public class NullPointerExceptionTest {
    //Java program to demonstrate NullPointerException
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            String a = null;
            System.out.println(a.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("This is NullPointerException.");
        }
        System.out.println("Stop");
    }
}
