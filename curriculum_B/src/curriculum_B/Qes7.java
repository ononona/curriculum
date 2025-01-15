package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		int numberOfStudents;
		do {
			System.out.print("生徒の人数を入力してください（2以上）: ");
			numberOfStudents = scanner.nextInt();
		} while (numberOfStudents < 2); // 必ず2人以上を入力させる

		// 各生徒の科目ごとの点数を保持する配列
		double[][] scores = new double[numberOfStudents][4];
		double[] subjectTotals = new double[4]; // 科目ごとの合計点を出力する

		// 各生徒の点数を入力する
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println((i + 1) + "人目の点数を入力してください。");
			System.out.print((i + 1) + "人目の『英語』の点数を入力してください :");
			scores[i][0] = scanner.nextDouble();
			System.out.print((i + 1) + "人目の『数学』の点数を入力してください :");
			scores[i][1] = scanner.nextDouble();
			System.out.print((i + 1) + "人目の『理科』の点数を入力してください :");
			scores[i][2] = scanner.nextDouble();
			System.out.print((i + 1) + "人目の『社会』の点数を入力してください :");
			scores[i][3] = scanner.nextDouble();

			// 各科目の合計点を更新する
			for (int j = 0; j < 4; j++) {
				subjectTotals[j] += scores[i][j];
			}
		}

		// 各生徒の平均点を計算して出力する
		System.out.println();
		double totalScoreAll = 0; // 全体の合計点
		for (int i = 0; i < numberOfStudents; i++) {
			double studentAverage = 0;
			for (int j = 0; j < 4; j++) {
				studentAverage += scores[i][j];
			}
			studentAverage /= 4;
			totalScoreAll += studentAverage;
			System.out.printf((i + 1) + "人目の平均点は%.2f点です。\n", studentAverage);
		}

		// 各科目の平均点を計算して出力する
		String[] subjects = { "英語", "数学", "理科", "社会" };
		System.out.println();
		for (int i = 0; i < 4; i++) {
			double subjectAverage = subjectTotals[i] / numberOfStudents;
			System.out.printf("%sの平均点は%.2f点です。\n", subjects[i], subjectAverage);
		}

		// 全体の平均点を計算して出力する
		double overallAverage = totalScoreAll / numberOfStudents;
		System.out.println();
		System.out.printf("全体の平均点は%.2f点です。\n", overallAverage);

		scanner.close();
	}
}
