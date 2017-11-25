
public class Help {
			
	void helpon(int what) {	
	switch(what) {
				case '1':
					System.out.println("the IF: \n");
					System.out.println("if(condition) statement;");
					System.out.println("else statement;");
					break;
				case '2':
					System.out.println("the SWITCH: \n");
					System.out.println("switch(expression) { ");
					System.out.println("case constant:");
					System.out.println(" statement sequence");
					System.out.println("break;");
					System.out.println("//...");
					System.out.println(" } ");
					break;
				case '3':
					System.out.println("the FOR: \n");
					System.out.println("for(initialization; condition; iteration)");
					System.out.println(" statement;");
					break;
				case '4':
					System.out.println("the While: \n");
					System.out.println("while(condition) statement;");
					break;
				case '5':
					System.out.println("the Do-While: \n");
					System.out.println(" do {");
					System.out.println(" statement;");
					System.out.println(" } while (condition);");
					break;
				case '6':
					System.out.println("the break: \n");
					System.out.println("break; or break label;");
					break;
				case '7':
					System.out.println("the continue: \n");
					System.out.println("continue; or continue label;");
					break;
	}
	}
	void showmenu() {
		System.out.println("need help on:");
		System.out.println("1. IF");
		System.out.println("2. SWITCH");
		System.out.println("3. FOR");
		System.out.println("4. While");
		System.out.println("5. Do-While");
		System.out.println("6. Break");
		System.out.println("7. continue\n");
		System.out.print("Choose an option or press 'q' to quit: ");
	}
			
		boolean isvalid(int ch) {
			if(ch <'1' | ch > '7' & ch != 'q') return false;
			else return true;
	}
	

//class HelpClassDemo {
	public static void main(String [] args)
throws java.io.IOException {
	char choice;
	Help hlpobj = new Help();
	
	for(;;) {
		do {
			hlpobj.showmenu();
			do {
				choice = (char) System.in.read();
			}while (choice == '\n' | choice == '\r');
		}while( !hlpobj.isvalid(choice));
		if(choice =='q') break;
		System.out.println("\n");
		hlpobj.helpon(choice);
	}}}
			