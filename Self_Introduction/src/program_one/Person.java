package program_one; 

class Person {
	  // インスタンスフィールドを定義する
	  public String name;   
	  public int age;       
	  public double height; 
	  public double weight; 

	  // クラスフィールド（人数の合計を管理）
	  private static int personCount = 0;

	  // コンストラクタを定義しインスタンスフィールドに値をセット
	  public Person(String name, int age, double height, double weight) {
	    this.name = name;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	    personCount++; 
	  }

	  // BMIを計算するメソッド
	  public double bmi() {
	    return this.weight / (this.height * this.height);
	  }

	  // 自己紹介を出力するメソッド
	  public void print() {
	    System.out.println("名前は" + this.name + "です");
	    System.out.println("年は" + this.age + "才です");
	    System.out.println("BMIは" + String.format("%.1f", this.bmi()) + "です");
	  }

	  // 合計人数を出力するクラスメソッド
	  public static void printTotalCount() {
	    System.out.println("合計" + personCount + "人です");
	  }
	}