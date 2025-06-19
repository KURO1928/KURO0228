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

/*ローカル変数の初期化*/
/*byte型*/
myByteVariable = 10;

/*short型*/
myShortVariable = 5000;

/*int型*/
myIntVariable = 10000;

/*long型*/
myLongVariable = 1234567890123L;

/*float型*/
myFloatVariable = 3.14f;

/*double型*/
myDoubleVariable = 3.14159265;

/*char型*/
myCharVariable = 'A';

/*String型*/
myStringVariable = "これはJavaの文字列です";

/*boolean型*/
myBooleanVariable = true ;


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
int num1=23;
num = "4";
num1 = 3;
System.out.println("ハローJAVA"+(num+num1));

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
System.out.printf("BMIは%.1fです%n", myBmi3);

System.out.println("初めまして" + myName +"です" );
System.out.println("年齢は"+ myAge + "歳です");
System.out.println("身長は"+ myHeight + "cmです");
System.out.println("体重は"+ myWeight + "kgです");
System.out.println("好きな食べ物は"+ myLikefood + "です");
System.out.printf("BMIは%.2fです%n", myBmi3);

System.out.println();

/*問１０*/
System.out.println(myAge >= 25);

System.out.println();

/*問１１*/
String str = String.valueOf(myAge) + " " +  String.valueOf(myHeight) + " " + String.valueOf(myWeight);
System.out.println(str);

System.out.println();

/*問１２*/
System.out.println(myAge >= 25 || myHeight < 160);

	}

}