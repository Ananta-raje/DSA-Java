//calculator
import java.util.*;

// import java.util.Scanner;

 public class javaBasics2 {
    //functions
    // public static void printHelloWorld () { 
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    // }
    // public static void calculateSum(int a,int b){
    //     int sum = a+b ;
    //     System.out.println("sum is: "+sum);
    // }
    
    // public static void main (String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     calculateSum(a,b);
    // }

    // Average of 3 numbers
    //  public static void main (String args []) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int c = sc.nextInt();
    //     int avg = (a+b+c)/3 ;

    //     System.out.println("The avg is:"+avg);
    //  }
    

    //find the product of two numbers
//     public static int multiply(int a, int b){
//         int product = a*b ;
//         return product;   
//     }

//     public static void main (String args[]) {
//         int a = 3;
//         int b = 5;
//        int prod =multiply(a,b);
//        System.out.println("a*b ="+prod);
//     }
// }


// Calculater 
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a");
//         int a = sc.nextInt();
//         System.out.println("enter b");
//         int b = sc.nextInt();
//         System.out.println("enter operator");
//         char operator =  sc.next().charAt(0);

//         switch(operator){
//             case '+' : System.out.println(a+b);
//                       break;
//             case '-' : System.out.println(a-b);
//                       break;
//             case '*' : System.out.println(a*b);
//                       break;
//             case '/' : System.out.println(a/b);
//                       break;
//             case '%' : System.out.println(a%b);
//                       break;
//             default  :System.out.println(" wrong operator");      
                      

//            }
//     }
        
// }
// CONDITIONAL STATEMENTS 
// QUESTIONSQuestion1:WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negative
        //    Scanner sc = new Scanner(System.in);
        //    System.out.println("Enter a");
        //    int a = sc.nextInt();

        //    if (a>0) {
        //     System.out.println("positive number");
            
        //    }else if(a<0){
        //     System.out.println("negative number");
           
        //    }
// Income tax calculator
    //   public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int income = sc.nextInt();
    //     int tax;
    //     if(income<500000){
    //         tax = 0;
    //     } else if (income>=500000 && income<1000000) {
    //         tax = (int)(income * 0.2) ;
            
    //     } else{
    //         tax = (int)(income * 0.3) ;
           
    //     }
    //     System.out.println("your tax is:"+ tax);
    //   }


     
//Loops 
// while-loop
    //   public static void main(String[] args) {
    //   int counter = 0;
    //   while(counter<100){
    //     System.out.println("Hello World");
    //     counter++;
    //    }
    //    System.out.println("printed 100 times");

    //print num 1 to 10
    //  int counter = 1;
    //  while(counter<=10){
    //     System.out.println(counter);
    //     counter++;
    //  }
    //  System.out.println("completed");


    // print sum of first n natural numbers?
    // upto 6
    //   public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = 6;
    //     int sum = 0;
    //     int i = 1 ;
    //     while(i<=n){
    //     sum = sum+i;
    //     i++;
    //   }
    //   System.out.println("The sum is:"+sum);
    //   }  

       // print reverse of a number
    // int n = 234567;

    // while (n>0) {
    //     int lastdigit = n % 10;
    //     System.out.print(lastdigit);
    //     n = n/10;
    // }
    // System.out.println();

    //   }
    
    // // For loop
    //  public static void main(String[] args) {
    //    int i = 1;
    //    for(i=1; i<=10; i++) {
    //    System.out.println("hello World");
    //    }

         // print square pattern
    //    for(int line = 1; line<=4; line++){
    //     System.out.println("****");
    //    }
    // or
    //   int line = 1;
    //   while(line<=4){
    //     System.out.println("****");
    //     line++;
    //   }

    // }

   
       
 //   do while loop
        // public static void main(String[] args) {
         // int counter = 1 ;
        // do{
        //     System.out.println("hello World");
        //     counter++;
        // }while(counter<=10);


        // keep entering numbers till users enters a multilple of 10

        // Scanner sc = new Scanner(System.in);
        // do{
        //     System.out.println("Enter your number :");

        //     int n = sc.nextInt();
        //     if(n%10 == 0){
        //         break;
        //     }
        //     System.out.println(n);
        // }while(true);
        // }
       
        
    // continue Statement--to skip the iteration

        // public static void main(String[] args) {
        // int i = 1;
        // for(i=1; i<=5; i++){
        //     if(i==3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }
        
        // Display all numbers entered by users expect multiples of 10
        // Scanner sc = new Scanner(System.in);
        
        // do{
        //     System.out.print("Enter a number:");
        //     int n = sc.nextInt();
        //     if(n%10 == 0){
        //         continue;
        //     }
        //     System.out.println("your num :"+n);

        // }while(true);

        // check if the number is prime or not

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // if(n==2){
        //     System.out.println("n is prime");
        // }else{
        //      boolean isPrime = true;
        //  for(int i = 2; i<=Math.sqrt(n); i++){
        //     if(n%i==0){
        //       isPrime = false;
        //     }
        //  }
        //     if(isPrime==true){
        //         System.out.println("n is prime");
        //     }else{
        //     System.out.println("n is not prime");
        //     }
         

        // }
        

    // print star pattern//nested pattern
        // for(int line = 1;line<=4 ; line++){
        //   for(int star = 1; star<=line ; star++){
        //     System.out.print("*");
        //   }
        //   System.out.println();
        // }

        // for(int line = 1; line<=4 ; line++){
        //     for(int star = 4; star>=line ; star--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // or
        // int n = 4;
        // for(int line = 1; line<=4 ; line++){
        //     for(int star = 1; star<=n-line+1 ; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
 
   // print half pyramid pattern
        //    for(int i = 1 ; i<=4 ; i++){
        //     for(int j = 1; j<=i ; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        //    }
        
   // print charactor pattern
        // int n = 4;
        // char ch = 'A';
        // for(int line = 1; line<=n;line++){
        //     for(int chars=A;chars<=line ; chars++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
    //   }

//   Functions or methods
// calculate product
// public static int calculateProduct(int a, int b){
//     int product = a*b ;
//     return product;
// }

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int product = calculateProduct(a,b);

//     System.out.println(product);
// }
// //factorial of a no  4
//  public static int factorial(int n){
//     int f = 1;

//     for(int i = 1; i<=n ; i++){
//         f = f*i;
//     }
//     return f;
//  }

//  Bionomial coeficant
//  public static int binCoeff(int n,int r){
//     int fact_n = factorial(n);
//     int fact_r = factorial(r);
//     int fact_nmr = factorial(n-r);
    
//     int binCoeff = fact_n/(fact_r*fact_nmr);
//     return binCoeff;
//  }
     
// public static void main(String[] args) {
//     System.out.println(factorial(4));
//     System.out.println(binCoeff(5, 2));// bionomial coeficent of a number 
// }

// check the number is prime or not
 
// public static boolean isPrime(int n){
//     if(n == 2){
//         return true;
//     }
//     for(int i = 2; i<=n-1; i++){
//         if(n%i==0){
//             return false;
//         }
//     }
//     return true ;
//   }

//     public static void main(String[] args) {
//         System.out.println(isPrime(8));

//     }
// Optimized method for prime numbers 
// public static boolean isPrime(int n){
//     if(n == 2){
//         return true;
//     }
//     for(int i = 2; i<=Math.sqrt(n); i++){
//         if(n%i==0){
//             return false;
//         }
//     }
//     return true ;
//   }

//     public static void main(String[] args) {
//         System.out.println(isPrime(8));

//     }

// Convert binary to decimal
// public static void binToDec(int binNum){
//     int MyNum = binNum;
//     int pow = 0;
//     int dec = 0;
//     while(binNum>0){
//         int LastDigit = binNum % 10;
//         dec = dec + (LastDigit * (int)Math.pow(2, pow));
//         pow++;
//         binNum = binNum / 10;
//     }
//     System.out.println("Decimal of "+MyNum+ " = " +dec);
// }

// public static void main(String[] args) {
//     binToDec(101);
// }

// convert dec to binary
// public static void decTobin(int decNum){
//     int MyNum = decNum;
//     int pow = 0;
//     int bin = 0;
//     while(decNum>0){
//       int rem = decNum % 2 ;
//       bin = bin + (rem*(int)Math.pow(10, pow)); 
//       pow++;
//       decNum = decNum/2 ;
//     }
//     System.out.println("Binary of"+MyNum+ " = "+bin);
// }

// public static void main(String[] args) {
//  decTobin(11);
// }

// FUNCTIONS QUESTIONS Question 1 :Write a Java method to compute the averageof three numbers..

// public static int avgOf(int a, int b, int c ){
//     int avg = (a+b+c)/3;
//     return avg;
// }

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter numbers: ");
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int c = sc.nextInt();
//     int Average = avgOf(a, b, c);
//     System.out.println("Avg is : "+ Average);
// }

// WriteamethodnamedisEventhatacceptsanintargument.Themethodshouldreturntrueiftheargumentiseven,orfalseotherwise.Alsowriteaprogramtotestyourmethod

// public static boolean isEven(int n){
//     if(n%2 == 0){
//         return true;
//     }
//     return false;
// }
// public static void main(String[] args) {
//     System.out.println(isEven(5));
// }
// WriteaJavaprogramtocheckifanumberisapalindromeinJava?


//prime numbers total
    // public static boolean isPrime(int n){
    //     if(n<2){
    //         return false;
    //     }
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i = 2; i <=Math.sqrt(n); i++){
    //         if(n % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // } 
    // public static void primeInRange(int n){
    //     int count = 0;
    //     for(int i = 2; i <= n; i++){
    //         if(isPrime(i)){
    //             System.out.print(i + " ");
    //             count += 1;
    //         }
    //     }
    //     System.out.println();
    //     System.out.println("Total no of prime no upto "+n+" is "+count);
    // }
    // public static void main(String [] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     primeInRange(n);
    // }

}

       




        
        

   