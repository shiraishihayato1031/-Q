package set;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JAVAset {
	/*
	LocalDateTime nowDate = LocalDateTime.now();
		System.out.println(nowDate);
		
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
	public String name;

	public String country;

	public String food;

	public String taste;

	public String cooking;

	public String time;

	public JAVAset(String name, String country, String food, String taste, String cooking, LocalDateTime time) {

		this.name = name;

		this.country = country;

		this.food = food;

		this.taste = taste;

		this.cooking = cooking;
		
		DateTimeFormatter times = DateTimeFormatter.ofPattern("yyyy/MM/dd H:m:ss");
		String timef = times.format(time);

		this.time = timef;
	}
};