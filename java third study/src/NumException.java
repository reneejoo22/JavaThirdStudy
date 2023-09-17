
public class NumException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] stringNumber = {"23","12","3.1415","998"};	//문자를 정수형으로 변환
		
		int i = 0;
		
		try {
			for(i = 0;i<stringNumber.length;i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("숫자로 변환된 값은"+j);
			}
		}
		
		catch(NumberFormatException e) {
			System.out.println(stringNumber[i]+"는 정수로 변환 불가능");
		}
		
		//catch()

	}

}

//교수님 복습 추천>3-15 예외 사항 더 만들기 문자 