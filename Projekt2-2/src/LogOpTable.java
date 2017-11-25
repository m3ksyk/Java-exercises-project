
public class LogOpTable {

	public static void main(String[] args) {
		boolean p, q;
		
		System.out.println("p\tq\tAND\tOR\tXOR\tNOT");
		
		
		p = true; q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		
		p = true; q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
	
		p = false; q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = false; q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
	
	
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        print10Row(true, true);
        print10Row(true, false);
        print10Row(false, true);
        print10Row(false, false);
    }

    /* Jest to praktycznie kopia funkcji printRow z drobn¹ ró¿nic¹, zanim 
     * zostanie wyœwietlony wynik operacji logicznej, zostaje on przekazany 
     * do funkcji convertToInt. Poza tym, funkcja nie ró¿ni siê od 4 bloków
     * wypisuj¹cych tabelê z pierwotnego programu
     */
    static void print10Row(boolean p, boolean q) {
        System.out.print(convertToInt(p) + "\t" + convertToInt(q) + "\t");
        System.out.print(convertToInt(p & q) + "\t" + convertToInt(p | q)
                + "\t");
        System.out.println(convertToInt(p ^ q) + "\t" + convertToInt(!p));
    }

    /* Jest to w³aœciwa funkcja konwertuj¹ca true na 1 a false na 0. 
     * Nie robi nic poza tym.
     */
    static int convertToInt(boolean b) {
        if (b)
            return 1;
        else
            return 0;
    }

    /* Pierwotne bloki zosta³y tutaj
     * wrzucone w funkcje dla skrócenia kodu
     * unikniêcia prawdopodobnego b³êdu
     * i ³atwiejszej póŸniejszej modyfikacji (gdy¿ zmianê ³atwiej zrobiæ w 
     * jednym miejscu zamiast 4, prawda?)
     */
    static void printRow(boolean p, boolean q) {
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));
    }
   
	}
	


