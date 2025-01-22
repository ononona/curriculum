package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import logic.Prefecture;

public class Main {
	public static void main(String[] args) {
		// 都道府県データを配列に納める
		Prefecture[] prefectures = {
				new Prefecture("北海道", "札幌市", 83424),
				new Prefecture("青森県", "青森市", 9646),
				new Prefecture("岩手県", "盛岡市", 15275),
				new Prefecture("宮城県", "仙台市", 7282),
				new Prefecture("秋田県", "秋田市", 11638),
				new Prefecture("山形県", "山形市", 9323),
				new Prefecture("福島県", "福島市", 13784),
				new Prefecture("茨城県", "水戸市", 6097),
				new Prefecture("栃木県", "宇都宮市", 6408),
				new Prefecture("群馬県", "前橋市", 6362),
				new Prefecture("埼玉県", "さいたま市", 3798)
		};

		Scanner scanner = new Scanner(System.in);

		// ユーザー入力する
		String inputNumbers = scanner.nextLine();
		String sortOrder = scanner.nextLine();

		scanner.close();

		// 入力された番号をリストに変換する
		String[] numbers = inputNumbers.split(",");
		List<Prefecture> selectedPrefectures = new ArrayList<>();
		for (String num : numbers) {
			int index = Integer.parseInt(num.trim());
			if (index >= 0 && index < prefectures.length) {
				selectedPrefectures.add(prefectures[index]);
			}
		}

		// ソート処理をする
		if ("昇順".equalsIgnoreCase(sortOrder)) {
			Collections.sort(selectedPrefectures, Comparator.comparingDouble(Prefecture::getArea));
		} else if ("降順".equalsIgnoreCase(sortOrder)) {
			Collections.sort(selectedPrefectures, Comparator.comparingDouble(Prefecture::getArea).reversed());
		} else {
			return;
		}

		// 出力する
		for (Prefecture prefecture : selectedPrefectures) {
			System.out.println("\n都道府県名：" + prefecture.getName());
			System.out.println("県庁所在地：" + prefecture.getCapital());
			System.out.println("面積：" + prefecture.getArea() + "km2");
		}
	}
}