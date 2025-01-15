package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 外側のループは掛けられる数 (1～9)
		for (int i = 1; i <= 9; i++) {
			// 内側のループは掛ける数 (1～9)
			for (int j = 1; j <= 9; j++) {
				// 結果をフォーマットして出力する
				System.out.printf("%02d * %02d = %02d || ", i, j, i * j);
			}
			// 各行の終了で改行する
			System.out.println();
		}
	}
}
