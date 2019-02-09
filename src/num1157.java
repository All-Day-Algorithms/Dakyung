/*알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.*/
import java.util.Scanner;
public class num1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, most=0,alpha =0;//리스트에 넣을 인덱스
		//알파벳 리스트 생성
		int[] list =new int[26]; //알파벳리스트
		for(int k=0;k<26;k++) { //리스트 초기화
			list[k] =-1;
		}
		
		String input = scan.next(); //입력
		
		for(int k=0; k<input.length();k++) {	
			alpha = (int)(input.charAt(k)); //알파벳 한글자씩
			if(alpha >= 97) {
				num = alpha - 97 ;
			}else {
				num = alpha - 65;
			}
			list[num]++; //해당인덱스에 +1
		}
		
		for(int k=0; k<26;k++) {
			if(list[k]> most) {
				most=list[k];
			}
		}
		System.out.println((char)(list[most]+65));
	}
}

