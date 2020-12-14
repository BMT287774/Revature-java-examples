package ex1;

public class Demo1 {
	public static void main(String[] args) {
		/*
		 * Java provides 8 primitive data types
		 * 
		 * datatype   size(bytes)    defaultValue
		 * --------------------------------------------
		 * byte       1byte               0
		 * short      2                   0
		 * int        4                   0
		 * long       8                   0 any long
		 * 
		 * float      4                   0.0000f
		 * double     8                   0.0000d
		 * 
		 * char       2                   '\u00000' java supports UNI-code charset
		 * 
		 * boolean    1bit                false
		 * 
		 */
		int x=10;
		System.out.println("x = "+x);
		
		float z=123.55f;
		System.out.println("z = "+z);
		
		long contact=1234567899L;
		System.out.println("contact : "+contact);
		
		String s1 = "Vinay";
		System.out.println("s1 : "+s1);
		
		double d=23.4455d;
		System.out.println("d =  "+d);
	}

}
