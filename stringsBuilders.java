//import java.util.*;
public class stringsBuilders {
    public static void main(String[] args){
      StringBuilder sb = new StringBuilder("mohit");
      System.out.println(sb);
   
      // char at index 0:
      System.out.println(sb.charAt(0));

      //set charAt inder:
      sb.setCharAt(0, 's');
      System.out.println(sb);

      //insert char at index
      sb.insert(4,'s');
      System.out.println(sb);

      //delete char at index:
      sb.delete(4,5);    
      System.out.println(sb);
      
      // print length of string:
      sb.append(" kumar");
      System.out.println(sb);   

      System.out.println(sb.length());

    }
}
