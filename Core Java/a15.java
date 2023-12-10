//Write a Program to find out whether given string is Palindrome or Not
import java.util.Scanner;
public class a15
{
static void checkPalindrome(String input) 
{
boolean res = true;
int length = input.length();
for(int i=0; i<= length/2; i++) 
{
if(input.charAt(i) != input.charAt(length-i-1)) 
{
res = false;
break;
}
}
System.out.println(input + " is palindrome = "+res);
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter your Statement: ");
String str = sc.nextLine();
checkPalindrome(str);
}
}