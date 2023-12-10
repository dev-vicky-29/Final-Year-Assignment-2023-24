//Write a Program to Check a Leap Year
import java.io.*;
import java.util.Scanner;
//public class Leapyear
public class a12
{
public static void main(String[] args)
{
int year;
Scanner sc=new Scanner(System.in);
System.out.println("enter the year=");
year=sc.nextInt();
if((year%4==0)&&(year%100!=0||year%400==0))
{
System.out.println("given year is leap year");
}
else
System.out.println("given year is not leap year");
sc.close();
}
}