package keisyou;

import java.util.Scanner;

import keisyousub.keisyouset;
import keisyousub.subjava;

public class keisyoumain {
	/*
	 
	 名前を入力したら下記がコンソールに出力されるように作ってください
		条件：数値は毎回変わるように作ってください
		 	 サブクラスを使用してください
			 スーパークラスを使用してください
			 getterとsetterを使用してください
			 packageを2つ作ってメインと処理を分けてください
			 命名する場合は規則にのっとってください
			 コンストラクタを使用してください

		こんにちは 「 名前 」 さん
		ステータス
		HP：849
		MP：862
		攻撃力：375
		素早さ：937
		防御力：24

		さあ冒険に出かけよう！
	 
	 */
		
		public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();

			subjava ke = new subjava();
			
			System.out.println("こんにちわ「"+name+"」さん");
			
			System.out.println(ke.getStates());
			
			System.out.println("HP:"+ke.getHp());
			
			System.out.println("MP:"+ke.getMp());
			
			System.out.println("MP:"+ke.getAt());
			
			System.out.println("MP:"+ke.getSp());
			
			System.out.println("MP:"+ke.getDf());
			
			System.out.println(keisyouset.go);
}
	};
