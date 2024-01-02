

public class bit {
    // public static void main (String[] args){
    //     try (Scanner sc = new Scanner(System.in)){
    //         int oper = sc.nextInt();

    //  int n = 5; //0101
    //  int pos = 1 ;
     
// Get bit
   //   if((bitMask & n)== 0){
   //      System.out.println("bit mask was zero");
   //   }else{
   //      System.out.println("bit mask was one");
   //   }

   //setBitMask(bitMask)-->
   //  int newNumber = bitMask | n;
   //  System.out.println(newNumber);


    //clear bit
// int notBitMask = ~(bitMask);
// int newNumber = notBitMask & n;
// System.out.println(newNumber);

// update bit mask: 
//      int bitMask = 1<<pos;
// if(oper == 1){
//     //set operation:
   
//     int newNumber = bitMask | n;
//     System.out.println(newNumber);
// }else{
//     // clear operation:
//     int newBitMask = ~(bitMask);
//     int newNumber = newBitMask & n;
//     System.out.println(newNumber);

// }


//     } 
// }


// ALPHA 2.0


// QS:  binary &....?

// public static void main(String[] args){
//     System.out.println(4^4);
//         //System.out.println(5|6);
        //     System.out.println(5^ 6);
//}



// find odd or even:

// public static void oddOrEven(int n){
//     int bitMask = 1;
//     if((n & bitMask) == 0){
//         System.out.println("even number");
//     }else{
//         System.out.println("odd number");
//     }
// }
// public static void main(String[] args){
// oddOrEven(3);
// oddOrEven(11);
// oddOrEven(1);
// }



// getithbit:


// public static int getIthBit(int n,int i){
//     int bitMask = 1<<i;
//     if((n & bitMask) == 0){
//         return 0;
//     }else{
//         return 1;
//     }
// }
// public static void main(String[] args){
// System.out.println(getIthBit(10, 2));
// }


// QS: setithbit


// public static int setIthBit(int n,int i){
// int bitMask = 1<<i;
// return n | bitMask;
// }
// public static void main(String[] args){
//     System.out.println(setIthBit(10, 2));

// }


// QS: clearithbit

// public static int clearIthBit(int n,int i){
// int bitmask = ~(1<<i);
// return n & bitmask;
// }

// public static int updateIthBit(int n,int i,int newBit){
// //     if(newBit == 0){
// //         return clearIthBit(n, i);

// //     }else{
// //         return setIthBit(n, i);
// //     }

//     // 2nd method
//     n = clearIthBit(n, i);
//     int BitMask = newBit<<i;
//     return n | BitMask;
// }

// public static void main(String[] args){
//     System.out.println(updateIthBit(10, 2,1));

// }


// clearithbits



// public static int clearIBits(int n,int i){
//     int bitmask = (~0)<<i; // left se right side: move krega
//     return n & bitmask;
// }
// public static void main(String[] args){
// System.out.println(clearIBits(5, 2));
// }



// clearbits in range


// public static int clearIBits(int n,int i,int j){ 
//     int a = ((~0)<<(j+1));
//     int b = (1<<i)-1;
//     int bitmask = a | b;
//     return n & bitmask;
// }



// public static void main(String[] args){
//     System.out.println(clearIBits(10, 2, 4));

// }



// public static boolean isPowerOfTwo(int n) {
//     return (n&(n-1)) == 0;
// }
// public static void main(String[] args){
//     System.out.println(isPowerOfTwo(16));

// }



// QS: count set bit..........(GOOGLE & AMAZON)


// public static int countSetBit(int n){
//     int count = 0;
//     while(n > 0){
//         if((n & 1) != 0){
//             count++;
//         }
//         n = n>>1;
//     }
//     return count;
// }
// public static void main(String[] args){
//     System.out.println(countSetBit(15));

// }


// public static int fastExpo(int a,int n){
//     int ans = 1;

//     while(n > 0){
//    if((n & 1)!= 0){
//         ans = ans * a;
//     }
//     a = a * a;
//     n = n>>1;
// }
// return ans;
// }
// public static void main(String[] args){
//     System.out.println(fastExpo(5, 3));

// }



//qs:swap two numbers without using any third variable:
// public static void main(String[] args){
//     int x = 3,y =4;
//     System.out.println("before swap: x = " + x + " and y = " + y);

//     //swawp using xor
//     x = x ^ y;
//     y = y ^ x;
//     x = x ^ y;
    
//     System.out.println("after swap: x = " + x + " and y = " + y);
// }


// QS:add 1 to an integer using bit manipulation:

// public static void main(String[] args){
//     int x = 6;
//     System.out.println(x + " + " + 1 + " is " + -~x);

//     x = -4;
//     System.out.println(x + " + " + 1 + " is " + -~x);

//     x = 0;
//     System.out.println(x + " + " + 1 + " is " + -~x);
// }




// QS: convvert upper case to lower case using bits:

// public static void main(String[] args){
//     // convert uppercase character to lowercase
//     for(char ch = 'A'; ch <= 'Z'; ch++){
//         System.out.print((char)(ch | ' '));
//     }
// }





}
