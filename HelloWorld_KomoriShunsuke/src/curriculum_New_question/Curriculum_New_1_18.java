package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	private static void printHello(String message, int version) {
		System.out.println(message +  " JavaSE " + version);
	}
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	private static void multiplication(int num1 , int num2) {
		System.out.println(num1 * num2);
	}
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	private static void printArrayElements(int[] array) {
	    for (int i = 0; i < array.length; i++) {
	        System.out.print(array[i]);
	        // 最後の要素でなければカンマとスペースを出力
	        if (i < array.length - 1) {
	            System.out.print(" , ");
	        }
	    }
	    System.out.println();
	}
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	private static void calculateSum(double num1 , double num2) {
		System.out.println(num1 + num2);
	}
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	
	private static int[] RandomNumber(int Rnum) {
		int[] randomNumbers = new int[Rnum];
        Random rand = new Random();
        for (int i = 0; i < Rnum; i++) {
            int num;
            do {
                num = rand.nextInt(100) + 1; // 1から100までのランダムな数字
            } while (num == 0); // 0は含めない
            randomNumbers[i] = num;
            System.out.print(num);
            if (i < Rnum - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        return randomNumbers;
    }

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	private static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("配列が空のため平均値を計算できません。");
            return 0.0;
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / array.length;
        System.out.println( average);
        return average;
    }

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	 private static boolean checkAverageThreshold(double average) {
	        boolean isFiftyOrMore = average >= 50.0;
	        System.out.println(isFiftyOrMore);
	        return isFiftyOrMore;
	    }

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		/*Q1*/
		printHello("Hello" , 11);
		
		/*Q2*/
		multiplication(5 , 6 );
		
		/*Q3*/
		int[] numbers = {10, 20, 30, 40, 50};
		printArrayElements(numbers);
		
		/*Q4*/
		calculateSum(5.5 , 2.5);
		
		/*Q5*/
		int[] randomArray = RandomNumber(5);
		
		/*Q6*/
		double avg = calculateAverage(randomArray);
		
		/*Q7*/
		checkAverageThreshold(avg);
		
	}
}