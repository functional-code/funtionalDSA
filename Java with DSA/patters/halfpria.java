import java.util.*;

public class halfpria {
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
//minor tweeks

    //     for(int j =1 ; j<=4 ; j++){
    //         for( int i =1;i<=4;i=i--){
    //             System.out.print("*");
    //         }System.out.println();
    //     }
        for( int i= 0;i<5;i++){
        for( int k=5-i)
            for(int j=0;j<=i;j++){
                
                System.out.print("*");
            }System.out.println();
        }


     }
}
