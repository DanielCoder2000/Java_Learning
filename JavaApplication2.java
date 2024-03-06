/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.Point;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Mmirwa Mothemane
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=10;
        int y=20;
       int sum =x+y;
 System.out.println("Hello World");
 System.out.println(x);
System.out.println(y);
System.out.println(sum);

 
 /* Java Data Types (Typed in pascal naming convention)*/
 // reference types
 Date now =new Date();
 System.out.println(now);
 Point point1 = new Point(x=1, y=1);
 Point point2 = point1;
 point1.y = 5;
 System.out.println(point2);
//strings 
String message = "Hello World";
System.out.println(message.isEmpty());
String names = "Letsatsi \nDarlington \nMothemane";
System.out.println(names);
//arrays 
int[] numbers={1, 2, 5, 8, 7, 4};
System.out.println(numbers.length);
System.out.println(numbers[5]);
Arrays.sort(numbers);
System.out.println(Arrays.toString(numbers));

int [][] mNumbers={{2,5,1},{8,5,8}};
System.out.println(mNumbers.length);
System.out.println(Arrays.deepToString(mNumbers));
//constants
/*float pi=3.14f;
pi =3;  normal situation*/
final float PI=3.14f;
//arithmetic mathenatics
int a = 3;
int b = 10;

sum =a+b;
int difference = a-b;
double division= (double)b/ (double)a;
int multiply=a*b;
int modulus=b%a;
System.out.println(sum);
System.out.println(difference);
System.out.println(division);
System.out.println(multiply);
System.out.println(modulus);
//increment and decrement
int k=10;
k++;
System.out.println(k);
k--;
System.out.println(k);
k+=4;
System.out.println(k);
k-=7;
System.out.println(k);
//order of operations
int c=10+3*2;
System.out.println(c);
int g=(10+3)*2;
System.out.println(g);
//casting  (automatic/implicit)byte > short > int > long > float > double
byte f=20;
int v=f;
System.out.println(v);
//(manual/explicit casting)
float s=10.22f;
int sum1 =(int)s +5;  
float sum2=s +(float)5;
System.out.println(sum1);
System.out.println(sum2);
String q="10.1";
double i=Double.parseDouble(q)+5.2;
System.out.println(i);
        // TODO code application logic here
    }
    
}
