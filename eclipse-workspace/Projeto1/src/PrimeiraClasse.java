import java.util.Scanner;
public class PrimeiraClasse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Notas Primeiro Bimestre Escolar: ");
		System.out.print("Nota Prova: ");
		float prova = sc.nextFloat();
		System.out.print("Nota Projeto: ");
		float projeto = sc.nextFloat();
		System.out.print("Nota Exercício: ");
		float exercicio = sc.nextFloat();
		System.out.print("Nota Contribuição: ");
		float contribuição = sc.nextFloat();
		float bimestre = (((prova*3)+(projeto*3)+(exercicio*2)+(contribuição*3))/11);
		System.out.println("Sua média do primeiro bimestre é: "+bimestre+"\n");
		
		System.out.println("Notas Segundo Bimestre Escolar: ");
		System.out.print("Nota Prova: ");
		float prova2 = sc.nextFloat();
		System.out.print("Nota Projeto: ");
		float projeto2 = sc.nextFloat();
		System.out.print("Nota Exercício: ");
		float exercicio2 = sc.nextFloat();
		System.out.print("Nota Contribuição: ");
		float contribuição2 = sc.nextFloat();
		float bimestre2 = (((prova2*3)+(projeto2*3)+(exercicio2*2)+(contribuição2*3))/11);
		System.out.println("Sua média do segundo bimestre é: "+bimestre2+"\n");
		
		float semestre = ((bimestre+bimestre2)/2);
		System.out.println("Sua média semestral é: "+semestre);
		float faltou = (10-semestre);
		sc.close();
		
		if (semestre >=8) {
			System.out.println("Você foi aprovado!");
			
		}else {
			System.out.println("Você não foi aprovado e precisa de mais "+faltou+"pontos na recuperação");
	}
	}
}
