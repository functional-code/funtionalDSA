import java.util.*;
class camelcase{
    public static void main(String args[]){
     
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        int test = 1;

        for(int i=0 ; i< n.length(); i++){
            if( n.charAt(i)== n.charAt(n.length()-1-i)){
                test =test*1;
            }
            else{
                test = test*0;
            }
        }

        if( test ==1){
            System.out.println("this is a pal");

        }

        else{
            System.out.println("not");
        }



        }
        
    }
