import java.util.Scanner;
public class level1 {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number:");
        long a = scan.nextLong();
        String result = (a%2 == 0)?  "偶数":"奇数";
       System.out.println(result);
    }
}
