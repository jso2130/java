import java.util.Scanner;

public class Tree {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("트리의 높이를 입력하세요");
		int height = scanner.nextInt();
		
		for (int i = 1; i <= height; i++) {        // 전체 행
			
			for (int j = 0; j < height - i; j++) {
				System.out.print(" ");
			}
			
			//내가 한 버전
//			for (int j = 0; j < (i * 2) - 1; j++) {
//				System.out.print("*");
//			}
			
			//교수님 버전
			for (int j = 0; j < (i + 1) * 2 - 3; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
}
