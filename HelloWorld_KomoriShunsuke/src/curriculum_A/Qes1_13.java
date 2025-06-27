package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {
		/*問１　９つのローカル変数の宣言*/
		/*byte型*/
		byte myByteVariable;
		/*short型*/
		short myShortVariable;
		/*int型*/
		int myIntVariable;
		/*long型*/
		long myLongVariable;
		/*float型*/
		float myFloatVariable;
		/*double型*/
		double myDoubleVariable;
		/*char型*/
		char myCharVariable;
		/*String型*/
		String myStringVariable;
		/*boolean型*/
		boolean myBooleanVariable;
		
        /*問2
		ローカル変数の初期化*/
		/*byte型*/
		myByteVariable = 0;

		/*short型*/
		myShortVariable = 0;

		/*int型*/
		myIntVariable = 0;

		/*long型*/
		myLongVariable = 0L;

		/*float型*/
		myFloatVariable = 0.0f;

		/*double型*/
		myDoubleVariable = 0.0d;

		/*char型*/
		myCharVariable = '\u0000';

		/*String型*/
		myStringVariable = null;

		/*boolean型*/
		myBooleanVariable = false ;


		/*byte型*/
		myByteVariable = 10;

		/*short型*/
		myShortVariable = 100;

		/*int型*/
		myIntVariable = 1000;

		/*long型*/
		myLongVariable = 10000L;

		/*float型*/
		myFloatVariable = 9.5f;

		/*double型*/
		myDoubleVariable = 10.5;

		/*char型*/
		myCharVariable = 'a';

		/*String型*/
		myStringVariable = "ハロー";

		/*boolean型*/
		myBooleanVariable = true ;

		/*問題4*/
		System.out.print(myByteVariable + myShortVariable + myIntVariable + myLongVariable +  " ");
		System.out.println(myByteVariable + myShortVariable + myIntVariable + myLongVariable);

		System.out.print(myByteVariable + myByteVariable +  " ");
		System.out.println(myByteVariable + myByteVariable);

		System.out.print(myCharVariable + myStringVariable + myBooleanVariable + " ");
		System.out.println(myCharVariable + myStringVariable + myBooleanVariable);

		double sum = myLongVariable + myIntVariable + myShortVariable + myByteVariable + myFloatVariable + myDoubleVariable;
		System.out.print((long) sum + " ");
		System.out.println((long) sum);

		System.out.print(myByteVariable * myShortVariable * myIntVariable * myLongVariable +  " ");
		System.out.println(myByteVariable * myShortVariable * myIntVariable * myLongVariable);

		System.out.print(myDoubleVariable / myShortVariable + " ");
		System.out.println(myDoubleVariable / myShortVariable);

		System.out.print(myByteVariable - myShortVariable + " ");
		System.out.println(myByteVariable - myShortVariable);

		System.out.println();

		/*問題５*/
		String num="20";
		int num3 = Integer.parseInt(num);
		int num1=23;
		System.out.println("ハローJAVA"+(num3+num1));

		System.out.println();


		/*問題６*/
		String myName , myLikefood; 
		myName = "山田太郎";
		myLikefood = "寿司";
		byte myAge = 18;
		double myHeight , myWeight ;
		myHeight = 170.5;
		myWeight = 62.2;

		System.out.println("「初めまして" + myName +"です」" );
		System.out.println("「年齢は"+ myAge + "歳です」");
		System.out.println("「身長は"+ myHeight + "cmです」");
		System.out.println("「体重は"+ myWeight + "kgです」");
		System.out.println("「好きな食べ物は"+ myLikefood + "です」");

		/*問７*/
		double myHeightm = myHeight / 100.0;
		double myBmi = myWeight / (myHeightm * myHeightm);
		System.out.printf("BMIは%.1fです%n", myBmi);

		System.out.println();

		/*問題8*/
		myName = "鈴木一郎";
		myLikefood = "オムライス";
		myAge = 24;
		myHeight = 168.5;
		myWeight = 64.2;

		System.out.println("初めまして" + myName +"です" );
		System.out.println("年齢は"+ myAge + "歳です");
		System.out.println("身長は"+ myHeight + "cmです");
		System.out.println("体重は"+ myWeight + "kgです");
		System.out.println("好きな食べ物は"+ myLikefood + "です");

		double myHeightm2 = myHeight / 100.0;
		double myBmi2 = myWeight / (myHeightm2 * myHeightm2);
		System.out.printf("BMIは%.1fです%n", myBmi2);

		System.out.println();
		/*問９*/

		myAge += myAge;
		myHeight += myHeight;
		myWeight += myWeight;

		double myHeightm3 = myHeight / 100.0;
		double myBmi3 = myWeight / (myHeightm3 * myHeightm3);
		
		System.out.println("初めまして" + myName +"です" );
		System.out.println("年齢は"+ myAge + "歳です");
		System.out.println("身長は"+ myHeight + "cmです");
		System.out.println("体重は"+ myWeight + "kgです");
		System.out.println("好きな食べ物は"+ myLikefood + "です");
		System.out.printf("BMIは%.2fです%n", myBmi3);

		System.out.println();

		/*問１０*/
		myAge = 24;
		myHeight = 168.5;
		myWeight = 64.2;
		System.out.println(myAge >= 25);

		System.out.println();

		/*問１１*/
		String str = String.valueOf(myAge) + " " +  String.valueOf(myHeight) + " " + String.valueOf(myWeight);
		System.out.println(str);

		System.out.println();
		
		/*問１２*/
		int Anum = Integer.valueOf(myAge);
		int Wnum = (int) myHeight;
		System.out.println(Anum);
		System.out.println(Wnum);
		
		System.out.println();
		

		/*問１３*/
		System.out.println(myAge >= 25 || myHeight < 160);

	}

}