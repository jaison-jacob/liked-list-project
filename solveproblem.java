package interview;

import java.util.Scanner;

public class solveproblem {

	public static void main(String[] arg) {

		addingprocess add = new addingprocess();
		
		//adding the object
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("1.add String  \n 2.see String list  \n 3. view binary result \n 4. exit");
			System.out.println("please choose ");
			int no = scan.nextInt();
			if(no == 1){
				System.out.println("ENTER THE STRING VALUE");
				String string = scan.next()+"";
				if(string.equals("1" )|| string.equals("0" ) || string.equals("*")){
				storage object = new storage(string);
				add.add(object);
				}else{
					System.out.println("ENTER STRING  LIKE 1,0,* ");
				}
			}else if(no ==2){
				add.viweaddestring();
			}else if(no == 3) {
				add.result();
			}else if(no == 4){
				break;
			}
		
		
		
		}
		
		
		
	}
}
