package logic;

public class Prefecture {
	private String name; // 都道府県名
	private String capital; // 県庁所在地
	private double area; // 面積

	// コンストラクタ
	public Prefecture(String name, String capital, double area) {
		this.name = name;
		this.capital = capital;
		this.area = area;
	}

	// ゲッター
	public String getName() {
		return name;
	}

	public String getCapital() {
		return capital;
	}

	public double getArea() {
		return area;
	}
}