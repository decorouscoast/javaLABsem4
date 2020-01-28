class fibo
{
public static void main(String args[])
{
 int n=Integer.parseInt(args[0]);
 int a=0;
 int b=1;
int sum=0;
 System.out.println(a+","+b+",");
 for(int i=0;i<n;i++)
{
 sum=a+b;
 System.out.println((sum)+",");
 a=b;
 b=sum;
}
}
}