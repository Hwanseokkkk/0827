
public class ArrayDemo {
	public static void main(String[] args) {
		//1st 첫번째 방법 (배열의 방갯수가 작으면 쓸만혀~)
		/*int [] array = null; //배열 선언 (배열은 객체이기 때문에 주소를 가지고 있다(초기값 null) =null은 생략해도됨.
		array = new int[4]; //배열 생성 (어떤 배열을 만들꺼야? int배열을 만들꺼야, 방은 몇개 만들꺼야? 4개 만들꺼야)
		array[0] = 5; //배열 할당 
		array[1] = 6;
		array[2] = 7;
		array[3] = 8;*/
		
		//2nd
		/*int [] array =null; //배열선언
		array = new int[] {5,6,7,8}; //배열 생성 및 할당 */
		
		//3nd
//		int[]array = {5,6,7,8}; //initialization (단점 : 무조건 이런모양의 한줄로 끝내야함)
		
		//2차원 배열 : Rectangular Array(각층의 열의 수가 같다)
		//1st
		/*int[][]array = null; //선언
		array = new int[2][3]; //생성
		array[0][0] = 5;  //할당*/
		
		//2nd
		/*int [][]array = null; //선언
		array = new int[][] {{5,6,7},{8,9,10}}; //생선 및 할당*/
		
		//3nd
		//int[][]array = {{5,6,7},{8,9,10}}; //initialization
		
		//2차원 배열 : Ragged Array 각층의 열의 갯수가 다르다
		//1st
		/*int[][]array = null; //선언
		array = new int[3][]; //생성
		array[0] = new int[4];
		array[1] = new int[2];
		array[2] = new int[5];
		array[0][0] = 5; //할당*/
		
		//2nd
		/*int [][]array = null; //선언
		array = new int[3][]; //생성 및 할당
		array[0] = new int[] {3,4,5,6};
		array[1] = new int[] {7,8};
		array[2] = new int[] {9,10,11,12,13};*/
		
		//2-1 위에랑 똑같다.
//		int [][]array = null; //선언
//		array = new int[][] {{3,4,5,6},{7,8},{9,10,11,12,13}}; //생성 및 할당
		
		//3nd
		int [][]array =  {{3,4,5,6},{7,8},{9,10,11,12,13}}; //initialization
		System.out.println("0층의 방갯수 : "+array[0].length);
		System.out.println("1층의 방갯수 : "+array[1].length);
		System.out.println("2층의 방갯수 : "+array[2].length);
		
		for(int i=0;i<array.length;i++) {
			System.out.print(i+"층 : ");
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+",");
			}
			System.out.println();
		}
		//배열 바꿔치기~~~
		//array[0]와 array[1]를 swapping 할꺼얌
		int []temp = array[0]; //임시배열temp생성하고~~임시배열temp에 0번째 넣고 0번째에 1번째 넣고 1번째를 임시배열temp에 넣으면? 끗!ㅋ
		array[0] = array[1];
		array[1] = temp;

	}

}
