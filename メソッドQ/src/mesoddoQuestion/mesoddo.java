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
	public static void test1(String a, String b, int x) {
		System.out.println(a + b + x);
	};

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	//初めに渡す整数型の数値を設定
	public static void test2(int c) {
		System.out.println(c * c);
	};

	//次に、設定した値にかける因数を作成
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void test3(int d[]) {
		System.out.println(Arrays.toString(d));
	};

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void test2(int c, int e) {
		System.out.println(c + e);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static double[] test4(int f) {
		double nums[] = new double[f];
		Random random = new Random();
		for (int i = 0; i < f; i++) {
			int randomValue = 1 + random.nextInt(100);
			System.out.println(randomValue);
			nums[i] = randomValue;
		}
		return nums;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double test(double[] nums) {
		double z = sum(nums);
		int g = nums.length;
		double ave = z / g;
		System.out.println("平均値は" + ave);
		return ave;
	}
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static double[] test5(double[] count) {
		double y[] = count;
		int v = y.length;
		for(int i=0;i < v; i++) {
			double x = count[i];
			if(x >=50) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		test1("Hello ", "JavaSE ", 11);
		test2(9);
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		test3(num);
		test2(9, 3);
		test4(6);
		test(test4(6));
		test5(test4(6));
	}
};
