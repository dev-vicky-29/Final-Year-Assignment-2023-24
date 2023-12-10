//Write a Program to Perform basic Calculator Operations
import java.util.*;
//public class Calculator
public class a11
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter First Number:");
   int num1=sc.nextInt();
   System.out.println("Enter second Number:");
  int num2=sc.nextInt();
  System.out.println("Enter Operator:");
  char operator=sc.next().charAt(0);
  int  result;
  switch(operator)
 {
  case '+' : result=num1+num2;
                  System.out.println(num1 + "+" +num2 +"=" +result); break;
   case '-' :result=num1-num2;
                 System.out.println(num1 + "-" +num2 + "=" +result); break;
   case '*' :result=num1*num2;
                  System.out.println(num1 + "*" +num2 +"=" +result); break;
   case '/' : result=num1*num2;
                 System.out.println(num1 + "*" +num2 + "=" +result); break;
   default : System.out.println("Invalid operator");
 } 
}
}