//3-16
public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[5];
		intArray[0] = 0;
		
		try {
			for(int i =0;i<5;i++) {
				intArray[i+1] = i+1+intArray[i];	//i가 4일때 예외
				System.out.println("intArray["+i+"]"+"="+intArray[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인데스가 범위를 벗어났습니다.");
		}
	}

}
