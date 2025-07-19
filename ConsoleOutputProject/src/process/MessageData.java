package process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class MessageData {
	private String greeting;
	private String location;
	private String foodTaste;
	private String foodCategory;
	private LocalDateTime currentDateTime;

	public MessageData(String greeting, String location, String foodTaste, String foodCategory) {
		this.greeting = Optional.ofNullable(greeting).orElse("こんにちは！");
		this.location = Optional.ofNullable(location).orElse("ここは日本です！");
		this.foodTaste = Optional.ofNullable(foodTaste).orElse("この食べ物はうまい");
		this.foodCategory = Optional.ofNullable(foodCategory).orElse("これは和食です");
		this.currentDateTime = LocalDateTime.now(); // 今日の日付と時刻を取得
	}

	public String getGreeting() {
		return this.greeting;
	}

	public String getLocation() {
		return this.location;
	}

	public String getFoodTaste() {
		return this.foodTaste;
	}

	public String getFoodCategory() {
		return this.foodCategory;
	}

	public String getCurrentDateTimeFormatted() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		return this.currentDateTime.format(formatter);
	}
}
