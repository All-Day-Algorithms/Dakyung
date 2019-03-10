import java.util.*;
public class num1193 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt(); //구해야 하는 값
		
		int line=0, cnt = 0,top =0, down =0;

        while(cnt < num) {
            line++; //몇번째 라인인지 체크
            cnt = line * (line+1) / 2; //n번째까지의 항
        } //등차수열의 법칙 사용 ->n번째까지의 항을 구하는 식 = n*(n+1)/2
        
        if( line % 2 != 0) { //홀수번째 줄이면 올라가는 방향
            top = 1+(cnt-num);
            down = line - (cnt-num);
            System.out.println(top+"/"+down);
        }else { //짝수번째 줄이면 내려오는 방향
            top = line - (cnt - num);
            down = 1 + (cnt - num);
            System.out.println(top+"/"+down);
        }
	}
}
