//3-11
public class IrregularArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intArray[][] = new int[4][];
		
		intArray[0] = new int[3];
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[2];
		
		for(int i = 0;i<intArray.length;i++)	//4개
			for(int j=0;j<intArray[i].length;j++)	//3, 2, 3, 2
				intArray[i][j] = (i+1)*10+j;
		
		for(int i =0;i<intArray.length;i++) {
			for(int j = 0;j<intArray[i].length;j++)
				System.out.print(intArray[i][j]+" ");
			System.out.println();
		}
	}

}

/*
 
10 11 12 
20 21 
30 31 32 
40 41 

*/
