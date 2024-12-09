package wrapper_class;
import java.math.*;
public class Program6 {
	public static void main(String[] args) {
		
		BigDecimal b=new BigDecimal("43786876987908708707980");
		double p=12569999999.69769979879999;
		String q=p+"";
		int count=0;
		for(int i=0;i<q.length();i++)
		{
			if(q.charAt(i)!='.')
				count++;
		}
		System.out.println("Total Digit is: "+count);
	}

}
