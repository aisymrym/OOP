import java.util.Scanner;

public class Address{

    Scanner input = new Scanner(System.in);

    private String address;
    private int unitno;
    private String street;
    private int postcode;
    private String district;
    private String state;


    public String setFullAddr(){

        System.out.println("Enter your unit no: ");
        unitno = input.nextInt();input.nextLine();
        System.out.println("Enter your street name: ");
        street = input.nextLine();
        System.out.println("Enter your postcode: ");
        postcode = input.nextInt();input.nextLine();
        System.out.println("Enter your district: ");
        district = input.nextLine();
        System.out.println("Enter your state: ");
        state = input.nextLine();

        address= unitno + ", " + street + ", " + postcode + ", " + district + ", " + state;
        return address;
    }
}    
    
    