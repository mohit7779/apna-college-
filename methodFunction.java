//import java.lang.*;
//import java.util.Scanner;
import java.util.*;

public class methodFunction {


   // public static int calculateSum(int a , int b){
     //   int sum = a+b;
       // return sum;
    //}
//     public static int calculateProduct(int a , int b){
//         return a * b;
//     }
// public static void main(String[] args){
//     try (Scanner sc = new Scanner(System.in)) {
//    int a = sc.nextInt();
//    int b = sc.nextInt();
   
//    //int sum = calculateSum(a, b);
//               //or 
//    System.out.println("product of two sum is: "+ calculateProduct(a, b));
//  }
//  }


//        QS:   print factorial:


// public static void printFactorial(int n) {
  
//   if(n < 0){
//     System.out.println("invalid number");
//     return;
//   } 

//   //loop:
//   int factorial = 1;
//   for(int i=n; i>=1; i--){
  
//     factorial = factorial * i ;
//   }
//   System.out.println(factorial);
//   return;
// }

// public static void main(String[] args){
// try(Scanner sc = new Scanner(System.in)){
// int n = sc.nextInt();
//  printFactorial(n);
// } 
//  }

 // }


//QS: find product of a & b:

// public static int multiply(int a, int b){
// int product = a * b;
// return product;
// }
// public static void main(String[] args){
// int a = 3; 
// int b = 5;
// int prod = multiply(a,b);
// System.out.println("a * b :"+prod);
// prod = multiply(32, 2);
// System.out.println("a * b :"+prod);
// }



// QS: print factotial (second method):


// public static int factorial(int n){
//   int f = 1;
  
//   //loop:
//   for(int i=1; i<=n; i++){
//     f = f * i;
//   }
//   return f;
// }

// public static void main(String[] args){
// try(Scanner sc = new Scanner(System.in)){
// int n = sc.nextInt();
//   System.out.println(factorial(n));
// }
// }

// binomial coefficient:
// public static int binCoeff(int n,int r){
//   int fact_n = factorial(n);
//   int fact_r = factorial(r);
//   int fact_nmr = factorial(n-r);

//   int binCoeff = fact_n / (fact_r*fact_nmr);
//   return binCoeff;
// }


//QS: function overloading ( print sum of two number:)
// public static int sum(int a , int b){
//   return a+b;
// }

// public static int sum(int a , int b ,int c){
//   return a+b+c;
// }

// public static float sum(float a, float b){
//   return a+b;
// }
 

//QS: check if a number is prime or not:
// public static boolean isPrime(int n){
//   boolean isPrime = true;
//   for(int i=2; i<=n-1; i++){
//     if(n % i ==0){
//       isPrime = false;
//      break;
//     }
     
//   }
//     return isPrime;
// }


//optimised
// public static  boolean isPrime(int n){
//   if(n == 2){
//     return true;
//   }

//   for(int i=2; i<=Math.sqrt(n); i++){
//     if(n % i == 0){
//       return false;
//     }
    
//   }
//   return true;
// }

// public static void primeInRange(int n){
//   for(int i=2; i<=n; i++){
//     if(isPrime(i)){
//       System.out.print(i+" ");
//     }
//   }
  
//   System.out.println();
// }


// public static void main (String [] args){
// System.out.println(binCoeff(5,3));
// System.out.println(sum(5,5));
// // System.out.println(sum(5,5,5));
// System.out.println(sum(5.5f,5.0f));
// System.out.println(isPrime(4));
  //primeInRange(100);

// }

// convert binary to decimal:
// public static void binToDec(int binNum){
//   int myNum = binNum;
//   int pow = 0;
//   int decNum = 0;
//   while(binNum > 0){
//     int lastDigit = binNum % 10;
//     decNum = decNum + (lastDigit + (int)Math.pow(2,pow));
//     pow++;
//     binNum = binNum/10;
//   }
//   System.out.println("decimal of" + myNum +" = " + decNum);
// }


// public static void decToBin(int n){
//   int myNum  = n;
//   int pow = 0;
//   int binNum = 0;

//   while(n > 0){
//     int rem = n % 2;
//     binNum = binNum + (rem * (int)Math.pow(10,pow));
//     pow++;
//     n = n/2;
//   }
//   System.out.println("binary form of"  + myNum  + " = " + binNum);
// }


// public static void main(String[] args){
//  // binToDec(101);
//  decToBin(9);
// }


//Qs: write a java method to compute the average of three number:

// public static void main(String [] args){
//   try(Scanner sc = new Scanner(System.in)){
//     System.out.println("input the first number: ");
//     double x = sc.nextDouble();
//     System.out.println("input the second number: ");
//     double y = sc.nextDouble();
//     System.out.println("input the third number: ");
//     double z = sc.nextDouble();
//     System.out.println("the average value is " + average(x,y,z)+"\n" );
//   }
//   double average(double x, double y, double z){
//     return (x+y+z)/3;
//   }
// }

// private static String average(double x, double y, double z) {
//   return null;
// }



// public static void main(String[]args){
//   try(Scanner sc = new Scanner(System.in)){
//     int num;

//     System.out.print("enter an integer: ");
//     num = sc.nextInt();

//     if(isEven(num)){
//       System.out.println("nember is even");
//     }else{
//       System.out.println("number is odd");
//     }
//   }

//  boolean isEven(int n){
//     if(n % 2 == 0){
//       return true;
//     }
//     else{
//       return false;
//     }
//   }
// }

// private static boolean isEven(int num) {
//   return false;
// }
 














}