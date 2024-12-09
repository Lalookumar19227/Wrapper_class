package wrapper_class;

public class Program5 {
	public static void main(String[] args) {
		double p=12.69769988777778888888888000000000000001;
		String q=Double.toString(p);
		System.out.println(q);
		System.out.println("Total digit in "+p+" is: "+(q.length()-1));
		
		
		int count=0;
		for(int i=0;i<q.length();i++)
		{
			if(q.charAt(i)!='.')
				count++;
		}
		System.out.println("Total Digit is: "+count);
		
	}

}
