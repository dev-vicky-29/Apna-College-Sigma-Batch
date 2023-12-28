// Question 2: In a program, input the side of a square. You have to output the area of the
// square.
// (Hint : area of a square is (side x side))
import java.util.*;
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Side Of Square : ")
        int Side=sc.nextInt();
        int Area=Side*Side;
        System.out.println(Area);
        sc.close();
    }
}
