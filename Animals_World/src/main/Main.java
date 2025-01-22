package main;

import java.util.HashMap;
import java.util.Scanner;

import logic.Animal;

public class Main {
	public static void main(String[] args) {
		// 学名を登録するためのマップを作成する
		HashMap<String, String> scientificNames = new HashMap<>();
		scientificNames.put("ライオン", "パンテラ レオ");
		scientificNames.put("ゾウ", "ロキソドンタ・サイクロティス");
		scientificNames.put("パンダ", "アイルロポダ・メラノレウカ");
		scientificNames.put("チンパンジー", "パン・トゥログロディテス");
		scientificNames.put("シマウマ", "チャップマンシマウマ");
		scientificNames.put("インコ", "不明");

		// ユーザー入力する
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		// 入力データを分解して処理する
		String[] animalsData = input.split(",");
		for (String data : animalsData) {
			String[] parts = data.split(":");
			String name = parts[0];
			double bodyLength = Double.parseDouble(parts[1]);
			int speed = Integer.parseInt(parts[2]);
			String scientificName = scientificNames.getOrDefault(name, "不明");

			// Animalオブジェクトを作成する
			Animal animal = new Animal(name, bodyLength, speed, scientificName);

			// 出力する
			System.out.println("\n動物名：" + animal.getName());
			System.out.println("体長：" + animal.getBodyLength() + "m");
			System.out.println("速度：" + animal.getSpeed() + "km/h");
			System.out.println("学名：" + animal.getScientificName());
		}
	}
}