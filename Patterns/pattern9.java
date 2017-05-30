class pattern9 {
public static void main (String args[]){
	for (int i=0;i<=6;i++) {
		for (int k=5-i;k>=0;k--){
			System.out.print(" ");
		}
		for (int j=0;j<i;j++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	for (int x=5;x>=0;x--){
		for (int k=5-x;k>=0;k--){
			System.out.print(" ");
		}
		for (int y=0;y<x;y++){
			System.out.print("*");
		}
		System.out.println("");
	}	
}
}