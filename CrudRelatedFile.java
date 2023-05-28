import java.util.Scanner;

public class CrudRelatedFile {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
JdbcCrudOperation p=new JdbcCrudOperation();
System.out.println("select a choice  enter 1-->insert enter 2 ==>display enter 3 ==>delete ");
int choice=scan.nextInt();

switch(choice) {
case 1:System.out.println("ur select insert");
      p.insert();
      break;
 case 2:System.out.println("ur select display");
        p.display();
        break; 
 case 3:System.out.println("ur select delete");
 p.delete();
 break; 
 default:System.out.println("select proper one");
}
	}

}
