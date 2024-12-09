package wrapper_class;

public class Program7 {
	public static void main(String[] args) {
		String s1="135";
		String s2="135.57868";
		System.out.println(s1+100);
		System.out.println(s2+100);
		System.out.println("===================");
		int k=Integer.valueOf(s1);
		System.out.println(k+100);
		System.out.println("===============");
		double p=Double.valueOf(s2);
		System.out.println(p+100);
		
	}

}
