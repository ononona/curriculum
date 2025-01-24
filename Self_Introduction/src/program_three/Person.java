package program_three;

class Person {
	// クラスフィールド
	public static int count = 0;

	// インスタンスフィールド
	public String firstName; // 名
	public String lastName; // 姓
	public int age; 
	public double height; 
	public double weight; 

	// コンストラクタ（firstName, lastNameを受け取る）
	public Person(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++; // インスタンス生成時に人数をカウントする
	}

	// フルネームを返すメソッド
	public String fullName() {
		return this.firstName + " " + this.lastName;
	}

	// 自己紹介を出力するメソッド
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + String.format("%.1f", this.bmi()) + "です");
	}

	// BMIを計算するメソッド
	public double bmi() {
		return this.weight / (this.height * this.height);
	}

	// 合計人数を出力するクラスメソッド
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}