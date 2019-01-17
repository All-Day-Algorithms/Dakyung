//영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.*;
public class num1152 {
	public static void main(String[] args) throws IOException { //왜 이거 안쓰면 안되지..?
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		String i = bf.readLine(); //문자 입력받기
		StringTokenizer st = new StringTokenizer(i, " "); //공백 기준으로 자르기
		int count = st.countTokens();
        System.out.println(count);
		


	}
}

/* 출력되지만 시간이 오래걸리는 코드
import java.util.*;
public class num1152 {

	public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
	    
	        String words = scan.nextLine();
	        String date[] = words.split(" ");
	        
	        for(int i=0; i<date.length;i++) {
	        	System.out.println(date[i]);
	        }
	}
} 
 */



/*
       long end = System.currentTimeMillis();

      System.out.printf("실행 시간 : %.3f(초)",(end-start) / 1000.0);
      
       Scanner scan = new Scanner(System.in);
          
        String words = scan.nextLine();
        String date[] = words.trim().split(" ");
        
        Arrays.stream(date).forEach(System.out::println);
 */

/*
        Scanner scan = new Scanner(System.in);
        
        Arrays.stream(scan.nextLine().trim().split(" ")).forEach(System.out::println);
 */
 