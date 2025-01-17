package basicClass;

public class Dog {

	private String name;
	private int count;

	// Q1：フィールドに動物の名前の変数を定義する
	public Dog(String name) {
		this.name = name;
	}

	// Q2:フィールドに動物の数の変数を定義する
	public Dog(String name, int count) {
		this.name = name;
		this.count = count;
	}

	// Q3:Q1で作成した変数に「犬」を代入するコンストラクタを作成する

	public String getName() {
		return name;
	}

	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成する
	public int getCount() {
		return count;
	}
}