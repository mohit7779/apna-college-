import java.util.*;


public class loop {
    // public static void main(String[] args){
    //     try (Scanner sc = new Scanner(System.in)) {
    //    // int n = sc.nextInt();
        

        //for loop
    //    for(int i=1; i<11; i=i+1) {
    //        System.out.println(i);
    //     }
    //     for( int i = 0; i<11; i++){
    //        System.out.println(i+" ");
    //    }

//while loop:
    //   int i = 0;
    //    while(i < 11){
    //     System.out.println(i);
    //     i= i+1;
    //    }

// dowhile loop:
/*int i = 0;
do {
    System.out.println(i);
   i = i+1;

}while (i < 11);
/* */

//taking example of multipilication: using forloop::

// for (int i=1; i<11; i=i+1){
// System.out.println(i*n);
// }




//print sum of n natural number:
// int n = sc.nextInt();
// int sum = 0;

// int i = 1;
// while(i <= n){
// sum = sum + i;
// i++;
// }
// System.out.println(sum);



// print reverse of a number:
// int n = 10052002;
// while(n > 0){
//     int lastDigit = n%10;
//     System.out.print(lastDigit );
//     n = n / 10;
// }
// System.out.println(); 


// same question: reverse number:
// int n = 105202;
// int rev = 0;
// while(n > 0){
//     int lastDigit = n % 10;
//     rev = (rev*10) + lastDigit;
//     n = n/10;

// }
// System.out.println(rev);


// question break keyword:

//do{
// System.out.print("enter your number:");
// int n = sc.nextInt();

// if(n % 10 == 0){
//     break;
// }
//     System.out.println(n);
// }while(true);

// }


// continue statement:

// for(int i=1; i<=5; i++){
//     if( i == 3){
//         continue;
//     }
//     System.out.println(i);
// }
//         }

// Q: continue statement (do not print multiple of 10:)

// do{
//     System.out.println("enter your number: ");
//     int n = sc.nextInt();

//     if( n % 10 == 0){
//         continue;
//     }
//     System.out.println("number was : "+ n);
// }while(true);
        

// Q: check wheather its a prime num or not :

// int n = sc.nextInt();

// boolean isPrime = true;
// // using for loop:
// for(int i=2; i<= n-1; i++){
//     if(n%i == 0){
//         isPrime = false;

//     }
// } 
// if(isPrime == true){
//     System.out.println("n is prime");
// }else{
//     System.out.println("n is not prime");

// } 


// Q: print multiplication table of N number, entered by a user:

// int n = sc.nextInt();
// for(int i=0; i<=10; i++){
//     System.out.println(i*n);
// }



//Q: print factorial of n:
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

// int num;
// int fact = 1;

// System.out.println("enter any positive number: ");
// num = sc.nextInt();
// for(int i = 1; i<=num; i++){
//     fact *= i;
// }
// System.out.println("factorial: "+ fact);

//Q: 

//     public static void main(String[] args){
//         try (Scanner sc = new Scanner(System.in)) {

// int number;
// int choice;
// int evenSum = 0;
// int oddSum = 0;

// do{
//     System.out.println("enter the number :");
//     number = sc.nextInt();

//     if(number % 2 == 0){
//         evenSum += number;

//     }else{
//         oddSum += number;

//     }
//     System.out.println("do you want to continue? press 1 for yes or 0 for no");
//     choice = sc.nextInt();


// }while(choice==1);
// System.out.println("print sum of even number:"+ evenSum);
// System.out.println("print sum of odd number:"+ oddSum);
// }
// }






// practise

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     int range = sc.nextInt();
//     int counter = 1;

//     while(counter <= range){
//         System.out.print(counter+" ");
//         counter++;
//     }
//     System.out.println();
// }



//reverse

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("ENTER VALUE");
// int n = sc.nextInt();
// boolean isPrime = true;
// for(int i=1; i<=n-1; i++){
// if(n%i == 0){
//     isPrime = false;

// }
// }
// if(isPrime == true){
//     System.out.println("N IS prime");
// }else{
// System.out.println("n is  not prime");
// }
// }



public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter the number");
    int n = sc.nextInt();
    

   
}






















}