
public class liczbypierwsze {
//program znajduje liczby pierwsze od 1 do 100
	public static void main(String[] args) {
	int i, j;
	boolean pierwsza;
	 for( i = 2; i < 100; i++) {
		 pierwsza = true;
		 for(j = 2; j <= i/2; j++)
			 if((i%j) == 0) pierwsza = false;
		 if(pierwsza)
	 System.out.println(i + "jest pierwsza");
	 }
	}

}
