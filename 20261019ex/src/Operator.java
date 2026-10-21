
public class Operator {
	public static void main(String[] args) {
		
		/*
		 * [연산자]
		 * 
		 * 산술 연산자   +, -, *, /, %, ++, --
		 * 할당 연산자   =, +=, -=, *=, /=, %=, &=, |=
		 * 비교 연산자   ==, !=, >, <, >=, <=
		 * 논리 연산자   &&, ||, !
	     */
		
		// 산술연산자
		// 1. 덧셈
		// 1-1. 숫자 덧셈
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1+num2);
		
		// 1-2. 문자열 덧셈(연결 연산자)
		String str1 = "Hello";
		String str2 = "World";
		
		System.out.println(str1+str2);
		
		// 1-3. 문자 덧셈(연결 연산자)
		System.out.println('A' + 'B');    // 결과 : 131 (유니코드 덧셈 결과) 
		
		
		// 2. 뺄셈
		// 2-1. 숫자 뺄셈
		num1 = 10; num2 = 20;
		System.out.println(num1-num2);
		
		// 2-2. 문자 뺄셈
		System.out.println('A' - 'B');   // 문자열은 뺄셈을 할 수 없다
		
		
		// 3. 곱셈
		// 3-1. 숫자 곱셈
		num1 = 10; num2 = 20;
		System.out.println(num1*num2);
		
		// 3-2. 문자 곱셈
		System.out.println('A' * 'B');   // 결과 : 4290 (유니코드 덧셈 결과) 
		
		
		// 4. 나눗셈
		// 4-1. 숫자 나눗셈
		num1 = 10; num2 = 20;
		System.out.println(num1/(float)num2);  // 소숫점까지 보이기위해 강제 형변환 (정수는 4바이트 결과는 실수형 8바이트)
		
		// 4-2. 문자 나눗셈
		System.out.println('A' / 'B');   // 결과 : 4290 (유니코드 덧셈 결과) 
		
		
		// 5. 나머지 연산자 
		num1 = 10; num2 = 3;
		System.out.println(num1%num2);
		
	}
}
