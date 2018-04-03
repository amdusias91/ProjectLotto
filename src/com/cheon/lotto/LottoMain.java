package com.cheon.lotto;

public class LottoMain {
	
	// 2018-04-03 주석을 추가했습니다.
	
	public static void main(String[] args) {
		
		/*
		 * Lotto 클래스
		 * 
		 * public int[] generate(){
		 * 
		 * }
		 * 
		 * 사용하기
		 * Lotto lotto = new Lotto(); 
		 * int numbers[] = lotto.generate();
		 * 
		 */
		Lotto lotto = new Lotto();
		
		int numbers[] = lotto.generate(6);
		
		for(int num: numbers) {
			System.out.print(num+".");
		}
		
	}

}
