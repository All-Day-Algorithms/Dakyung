import java.util.*;

public class num11718 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextLine()) {
			String inputs = scan.nextLine();
			
			if(inputs.length()>100 || inputs.isEmpty()||inputs.startsWith(" ")||inputs.endsWith(" ")){
				break;
			}
			System.out.println(inputs);
		}
		scan.close();
	}
	
}
