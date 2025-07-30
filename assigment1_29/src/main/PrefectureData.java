/*
 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"
 	
 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください
   	
   	例:
   	8,5,9,.....
   	と入力された場合（昇順）
   	
   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2
   	
   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2	
 */
 

package main;

import java.util.HashMap;
import java.util.Map;

import prefectures.Prefecture; // Prefectureクラスをインポート

public class PrefectureData {
	 // 都道府県データを格納する静的マップ
    private static final Map<Integer, Prefecture> data = new HashMap<>();

    // クラスロード時に初期データを設定
    static {
        data.put(0, new Prefecture("北海道", "札幌市", 83424));
        data.put(1, new Prefecture("青森県", "青森市", 9646));
        data.put(2, new Prefecture("岩手県", "盛岡市", 15275));
        data.put(3, new Prefecture("宮城県", "仙台市", 7282));
        data.put(4, new Prefecture("秋田県", "秋田市", 11638));
        data.put(5, new Prefecture("山形県", "山形市", 9323));
        data.put(6, new Prefecture("福島県", "福島市", 13784));
        data.put(7, new Prefecture("茨城県", "水戸市", 6097));
        data.put(8, new Prefecture("栃木県", "宇都宮市", 6408));
        data.put(9, new Prefecture("群馬県", "前橋市", 6362));
        data.put(10, new Prefecture("埼玉県", "さいたま市", 3798));
    }

    /**
     * 指定されたインデックスに対応するPrefectureオブジェクトを返します。
     * @param index 都道府県のインデックス（例: 0, 1, 2...）
     * @return 該当する{@link Prefecture}オブジェクト、またはインデックスが無効な場合は{@code null}
     */
    public static Prefecture getPrefecture(int index) {
        return data.get(index);
    }

    /**
     * 指定されたインデックスが有効な都道府県データに存在するかどうかをチェックします。
     * @param index チェックするインデックス
     * @return インデックスが有効な場合は{@code true}、それ以外は{@code false}
     */
    public static boolean isValidIndex(int index) {
        return data.containsKey(index);
    }
}
