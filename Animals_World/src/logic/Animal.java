package logic;

public class Animal {
	private String name;
	private double bodyLength;
	private int speed;
	private String scientificName;

	// コンストラクタ
	public Animal(String name, double bodyLength, int speed, String scientificName) {
		this.name = name;
		this.bodyLength = bodyLength;
		this.speed = speed;
		this.scientificName = scientificName;
	}

	// ゲッター
	public String getName() {
		return name;
	}

	public double getBodyLength() {
		return bodyLength;
	}

	public int getSpeed() {
		return speed;
	}

	public String getScientificName() {
		return scientificName;
	}
}