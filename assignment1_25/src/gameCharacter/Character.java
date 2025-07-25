package gameCharacter;

import java.util.Random;

public class Character {
	protected String name; /*名前*/
	protected int hp; /*HP*/
	protected int mp; /*MP*/
	protected int attack; /*攻撃力*/
	protected int agility; /*素早さ*/
	protected int defense; /*防御力*/
	
	
	public Character(String name) {
        this.name = name;
        Random random = new Random(); // Randomクラスのインスタンスを生成

        // 各ステータスにランダムな値を設定
        // nextInt(上限) + 下限 で、指定範囲内の整数を生成
        this.hp = random.nextInt(900) + 100;    // HP: 100 ～ 999
        this.mp = random.nextInt(900) + 100;    // MP: 100 ～ 999
        this.attack = random.nextInt(400) + 50; // 攻撃力: 50 ～ 449
        this.agility = random.nextInt(900) + 100; // 素早さ: 100 ～ 999
        this.defense = random.nextInt(100) + 10; // 防御力: 10 ～ 109
    }
	
	// --- Getterメソッド ---
    // 各ステータスの値を取得するためのメソッド
	
	public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getAttack() {
        return attack;
    }

    public int getAgility() {
        return agility;
    }

    public int getDefense() {
        return defense;
    }
    
 // --- Setterメソッド ---
    // 各ステータスの値を設定するためのメソッド (必要に応じて追加)
    
    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
    
    /* キャラクターの現在のステータスをコンソールに出力します。*/
    public void displayStatus() {
        System.out.println("こんにちは「 " + this.name + " 」 さん");
        System.out.println("ステータス");
        System.out.println("HP：" + this.hp);
        System.out.println("MP：" + this.mp);
        System.out.println("攻撃力：" + this.attack);
        System.out.println("素早さ：" + this.agility);
        System.out.println("防御力：" + this.defense);
    }
}
