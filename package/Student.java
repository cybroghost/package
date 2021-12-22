package CIE;
import java.util,Scanner;
public class Student{
Scanner scan =new Scanner(System.in);
public srting usn,name;

public void accept(){
System.out.println("Enter usn:");
usn= scan.nextline();
System.out.println("Enter name:");
name= scan.nextline();
System.out.println("Enter sem:");
sem= scan.nextline();
}

public void display(){
System.out.println("Name: "+name);
System.out.println("USN:" +usn);
System.out.println("Sem:" +sem);
   }
 }