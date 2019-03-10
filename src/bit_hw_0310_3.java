/*
문제6. 사용자로부터 초를 입력받은 후
  이 초를 [시간, 분, 초]로 출력하는 메서드를 제작해서
  사용해보세요
  예를 들어 3672를 입력하면 [1시간, 1분, 12초]를 
  출력하면 됩니다
*/
import java.util.*;
public class bit_hw_0310_3 {
	public static void main(String[] args) {
		int time =0, hour =0;
		int min =0, sec =0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("초를 입력하세요.");
		time = scan.nextInt();
		
		hour = hour(time);
		min = min(time);
		sec = sec(time);
		
		System.out.println("[" + hour + "시간, " + min + "분 , "+sec+"초]");
	}
	
	public static int hour(int time) {
		int hour =0;
		hour = time / 3600;
		
		return hour;
	}
	
	public static int min(int time) {
		int min =0;
		min = time / 60;
		if(min >=60) {
			min = min- 60;
		}
		
		return min;
	}
	
	public static int sec(int time) {
		int sec =0;
		sec = time % 60;
		
		return sec;
	}
	

}
