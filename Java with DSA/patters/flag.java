import java.util.*;

class flag {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();

        for(int i= 0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //dandi

        for(int i=0; i<5;i++){
            System.out.println("*");
        }
        //base

        for(int i=0;i<2;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=0;i<n;i++){
            for(int j=i;i>0;j--){
                System.out.println("*");
            }
        }
    }
    
}
