package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
	public static void main(String[] args) {

		// Q1:文字列型と整数型を受け取るメソッド
		printMessage("JavaSE", 11);

		// Q2:2つの整数を乗算するメソッド
		multiplyAndPrint(5, 3);

		// Q3:整数の配列を受け取り順番に出力するメソッド
		int[] numbers = { 1, 2, 3, 4, 5 };
		printArray(numbers);

		// Q4:オーバーロードで2つの小数の和を出力するメソッド
		addAndPrint(3.5, 2.5); // double型を受け取るメソッド
		addAndPrint(3, 2); // int型を受け取るオーバーロードメソッド
		addAndPrint(1.5f, 2.5f); // float型を受け取るオーバーロードメソッド

		// Q5:指定回数分ランダムな数値を生成し出力＆返すメソッド
		int[] randomNumbers = generateRandomNumbers(10);
		for (int num : randomNumbers) {
			System.out.print(num + " ");
		}
		System.out.println(); // 改行

		// Q6:配列の平均値を計算して出力するメソッド
		double average = calculateAverage(randomNumbers);
		System.out.println("Average: " + average);

		// Q7:平均値が50以上か判定するメソッド
		boolean isAbove50 = checkIfAbove50(average);
		System.out.println("Is average >= 50 " + isAbove50);
	}

	// Q1:文字列型と整数型を受け取るメソッド
	public static void printMessage(String text, int number) {
		System.out.println("Hello " + text + " " + number);
	}

	// Q2:整数の乗算を行うメソッド
	public static void multiplyAndPrint(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	// Q3:整数配列を順番に出力するメソッド
	public static void printArray(int[] array) {
		for (int num : array) {
			System.out.println(num);
		}
	}

	// Q4:オーバーロードで小数の和を計算するメソッド
	public static void addAndPrint(double num1, double num2) {
		System.out.println("Sum: " + (num1 + num2));
	}

	// オーバーロード1:int型の和を計算するメソッド
	public static void addAndPrint(int num1, int num2) {
		System.out.println("Sum (int): " + (num1 + num2));
	}

	// オーバーロード2:float型の和を計算するメソッド
	public static void addAndPrint(float num1, float num2) {
		System.out.println("Sum (float): " + (num1 + num2));
	}

	// Q5:ランダムな値を生成して配列に格納・出力するメソッド
	public static int[] generateRandomNumbers(int count) {
		Random random = new Random();
		int[] randomNumbers = new int[count];
		for (int i = 0; i < count; i++) {
			randomNumbers[i] = random.nextInt(100) + 1; // 1～100のランダムな整数
		}
		return randomNumbers;
	}

	// Q6:配列の平均値を計算して出力するメソッド
	public static double calculateAverage(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		return (double) sum / array.length;
	}

	// Q7:平均値が50以上か判定するメソッド
	public static boolean checkIfAbove50(double value) {
		return value >= 50;
	}
}
