package introduction;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	
	private static int count = 0;

	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
	}

	public double bmi(){
		return this.weight / this.height / this.height;
	}

	public void print(){
		System.out.println("名前は" + name + "です");
		System.out.println("年は" + age + "です");
	}
	
	public static int getCount(){
        return count;
    }
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
	
}
