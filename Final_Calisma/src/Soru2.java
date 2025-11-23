import java.util.Scanner;
public class Soru2 {
	public static void main(String[] args) {
		Scanner a =new Scanner(System.in);
		int	b=a.nextInt();
		if(b>1000&&b<10000){
			int son=b%100;
			int ilk=b/100;
			if( (int) Math.pow(ilk+son,2)==b) {
				System.out.println("Orjinal");			
			}
			else System.out.println("Orjinal Değil");
			a.close();
		}
		else System.out.println("Lütfen 4 Basamaklı BİR sayı YAZIN");
		a.close();
	}
}