
/*Bitwise operators  Shift Operators
AND &				Left shift <<
OR |				Right shift >>
NOT ~				Right shift zero fill >>>
EX-OR ^
*/
public class OperatorsDemo { 

	public static void main(String[] args) {
		
		//Bitwise operators - used for parity checking and end to end encryption in msges
		int a= 19, b =20;
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(~a);
		System.out.println(a^b);
		
		int c = 4;
		System.out.println(c<<1); //left shift
		System.out.println(c>>1); //right shift
		
		byte e = -5;
		System.out.println((byte)(e>>>1)); //right shift with zero fill without byte
		System.out.println((e>>>1)); //right shift with zero fill with byte
		System.out.println(e>>1); //right shift
		
		//Boolean operators
		boolean f= false; boolean g = true;
		
		System.out.println(f&g);
		System.out.println(f|g);
		System.out.println(g^f);
		
		//short circuit logical operators && || - 95% we're using sc operators
		int z= 12, x=10;
		
		System.out.println( "sc " + ((z>20) && (z<65)));
		
		System.out.println("sc " + ((z>30) || (z<65)));
		
		//Operator Precedence - sequence multiplication,division,mod,addition and subtraction
		int v = 10, m = 25;
		
		double l = v*m-10/v;
		double r = (v*m-10)/v; //high priority on paranthesis()
		System.out.println(l);
		System.out.println(r);

	}

}
