
public class Main {

	public static void main(String[] args) {
		
		// Type entier
		byte bEntier;
		short sEntier;
		int iEntier;
		long lEntier;
		
		// Type décimaux
		
		float fDecimal;
		double dDecimal;
		
		// Type caractère
		char [] cChar = new char[256];
		String [] cNonImpr = {"NUL","SOH","STX","ETX","EOT","ENQ","ACK","BEL","BS","HT","LF","VT","FF","CR","SO","SI","DLE"
		                      ,"DC1","DC2","DC3","DC4","NAK","SYN","ETB","CAN","EM","SUB","ESC","FS","GS","RS","US","SP"};
		// Type chaine
		String sChaine;
		
		bEntier = 10;
		sEntier = 15;
		iEntier =-15;
		lEntier = 0;
		
		fDecimal = 10.56f;
		dDecimal = 345.6892;
		
		sChaine = "Hello world!";
		
		System.out.println("Les types de varibales Java :\n");
		System.out.println("Les types entiers : \n");
		System.out.println("Byte : " + bEntier + " Valeur minimum : " + Byte.MIN_VALUE + " Valeur maximum : " + Byte.MAX_VALUE);
		System.out.println("Short : " + sEntier + " Valeur minimum : " + Short.MIN_VALUE + " Valeur maximum : " + Short.MAX_VALUE);
		System.out.println("Integer : " + iEntier + " Valeur minimum : " + Integer.MIN_VALUE + " Valeur maximum : " + Integer.MAX_VALUE);
		System.out.println("Long : " + lEntier + " Valeur minimum : " + Long.MIN_VALUE + " Valeur maximum : " + Long.MAX_VALUE + "\n");
		System.out.println("Les types décimaux :\n");
		System.out.println("Float : " + fDecimal + " Valeur minimum : " + Float.MIN_VALUE + " Valeur maximum : " + Float.MAX_VALUE);
		System.out.println("Double : " + dDecimal + " Valeur minimum : " + Double.MIN_VALUE + " Valeur maximum : " + Double.MAX_VALUE + "\n");
		System.out.println("Le type Char : \n");
		
		char c;
		int lAffichage = 0;
		int lTabulation = 80;
		for (int i = 0; i < 255; i++) {
			c = (char) i;
			cChar[i] = c;
			
			if (i > 32) {
				System.out.print(cChar[i] + " ");
				lAffichage++;
				lAffichage++;
			}
			else {
				System.out.print(cNonImpr[i] + " ");
				lAffichage = lAffichage + cNonImpr[i].length();
				lAffichage++;
			}
				
			if (lAffichage >= lTabulation) {
				System.out.println("\n");
				lTabulation = lTabulation + 80;
			}
		}
		
		System.out.println("\n\nLe type String : " + sChaine + "\n");
		
	}

}
