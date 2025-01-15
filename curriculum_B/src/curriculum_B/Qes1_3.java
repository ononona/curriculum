package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		// 問題１
		// ユーザー名を取得する
		String userName = scanner.nextLine();
		// ユーザー名の名前が０文字以下もしくはnullの場合を『名前を入力してください」と出力する
		if (userName == null || userName.trim().isEmpty()) {
			System.out.println("名前を入力してください");
			// 問題２ ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力する						
		} else if (!userName.matches("[a-zA-Z0-9]+")) {
			System.out.println("半角英数字でのみ名前を入力してください");
			// ユーザ名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力する
		} else if (userName.length() > 10) {
			System.out.println("名前を10文字以内にしてください");
			// ユーザ名が正常だった場合「ユーザー名○○を登録しました」と出力をする
		} else {
			System.out.println("ユーザー名「" + userName + "」を登録しました");

			//問題３	
			// じゃんけんの手
			String[] hands = { "グー", "チョキ", "パー" };
			int totalRounds = 0;
			// ゲーム開始
			while (true) {
				totalRounds++;
				//ユーザーの手を入力する
				System.out.println("\n0:グー, 1:チョキ, 2: パー");

				int userHand;
				try {
					userHand = Integer.parseInt(scanner.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("数字で入力してください。");
					continue;
				}

				if (userHand < 0 || userHand > 2) {
					System.out.println("0から2の数字を入力してください。");
					continue;
				}

				// コンピュータの手をランダムにする
				int computerHand = random.nextInt(3);

				// 両者の手を表示する
				System.out.println(userName + "の手は「" + hands[userHand] + "」");
				System.out.println("相手の手は「" + hands[computerHand] + "」");

				// 勝敗判定をする
				if (userHand == computerHand) {
					System.out.println("DRAW あいこ もう一回しましょう！");
				} else if ((userHand == 0 && computerHand == 1) || // グー vs チョキ
						(userHand == 1 && computerHand == 2) || // チョキ vs パー
						(userHand == 2 && computerHand == 0)) { // パー vs グー
					System.out.println("やるやん。");
					System.out.println("次は俺にリベンジさせて");
					break;
				} else {
					System.out.println("俺の勝ち！");
					if (computerHand == 0) {
						System.out.println("負けは次につながるチャンスです！ネバーギブアップ！");
					} else if (computerHand == 1) {
						System.out.println("たかがじゃんけん、そう思ってないですか？それやったら次も、俺が勝ちますよ");
					} else {
						System.out.println("なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです");
					}
				}
			}

			// じゃんけんを行った回数を表示する
			System.out.println("\n勝つまでにかかった合計回数は" + totalRounds + "回です");
			scanner.close();
		}
	}
}
