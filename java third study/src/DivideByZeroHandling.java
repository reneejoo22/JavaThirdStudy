//3-15>> 미완성
import java.util.Scanner;

public class DivideByZeroHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		while(true){	//오류가 발생하면 다시 돌아감
			
			System.out.print("나뉨수를 입력하세요: ");
			int dividend = scanner.nextInt(); 	//나뉨수 입력
			System.out.print("나눗수를 입력>> ");
			int divisor = scanner.nextInt();	//나눗수 입력
			
			try {
				
				System.out.println(dividend+"를"+divisor+"로 나누면 몫은"+dividend/divisor+"입니다");
				break;
			}
			catch(ArithmeticException e) {	//정수를 0으로 나눌때 발생하는 예외
				System.out.println("0으로 나눌 수 없습니다, 재입력 필요");
			}
		}
		scanner.close();
	}
}

