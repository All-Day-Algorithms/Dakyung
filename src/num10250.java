import java.util.*;
public class num10250 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num =0; 
		int nheight=0, nwidth=0;
		int nperson =0;
		
		num=scan.nextInt(); //�׽�Ʈ ����
		int result[] = new int[num]; //��� ���� ����Ʈ
		
		for(int i=0; i<num; i++) {
			int h=1;
			int c =0;
			nheight = scan.nextInt(); //����
			nwidth = scan.nextInt(); //ȣ��
			nperson = scan.nextInt(); //���° ���
			
			for(int j=0; j < nperson; j++) {
				if(c >= nheight) {
					h++; 
					c =0;
				} //����� �������� �� �ö󰡸� ȣ���� �ϳ� �ø��� , ���� ȣ���� 1������ �ٽ� ����
				c++; //����� ������ �Ǳ� ������ ������ �ø��� ��
			}
			result[i] = (c*100) + h; //c���� hȣ
		}
		for(int k=0;k<num;k++) {
			System.out.println(result[k]);
		}
	}
}

