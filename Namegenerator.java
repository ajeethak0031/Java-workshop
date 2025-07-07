import java.util.Scanner;

public class Namegenerator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System .in);
        System.out.println("enter your name");
        String name=sc.next();
        System.out.println("enter your gender");
        String gender=sc.next();
        System.out.println("enter your qualification");
        String qualification=sc.next();
        if("male".equalsIgnoreCase(gender)){
            System.out.println("Mr."+ name +" qualification "+qualification);
        }
        else if("female".equalsIgnoreCase(gender))
        {
            System.out.println("Mrs."+ name +" ,  "+qualification);
        }
        else
        {
            System.out.println("invalid gender");

        }
    }

}
