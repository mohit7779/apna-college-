import java.util.*;
import java.util.LinkedList;

public class homework {
    // public static void main(String[] args){
     
    //   try (Scanner sc = new Scanner(System.in)) {
    //  int a = sc.nextInt();
      
    //  int b = sc.nextInt();

    //  int sum = (a + b ); 
    //  System.out.println(sum);

       //}


        //QUEUE QUESTION
       static void generatePrintBinary(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");
    
        while(n-- > 0){
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1+"0");
            q.add(s2+"1");
        }
    }
    
    public static void main(String[] args) {
        int n = 10;
        generatePrintBinary(n);
    
    }
    
    
    
    
    












  }
//}
