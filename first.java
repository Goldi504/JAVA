import java.util.*;

public class first {
    public static void main(String args[])
    {
    Scanner sc =new Scanner(System.in);
    /*String input= sc.next();
    System.out.println(input);
    String name= sc.nextLine();
    System.out.println(name);
    int number= sc.nextInt();
    System.out.println(number);
    Byte by= sc.nextByte();
    System.out.println(by);
    Float ft= sc.nextFloat();
    System.out.println(ft);
    double doub = sc.nextDouble();
    System.out.println(doub);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int product =a*b;
    System.out.println(product);
    
    float height=sc.nextFloat();
    float base=sc.nextFloat();
    float area=0.5f*height*base;
    System.out.println(area);
    int a=23;
    float b= (int)a;
    System.out.println(b);
    float marks=24.999f;
    int marks1=(int)marks;
    System.out.println(marks1);
    char ch='a';
    char ch2='b';
    int number=ch;
    int number2=ch2;
System.out.println(number);
System.out.println(number2);  
char a='a';
char b='b';
System.out.println((int)b); 
System.out.println((int)a);
System.out.println(b-a);  
char a='a';
char b='b';
char c='c';
byte bt=(byte)(a+b+c);
System.out.println(bt);
int a=10;
float b=25.02f;
long c=30;
double d=20;
double sum=a+b+c+d;
System.out.println(sum);
int a= sc.nextInt();
int b= sc.nextInt();
int c=sc.nextInt();
int avg=(a+b+c)/3;
System.out.println( avg);
int side=sc.nextInt();
int area=side*side;
System.out.println(area);
float pencil=sc.nextFloat();
float pen=sc.nextFloat();
float eraser=sc.nextFloat();
float total= pencil+pen+eraser;
System.out.println(total);
float newTotal=total+(0.18f* total);
System.out.println("Bill with 18% tax" + newTotal);
byte b=4;
char c='a';
short s=512;
int i= 1000;
float f=3.14f;
double d=99.9954f;
double result=(f*b)+(i*c)-(d*s);
System.out.println(result);
int a=10;
int b=a++;
System.out.println(a);
System.out.println(b);
int a=10;
int b=--a;
System.out.println(a);
System.out.println(b);
int a=10;
int b=5;
System.out.println(a==b);
int x=200 ,y= 50,z=100;
if(x>y && y>z){
    System.out.println("Hello");
}
if(z>y && z<x){
    System.out.println("Java");
}
if((y+200)<x && (y+150)<z){
    System.out.println("Hello Java");
}
    }
}
int x = 9, y = 12;
int a = 2, b = 4, c = 6;
int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
System.out.println(exp);
    }
}
/*int a= 10;
//int b=5;


System.out.println(!(0<a));
 
 
 int x = 10, y = 5;
 int exp1 = (y * (x / y + x / y));
 int exp2 = (y * x / y + y * x / y);
 System.out.println(exp1);
 System.out.println(exp2);
 }
}
 int x = 200, y = 50, z = 100;
 if(x > y && y > z){
 System.out.println("Hello");
 }
 if(z > y && z < x){
 System.out.println("Java");
 }
 if((y+200) < x && (y+150) < z){
 System.out.println("Hello Java");
 }
 }
}
 int income = sc.nextInt();
int tax = sc.nextInt();
if(income<5l){
    System.out.println("0%tax");
}
    else if(income<=10l){
   System.out.println("20%tax");
}
else{
    System.out.println("30%tax");
}
    }
}
int a=1,b=3,c=6;
if ((a>=b)&&(a>=c)) {
    System.out.println(" largest is A");
    
}
else if(b>=c){
    System.out.println("largest is B");
}
else{
    System.out.println("largest is C");
}
    }
}
int marks=100;
String  type=((marks)>=33)?"pass":"fail";
System.out.println(type);
    }
}
char ch='G';
switch (ch) {
    case 'G':System.out.println("Goldi");
    break;
    case 'b':System.out.println("two");
    break;
    case 'c':System.out.println("three");
        
        //break;

    default:System.out.println("No any number");
       // break;
}
    }
}
System.out.println("enter a:");
int a= sc.nextInt();
System.out.println("enter b:");
int b=sc.nextInt();
System.out.println("enter operator");
char operator=sc.next().charAt(0);

switch (operator) {
    case '+': System.out.println(a+b);
        break;
        case '-': System.out.println(a-b);
        break;
case '*':System.out.println(a*b);
break;
case'/':System.out.println(a/b);
break;
case '%':System.out.println(a%b);
    default:System.out.println("wrong operator");
        
}
    }
}*/
/* conditional stat problem 
int a= sc.nextInt();
if(a>=0){
System.out.println("positive");
}
else{
    System.out.println("negative");
}
    }
}
double temp=105.3;
if(temp>100){
    System.out.println("You havea fever");
}
else{
    System.out.println(" Not You havea fever");
    }
    }
    int week =sc.nextInt();
    switch (week) {
        case 1:System.out.println("Monday");
    
    case 2:System.out.println("Tuseday");
    case 3:System.out.println("Wednesday");
    case 4:System.out.println("Thrusday");
    case 5:System.out.println("Friday");
    case 6:System.out.println("Saturday");
    case 7:System.out.println("Sunday");
    break;
            default:System.out.println("No days");
            break;
    }
}
}
 int a = 63, b = 36;
 boolean x = (a < b ) ? true : false;
 int y= (a > b ) ? a : b;
 System.out.println(x);
 System.out.println(y);
    }
}
System.out.print("Input the year: ");
 int year = sc.nextInt();
 boolean x = (year % 4) == 0;
 boolean y = (year % 100) != 0;
 boolean z = ((year % 100 == 0) && (year % 400 == 0));
 if (x && (y || z)) {
 System.out.println(year + " is a leap year");
 } else {
 System.out.println(year + " is not a leap year");
 }
}
}
//int range=sc.nextInt();
int counter=0;
//int n=range;
while (counter<=100)
{
System.out.println(counter + " ");
counter++;
    
}
    }
}

for( int i=1; i<=4; i++){
    System.out.println("****");
}
for( int j=1; j<=4; j++){
    System.out.println("****");
}
    }
}

//int n=sc.nextInt();
int n=5;
int sum=0;
int i=1;
while(i<=n){
    sum+=i;
    i++;
}
    }
}
int n=10;
int i=1;
int counter=1;
do{
    System.out.println("hello world");
}
while(counter<=n);
    }
}
int n=10899;
while(n>0){
     int lastDigit=n%10;
     System.out.print(lastDigit +" ");
     n=n/10;

}
    }
}
for(int i=1; i<=5; i++)
{
    if(i==3){
        continue;
    }
    System.out.println(i);
}
}
}
do{
   System.out.println("enter the number");
   int n=sc.nextInt();
   if(n%10==0)
   {
    continue;
   }
    System.out.println("number was :" +n);

   } while(true); 
    
   
}
    
}

 for(int i=0; i<5; i++) {
 System.out.println("Hello");
 i+=2;
 }
 }
}
int n=sc.nextInt();
if(n%2==0){
    System.out.println("even");

}
else{
    System.out.println("odd");
}
    }
}
 for(int i=0; i<5; i++) {
 System.out.println("i = " +i);
 }
 
 System.out.println("i after the loop = " + i);
}
}
    }
    int num;
    int fact=1;
    System.out.println("enter the positive integer ");
    num=sc.nextInt();
    for(int i=1; i<=num; i++)
    {
        fact *=i;
    }
    System.out.println("Factorial:" + fact);
}
}
 public static void printMultiplicationTable(int number){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter number:");
 int n = sc.nextInt();
 for(int i=1; i<=10; i++) {
 System.out.println(n + " * " + i + " = " + n*i);
 }
 }
 public static void main(String s[]) {
 printMultiplicationTable(5);
 }
}
int n=4;
    for(int stat=1; stat<=4; stat++)
    {
        for(int line=1; line<=(n-stat+1); line++)
    
    {
        System.out.print("*");
        
    }
    System.out.println( );
}

}
}
int n=5;
for(int line=1; line<=n; line++)
{
    for(int number=1; number<=line; number++)
    {
        System.out.print(number);
    }
    System.out.println( );
}
    }
    }
int n=4;
char ch='A';
for(int line=1; line<=n; line++)
{
    for(int cha=1; cha<=line; cha++)
    {
       System.out.print(ch);
       ch++;
    }
    System.out.println( );
}
    }
}
int n=5;
char ch='a';
for(int line=1; line<=n; line++)
{
    for(int cha=1; cha<=n-cha+1; cha++)
    {
        System.out.print(ch);
        ch++;
    }
    System.out.println( );
}
    }

}*/


 

 
 




 
 
    
