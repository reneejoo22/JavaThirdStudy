//3-17
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개 입력>> ");
		
		int sum = 0, n = 0;
		
		for(int i =0; i<3;i++) {
			System.out.print(i+">>");
			try {
				n = scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아님, 재입력");
				scanner.next();
				i--;
				continue;
			}
			sum+=n;
		}
		System.out.println("합은"+sum);
		scanner.close();
	}

}
