class calc
{
public static void main(String args[])
{
String a=args[0];
int x=5,y=3;
if(a.equals("+"))
System.out.println("sum="+(x+y));
else if (a.equals("-"))
System.out.println("Sub="+(x-y));
else if(a.equals("x"))
System.out.println("Mult="+(x*y));
else
System.out.println("Div="+(x/y));
}
}		