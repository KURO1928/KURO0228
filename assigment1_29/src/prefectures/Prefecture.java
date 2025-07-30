package prefectures;

public class Prefecture {
	private String name;
    private String capital;
    private double area;

    public Prefecture(String name, String capital, double area) {
        this.name = name;
        this.capital = capital;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "都道府県名：" + name + "\n" +
               "県庁所在地：" + capital + "\n" +
               "面積：" + area + "km2";
    }
}
