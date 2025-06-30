package zikosyoukaiset;

public class Main {
	  public static void main(String[] args) {
		    Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

		    person1.print();

		    // 問題10: 合計人数を出力
		    System.out.println("合計" + Person.getCount() + "人です");
		  }
		}