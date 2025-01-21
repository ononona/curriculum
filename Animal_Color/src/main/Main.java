package main;

import model.Animal;

public class Main {
	public static void main(String[] args) {
		// Animalクラスのインスタンスを作成する
		Animal lion = new Animal();

		// セッターを使ってデータを設定する
		lion.setName("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80);

		// ゲッターを使ってデータを取得し出力する
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");
	}
}