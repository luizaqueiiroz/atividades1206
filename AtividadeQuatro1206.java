package exerciciosmatri;

import java.util.Scanner;

public class AtividadeQuatro1206 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int mA[][] = new int [3] [3];
		int mB[][] = new int [3] [3];
		int mC[][] = new int [3] [3];

		for (int l=0; l<3; l++) {
			for (int c=0; c<3; c++) {
				mA[l][c]=(int) Math.round(Math.random()*100);
				mB[l][c]=(int) Math.round(Math.random()*100);
				mC[l][c]= mA [l][c]*mB[l][c];
			}
		}
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.println("matriz A");
				System.out.println("["+mA[i][j]+"]");
			}
			System.out.println("\n---------------------");
		}
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.println("matriz B");
				System.out.println("["+mB[i][j]+"]");
			}
			System.out.println("\n---------------------");
		}
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.println("matriz C");
				System.out.println("["+mC[i][j]+"]");
			}
			System.out.println("\n---------------------");
		}
	}

}


