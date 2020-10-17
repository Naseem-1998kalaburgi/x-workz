//a class with 5 methods in main method
class Example2{
public static void main(String[] args)
{
	System.out.println("Execute the following methods");
	add();
	sub();
	mul();
	div();
	remi();
	
}
public static void add()
{
	int a=2,b=3,c;
	c=a+b;
	System.out.println("Addition of a and b :"+c);
}
public static void sub()
{
	int d=6,e=4,f;
	f=d-e;
	System.out.println("Substraction of d and e:"+f); 
}
public static void mul()
{
	int g=4,h=2,i;
	i=g*h;
	System.out.println("Multiplication of g and h:"+i);
}
public static void div()
{
	int j=10,k=2;
	float l;
	l=j/k;
	System.out.println("Division of j and k:"+l);
	
}
public static void remi()
{
	int m=7,n=2;
	int quo=m/n;
	System.out.println("Quotient is:"+quo);
	int remind=m%n;
	System.out.println("Reminder is:"+remind);
}
}