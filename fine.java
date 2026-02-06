import java.util.Scanner;
public class fine
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.print("Enter your id:");
int id=s.nextInt();
s.nextLine();
System.out.print("Enter your name:");
String name = s.nextLine();
System.out.print("Enter number of attempts:");
int attempt = s.nextInt();
int choice ;
int fine = 0;
do
{
System.out.println("Fine Calculation");
System.out.println("1.Not Wearing ID Card");
System.out.println("2.Not Wearing Shoes");
System.out.println("3.Casual leave Taken");
System.out.println("4.Not Returning Library Book");
System.out.println("5.Breakage of Lab item");
System.out.print("Enter your choice:");

choice = s.nextInt();
switch(choice)
{

case 1:
fine = attempt*150;
System.out.println("The total fine amount for not wearing ID:"+fine);
break;
case 2:
fine = attempt*250;
System.out.println("The total fine amount for not wearing shoes:"+fine);
break;
case 3:
System.out.print("Enter number of days:");
int days = s.nextInt();
fine = days*10;
System.out.println("The total fine amount for casual leave taken:"+fine);
if(fine>50)
System.out.println("Warning message for Suspension");
break;
case 4:
System.out.print("Enter number of books");
int books=s.nextInt();
fine = books*attempt*20;
System.out.println("The total fine amount for not returning books:"+fine);
break;
case 5:
fine = attempt*10000;
System.out.println("The total fine amount for breakage of lab item:"+fine);
break;
default:
System.out.println("Enter valid choice");
break;
}
}while(choice<=5);
}
}

