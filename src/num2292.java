import java.util.*;
public class num2292 {

	public static void main(String[] args) {
		int num=0;
		int total=1, count = 1;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt(); //목적지 값
		
		while(total <num) {
			total +=count*6;
			count++; 
		}
		System.out.println(count);
	}
}


/*
58까지 5가 나오려면 일단 4번 실행하면 61인데, count++ 한 번 진행해서 count가 5가된다음에 
또 실행하려보니까 total>num이라서 break!
따라서 5로 나오게 됨! 
*/