package LEVEL_2_1;

public class Soru_15 {

	public static void main(String[] args) {
		

		for (int b = 0; b < 32; b++) { 
            	for(int a=1;a<100;a++){
            		int c =a+b;
            		if(Math.sqrt(c)<850) {
            			System.out.println("a: " + a + ", b: " + b + ", c: " + c);
            		}
            	}
		}
	}
}
