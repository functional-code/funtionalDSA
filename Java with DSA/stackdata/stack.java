import java.util.*;

class Pen{
        String colour;
        String type;

        public void write(){
            System.out.println("writting something");
        }

        public void printcolor(){
            System.out.println(this.colour);
        }
    } 

class stack{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
 
        Pen pen1 = new Pen();
        pen1.colour = "blue";
        pen1.type = "gel";
        pen1.write();
        pen1.printcolor();


    }
    
}
