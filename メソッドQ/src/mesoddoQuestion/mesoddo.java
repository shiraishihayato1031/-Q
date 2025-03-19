package mesoddoQuestion;

import java.util.Arrays;
import java.util.Random;

public class mesoddo {
	//arraylist numの前準備
	public static double sum(double[] list) {
		//変数numに数値を代入
		double sum = 0;
		//arraylist listを変数numに挿入
		for (double num : list) {
			//変数sumに変数numを同期させる
			sum += num;
		}
		//変数numに値を返す
		return sum;
	};

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	//メソッドに因数を指定
	//test1メソッドを定義
	public static void test1(String a, String b, int x) {
		//文章を表示する
		System.out.println(a + b + x);
	};

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	//初めに渡す整数型の数値を設定
	public static void test2(int c) {
		//一つの整数同士の掛け算を表示
		System.out.println(c * c);
	};

	//次に、設定した値にかける因数を作成
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void test3(int d[]) {
		//整数の配列を順次表示する文章を作成
		System.out.println(Arrays.toString(d));
	};

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void test2(int c, int e) {
		//二つの因数を和算で表示
		System.out.println(c + e);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static double[] test4(int f) {
		//因数の数値の大きさの配列を新たに作成
		double nums[] = new double[f];
		//ランダムな値を出す変数を設定
		Random random = new Random();
		//因数の値まで繰り返す分を作成
		for (int i = 0; i < f; i++) {
			//1～100までのランダムな値を表示する文を作成
			int randomValue = 1 + random.nextInt(100);
			//ランダムに堕した値を表示する文を作成
			System.out.println(randomValue);
			//配列に出した値を格納する式を作成
			nums[i] = randomValue;
		}
		//配列の返り値を返す式を作成。
		return nums;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double test(double[] nums) {
		//配列の値をすべて足す和算の式を作成
		double z = sum(nums);
		//配列の要素の数を確認する式を作成
		int g = nums.length;
		//平均値を出す式を作成
		double ave = z / g;
		//平均値を表示するコンソール文を作成
		System.out.println("平均値は" + ave);
		//返り値を出す式を作成
		return ave;
	}
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static void test5(double count) {
			//繰り返し回数を定義する式を作成
			double x = count;
			//値が50以上の場合の条件式を作成
			if(x >=50) {
				//値が50以上の場合の表示文を作成
				System.out.println("true");
				//それ以外の場合の条件式を作成
			}else {
				//それ以外の場合に表示される表示文を作成
				System.out.println("false");
			}
	}
	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		//test1に挿入する値を定義
		test1("Hello ", "JavaSE ", 11);
		//test2に挿入する値を定義
		test2(9);
		//配列の挿入する値を定義
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		//test3に挿入する値を定義
		test3(num);
		//test2に挿入する値を定義
		test2(9, 3);
		//test4に挿入する値を定義
		double [] result4 = test4(6);
		//test5に挿入する値を定義
		double avele = test(result4);
		//aveleをメソッドに適用
		test5(avele);
	}
};
