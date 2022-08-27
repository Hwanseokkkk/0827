
public class Secondjava {
	public static void main(String[] args) {
		char ch1 ='자'; // \uC790
		char ch2 ='바'; // \uBC14
		//한 char 16비트 사이즈를 갖는다 16비트에는 한글하나밖에 저장이 안된다. 자바 를 저장하려면 2개의 char가 필요하다.
		System.out.print(ch1);
		System.out.println(ch2);
	}

}
//스택(지역변수, 값변수)을(를) 힙(객체만 들어갈수있음)으로 넘기려면 (Auto)Boxing 반대는 (Atuo)Unboxing( boxing Ex) Int --> Integer)