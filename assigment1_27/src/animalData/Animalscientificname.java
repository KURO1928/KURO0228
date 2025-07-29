/*コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50

  	コンソール出力結果

  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ

	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス

	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ

	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス

	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ

	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明  */

package animalData;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Animalscientificname {
	public static void main(String[] args) {
		// 学名のデータをMapに格納
		Map<String, String> scientificNames = new HashMap<>();
		scientificNames.put("ライオン", "パンテラ レオ");
		scientificNames.put("ゾウ", "ロキソドンタ・サイクロティス");
		scientificNames.put("パンダ", "アイルロポダ・メラノレウカ");
		scientificNames.put("チンパンジー", "パン・トゥログロディテス");
		scientificNames.put("シマウマ", "チャップマンシマウマ");
		scientificNames.put("インコ", "不明");

		System.out.println("コンソールに文字を入力してください");
		Scanner scanner = new Scanner(System.in);
		String inputLine = scanner.nextLine();
		scanner.close();

		// カンマで文字列を分割
		String[] animals = inputLine.split(",");

		// 分割した各動物の情報を処理
		for (String animal : animals) {
			String[] data = animal.split(":");
			if (data.length == 3) {
				String name = data[0];
				String length = data[1];
				String speed = data[2];

				// 学名をMapから取得
				String scientificName = scientificNames.getOrDefault(name, "不明");

				// 整形して出力
				System.out.println("動物名：" + name);
				System.out.println("体長：" + length + "m");
				System.out.println("速度：" + speed + "km/h");
				System.out.println("学名：" + scientificName);
				System.out.println(); // 改行して次の動物と区別
			}
		}
	}
}
