package day33;
import java.util.*;
public class fact_series {
public static void main(String args[])
{
	System.out.println("Enter a and n");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int n=sc.nextInt();
	int i;
	float f=0;
	float ans=0,sum=0;
	for(i=1;i<=n;i++)
	{
		f=fact(i);
		ans=(float)(Math.pow(a,i)/f);
		sum=sum+ans;
	}
	System.out.println(sum);

}
public static int fact(int k)
{
	int fac=1;
	for(int i=1;i<=k;i++)
	{
		fac=fac*i;
	}
	return fac;
}

}
