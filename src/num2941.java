import java.util.Scanner;
public class num2941 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence =scan.next();
		String[] list = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		sentence = sentence.trim();
		
		for(int i=0; i<8; i++) { 
			sentence = sentence.replaceAll(list[i], ";"); 
			}
		System.out.println(sentence.length());
	}

}
