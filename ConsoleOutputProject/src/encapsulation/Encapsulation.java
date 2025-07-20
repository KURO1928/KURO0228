package encapsulation;

/*
	
下記がコンソールに出力されるように作成してください
※thisとsetterとgetterとフィールドを使ってください

動物名：ライオン
体長：2.1m
速度：80km/h
	
*/

public class Encapsulation {
	/*フィールド*/
	private String animal;
	private double height;
	private double speed;
	
	public  Encapsulation(String animal, double height, double speed) {
		this.animal = animal;
		this.height = height;
		this.speed = speed;
	}
	/*セッター*/
	public void setanimal(String animal) {
		this.animal = animal;
	}
	public void setheight(double height) {
		this.height = height;
	}
	public void setspeed(double speed) {
		this.speed = speed;
	}
	
	/*ゲッター*/
	public String getanimal() {
		return this.animal;
	}
	public double getheight() {
		return this.height;
	}
	public double getspeed() {
		return this.speed;
	}
	
	public static void main(String[] args) {
        // Animalオブジェクトの作成
		Encapsulation lion = new Encapsulation("ライオン", 2.1, 80.0);

        // ゲッターを使って情報を取得し、出力
        System.out.println("動物名：" + lion.getanimal());
        System.out.println("体長：" + lion.getheight() + "m");
        System.out.println("速度：" + lion.getspeed() + "km/h");
    }
}
