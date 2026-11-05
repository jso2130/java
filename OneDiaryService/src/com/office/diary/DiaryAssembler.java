package com.office.diary;


public class DiaryAssembler {

	final private DiaryDao diaryDao = new DiaryDao();
	final private DiaryService diaryService = new DiaryService(diaryDao);
	final private DiaryController diaryController = new DiaryController(diaryService);
	
	private static DiaryAssembler diaryAssembler;
	
	public DiaryAssembler() {
		
	}
	
	
	public static DiaryAssembler getInstance() {
		
		if(diaryAssembler == null) {
			
			diaryAssembler = new DiaryAssembler();
			
		}
		
		return diaryAssembler;
		
	}

	
	public DiaryController getDiaryController() {
		return diaryController;
	}

	public DiaryService getDiaryService() {
		return diaryService;
	}

	public DiaryDao getDiaryDao() {
		return diaryDao;
	}
	
	
	
}
