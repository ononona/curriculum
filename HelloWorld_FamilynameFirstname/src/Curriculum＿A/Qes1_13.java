package Curriculum＿A;

public class Qes1_13 {

	public static void main(String[] args) {

		// 問題１と問題２ ローカル変数の宣言をして初期値を代入する	
		byte byteVar = 0;
		short shortVar = 0;
		int intVar = 0;
		long longVar = 0;
		float floatVar = 0.0f;
		double doubleVar = 0.0d;
<<<<<<< HEAD
		char charVar = '\u0000'; 
		String stringVar = null;
=======
		char charVar = '\u0000';
		String stringVar = "";
>>>>>>> branch 'ononona' of https://github.com/ononona/curriculum.git
		boolean booleanVar = false;

		// 問題３ ローカル変数に値を代入する	
		byteVar = 10;
		shortVar = 100;
		intVar = 1000;
		longVar = 10000;
		floatVar = 9.5f;
		doubleVar = 10.5d;
		charVar = 'a';
		stringVar = "ハロー";
		booleanVar = true;

		// 問題４ 値を出力する
		System.out.println(byteVar + shortVar + intVar + longVar);
		System.out.println(byteVar + byteVar);
		System.out.println(charVar + stringVar + booleanVar);
		System.out.println(byteVar + shortVar + intVar + longVar + floatVar + doubleVar);
		System.out.println(byteVar * shortVar * intVar * longVar);
		System.out.println(doubleVar / shortVar);
		System.out.println(byteVar - shortVar);

		// 問題５
		String num = "20";
		// 文字列を数値に変換する
		int num2 = Integer.parseInt(num);
		int num1 = 23;
		// 数値+数値に変更する
		System.out.println("ハローJAVA" + (num2 + num1));

		// 問題６
		// ローカル変数に代入する
		byteVar = 18;
		doubleVar = 170.5;
		floatVar = 62.2f;
		stringVar = "山田太郎";
		// 値を出力する
		System.out.println("初めまして" + stringVar + "です");
		System.out.println("年齢は" + byteVar + "歳です");
		System.out.println("身長は" + doubleVar + "㎝です");
		System.out.println("体重は" + floatVar + "kgです");
		// 寿司を変数に代入する
		stringVar = "寿司";
		// 値を出力する
		System.out.println("好きな食べ物" + stringVar + "です");

		// 問題７
		// 身長の単位をmにする
		doubleVar = doubleVar / 100;
		System.out.println("BMIは" + (floatVar / (doubleVar * doubleVar)) + "です");

		// 問題８ 宣言した変数に再代入
		byteVar = 24;
		doubleVar = 168.5;
		floatVar = 64.2f;
		stringVar = "鈴木一郎";
		// 値を出力する
		System.out.println("初めまして" + stringVar + "です");
		System.out.println("年齢は" + byteVar + "歳です");
		System.out.println("身長は" + doubleVar + "㎝です");
		System.out.println("体重は" + floatVar + "kgです");
		// stringVarを再代入
		stringVar = "オムライス";
		//値を出力する
		System.out.println("好きな食べ物は" + stringVar + "です");
		// doubleVarを再代入する
		doubleVar = 22.6;
		// 値を出力する
		System.out.println("BMIは" + doubleVar + "です");

		// 問題９　
		// 値を再代入する
		stringVar = "鈴木一郎";
		doubleVar = 168.5;
		// 数値を和算で自己代入する
		byteVar += byteVar;
		doubleVar += doubleVar;
		floatVar += floatVar;
		// 値を出力する
		System.out.println("初めまして" + stringVar + "です");
		System.out.println("年齢は" + byteVar + "歳です");
		System.out.println("身長は" + doubleVar + "㎝です");
		System.out.println("体重は" + floatVar + "kgです");
		// stringVarを再代入
		stringVar = "オムライス";
		// 値を出力する
		System.out.println("好きな食べ物は" + stringVar + "です");
		// doubleVarを再代入する
		doubleVar = 11.31;
		// 値を出力する
		System.out.println("BMIは" + doubleVar + "です");

		// 問題10　
		// 問題８の年齢を再代入する
		byteVar = 24;
		// 年齢が25歳以上なら、trueを出力する
		booleanVar = (byteVar >= 25) ? true : false;
		// 出力する
		System.out.println(booleanVar);

		// 問題11　
		// 問題８宣言した変数を再代入
		byteVar = 24;
		doubleVar = 168.5;
		floatVar = 64.2f;
		// 問題８の[年齢・身長・体重]を文字列型に型変換する
		String byteStr = String.valueOf(byteVar);
		String doubleStr = String.valueOf(doubleVar);
		String floatStr = String.valueOf(floatVar);
		// 出力する
		System.out.println(byteStr + doubleStr + floatStr);

		// 問題12
		// 型変換する
		int byteInt = Integer.valueOf(byteStr);
		Double doubleDbl = Double.valueOf(doubleStr);
		// 出力する
		System.out.println(byteInt + doubleDbl);

		// 問題13
		// 年齢が25もしくは身長が160以上なら、trueを出力する
		booleanVar = (byteInt == 25 || doubleDbl >= 160) ? true : false;
		// 出力する
		System.out.println(booleanVar);
	}
}
