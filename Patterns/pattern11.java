import java.util.*;
class pattern11 {
public static void main (String args[]){
	Scanner obj = new Scanner(System.in);
	System.out.println("Please enter the number of rows");
	int a = obj.nextInt();
	
	for (int i=a;i>=0;i--) {
		for (int k=a-i;k>0;k--){
			System.out.print(" ");
		}
		for (int j=0;j<i;j++) {
			System.out.print(j);
		}
		for (int k=1;k<i;k++) {

			System.out.print(i-k-1);
		}
		System.out.println("");
}
}
}