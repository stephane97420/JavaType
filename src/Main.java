
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
		// Type booléen
		boolean bBool;
		
		// Type chaine
		String sChaine;
		
		// Type litteral
		Float fLitterale;
		Double dLitterale;
		
		// Type de différente base
		int oValue;
		int hValue;
		
		// Les valeurs par défaut
		
		byte bDefaut = 0;
		short sDefaut = 0;
		int iDefaut = 0;
		long lDefaut = 0;
		float fDefaut = 0;
		double dDefaut = 0;
		char cDefaut = 0;
		boolean boDefaut = false;
		String stDefaut = null;
				
		bEntier = 10;
		sEntier = 15;
		iEntier =-15;
		lEntier = 0;
		
		fDecimal = 10.56f;
		dDecimal = 345.6892;
		
		bBool = false;
		
		sChaine = "Hello world!";
		
		fLitterale = 3.14f;
		dLitterale = 156.1235;
		
		oValue = 0363;
		hValue = 0xF3;
		
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
		
		System.out.println();
		System.out.println();
		System.out.println("Le type booléen : " + bBool + " et l'inverse " + !bBool);
		System.out.println("\n\nLe type String : " + sChaine + "\n");
		System.out.println("Les valeurs littérales :");
		System.out.println("Le type " + fLitterale.getClass().getTypeName() + " : " + fLitterale);
		System.out.println("Le type " + dLitterale.getClass().getTypeName() + " : " + dLitterale);
		System.out.println();
		System.out.println("Valeur en octal " + Integer.toOctalString(oValue) + " et en entier " + oValue);
		System.out.println("Valeur en hexadecimal " + Integer.toHexString(hValue) + " et en entier " + hValue);
		System.out.println();
		System.out.println("La valeur par défaut des types :");
		System.out.println("Type byte " + bDefaut) ;
		System.out.println("Type short " + sDefaut);
		System.out.println("Type integer " + iDefaut);
		System.out.println("Type long " + lDefaut);
		System.out.println("Type float " + fDefaut);
		System.out.println("Type double " + dDefaut);
		System.out.println("Type char " + (int) cDefaut);
		System.out.println("Type boolean " + boDefaut);
		System.out.println("Type string " + stDefaut);
		
	}

}
