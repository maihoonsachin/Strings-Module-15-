import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1 = sc.nextLine();
        System.out.println("the entered String is :" + s1);
        System.out.println("now enter the string to concatnate with this string:");
        String s2 = sc.nextLine();
        s1 = s1.concat(s2);
        System.out.println("the final concatanated String is : " + s1);
    }
}
