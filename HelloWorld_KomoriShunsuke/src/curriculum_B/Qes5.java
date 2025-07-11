package curriculum_B;

public class Qes5 {
	 public static void main(String[] args) {
		 for (int i = 1; i <= 9; i++) {
	            for (int j = 1; j <= 20; j++) {
	                // 3桁ゼロ埋めで表示
	                System.out.print(String.format("%03d * %03d = %03d", j, i, j * i));
	                // 20列目以外は区切りを入れる
	                if (j != 20) {
	                    System.out.print(" || ");
	                }
	            }
	            System.out.println();
	            /*もう一行あける*/
	            System.out.println();
	        }
	    }
	}