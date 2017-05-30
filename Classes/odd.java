import java.util.*;
class odd{
public static void main(String args[]){
	Scanner obj = new Scanner(System.in);
	System.out.println("Please enter a number");
	int a = obj.nextInt();
	if (a%2==0){
		System.out.println("Number is even");}
	else {
		System.out.println("Number is odd");}
}
}