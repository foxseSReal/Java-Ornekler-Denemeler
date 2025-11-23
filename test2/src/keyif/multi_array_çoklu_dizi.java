package keyif;

public class multi_array_çoklu_dizi {

	public static void main(String[] args) {
					// 	-->	1.Array , 2.Array
		String [][] isimler={ {"Ahmet","Mehmet","Ayşe"},{"Yusuf","Burak","Ali","Yiğit"}};
		System.out.println(isimler[1][1].length());
		
		for(int i=0;i<isimler.length;i++)
		{
			for(int j=0; j<isimler[i].length;j++)
			{
				System.out.println(isimler[i][j]);
			}
		}
		
		
		

	}

}
