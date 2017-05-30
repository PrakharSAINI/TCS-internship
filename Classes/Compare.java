import java.util.*;
class compare{
public static void main(String args[])
{
	Scanner obj = new Scanner(System.in);
	System.out.println("Please enter first number");
	int a = obj.nextInt();
	System.out.println("Please enter Second number");
	int b = obj.nextInt();
	System.out.println("Please enter Third number");
	int c = obj.nextInt();

	if (a>b){
		if (a>c) {
			System.out.println(a+" is greatest");}
		else {
			System.out.println(c+" is greatest");}}
	else {
		if (b>c) {
			System.out.println(b+" is greatest");}
		else {
			System.out.println(c+" is greatest");}
}
}
}