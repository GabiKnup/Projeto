import java.util.Scanner;
public class PrimeiraClasse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Notas Primeiro Bimestre Escolar: ");
		System.out.print("Nota Prova: ");
		float prova = sc.nextFloat();
		System.out.print("Nota Projeto: ");
		float projeto = sc.nextFloat();
		System.out.print("Nota Exerc�cio: ");
		float exercicio = sc.nextFloat();
		System.out.print("Nota Contribui��o: ");
		float contribui��o = sc.nextFloat();
		float bimestre = (((prova*3)+(projeto*3)+(exercicio*2)+(contribui��o*3))/11);
		System.out.println("Sua m�dia do primeiro bimestre �: "+bimestre+"\n");
		
		System.out.println("Notas Segundo Bimestre Escolar: ");
		System.out.print("Nota Prova: ");
		float prova2 = sc.nextFloat();
		System.out.print("Nota Projeto: ");
		float projeto2 = sc.nextFloat();
		System.out.print("Nota Exerc�cio: ");
		float exercicio2 = sc.nextFloat();
		System.out.print("Nota Contribui��o: ");
		float contribui��o2 = sc.nextFloat();
		float bimestre2 = (((prova2*3)+(projeto2*3)+(exercicio2*2)+(contribui��o2*3))/11);
		System.out.println("Sua m�dia do segundo bimestre �: "+bimestre2+"\n");
		
		float semestre = ((bimestre+bimestre2)/2);
		System.out.println("Sua m�dia semestral �: "+semestre);
		float faltou = (10-semestre);
		sc.close();
		
		if (semestre >=8) {
			System.out.println("Voc� foi aprovado!");
			
		}else {
			System.out.println("Voc� n�o foi aprovado e precisa de mais "+faltou+"pontos na recupera��o");
	}
	}
}
