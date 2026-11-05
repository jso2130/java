package com.office.diary;

import java.util.ArrayList;
import java.util.HashMap;

public class DiaryDao {
	
	//Array list
	private ArrayList<String> diaries = new ArrayList<String>();

	
	public boolean insertDiary(DiaryDto diaryDto) {

		int beforSize = diaries.size();
		
		diaries.add(0, diaryDto.getTxt());   // 최신 데이터를 첫번째 순서[0]에 추가하기
		
		int afterSize = diaries.size();
		
		return afterSize > beforSize ? true : false;
	}

	public ArrayList<String> getDiaries() {
		
		return diaries;
		
	}
	
	
	 
}
