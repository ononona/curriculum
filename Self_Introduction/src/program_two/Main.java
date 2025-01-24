package program_two;

class Main {
	public static void main(String[] args) {
		// Personインスタンスを作成する
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();

		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();

		// クラスメソッドを呼び出して合計人数を出力する
		Person.printCount();
	}
}