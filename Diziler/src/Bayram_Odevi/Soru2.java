package Bayram_Odevi;

public class Soru2 {
			 
	public static void main(String[] args) {
			//Soru2: Adı "k l m n" hafleriyele biten büyük küçük önemli değil
		String [][] veri={ 
				{"1","Emirhan","Toruk",     "65413245215"},
				{"2","Bayram","Sütçü","68512452215"},
				{"3","Adahan","Karadeniz",  "63913245215"},
				{"4","Rümeysa","Güven",     "38413245215"},
				{"5","Yusuf","Erdoğan",     "35413245215"},
				{"6","Hüseyin","Yüce",      "94432452155"},
				{"7","Serhat Semi","Akyüz", "90013245215"},
				{"8","Miraç","Alaca",       "15213245215"},
				{"9","Davut","Güney",       "18882545215"},
				{"10","Murat","Sezen",      "40413245215"},
				{"11","Semik","KALK",   "47413245215"}
			};
		for(int i=0;i<veri.length;i++) {
			if(veri[i][1].endsWith("k") || veri[i][1].endsWith("K")){
				System.out.println("Adı= "+veri[i][1]
									+" Soyadı= "+veri[i][2]); 	
			}
			if(veri[i][1].endsWith("l") || veri[i][1].endsWith("L")){
				System.out.println("Adı= "+veri[i][1]
									+" Soyadı= "+veri[i][2]); 	
			}
			if(veri[i][1].endsWith("m") || veri[i][1].endsWith("M")){
				System.out.println("Adı= "+veri[i][1]
									+" Soyadı= "+veri[i][2]); 	
			}
			if(veri[i][1].endsWith("n") || veri[i][1].endsWith("N")){
				System.out.println("Adı= "+veri[i][1]
									+" Soyadı= "+veri[i][2]); 	
			}
		}
	}

}
