/*
 "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 */

import java.util.*;
public class num8958 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String[] list = new String[num];
		
		for(int i=0;i<num;i++) {
			list[i] = scan.next(); //입력받기
		}
		
		for(int i=0;i<list.length;i++) {
			int total=0;
			int plus=0;
			for(int k=0;k<list[i].length();k++) {
				if(list[i].charAt(k)=='O') {
					total += ++plus;  //연속 o면 한번 더 더해야하니까 여기서 plus 조절하기!
				}else {
					plus =0;
				}
			}
			System.out.println(total);
		}
	}
}


/*
 length --- arrays (int[], double[], String[]) ---- 배열의 길이를 알려 할때 사용한다.
length() --- String related Object (String, StringBuilder etc) - 이것은 문자열의 길이를 알고자 할때 사용된다.
size() --- Collection Object (ArrayList, Set etc) 컬렉션 타입의 길이를 확인할때 사용된다.
 */
 