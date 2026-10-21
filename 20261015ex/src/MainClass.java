
public class MainClass {

	public static void main(String[] args) {
		
		//변수
		/* : 메모리의 데이터를 저장하는 특정 공간. 
		 * 
		 * [변수 정의] 
		 * 1. 변수 선언 : 메모리의 특정 공간을 청소하고 변수명을 설정하는 작업 
		 * 2. 변수 초기화 : 변수에 데이터를 할당(대입)연산자로 저장하는 작업
		 */
		
		//정수를 이용한 변수 선언과 초기화
		// 데이터 타입 변수명 = 데이터;
		int num = 10; 
		
		int num2;   //변수 선언과 초기화는 따로 해도 된다
		num2 = 20;
		
		System.out.println("num :" + num);  // 연결연산자 ,를 사용하지 못한다.
		
		int address = System.identityHashCode(num);  // 메모리 주소
		System.out.println(address);
		
		//[ 변수명 작명하는 가이드 ]
		/* 
		 * 1. 영문 사용 
		 *  - 일반적으로 소문자로 시작 (camelCase)
		 * 2. 데이터의 의미를 파악할 수 있어야한다.
		 * 3. 키워드는 변수명으로 사용할 수 없다.
		 * 4. '_'를 제외한 특수문자는 사용할 수 없다.
		 * 5. 공백은 들어갈 수 없다.
		 * 6. 숫자는 첫 글자로 쓸 수 없다.
		 */
		
		//데이터 변경
		/*
		 * 동일한 이름으로 변수를 선언하면 안된다.
		 */
		int number = 10;
		System.out.println(number);
		number = 20;                // 이거는 선언된 변수를 수정하는 것이고 같은 이름으로 변수를 선언한 것이 아니다.
		System.out.println(number);
		
		//데이터 복사
		int num3 = 10;
		System.out.println(num3);
		int num33 = num3;  // 깊은 복사 : 데이터 자체를 복사 <> 얕은 복사 : 데이터 주소만 복사
		
		int n1 = 10;
		int n2 = 20;
		
		//문제) n1과 n2의 값을 교환  - 깊은 복사일 경우에만 가능
		
		int n0 = n1;
		n1 = n2;
		n2 = n0;
		
		System.out.println(n1);
		System.out.println(n2);
		
		//문제) 가로와 세로 변수를 각각 만들고 방의 넓이를 구해보자
		int width = 100;
		int height = 50;
		
		System.out.println("방의 넓이 : " + (width * height));
		
	}

}
