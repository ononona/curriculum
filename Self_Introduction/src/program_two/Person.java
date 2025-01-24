package program_two;

class Person {
	// インスタンスフィールド
	public String name;
	public int age;
	public double height;
	public double weight;

	// クラスフィールド
	private static int count = 0;

	// コンストラクタ
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++; // インスタンスが生成されるたびに人数をカウントする
	}

	// BMIを計算するメソッド
	public double bmi() {
		return this.weight / (this.height * this.height);
	}

	// インスタンスの情報を出力するメソッド
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + String.format("%.1f", this.bmi()) + "です");
	}

	// 合計人数を出力するクラスメソッド
	public static void printCount() {
		System.out.println("合計" + count + "人です");
	}
}