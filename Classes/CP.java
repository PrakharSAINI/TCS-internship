class xyz {
	int a;
	int b;
	int e;
	xyz (int c, int d) {
		a=c;
		b=d;
		e=a+b;
		System.out.println("Sum is " + e);
		}
	}

class mymain {
	public static void main(String args[]){
		xyz obj = new xyz(564,6984);
		xyz obk = new xyz(4,978);
		}
	}