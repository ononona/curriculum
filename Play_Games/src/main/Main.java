package main;

import java.util.Scanner;

import logic.Player;

public class Main {
	public static void main(String[] args) {
		// ユーザーの名前を入力する
		Scanner scanner = new Scanner(System.in);
		String playerName = scanner.nextLine();
		scanner.close();

		// プレイヤーを生成
		Player player = new Player(playerName);

		// ステータスを表示する
		System.out.println("こんにちは 「 " + player.getName() + " 」 さん");
		System.out.println("ステータス");
		System.out.println("HP：" + player.getHp());
		System.out.println("MP：" + player.getMp());
		System.out.println("攻撃力：" + player.getAttack());
		System.out.println("素早さ：" + player.getSpeed());
		System.out.println("防御力：" + player.getDefense());
		System.out.println("\nさあ冒険に出かけよう！");
	}
}