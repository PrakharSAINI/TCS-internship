import java.util.*;
class calc{
public static void main(String args[]){
	Scanner obj = new Scanner(System.in);
	int a,b,c,d;
	System.out.println("Please Enter first number");
	a = obj.nextInt();
	System.out.println("Please enter second number");
	b = obj.nextInt();
	System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division");
	c = obj.nextInt();
	switch(c)
{
		case 1: {
			d = a+b;
			System.out.println("Sum is :" + d);
			break;}
		case 2: {
			d = a-b;
			System.out.println("Difference is :" + d);
			break;}
		case 3: {
			d = a*b;
			System.out.println("Product is :" + d);
			break;}
		case 4: {
			d = a/b;
			System.out.println("Division is :" + d);
			break;}
		default : {
			System.out.println("Error");
			break;}
}
}		
}