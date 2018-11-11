package v9.v6.Operators;

public class KonuAnlatim {

	/*
	 * 36,37,38 geçtim 43 , 44, 45 bir þey yok
	 *  instanceof operatoru sadece referans tipte degiskenler icin kullanilabilir. instanceof operatoru IS-A kontrolu yapmaktadir.
	 *  
	 * a instanceof Object 
	 * 
	 * */
	
	public static void main(String[] args) {
		byte b1=6&8; 

		//0110 --->6
		//1000 --->8
		//----- & ve islemi
		//0000		
		System.out.println(b1);
		
		byte b2=5|9;
		//0101 --->5
		//1001 --->9
		//----- | veya islemi
		//1101
		System.out.println(b2);
		
		byte b3=7^5;

		//0111 --->7
		//0101 --->5
		//----- ^ xor islemi
		//0010

		System.out.println(b3);
		
		
	}
}
