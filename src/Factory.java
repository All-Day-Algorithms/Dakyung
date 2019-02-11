import java.util.ArrayList;

public class Factory {
	
	private static addInterface addInterfaceS = new AddCalculator(); //정적캐시
	private static addInterface addInterfaceD = null;
	
	private static ArrayList<Integer> cached_factorial = new ArrayList<Integer>();
	
	public static addInterface getAddInterface() {
		
		if( addInterfaceD == null) {
			addInterfaceD = new AddCalculator(); //동적캐시
		}
		
		return addInterfaceD; 
	}
	
/*
 정적캐시는 항상 모든 정적캐시 내용을 항상 다 저장해두고 실행해야해서 
 그것보다는 동적캐시가 좋음
 동적캐시는 필요시에만 실행되도록 적음!
 */
	

	
	public static int getFactorial(int x) {

		
		if(cached_factorial.get(x-1) != null) {
			return cached_factorial.get(x-1);
		}
		
		if(x == 1) {
			return 1;
		}
		
		int cached_value = x + getFactorial(x-1);
		
		cached_factorial.add(cached_value);
		
		return cached_value;
	}
	
	// B
	public static void main(String[] args) {
		
		
		addInterface addAble0 = Factory.getAddInterface();
		addInterface addAble1 = Factory.getAddInterface();
		addInterface addAble2 = Factory.getAddInterface();
		addInterface addAble3 = Factory.getAddInterface();
		addInterface addAble4 = Factory.getAddInterface();
		addInterface addAble5 = Factory.getAddInterface();
		addInterface addAble6 = Factory.getAddInterface();
		addInterface addAble7 = Factory.getAddInterface();
		addInterface addAble8 = Factory.getAddInterface();
		addInterface addAble9 = Factory.getAddInterface();
		addInterface addAble10 = Factory.getAddInterface();
		addInterface addAble11 = Factory.getAddInterface();
		
		System.out.println(addAble0==addAble1);
	}
//		show(new addInterface() {
//
//			@Override
//			public int add(int a, int b) {
//				return a+b+1;
//			}
//		});	
//		show(new addInterface() {
//
//			@Override
//			public int add(int a, int b) {
//				return a+b+2;
//			}
//		});
//		
//		show((a,b)->a+b+1);
//		show(Factory::getShow); 이런식으로 위에 내용을 짧게 쓰는게 람다식!
//	}
//	
//	public int getShow(int a,int b) {
//		return a+b;
//	}
//	
	
	
	public static int show(addInterface add) {
		return add.add(1, 2);
	}
}

class addMock implements addInterface{

	@Override
	public int add(int a, int b){
		
		return a + b;
	}
	
}

// A
interface addInterface {
	
	public int add(int a, int b);
}

// A

class AddCalculator implements addInterface{

	@Override
	public int add(int a, int b) {
		return a+b+5;
	}
}


/*
 -A와B가 협업을 할때,
 아직 A가 완성 전이지만 어떤 내용을 만들지를 interface addInterface에 작성.
 B는 그걸 보고 그걸 토대로 자신의 것을 만듦.
- 근데 만들다보면 잘하고 있는지 테스트도 해보고해야되는데, A꺼 내용이 없으니까 그냥 AddCalculator=null 이런식으로 해놓고 진행하다가
class addMock implements addInterface를 만들어서 진행!
-mock을 여기저기 쓰고 나중에 A가 완성했을때 그걸 다 진짜 A꺼로 고치려면 너무 힘드니까
getAddInterface() 만들어서 안에 mock실행을 넣었다가, 완성되면 mock 지우고 진짜 실행 내용 적으면 됨!
-
 
 
 
 */




 