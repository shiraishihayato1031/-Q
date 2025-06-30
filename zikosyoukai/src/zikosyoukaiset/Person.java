package zikosyoukaiset;

public class Person {
	  // 問題1：インスタンスフィールドを定義
	  String name;
	  int age;
	  double height;
	  double weight;  // 問題4：weight追加

	  // クラスフィールド（人数カウント用）
	  static int count = 0;

	  // 問題2・3・4：コンストラクタ定義 & フィールドに値をセット
	  Person(String name, int age, double height, double weight) {
	    this.name = name;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	    count++; // 人数カウントを加算
	  }

	  // 問題6・7：BMIを返すメソッド
	  double bmi() {
		    double rawBmi = this.weight / (this.height * this.height);
		    return Math.floor(rawBmi); // 小数点以下切り捨て
		  }

	  // 問題8・9：情報を出力するメソッド
	  void print() {
	    System.out.println("名前は" + this.name + "です");
	    System.out.println("年は" + this.age + "です");
	    System.out.printf("BMIは%.1fです%n", this.bmi());
	  }

	  // 問題10：人数を取得するstaticメソッド
	  static int getCount() {
	    return count;
	  }
	}