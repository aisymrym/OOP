//score, ID, name, className
import java.util.Scanner;
public class Marks{
    private String name, ID, className;
    private float score;

    public void addMark(int i){
        Scanner input = new Scanner(System.in);
        System.out.print("Student "+(i+1)+" :");
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("ID: ");
        ID = input.nextLine();
        System.out.print("Class Name: ");
        className = input.nextLine();
        System.out.print("Score: ");
        score = input.nextFloat();input.nextLine();
    }

    public float getScore(){
        return score;
    }
}