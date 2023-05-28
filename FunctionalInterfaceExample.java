

@FunctionalInterface
interface A {
	void add();
}
@FunctionalInterface
interface App{
	void display();
} 

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		
		A a=()-> {
			System.out.println("hello");
	};
			a.add();
			App aa=()-> {

				System.out.println("display");
				
			};
			aa.display();
			
		}
			
		}
	

/*
 * App aa=() ->{
		System.out.println("display");
	};
		a.add();
		aa.display();*/	
 

