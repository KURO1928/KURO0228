package game;

import gameCharacter. PlayerCharacter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// ユーザーに名前の入力を促すメッセージを表示
        System.out.print("名前を入力してください: ");
        // ユーザーが入力した名前を読み取り、playerName 変数に格納
        String playerName = scanner.nextLine();

        // PlayerCharacter のインスタンスを生成
        // コンストラクタが呼び出され、入力された名前が設定され、ランダムなステータスが生成されます。
        PlayerCharacter player = new PlayerCharacter(playerName);

        // 生成したプレイヤーキャラクターのステータスを表示
        // displayStatus() メソッドはスーパークラス (GameCharacter) で定義されています。
        player.displayStatus();

        // 冒険を促すメッセージを出力
        System.out.println("\nさあ冒険に出かけよう！");

        // Scanner オブジェクトをクローズし、リソースを解放
        scanner.close();
	}
}
