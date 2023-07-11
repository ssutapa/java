import java.util.*;
class a2
{
public static void main(String args[])
{
int n,s=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 5 integers:");
for(int i=1;i<=5;i++)
{
n=sc.nextInt();
s+=n;
}
System.out.println("Sum="+s);
}
}                     