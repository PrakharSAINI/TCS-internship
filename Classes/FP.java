class xy {
	int a;
	int b;
	int e;
	void add (int c, int d) {
		a=c;
		b=d;
		e=a+b;
		System.out.println("Sum is " + e);
		}
	}

class mymain2 {
	public static void main(String args[]){
		xy obj = new xy();
		obj.add(4,978);
		obj.add(897,21265);
		}
	}