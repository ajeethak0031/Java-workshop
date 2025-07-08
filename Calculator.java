import java.time.LocalDate;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("enter your date of birth(DD/MM/YYY):");
        String DateofBirth = inputScanner.nextLine();
        LocalDate birthDate = LocalDate.parse(DateofBirth);
        int yearofBirth = birthDate.getYear();
        int currentyear= LocalDate.now().getYear();
        int age = currentyear - yearofBirth;
        System.out.println("your age is:"+age);

    }

}
