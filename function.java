import java.util.*;
public class function {
    public static int calculateSum(int a ,int b){
int sum=a+b;
return sum;
    }
    public static void main(String args[]){
        int a=5;
        int b=10;
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a=" +a);
        System.out.println("b="+5 );
    }
}
   
    
// }
// public static int changeA(int a)

// {
//     a=10;
//     return a;
// }
// public static void main(String args[]){
//     int a=5;
//     changeA(a);
//     System.out.println(a);
// }
// }
// public static int multiply(int a, int b){
//     int product=a*b;
//     return product;
// }
// public static void main(String args[]){
//     int a=3;
//     int b=5;
//     int pro=multiply(a,b);
//     System.out.println("a*b=" +pro);
// }
// }
// public static int factorial(int n){
//     int f=1;

// for(int i=1; i<=n; i++)
// {




//  f=f*i;
// }
// return f;
// }
// public static void main(String args[])
// {
    
// System.out.println(factorial(4));
// }
// }
// public static int binCoeff(int n, int r){
//     int fact_n= Factorial(n);
//     int fact_r= Factorial(r);
//     int fact_mnr= Factorial(n-r);
//     int binCoeff=fact_n/(fact_r*fact_mnr);
//     return binCoeff;
// }
// public static void main(String args[])
// {
//     System.out.println(binCoeff(5, 2));
// }
// }
// public static void binToDec(int binNum){
//   int myNum=binNum;
//   int pow =0;
//   int decNum = 0;
//   while(binNum >0){
//     int lastDigit = binNum % 10;
//     decNum = decNum + (lastDigit* (int) Math.pow(2,pow));
//     pow++;
//     binNum = binNum/10;
//   }
//   System.out.println("decimal of " + myNum + " =" + decNum);
// }
// public static void main(String args[]){
//   binToDec(111);
// }
// }
// public static void binToDec(int binNum)
// {
//   int myNum=binNum;
//   int pow=0;
//   int decNum=0;
//   while ((binNum>0)) {
//     int lastDigit =binNum%10;
//     decNum=decNum+(lastDigit*(int) Math.pow(2 ,pow));
//     pow++;
//     binNum =binNum/10;
    
//   }
//   System.out.println("decimal of " +myNum + "= " +decNum);
// }
// public static void main(String args[]){
//   binToDec(101);
// }
// }
// public static void main(String args []){
  
 //Scanner sc=new Scanner(System.in);
 
    
// System.out.print("Input the number: ");
// int a= sc.nextInt();
// System.out.print("Input the first number:");
// int b= sc.nextInt();
// System.out.print("Input the  second number:");
// int c=sc.nextInt();
// System.out.print("Input the third number:");
// System.out.print("Average of three number =" + average(a,b,c)+"\n");

// }
// public static int average(int a, int b,int c){
//     return (a+b+c)/3;
// }
// }
