//���� ��ҹ��ڿ� ���⸸���� �̷���� ���ڿ��� �־�����. �� ���ڿ����� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.*;
public class num1152 {
	public static void main(String[] args) throws IOException { //�� �̰� �Ⱦ��� �ȵ���..?
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //����
		String i = bf.readLine(); //���� �Է¹ޱ�
		StringTokenizer st = new StringTokenizer(i, " "); //���� �������� �ڸ���
		int count = st.countTokens();
        System.out.println(count);
		


	}
}

/* ��µ����� �ð��� �����ɸ��� �ڵ�
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

      System.out.printf("���� �ð� : %.3f(��)",(end-start) / 1000.0);
      
       Scanner scan = new Scanner(System.in);
          
        String words = scan.nextLine();
        String date[] = words.trim().split(" ");
        
        Arrays.stream(date).forEach(System.out::println);
 */

/*
        Scanner scan = new Scanner(System.in);
        
        Arrays.stream(scan.nextLine().trim().split(" ")).forEach(System.out::println);
 */
 