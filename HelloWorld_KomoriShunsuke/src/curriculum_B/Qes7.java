package curriculum_B;

import java.util.Scanner;

public class Qes7 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		// 科目名の配列
		String[] subjects = {"英語", "数学", "理科", "社会"};

		// 生徒数の入力
		System.out.print("生徒の人数を入力してください（2以上）：");
		int studentCount = Integer.parseInt(scanner.nextLine());

		// 各生徒の点数を格納する配列
		int[][] scores = new int[studentCount][subjects.length];

		// 各生徒ごとに各科目の点数を入力
		for (int i = 0; i < studentCount; i++) {
			for (int j = 0; j < subjects.length; j++) {
				System.out.print((i + 1) + "人目の「" + subjects[j] + "」の点数を入力してください：");
				scores[i][j] = Integer.parseInt(scanner.nextLine());
			}
			 System.out.println();
		}

		// 各生徒の平均点を計算・出力
		for (int i = 0; i < studentCount; i++) {
			int sum = 0;
			for (int j = 0; j < subjects.length; j++) {
				sum += scores[i][j];
			}
			double avg = (double) sum / subjects.length;
			System.out.printf("%d人目の平均点は%.2f点です。\n", i + 1, avg);
		}
		System.out.println();

		// 各科目の平均点を計算・出力
		for (int j = 0; j < subjects.length; j++) {
			int sum = 0;
			for (int i = 0; i < studentCount; i++) {
				sum += scores[i][j];
			}
			double avg = (double) sum / studentCount;
			System.out.printf("%sの平均点は%.2f点です。\n", subjects[j], avg);
		}

		// 全体の平均点を計算・出力
		int totalSum = 0;
		for (int i = 0; i < studentCount; i++) {
			for (int j = 0; j < subjects.length; j++) {
				totalSum += scores[i][j];
			}
		}
		double totalAvg = (double) totalSum / (studentCount * subjects.length);
		System.out.printf("全体の平均点は%.2f点です。\n", totalAvg);
	}
}
