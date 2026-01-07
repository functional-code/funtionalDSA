import java.util.*;

public class Classes {

    //create new data type

    public static class Car{
        String name ;
        String type;
        int price ;

    }
    public static class Student{
        String name;
        int rollno;
        double percent;
    }
    public static void main(String args[]){
        Student x= new Student();
        Scanner sc = new Scanner(System.in);
        x.name = "Tanishq";                        
        x.percent=84.4;
        x.rollno=21;

        Student y= new Student();
        y.name = "viveka";
        y.rollno =33;
        y.percent = 23.23;


        Car c = new Car();
        c.name= "alto";
        // c.price = 4L ;
        c.type = "idk";

        Car sco = new Car();
        sco.name = "scoda";
        // sco.price =34L ;
        sco.type = "idk";

        System.out.println(c);



        

        System.out.println(x.percent);
    }
    
}
 
