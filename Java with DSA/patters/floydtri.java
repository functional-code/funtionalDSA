import java.util.Scanner;

class floydtri{
    public static void main(String args[]){
       
        int n=4;
        int num=1;
     
        for(int i=1 ;i<=n;i++){
            for(int j=1 ; j<=i ;j++){
                System.out.print(num+" ");
                num++;
            }System.out.println();
    }     
                for(int i=1 ;i<=n;i++){
            for(int j=1 ; j<=i ;j++){
                if((i+j)%2 == 0){
                    System.err.print(1);
                }
                else{
                    System.out.print(0);
                }
            }System.out.println();
    }

    

 }


// public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();

        if(a==1){
            int n = sc.nextInt();

            for(int j=1 ; j<=n ;j++ ){
                
                        
                //  for(int w=n ; w>=j ;w--){
                //      System.out.print(" ");
                //  }               
                for(int i=j ; i>=1 ;i--){
                    System.out.print("*");
                }System.out.println();
            }

            for(int j=n ; j>=1 ;j-- ){
                
                        
                //  for(int w=n ; w>=j ;w--){
                //      System.out.print(" ");
                //  }               
                for(int i=j ; i>=1 ;i--){
                    System.out.print("*");
                }System.out.println();
            }

            for(int i=0;i<n;i++){
                System.out.println("*");
            }
            for(int k=0;k<2;k++){
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    System.out.print("*");
                }
            }System.out.println();

            System.out.println("*");

        }
        
        }

        else if(a == 0){
            System.out.println("stopped");
        }
    }


//   public static void main(String args[]){

//         Scanner sc =new Scanner(System.in);
//         int a = sc.nextInt();

//         if(a==1){
//             int n = sc.nextInt();

//             for(int j=n ; j>=1 ;j-- ){
//                 for(int i=j ; i>=1 ;i--){
//                     System.out.print("*");
//                 }System.out.println();
//             }


//         }

//         else if(a == 0){
//             System.out.println("stopped");
//         }
//     }



 