import java.util.*;
public class Calculator
{
  public static void main(String[] args)
  {
   Scanner scn=new Scanner(System.in);
   System.out.println("Enter First Number:");
   int num1=scn.nextInt();
   System.out.println("Enter second Number:");
  int num2=scn.nextInt();
  System.out.println("Enter Operator:");
  char operator=scn.next().charAt(0);
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