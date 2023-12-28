import java.util.*;

public class JavaBasic5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of Circle: ");
        float r=sc.nextFloat();
        sc.close();
        float Area=3.14f * r *r;
        System.out.println(Area);
    }
}
