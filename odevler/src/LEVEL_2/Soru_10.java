package LEVEL_2;

public class Soru_10 {
	public static final String CYAN="\u001B[36m";
	public static final String RESET = "\u001B[0m";
	 public static final String KIRMIZI = "\u001B[31m";
	public static void main(String[] args) { 
			for (int x=1;x<101;x++) {
				
				for(int y=1;y<101;y++) {
					
				//	int islem=(x*x)+(y*y);
					if((x*x)+(y*y)==35||(x*x)+(y*y)==61) {
						System.out.println(CYAN+"	x= "+x+"	y= "
					+y+" Sonuç= "+RESET+KIRMIZI+" "+((x*x)+(y*y))+RESET);
					}
				}
			}
	}

}
			