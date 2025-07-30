package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import prefectures.Prefecture; // Prefectureクラスをインポート

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ユーザーにソートしたい都道府県の番号を入力させる
        System.out.println("ソートしたい都道府県の番号をカンマ区切りで入力してください (例: 8,5,9)");
        String inputIndices = scanner.nextLine();

        // ユーザーにソート順を入力させる
        System.out.println("昇順でソートする場合は 'asc'、降順でソートする場合は 'desc' と入力してください。");
        String sortOrder = scanner.nextLine().trim().toLowerCase();

        List<Prefecture> selectedPrefectures = new ArrayList<>();
        // 入力された文字列をカンマで分割し、個々のインデックス文字列を取得
        String[] indexStrings = inputIndices.split(",");

        // 各インデックス文字列を処理
        for (String indexStr : indexStrings) {
            try {
                int index = Integer.parseInt(indexStr.trim()); // 文字列を整数に変換
                // 有効なインデックスであれば、対応する都道府県をリストに追加
                if (PrefectureData.isValidIndex(index)) {
                    selectedPrefectures.add(PrefectureData.getPrefecture(index));
                } else {
                    System.out.println("無効な番号が入力されました: " + index + " は無視されます。");
                }
            } catch (NumberFormatException e) {
                // 数値変換エラーが発生した場合
                System.out.println("不正な入力です: '" + indexStr.trim() + "' は数値ではありません。無視されます。");
            }
        }

        // 選択された都道府県が一つもなければ終了
        if (selectedPrefectures.isEmpty()) {
            System.out.println("有効な都道府県が選択されませんでした。");
            scanner.close();
            return;
        }

        // 面積に基づいてリストをソート
        if (sortOrder.equals("asc")) { // "asc" と入力されたら、降順でソート (面積の大きい順)
            Collections.sort(selectedPrefectures, Comparator.comparingDouble(Prefecture::getArea).reversed());
        } else { // "desc" と入力された場合 (またはその他の入力) は、昇順でソート (面積の小さい順)
            Collections.sort(selectedPrefectures, Comparator.comparingDouble(Prefecture::getArea));
        }

        // ソート結果をコンソールに出力
        System.out.println("\n--- ソート結果 ---");
        for (Prefecture prefecture : selectedPrefectures) {
            System.out.println(prefecture);
            System.out.println("---");
        }

        scanner.close(); // Scannerを閉じる
    }
}
