
public class FourthJava {
	public static void main(String[] args) {
		String first = "Hello"; //1000번지
		String second = "World"; //2000번지
		//String result = first + second; 
		String result = first.concat(second); //3000번지(새로운 번지를 만들어냄)
		//문제점 : 문자열을 더할때마다 새로운번지를 계속 만들어야함
		System.out.println("result = " + result);
		
		StringBuffer sb = new StringBuffer("Hello");
		StringBuffer sb1 = new StringBuffer("World");
		sb.append(sb1); //위에 result와 결과값은 같지만 String자체가 상수라서 바뀔수없어서 새로운 번지를 할당해야하지만 append를 사용하면 기존번지 뒤에 이어버린다.
		System.out.println("sb = "+ sb.toString());
		
		String sql = "SELECT housecode, sido, gugun, dong bunji"+
		             "FROM housecode" + 
				     "WHERE dong = %" + "사직동" + "%";
		
		//StringBuffer sql1 =  위 코드를 buffer와 append를 이용하여 하는게 훨씬 좋다. 
		
	}

}
