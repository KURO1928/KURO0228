package curriculum_B;

public class Qes4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                // 2桁ゼロ埋めで表示
                System.out.print(String.format("%02d * %02d = %02d", i, j, i * j));
                // 9列目以外は区切りを入れる
                if (j != 9) {
                    System.out.print(" || ");
                }
            }
            System.out.println();
            System.out.println();
        }
    }
}