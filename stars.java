public class stars{
    public static void main(String[] args){
   /*  int n = 5;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            int sum = i+j;
            if(sum % 2 == 0){
                System.out.print("1 ");
            } else {
                System.out.print("0 ");

            }           
           
        }
        System.out.println();
    }*/

    
       
            int n = 5;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                //spaces
                int spaces = 2 * (n-i);
                for(int j=1; j<=spaces; j++){
                    System.out.print(" ");
                }
                //2nd part
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    
            // lower half
            for(int i=n; i>=1; i--){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                //spaces
                int spaces = 2 * (n-i);
                for(int j=1; j<=spaces; j++){
                    System.out.print(" ");
                }
                //2nd part
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    

