package introduction;

public class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name , int age , double height , double weight) {
		this.name = name;
		this.age = age;
		this.height = height; 
		this.weight = weight;
		Person.count++;
	}
	public double bmi() {
		return this.weight / (this.height * this.height);
	}

	public void print() {
		double originalBmi = this.bmi();

		// Math.floor()で小数点以下を切り捨て
		double flooredBmi = Math.floor(originalBmi);
		
		String formatBmi = String.format("%.1f", flooredBmi);
		
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + formatBmi + "です");
	}
}
