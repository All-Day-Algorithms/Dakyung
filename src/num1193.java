import java.util.*;
public class num1193 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt(); //���ؾ� �ϴ� ��
		
		int line=0, cnt = 0,top =0, down =0;

        while(cnt < num) {
            line++; //���° �������� üũ
            cnt = line * (line+1) / 2; //n��°������ ��
        } //���������� ��Ģ ��� ->n��°������ ���� ���ϴ� �� = n*(n+1)/2
        
        if( line % 2 != 0) { //Ȧ����° ���̸� �ö󰡴� ����
            top = 1+(cnt-num);
            down = line - (cnt-num);
            System.out.println(top+"/"+down);
        }else { //¦����° ���̸� �������� ����
            top = line - (cnt - num);
            down = 1 + (cnt - num);
            System.out.println(top+"/"+down);
        }
	}
}
