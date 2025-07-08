import java.util.Scanner;

public class Agecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentyear = sc.nextInt();
        int birthyear = sc.nextInt();
        int age = currentyear - birthyear;
        System.out.println("your age is:"+age);

    }

}
