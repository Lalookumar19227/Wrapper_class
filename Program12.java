package wrapper_class;

public class Program12 {
	public static void main(String[] args) {
		Test t1=new Test();
		Object x=t1.getData();
		Car c1=(Car)x;
		System.out.println("Car name is: "+c1.name);
		System.out.println("Car Price is: "+c1.price);
	}

}
