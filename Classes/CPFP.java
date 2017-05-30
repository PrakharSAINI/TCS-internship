class x {
	int a;
	int b;
	int e;
	x(int c, int d){
		a=c;
		b=d;
		e=a+b;
		System.out.println("Sum is " + e);
		}
	void add (int c, int d) {
		a=c;
		b=d;
		e=a+b;
		System.out.println("Sum is " + e);
		}
	}

class mymain3 {
	public static void main(String args[]){
		x obj = new x(148,324);
		obj.add(4,978);
		obj.add(897,21265);
		}
	}