package CIE;
import jaca.util.Scanner;
public class Internals extends CIE.Student
{
Scanner scan= new Scanner(System.in);
public int ciem[]=new int[5];

public void accept(){
for(int i=0;i<=5;1++){
System.out.println("Enter cie marks of subject "+(i+1));
ciem[i] =scan.nextInt();
}
