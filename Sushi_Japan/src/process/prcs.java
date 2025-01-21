package process;

import java.text.SimpleDateFormat;
import java.util.Date;

public class prcs {
	private String greeting;
	private String sushiTaste;
	private String sushiType;

	// コンストラクタでフィールドを初期化する
	public prcs() {
		this.greeting = "こんにちは！ここは日本です！";
		this.sushiTaste = "この寿司はうまい";
		this.sushiType = "寿司は和食です";
	}

	// 挨拶メッセージを取得する
	public String getGreeting() {
		return this.greeting;
	}

	// 寿司の味メッセージを取得する
	public String getSushiTaste() {
		return this.sushiTaste;
	}

	// 寿司の種類メッセージを取得する
	public String getSushiType() {
		return this.sushiType;
	}

	// 現在日時を取得する
	public String getCurrentDateTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date now = new Date();
		return "今の現在日時は" + sdf.format(now) + "です";
	}
}