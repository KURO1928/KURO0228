package gameCharacter;

public class  PlayerCharacter extends Character {
	/**
     * コンストラクタ: PlayerCharacter を初期化します。
     * @param name プレイヤーキャラクターの名前
     */
    public PlayerCharacter(String name) {
        // スーパークラス (GameCharacter) のコンストラクタを呼び出し、名前を渡します。
        // これにより、スーパークラスで定義されたステータスの初期化が実行されます。
        super(name);
    }
}
