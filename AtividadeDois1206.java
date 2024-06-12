package exerciciosmatri;

public class AtividadeDois1206 {

	public static void main(String[] args) {

		int diagonal[][] = new int [4][4];
		for(int i=0; i<4;i++) {
			diagonal[i][i]=(int) Math.round(Math.random()*100);
		}
		for(int i=0; i<4;i++) {
			for(int j=0; j<4; j++) {
				System.out.print("["+diagonal[i][j]+"]");
			}
		}
		System.out.print("\n---------");
	}
}

