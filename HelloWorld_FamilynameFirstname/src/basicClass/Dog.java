package basicClass;

public class Dog {
	// Q1: フィールドに動物の名前の変数を定義する
	public String name;

	// Q2: フィールドに動物の数の変数を定義する
	public int count;

	// Q3: Q1で作成した変数に「犬」を代入するコンストラクタを作成する
	public Dog(String name) {
		this.name = name;
	}

	// Q4: Q2で作成した変数に引数を代入するコンストラクタを作成する
	public Dog(int count) {
		this.count = count;
	}
}