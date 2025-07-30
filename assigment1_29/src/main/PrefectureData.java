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
