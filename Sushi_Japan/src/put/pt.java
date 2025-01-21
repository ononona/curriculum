package put;

import process.prcs;

public class pt {
	public static void main(String[] args) {
		// prcs クラスのインスタンスを作成する
		prcs sushiLogic = new prcs();

		// 各メッセージを出力
		System.out.println(sushiLogic.getGreeting());
		System.out.println(sushiLogic.getSushiTaste());
		System.out.println(sushiLogic.getSushiType());
		System.out.println(sushiLogic.getCurrentDateTime());
	}
}