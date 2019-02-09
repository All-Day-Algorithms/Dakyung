/*
 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
 */
import java.util.Scanner;
public class num2675 {

	public static void main(String[] args) {
		int t,num =0;
		String sentence =null;
		Scanner scan = new Scanner(System.in);
		t = scan.nextInt(); //몇 번
		for(int i=0; i<t;i++) {
			num = scan.nextInt();
			sentence = scan.next(); 
			for(int k =0; k<sentence.length();k++) {
				for(int j=0;j<num;j++) {
					System.out.print(sentence.charAt(k));
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
