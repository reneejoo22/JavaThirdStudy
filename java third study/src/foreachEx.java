//3-9
public class foreachEx {
	

	enum Week{월, 화, 수, 목, 금, 토, 일}		//enum은 배열이나 나열
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] n = {1,2,3,4,5};	//숫자를 저장한 배열
		String names[] = {"사과","배","바나나","체리","딸기","포도"};	//문자열을 저장한 배열
		
		int sum = 0;
		
		for(int k:n) {	//정수 k는 n만큼 돌아감, 5번
			System.out.print(k+" ");	//반복되는 k값 출력
			sum += k;	//출력한 값을 sum에 누적해서 합산해 저장
		}
		System.out.println("합은"+sum);	//함 출력
		
		for(String s:names)
			System.out.print(s+" ");
		System.out.println();
		
		for(Week day: Week.values())
			System.out.print(day + "요일");
		System.out.println();
	}
}