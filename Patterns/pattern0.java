class pattern0 {
public static void main (String args[]){
int a =4;
	for (int i=0;i<=a;i++) {

    		for (int k=a;k>i;k--){
    			System.out.print(" ");
    		}
    		for (int j=0;j<i;j++){
                    System.out.print("*");
            }


		if(i==a) {
		break;
		}
    		System.out.println("");
        }
}
}
