package move;

import java.time.LocalDateTime;

import set.JAVAset;

public class JAVAmove {
	/*
	 
		下記がコンソールに出力されるように作成してください
		
			こんにちは！ここは日本です！
			この寿司はうまい
			寿司は和食です
			今の現在日時は2023/03/09 10:23:39です
	
		【条件】
			・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
			・適切なファイルにフィールドで変数を必要な数作ってください。
			・thisを使って作成してください。
			・日時は今日の日付を取得してください。
			
	  */
	public static void main(String[] args) {
		JAVAset word = new JAVAset("こんにちは！", "日本", "寿司", "うまい", "和食", LocalDateTime.now()); 
		System.out.println(word.name + "ここは" + word.country +"です");
		System.out.println("この" + word.food + "は" +word.taste);
		System.out.println(word.food + "は" +word.cooking + "です");
		System.out.println("今の現在時刻は" + word.time + "です");
	}

};
