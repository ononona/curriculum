package program;

public class Main {
	public static void main(String[] args) {
		// Personインスタンスを作成する
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);

		// CarとBicycleのインスタンスを作成する
		Car car = new Car();
		Bicycle bicycle = new Bicycle();

		//ownerを設定する
		//car.setOwner(person1.fullName());
		//bicycle.setOwner(person2.fullName());

		//System.out.println(car.getOwner());
		//System.out.println(bicycle.getOwner());

		// 乗り物を購入する
		person1.buy(car);
		person2.buy(bicycle);
	}
}