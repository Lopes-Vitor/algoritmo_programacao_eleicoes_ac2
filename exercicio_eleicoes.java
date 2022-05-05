package exercicios;
import java.util.Scanner;

public class exercicio_eleicoes {

	public static void main(String[] args) {
		//Declarando o Scanner
		Scanner leitor = new Scanner(System.in);
		
		//Declarando as variaveis
		int voto, PT = 0, PDT = 0, PL = 0, PSDB = 0, votonulo = 0, votoembranco = 0;
		
		//Utilizando o for para rodar o programa ate atingir 50 votos
		for(int i = 0; i <= 49; i++) {
		//Imprimindo as opcoes de votos	para os eleitores
		System.out.println(" digite um numero para o respectivo voto: \r\n- 1 - (13) PT;\r\n- 2 - (12) PDT;\r\n- 3 - (22) PL;\r\n- 4 - (45) PSDB;\r\n- 5 - voto nulo;\r\n- 6 - voto em branco");
		//Leitura do valor entrado
		voto = leitor.nextInt();
		
		//utilizando a estrutura condicional IF para ver qual opcao o eleitor escolheu e contabilizando o voto de cada um deles
		if(voto == 1) {
			PT = PT + 1; 
		}
		else if(voto == 2) {
			PDT = PDT + 1;
		}
		else if(voto == 3) {
			PL = PL + 1;
		}
		else if(voto == 4) {
			PSDB = PSDB + 1;
		}
		else if(voto == 5) {
			votonulo = votonulo + 1;
		}
		else if(voto == 6) {
			votoembranco = votoembranco + 1;
		}
		else {
			votonulo = votonulo + 1;
		}
		}
		//Imprimindo o total de votos para cada candidato
		System.out.println("Total de votos para cada candidato: ");
		System.out.println(PT + " - PT");
		System.out.println(PDT + " - PDT");
		System.out.println(PL + " - PL");
		System.out.println(PSDB + " - PSDB");
		//Imprimindo o total de votos nulos e brancos
		System.out.println("Total de votos nulos e brancos: ");
		System.out.println(votonulo + " - Voto Nulo");
		System.out.println(votoembranco + " - Voto em branco");

		}

}
