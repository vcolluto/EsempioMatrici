import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		int nr,nc;
		Random rnd=new Random();
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Inserisci il numero di righe: ");
		nr=sc.nextInt();
		sc.nextLine();
		System.out.print("Inserisci il numero di colonne: ");
		nc=sc.nextInt();
		sc.nextLine();
		
		int[][] matrice=new int[nr][nc];		//dichiarazione di un array bidimensionale con nr righe e nc colonne
		
		//genero i valori
		for(int r=0;r<nr;r++)	//scorro le righe
			for(int c=0;c<nc;c++)	//scorro le colonne
				matrice[r][c]=rnd.nextInt(10);
		
		
		//elaborazioni
		
		
		
		//stampo la matrice
		for(int r=0;r<nr;r++)	//scorro le righe
		{
			for(int c=0;c<nc;c++)	//scorro le colonne
				System.out.print(matrice[r][c] +" ");
			System.out.println();
		}
	}

}
