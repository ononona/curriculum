package program;

public class Person {
	private String firstName;
	private String lastName;

	// コンストラクタ
	public Person(String lastName, String firstName, int age, double height, double weight) {
		this.lastName = lastName;
		this.firstName = firstName;
	}

	// フルネームを返すメソッド
	public String fullName() {
		return lastName + firstName;
	}

	// 車を購入するメソッド
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}

	// 自転車を購入するメソッド
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}