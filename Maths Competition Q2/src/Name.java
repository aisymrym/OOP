import java.util.Scanner;
public class Name{
    private String fname, lname, pname;

    public String setPName(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your principal's first name: ");
        fname = input.nextLine();
        System.out.println("Enter your principal's last name: ");
        lname = input.nextLine();

        pname = fname + " " + lname;
        return pname;
    }
}