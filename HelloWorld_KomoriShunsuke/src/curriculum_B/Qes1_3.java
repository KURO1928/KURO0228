package curriculum_B;

import java.util.Random;
import java.util.Scanner;


public class Qes1_3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		boolean trueName = false;

		Scanner scanner = new Scanner(System.in);
		String userName = scanner.nextLine();
		
		while(trueName = true)
		/*nullまたは空文字のチェック*/
		if (userName == null || userName.isEmpty()) {
			System.out.println("「名前を入力してください」");
			continue;
			/*半角英数字チェック*/
		} else if (!userName.matches("^[a-zA-Z0-9]*$")) {
			System.out.println("「半角英数字のみで名前を入力して下さい」");
			continue;
			/*文字数チェック*/
		} else if (userName.length() > 10) {
			System.out.println("「10文字以内にして下さい」");
			continue;
			/*正常時*/
		} else {
			System.out.println("ユーザー名「" + userName + "」を登録しました");
			trueName = true;
			break;
		}


		/*ジャンケンゲーム*/
		String[] hands = {"グー", "チョキ", "パー"};
		int count = 0;
		boolean winflag = false;
		scanner = new Scanner(System.in);


		/*自分の手*/
		/*ループ始まり　ジャンケンに勝つまで続ける*/
		while(winflag = true) {
			count++;
			
			int userHand = scanner.nextInt();
			if (userHand == 0 || userHand == 1 || userHand == 2) {
				System.out.println( userName + "の手は「" + hands[userHand] + "」");
			}

			/*相手の手*/
			Random random = new Random();
			int cpuHand = random.nextInt(3);
			System.out.println("相手の手は" + hands[cpuHand]  );

			/*勝ち負けの時*/
			/*あいこの時*/
			if (userHand == cpuHand) {
				System.out.println( "DRAW あいこ もう一回しましょう！");
				continue;
				/*勝ちの時*/
			} else if((userHand == 0 && cpuHand == 1) || (userHand == 1 && cpuHand == 2) || (userHand == 2 && cpuHand == 0) ) {
				System.out.println( "やるやん。");
				System.out.println( "次は俺にリベンジさせて");
				winflag = true;
				System.out.println("勝つまでにかかった合計回数は" + count + "回です");
				break;
				/*負けの時*/
				/*グーに負けた時*/
			} else if(userHand == 1 && cpuHand == 0) {
				System.out.println( "俺の勝ち！");
				System.out.println( "負けは次につながるチャンスです！");
				System.out.println( "ネバーギブアップ！");
				continue;
				/*チョキに負けた時*/
			} else if(userHand == 2 && cpuHand == 1) {
				System.out.println( "俺の勝ち！");
				System.out.println( "たかがじゃんけん、そう思ってないですか？");
				System.out.println( "それやったら次も、俺が勝ちますよ");
				continue;
				/*パーに負けた時*/
			} else if(userHand == 0 && cpuHand == 2) {
				System.out.println( "俺の勝ち！");
				System.out.println( "なんで負けたか、明日まで考えといてください。");
				System.out.println( "そしたら何かが見えてくるはずです");
				continue;
			}
			
		}


		scanner.close();

	}
}	
/*ループ文を作る　
 * 勝ったとき（winflagがtrueの時ループを抜ける）
 * 負けとあいこの時（winflagがfalsの場合ループを続ける）
 * ループを抜けた後カウントを表記する
 * */


