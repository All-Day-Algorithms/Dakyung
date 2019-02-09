import java.util.*;
public class num1924 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month=0 , day =0, total=0;
		
		month = scan.nextInt();
		day = scan.nextInt();
		
		int[] monthli = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i =0;i<month-1;i++) {
			total += monthli[i];
		}
		total += day;
		
		int out = total % 7;
		
        switch (out) {
        case 0:
            System.out.print("SUN");
            break;
        case 1:
            System.out.print("MON");
            break;
        case 2:
            System.out.print("TUE");
            break;
        case 3:
            System.out.print("WED");
            break;
        case 4:
            System.out.print("THU");
            break;
        case 5:
            System.out.print("FRI");
            break;
        case 6:
            System.out.print("SAT");
            break;
        }
    } 
}
