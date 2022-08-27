
public class ThirdJava {
	public static void main(String[] args) {
		Integer addr = 5; //autoboxing
		//int su = addr.intValue() + 100; 예전방식
		int su = addr + 100; //따로 위에 코드처럼 작업해주지 않아도된다.(autounboxing)
		System.out.println("su ="+ su);
		
		
	}

}
