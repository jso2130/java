package com.office.diary;

import java.util.Scanner;

public class DiaryController implements IDiaryConfig {
	
	final private DiaryService diaryService;
	
	public DiaryController (DiaryService diaryService) {

		this.diaryService = diaryService;
		
	}

	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean systemFlag = true;
		
		while (systemFlag) {
			
			System.out.println("1. WHITE   2.READ   3.SYSTEMOUT");
			int selectedMenuNum = scanner.nextInt();
			
			switch (selectedMenuNum) {
			
			case DIARY_WRITE:
				
				System.out.println("다이어리를 작성해주세요");
				String txt = scanner.nextLine();
				
				DiaryDto diaryDto = new DiaryDto(txt);
				
				diaryService.writeNewDiary(diaryDto);
				
				break;
				
			case DIARY_READ:
				
				diaryService.readDiaries();
				
				break;
				
			case SYSTEM_OUT:
				
				systemFlag = false; 
				
				break;

			}
			
		}
		
		scanner.close();
		
	}
	
}
