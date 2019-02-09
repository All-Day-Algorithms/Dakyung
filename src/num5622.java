import java.util.Scanner;
public class num5622 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num =scan.next();
		int total = 0;
		
		for(int i=0; i<num.length();i++) {
			char charc = num.charAt(i);
			if(charc >='A' && charc <= 'C' ) {
				total = total + 3;
			}else if(charc>='D' && charc <= 'F') {
				total = total+4;
			}else if(charc>='G' && charc <= 'I') {
				total = total+5;
			}else if(charc>='J' && charc <= 'L') {
				total = total+6;
			}else if(charc>='M' && charc <= 'O') {
				total = total+7;
			}else if(charc>='P' && charc <= 'S') {
				total = total+8;
			}else if(charc>='T' && charc <= 'V') {
				total = total+9;
			}else if(charc>='W' && charc <= 'Z') {
				total = total+10;
			}else if(charc == 1) {
				total = total+2;
			}else if(charc == 0)
	            total += 11;
		}
		
		System.out.println(total);
		
	}

}
