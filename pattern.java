import javax.swing.plaf.synth.SynthOptionPaneUI;

public class pattern {
    public static void main(String[] args){
//int n = 5;
//int m = 6;
 //to print a solid rectangle:
// /for(int i=1; i<=n; i++){
//     //inner loop:
//     for(int j=1; j<=m; j++){
// System.out.print("*");
//     }
//     System.out.println();
// }


// for(int i=1; i<=n; i++){
//     for(int j=1; j<=m; j++){
//         if(i ==1 || j == 1 || i == n || j == m ){
//             System.out.print("*");

//         }else{
//             System.out.print(" ");
//         }        
//     }
//     System.out.println();
// }



/// pyramid:
// making inverted pyramid: by doing reverse code:                           
// int n = 4;
// for(int i=1; i<=n;i++){  
//     for(int j=n; j>=1;j--){ 
// for(int k=1; k<=i; k++){
//     System.out.print("*");
// }
// System.out.println();
// }
// }


// int n = 4;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }



// int n = 5;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print(j+" ");
//     }
//     System.out.println();
// }



// reverse counting
// int n = 5;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=n-i+1; j++){
//         System.out.print(j+" ");
//     }
//     System.out.println();
// }



// floyd's pyramid:

// int n = 5;
// int number = 1;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print(number+" ");
//         number++;
//     }
//     System.out.println();
// }




// 0,1 triangle:
// int n = 5;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
// int sum = i+j;
// if(sum % 2 == 0){
//     System.out.print("1 ");

// }else{
//     System.out.print("0 ");
// }
//     }
//     System.out.println();
//     }


// Q: print stars:
// for(int i=1; i <= 4; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

// Q2:
// int n = 4;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=n-i+1; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

//Q3:
// int n = 4;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }


//Q4:
// int n = 4;
// char ch = 'A';
// for(int i=1; i<=n; i++){
//     for(int chars=1; chars<=i; chars++){
//         System.out.print(ch);
//         ch++;
//     }
//     System.out.println();
// }

// Q2: inverted half pyramid with number pattern:
// int n = 5;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=n-i+1; j++){
//         System.out.print(j+" ");

//     }
//     System.out.println();
// }


// int n = 5;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=n-1; j++){
//         System.out.print("*");

//     }
//     System.out.println();
// }


//Q : floyd's pyramid:
// int n = 5;
// int number = 1;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print(number+" ");
//         number++;
//     }
//     System.out.println();
// }


    //Qs: triangle number pattern:
    // int n = 5;
    // for(int i=1; i<=n; i++){
    //     for(int j=1; j<=i; j++){
    //         int sum = i+j;
    //         if(sum % 2 == 0){
    //             System.out.print("1");
    //         }else{
    //             System.out.print("0");
    //         }
            
    //     }
    //     System.out.println();
    // } 
    
    
    //Qs: number pyramid pattern:

    // int n = 5;
    // for(int i=1; i<=n; i++){
    //     for(int j=i; j<=n-1; j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=i; j++){
    //         System.out.print(i+" ");
    //     }
    //     System.out.println();
    // }


 //Qs: dimond pattern:

//  int n = 5;
//  for(int i=1; i<=n; i++){
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     for(int j=1; j<=2*i-1; j++){
//         System.out.print("*");
//     }
//     System.out.println();
//  }


//  for(int i=n; i>=1; i--){
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     for(int j=1; j<=2*i-1; j++){
//         System.out.print("*");
//     }
//     System.out.println();
//  }


//Qs: palindaromic pattern :
// int n = 5;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     for(int j=i; j>=1; j--){
//         System.out.print(j);
//     }
//     for(int j=2; j<=i; j++){
//         System.out.print(j);
//     }
//     System.out.println();

// }



int n = 5;

for(int i=1; i<=n; i++){
    for(int j=1; j<=i; j++){
        System.out.print(j);
    }
    System.out.println();

}





















}
}
