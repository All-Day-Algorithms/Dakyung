/*
 세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
예를 들어 A = 150, B = 266, C = 427 이라면 
A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 */

import java.util.*;
public class num2577 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int total = a * b * c;
		
		String num = Integer.toString(total); //int를 string으로
		char[] ch= num.toCharArray(); //string을 char로 
		char [] arraynum = new char[num.length()];
		int [] numcount = new int[10];

		for(int i =0;i<arraynum.length;i++) {
			arraynum[i]=num.charAt(i);
			numcount[arraynum[i]-'0']+=1; // char 형 문자를 int 형 정수로 변환하기 위해 '0' 을 빼기
		}
		
		for(int i =0;i<numcount.length;i++) {
			System.out.println(numcount[i]);
		}
	}
}
