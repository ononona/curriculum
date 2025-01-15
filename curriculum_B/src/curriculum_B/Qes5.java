package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		  // 行と列の最大値を指定
        int maxRows = 20;  // 列（左から右）の最大値
        int maxCols = ９; // 行（上から下）の最大値

        // 行をループ
        for (int j = 1; j <= maxCols; j++) { // 上から下の列ループ
            for (int i = 1; i <= maxRows; i++) { // 左から右の行ループ
                // 値を計算し、フォーマット形式で出力する
                System.out.printf("%03d ＊ %03d = %03d || ", i, j, i * j);
            }
            // 列ごとに改行する
            System.out.println();
        }
	}
}
