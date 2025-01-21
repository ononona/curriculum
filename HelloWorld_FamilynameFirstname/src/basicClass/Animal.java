package basicClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
	public static void main(String[] args) {
		// Q1: Dogクラスを呼び出して動物の名前をコンソールに出力する
		Dog dog1 = new Dog("犬");
		System.out.println(dog1.name); 

		// Q2: Dogクラスを呼び出して動物の数をコンソールに出力する
		Dog dog2 = new Dog(5); 
		System.out.println(dog2.count); 

		// Q3: 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して出力する
		Date now = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		String formattedDate = formatter.format(now);
		System.out.println(formattedDate);
	}
}