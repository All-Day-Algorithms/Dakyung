/*
 상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 
 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734과 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;
public class num2908 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2 =0;
		int[] list = new int[6];
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		int new1 = (num1%10)*100 + ((num1%100)/10)*10 + (num1/100);
		int new2 = (num2%10)*100 + ((num2%100)/10)*10 + (num2/100);
		
		if(new1>new2) {
			System.out.println(new1);
		}else {
			System.out.println(new2);
		}
	}

}
