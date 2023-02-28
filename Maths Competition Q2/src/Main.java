/* 
1) get the score for a particular school in a particular year
2) list out the average score for each schools
3) list out the standard deviation for each schools sort the list
*/
import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        ArrayList<School> schList = new ArrayList<School>(); //creating new array
        int response = 0;
        System.out.println("WELCOME!");
        menu.dispMenu();
        response = input.nextInt();input.nextLine();

        while (response != 6){
            if (response == 1) {
                System.out.println("Enter name of the school: ");
                String name = input.nextLine();
                School sch = new School(name);
                schList.add(sch);
                sch.setAddr();
                sch.setPName();
                System.out.println("Successfully added!");
                menu.dispMenu();
                response = input.nextInt();input.nextLine();
            }

            else if (response == 2){
                for (int i=0; i<schList.size(); i++) {
                    System.out.println("School " + (i + 1) + ": " + (schList.get(i)).getName());
                }
                System.out.println("Enter the school you want to delete based on the number: ");
                int no = input.nextInt(); input.nextLine();
                schList.remove(no-1);
                System.out.println("Successfully deleted!");
                menu.dispMenu();
                response = input.nextInt();input.nextLine();
            }

            else if (response == 3){
                for (int i=0; i<schList.size(); i++){
                    System.out.println("School "+(i+1)+" name: " + (schList.get(i)).getName());
                    System.out.println("School "+(i+1)+" address: " + (schList.get(i)).getAddr());
                    System.out.println("School "+(i+1)+" principal's name: " + (schList.get(i)).getPName());
                    System.out.println("\n");
                }
                menu.dispMenu();
                response = input.nextInt();input.nextLine();
            }

            else if (response==4){
                for (int i=0; i<schList.size(); i++) {
                    System.out.println("School " + (i + 1) + ": " + (schList.get(i)).getName());
                }
                System.out.println("Which school do you want to add marks? ");
                int no = input.nextInt(); input.nextLine();
                schList.get(no-1).setMarks();
                menu.dispMenu();
                response = input.nextInt();input.nextLine();
            }

            else if (response == 5){
                for (int i=0; i<schList.size(); i++) {
                    System.out.println("School " + (i + 1) + ": " + (schList.get(i)).getName());
                }
                System.out.println("Which school do you want to calculate the average and the sd? ");
                int no = input.nextInt(); input.nextLine();
                System.out.println("Average: " + schList.get(no-1).calcAvg());
                System.out.println("Standard Deviation: " + schList.get(no-1).calcSd());
                menu.dispMenu();
                response = input.nextInt();input.nextLine();
            }

            else{
                System.out.println("ERROR!");
                menu.dispMenu();
                response = input.nextInt();input.nextLine();
            }
        }
        System.out.println("Thank you!");
    }
}
