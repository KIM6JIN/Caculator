import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		//사용자가 입력한 값을 system.in으로 가져와 스캐너에 저장
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 입력 값");
		int first = scanner.nextInt();
		System.out.println(first);
		
		// 두 번째 값을 입력받아 저장
		System.out.println("두 번째 입력 값");
		int second = scanner.nextInt();
		System.out.println(second);
		
		
		// 입력 받은 두 값에 대한 사칙연산을 계산해 출력
		System.out.println("덧셈 : " + (first + second) );
		System.out.println("뺄셈 : " + (first - second) );
		System.out.println("곱셈 : " + (first * second) );
		System.out.println("나눗셈 : " + (first / second) );
	}
}
