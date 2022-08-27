
public class fristJava {
	public static void main(String[] args) {
		double avg = 89.5; //89.5가 실제로 2진수로 어떻게 저장되는지 알아보쟈
		long value1 = Double.doubleToRawLongBits(avg);
		System.out.println(Long.toBinaryString(value1));
		//100000001010110011000000000000000000000000000000000000000000000 이렇게 저장되어있는데 자바는 읽을때 89.5로 불러온다
		//룰이 있다...룰대로 읽는다. 
	}

}
