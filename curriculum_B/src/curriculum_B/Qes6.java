package curriculum_B;

import java.util.Random;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 入力例
		String input = "パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品";

		// 青色で入力値を表示
		final String ANSI_BLUE = "\u001B[34m"; // 青色のANSIエスケープシーケンス
		final String ANSI_RESET = "\u001B[0m"; // 色リセット
		System.out.println(ANSI_BLUE + input + ANSI_RESET);

		// 入力を「、」で区切って配列に変換をする
		String[] products = input.split("、");

		// ランダム値生成用
		Random random = new Random();

		// 拡張for文で処理をする
		for (String product : products) {
			// スイッチ文で処理を分岐
			switch (product) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				// 残り台数をランダムで生成
				int stock = random.nextInt(12);
				System.out.println(product + "の残り台数は" + stock + "台です");
				break;
			case "テレビ":
			case "ディスプレイ":
				// テレビとディスプレイは同じ商品扱い
				int tvStock = 11 - random.nextInt(12); // 11台からランダムな値を引く
				String name = product.equals("ディスプレイ") ? "テレビ" : product; // 条件演算子で出力名変更
				System.out.println(name + "の残り台数は" + tvStock + "台です");
				break;
			default:

				// その他の商品
				System.out.println("『 " + product + " 』は指定の商品ではありません");
				break;
			}
			System.out.println();
		}
	}

}
