import CIE.*;
import SEE.*;
import java.util.Scanner;

class TotalMarks
{
public static void main(String [] args)
{
int i,j,n;
Scanner scan= new Scanner (System.in);
int total[]=new int [5];
System.out.println("Enter the number of students:");
n=scan.nextInt();
CIE.student s[] =new CIE.Internals[n];
CIE.Internals ci[] =new CIE.Internals[n];
SEE.Externals se[] =new SEE.Internals[n];
for(i=0,i<n;i++)
{
System.out.println("Enter student"+(i+1)+" detail-");
s[i]=new CIE.Student();
s[i].accept();
ci[i]=new CIE.Internals();
ci[i].accept();
se[i]=new CIE.Externals();
se[i].accept();
}
for (i=0;i<n;i++)
{
System.out.println("Details of student "+(i+1));
s[i].display();
for(j=0,j<5;j++)
{
total[j]= ci[i].ciem[j]+se[i].seem[j];
System.out.println("Total marks in subjects "+(j+1)+": "+total[j]);
}
System.out.println();
} 
}
}

