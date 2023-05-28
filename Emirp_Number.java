
public class Emirp_Number {
	
	public void add() {
		
		System.out.println("hello");
		
	}
	public void  sub() {
		System.out.println("sub");
	}
}
	class demo extends Emirp_Number{
		public void  sub() {
			System.out.println("sub");
		}
		public void add() {
			
			System.out.println("hello");
			
		}
	}
	class c extends Emirp_Number{
		public void  add() {
			System.out.println("mul");
		}
		public void  sub() {
			System.out.println("sub");
		}
		
	}
	class sky{
		public void sky1(Emirp_Number ref ) {
			ref.add();
			ref.sub();
			
		}
	}




