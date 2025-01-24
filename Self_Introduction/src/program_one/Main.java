package program_one;

class Main {
	public static void main(String[] args) {
		// Personインスタンスを作成する
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60.0);

		// フィールドの値を出力する
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);

		// 自己紹介を表示する
		person1.print();

		// 合計人数を表示する
		Person.printTotalCount();
	}
}