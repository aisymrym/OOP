//name, address (splitted), principal's name (fname, lname)

public class School{
    private String sname;
    private Address addr=new Address();
    private String address;
    private Name pname = new Name();
    private String principalName;
    private Marks student[] = new Marks[3]; //can access details of each mark
    private float average, sd;


    public School(String sname){
        this.sname = sname;
    }
    public String getName(){
        return sname;
    }

    public void setAddr(){
        address= addr.setFullAddr();
    }
    public String getAddr(){
        return address;
    }

    public void setPName(){
        principalName = pname.setPName();
    }
    public String getPName(){
        return principalName;
    }


    public void setMarks(){
        for (int i=0; i<3; i++){
            student[i]=new Marks();
            student[i].addMark(i);
        }
    }

    public float calcAvg(){
        float total=0;
        for(int i=0; i < 3; i++){
            total += student[i].getScore();
        }
        average = total/3;
        return average;
    }

    public double calcSd(){
        for (int i=0; i < 3; i++) {
            sd += Math.pow(student[i].getScore() - average, 2);
        }
        return Math.sqrt(sd/3);
    }

}