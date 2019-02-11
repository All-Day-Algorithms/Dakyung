/*
 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 */
import java.util.*;
public class num1316 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int score =num;
		for(int i=0;i<num;i++) {
			String word = scan.next();
			boolean[] checkalp =new boolean[27];
			
			for(int k=1; k<word.length();k++) {
				if(word.charAt(k-1) != word.charAt(k)) {//이전 글자랑 현재글자랑 같은지 확인
					if(checkalp[word.charAt(k)-97] ==true) { //다르면 현재글자가 이전에 나왔는지 확인
						score --; //나왔으면 스코에서 빼고 끝
						break;
					}
					checkalp[word.charAt(k-1)-97]=true; //일단 이전글자는 나온거자나 ? 그러니까 체크해야지 
				}
			}
		}
		System.out.println(score);
	}
}
