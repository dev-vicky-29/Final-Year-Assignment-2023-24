//write a Java Program Based On class, object, field & method
class Student
{
 int rollno;
 String name;
 void insertRecord(int r,String n)
 {
  rollno=r;
  name=n;
 }
 void displayInfo()
 {
 System.out.println(rollno+""+name);
 }
}
 class a41
{
 public static void main(String args[])
 {
 Student s1=new Student();
 Student s2=new Student();
 s1.insertRecord(101,"Siddhi");
 s2.insertRecord(102,"Prachi");
 s1.displayInfo();
 s2.displayInfo();
 }
}
