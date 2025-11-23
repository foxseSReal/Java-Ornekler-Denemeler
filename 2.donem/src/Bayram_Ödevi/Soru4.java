package Bayram_Ödevi;	

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		Scanner a =new Scanner(System.in);
		System.out.print("6 Basamaklı bir tam sayı giriniz: ");
        int N=a.nextInt();
        if(N>99999 && N<1000000){
            int[] basamaklar = new int[6];
            int i = 5;
            do {
                basamaklar[i] = N % 10;
                N /= 10;
                i--;
            } while (i >= 0);
            System.out.println("Sayının yazıya çevrilmiş hali: ");
            String[] birler = {"", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
            String[] onlar = {"", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};
            String[] yuzler = {"", "yüz", "iki yüz", "üç yüz", "dört yüz", "beş yüz", "altı yüz", "yedi yüz", "sekiz yüz", "dokuz yüz"};
            String binlerBasamagi = yuzler[basamaklar[0]] + " " + onlar[basamaklar[1]] + " " + birler[basamaklar[2]] + " bin";
            String yuzlerBasamagi = yuzler[basamaklar[3]] + " " + onlar[basamaklar[4]] + " " + birler[basamaklar[5]];
            System.out.println("Sayının yazıya çevrilmiş hali: ");
            System.out.println(binlerBasamagi + " " + yuzlerBasamagi);
        } 
        else System.out.println("Girdiğiniz sayı 6 basamaklı değil.");
            
        
        a.close();
	}
}