package LEVEL_7_1;

public class Soru10 {

	public static void main(String[] args) {
        int faktöryel = 1;

        for (int i = 1; i < 5; i++) { // (n - 1)! hesaplanıyor
            faktöryel *= i;
        }

        System.out.println("Yuvarlak masa etrafinda " + "5" + " kisinin oturma sekli: " 
                           + faktöryel + " farkli sekilde olabilir.");
	}
}
