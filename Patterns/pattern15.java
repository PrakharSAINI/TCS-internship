import java.util.*;
class pattern15 {
public static void main (String args[]){
	int a = 4;
    // First Diamond
    	for (int i=0;i<a;i++) {
            System.out.print("   ");
    		for (int k=a-i;k>0;k--){
    			System.out.print(" ");
    		}
    		for (int j=0;j<i;j++){
                    System.out.print("*");
            }


    		for (int k=1;k<i;k++) {

    			System.out.print("*");
    		}
		if(i==a-1) {
		break;
		}
    		System.out.println("");
        }
    	
// middle row
        for (int i=0;i<=a;i++) {
            for (int k=a-i;k>0;k--){
                System.out.print(" ");
            }
            for (int j=0;j<i;j++){
                    System.out.print("*");
            }
            
// add space between triangles
            for (int h=2*a;h>=4;h-- ) {
                System.out.print(" ");
            }
             for (int j=0;j<i;j++){
                    System.out.print("*");
            }
            
            System.out.println("");
        }
        for (int i=a-1;i>0;i--) {
            for (int k=a-i;k>0;k--){
                System.out.print(" ");
            }
            for (int j=0;j<i;j++) {
                System.out.print("*");
            }
            
// add space between triangles

             for (int h=2*a;h>=4;h-- ) {
                System.out.print(" ");
            }
            for (int j=0;j<i;j++) {
                System.out.print("*");
            }

	
            

            System.out.println("");
        }

        //Last row
       
        for (int i=a-1;i>=0;i--) {
            System.out.print("    ");
            for (int k=a-i;k>1;k--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            for (int k=1;k<i;k++) {

                System.out.print("*");
            }
            System.out.println("");
        }

}
}