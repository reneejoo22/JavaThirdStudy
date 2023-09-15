//예제 3-7
import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5];	//배열 생성
		
		int max = 0;	//제일 큰 수
		
		System.out.println("양수 5개를 입력>>");	//커서가 다음 라인으로 감
		
		for(int i = 0;i<5;i++) {
			intArray[i] = scanner.nextInt();	//공백마다 or 엔터마다 입력받기
			if(intArray[i]>max)
				max = intArray[i];
		}
		System.out.print("가장 큰 수는"+max+"입니다");
		
		scanner.close();
		
		
		
		//예제 3-8
		
		
	}

}
