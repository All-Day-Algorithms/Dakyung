//알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
import java.util.Scanner;
public class num10809 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] list =new int[26]; //알파벳리스트
		for(int k=0;k<26;k++) { //리스트 초기화
			list[k] =-1;
		}
		
		String input = scan.next();
		for(int k=0; k<input.length();k++) {
			char alpha = input.charAt(k); //알파벳 한글자씩
			int change =(int)alpha -97; //리스트 체크하기 위해서 만듦
			int where = input.indexOf(alpha); //알파벳 위치
			list[change] = where;
		}
		
		for(int k=0;k<26;k++) {
			System.out.println(list[k]);
		}
		scan.close();
	}
}
