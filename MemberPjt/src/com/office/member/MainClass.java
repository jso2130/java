package com.office.member;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean systemFlag = true;  // 시스템 종료를 위한 플래그
		       
		/*메뉴 선택 상수*/
		final int MENU_SIGN_UP = 1;
		final int MENU_SIGN_IN = 2;
		final int MODIFY       = 3;
		final int DELETE       = 4;
		final int END          = 99;
		
		String[] memberInfos;   // DB에 있는 회원 정보 전체 값을 담아 확인하는 목적으로 쓸 배열
		
		/*정보 저장소(객체)*/
		HashMap<String, String[]> members = new HashMap<String, String[]>();
			  // 제네릭 타입 : 들어갈 데이터의 타입을 미리 설정
		
		/*더미 데이터 저장*/
		members.put("gildong", new String[] {"gildong", "1234", "gildong@gmail.com", "010-1234-5678"});
		
		memberInfos = members.get("gildong");   
		for (int i = 0; i < memberInfos.length; i++) {
			System.out.println(memberInfos[i]);
		}
		
		members.put("chanho", new String[] {"chanho", "0000", "chanho@naver.com", "010-2222-3333"}); 
		
		memberInfos = members.get("chanho");   
		for (int i = 0; i < memberInfos.length; i++) {
			System.out.println(memberInfos[i]);
		}
		
		
		/*메뉴 선택*/
		while (systemFlag) {
			
			// 사용자에게 어떤 메뉴를 선택할 건지
			System.out.println("1. sign-up    2. sign-in    3. modify    4. delete    99. end");
			int selectedMenuNumber = scanner.nextInt();    // 사용자가 선택한 메뉴 값을 받는 변수
			
			String memberID;
			String memberPW;
			String memberMAIL;
			String memberPHONE;
			
			
			switch (selectedMenuNumber) {
			
			/*회원가입*/
			case MENU_SIGN_UP:  
				
				// 정보 받기
//				String inputID;
				
				while (true) {  // ID중복 확인
					
					System.out.println("Input new member ID");  
					memberID = scanner.next();
					
					String[] getID = members.get(memberID);  // 저장된 데이테에 중복된 아이디 없으면 null
						
					if (getID == null) {

						break;
						
					} else {
						
						System.out.println("중복된 ID가 존재합니다.");
					
					}
					
				}
				
				System.out.println("Input new member PW");
				memberPW = scanner.next();
				
				System.out.println("Input new member MAIL");
				memberMAIL = scanner.next();
				
				System.out.println("Input new member PHONE");
				memberPHONE = scanner.next();
				
				
				// 정보 DB에 저장
				members.put(memberID, new String[] {memberID, memberPW, memberMAIL, memberPHONE}); 
				   
				// 정보 불러오기
				memberInfos = members.get(memberID);
				
				for (int i = 0; i < memberInfos.length; i++) {
					System.out.println(memberInfos[i]);
				}
				
//				for (String.memberInfo : memberInfos) {     // for each문 사용 버전
//					System.out.println(memberInfos[i]);
//				}
				
				break;
				
				
			/*로그인*/	
			case MENU_SIGN_IN:  
				
				System.out.println("Input member ID");
				memberID = scanner.next();
				
				System.out.println("Input member PW");
				memberPW = scanner.next();
				
				String[] searchedMember = members.get(memberID);
				System.out.println(searchedMember);
				
				if (searchedMember != null && searchedMember[1].equals(memberPW)) {
						
						// ID, PW 일치 == 로그인 성공
						System.out.println("SIGN-IN SUCCESS");
					
				} else {
					
					// ID or PW 불일치 == 로그인 실패
					System.out.println("SIGN-IN FAIL");
					
				}
				
				break;
			
				
			/*정보 수정*/
			case MODIFY:  
		
//				System.out.println("Input new member ID");
//				memberID = scanner.next();  
//				
//				// 입력한 ID의 수정할 정보 입력
//				System.out.println("Input new member PW");
//				memberPW = scanner.next();
//				
//				System.out.println("Input new member MAIL");
//				memberMAIL = scanner.next();
//				
//				System.out.println("Input new member PHONE");
//				memberPHONE = scanner.next();
//				
//				memberInfos = members.get(memberID);
//				if (memberInfos != null) {   // ID가 있다면
//					
//					memberInfos[1] = memberPW;
//					memberInfos[2] = memberMAIL;
//					memberInfos[3] = memberPHONE;
//					
//					// 수정된 정보 확인하기
//					String[] tempInfos = members.get(memberID);  // ID에 해당하는 정보들 다 담아오기
//					for (String tempInfo : tempInfos) {
//						
//						System.out.println(tempInfo);
//						
//					}
//					
//				} else {
//					
//					System.out.println("존재하지 않는 ID입니다. 다시 입력하세요.");
//				
//				}
//				
//				break;
				while (true) {    
					System.out.println("Input new member ID");
					memberID = scanner.next();  
					
					memberInfos = members.get(memberID);
					if (memberInfos != null) {   // ID가 있다면
						
						// 입력한 ID의 수정할 정보 입력
						System.out.println("Input new member PW");
						memberPW = scanner.next();
						
						System.out.println("Input new member MAIL");
						memberMAIL = scanner.next();
						
						System.out.println("Input new member PHONE");
						memberPHONE = scanner.next();
						
						memberInfos[1] = memberPW;
						memberInfos[2] = memberMAIL;
						memberInfos[3] = memberPHONE;
						
						// 수정된 정보 출력해서 확인하기
						String[] tempInfos = members.get(memberID);  // ID에 해당하는 정보들 다 담아오기
						for (String tempInfo : tempInfos) {
							
							System.out.println(tempInfo);
							
						} 
						
						break;  // 수정 후 출력까지 완료되면 반복문 종료
						
					} else {
						
						System.out.println("존재하지 않는 ID입니다. 다시 입력하세요.");
					
					}
				
				}
				
			break;
			
				
			/*탈퇴*/
			case DELETE:  
				
				while (true) {
					
					System.out.println("Input new member ID");
					memberID = scanner.next();         //공백이 있으면 안되니까 next로
					
					System.out.println("Input new member PW");
					memberPW = scanner.next();
					
					memberInfos = members.get(memberID);
					if (memberInfos != null && memberInfos[1].equals(memberPW)) {
						
							members.remove(memberID);
							System.out.println("탈퇴가 완료되었습니다.");
							break;
	
					} else if (memberInfos == null) {
						
						System.out.println("존재하지 않는 ID입니다. 다시 입력하세요.");
					
					} else {
						
						System.out.println("존재하지 않는 PW입니다. 다시 입력하세요.");
						
					}
					
				}
				
				break;
			
				
			/*while문 및 프로그램 종료*/
			case END:  
				
				System.out.println("시스템이 종료됩니다.");
				systemFlag = false;
				
				break;
				
			}
		
		}
		
		scanner.close();
	
	}
	
}
