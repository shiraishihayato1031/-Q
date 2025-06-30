package zikosyoukai2;

public class Person {
	 public String name;
	 public int age;
	 public double height;
	 public double weight;
	 public static int count = 0;  // クラスフィールド count（初期値0）

	 Person(String name, int age, double height, double weight) {
	  this.name = name;
	  this.age = age;
	  this.height = height;
	  this.weight = weight;
	  count++;  // インスタンス生成ごとに count を増加
	 }

	  double bmi() {
		    double rawBmi = this.weight / (this.height * this.height);
		    return Math.floor(rawBmi); // 小数点以下切り捨て
		  }

	 public void print() {
	  System.out.println("名前は" + this.name + "です");
	  System.out.println("年は" + this.age + "です");
	  double bmiValue = this.bmi();
	  double truncatedBmi = Math.floor(bmiValue * 10) / 10;  // 小数点第1位で切り捨て
	  System.out.println("BMIは" + truncatedBmi + "です");
	 }

	 public static void printCount() {
	  System.out.println("合計" + count + "人です");
	 }
	}