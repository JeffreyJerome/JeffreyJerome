import java.io.*;
import java.util.Scanner;
class A
{
public static void main(String args[])throws IOException
{
String name;
int age;
FileOutputStream f = new FileOutputStream("A.txt");
Scanner s = new Scanner(System.in);
System.out.println("Enter Name");
name=s.next();
System.out.println("Enter Age");
age=s.nextInt();
byte c[] = name.getBytes();
f.write(c);
f.write(age);
f.close();
}
}