import java.util.*;
class pattern12 {
public static void main (String args[]){
	Scanner obj = new Scanner(System.in);
	System.out.println("Please enter the number of rows");
	int a = obj.nextInt();
	
	for (int i=0;i<=a;i++) {
		for (int k=a-i;k>0;k--){
			System.out.print(" ");
		}
		for (int j=0;j<i;j++){
			System.out.print(j+1);
		}
		for (int k=1;k<i;k++) {

			System.out.print(i-k);
		}
		System.out.println("");
}
	for (int i=a-1;i>=0;i--) {
		for (int k=a-i;k>0;k--){
			System.out.print(" ");
		}
		for (int j=0;j<i;j++) {
			System.out.print(j+1);
		}
		for (int k=1;k<i;k++) {

			System.out.print(i-k);
		}
		System.out.println("");
}
}
}