/*Collection of similar types of elements which has contagious m/y allocation.
 * starts from 0 index or subscript.
	->code optimization - retrieve/sort data easily
	->Random access
	dis adv- fixed size limit to avoid this we used collections so size will increase automatically at runtime.
*/
public class Arrays { 

	public static void main(String[] args) {
		
		int[] numarr = new int[5]; //1D array
		
		numarr[0] =1;
		numarr[1] = 2;
		numarr[2] = 3;
		numarr[3] = 4;
		//numarr[4] = 5; //initially array was assigned to 0 while m/y allocation, we have to change if we required
		//numarr[5] = 6; //out of bounds
		
		System.out.println(numarr[4]);
		
		int numarray[] = {1,2,3,4}; //1D array
		System.out.println(numarray[3]);
		
		int twoDarray[][] = new int[2][2];
		
		twoDarray[0][0] = 12;
		twoDarray[0][1] = 13;
		twoDarray[1][0] = 14;
		twoDarray[1][1] = 43;
		System.out.println(twoDarray[1][1]);
		
		//example 2
		
		int twoD[][] = new int[3][]; //fixed row variable column
		   //3 Rows with different column initialization	
		twoD[0]= new int[4];
		twoD[1]= new int[7];
		twoD[2]= new int[17];
		
		twoD[2][5] = 54;
		System.out.println(twoD[2][5]);
		System.out.println(twoD[2][6]);
		
		//twoDarray in  curly braces
		int twoDD[][]= {
				{1,2,3},
				{4,5,6}
				};
		System.out.println(twoDD[1][2]);
		
		//char array
		
		char[] c1= {'A'};
		System.out.println(c1);
		
	}

}
