
public class Operator2 {
	public static void main(String[] args) {
	
		/*
		 * 대입 연산자
		 * : 오른쪽의 값을 왼쪽 변수에 대입(할당)하는 연산자
		 */
		int no = 10;
		
		/*
		 * 복합 대입 연산자
		 */
		
		no += 1;  // 11
		no -= 1; // 9
		no *= 2;  // 20
		no /= 2;  // 5
		no %= 3;  // 1
		
		/*
		 * 증감 연산자
		 */
		
		no++; // 11
		no--; // 10
		
		/*
		 * 전위 or 후위 연산자 
		 */
		
		int num1 = 10;
		int result1 = 0;
		result1 = ++num1; 
		System.out.println(result1); // 11
		System.out.println(num1); // 11
		
		int num2 = 10;
		int result2 = 0;
		result1 = num1++;
		System.out.println(result2); // 10 -> 할당 연산자의 우선 순위가 후위 연산자보다 높다
		System.out.println(num2); // 11
		
		int num3 = 10;
		int result3 = 0;
		result1 = (num3++);  // 괄호를 해도 할당 연산자의 우선순위가 높다.
		System.out.println(result3); // 10 
		
}
}
