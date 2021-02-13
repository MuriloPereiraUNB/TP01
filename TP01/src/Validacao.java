
public class Validacao {
	
	public static int validaOpcao(int opcao) {
		
		System.out.println("Insira o numero de acordo com a opcao que deseja");
		System.out.println("Opcao 1: Entrada das temperaturas");
		System.out.println("Opcao 2: Cálculo da temperatura média");
		System.out.println("Opcao 3: Cálculo da temperatura mínima");
		System.out.println("Opcao 4: Cálculo da temperatura máxima");
		System.out.println("Opcao 5: Relatório meteorológico");
		System.out.println("Opcao 0: Parar o programa");
		
		opcao = Leitura.lerInteiro();
		while(opcao<0 || opcao >5) {
			System.out.print("ENTRADA INVALIDA. Escolha entre as opcoes de 0 a 5: ");
			opcao = Leitura.lerInteiro();
		}
		return opcao;
	}
	
	public static int validaAno(int ano) {
		System.out.print("Informe de qual ano voce ira inserir os dados: ");
		ano = Leitura.lerInteiro();
		while(ano<2011 || ano>2020) {
			System.out.println("ENTRADA INVALIDA. O ano precisa ser entre 2011 e 2020. Insira novamente: ");
			ano = Leitura.lerInteiro();
		}
		return ano;
	}
	
	public static int validaMes(int mes) {
		System.out.print("Informe de qual mes voce ira inserir os dado(informe a numeracao do mes): ");
		mes = Leitura.lerInteiro();
		while(mes<1 || mes>12) {
			System.out.println("ENTRADA INVALIDA. O mes precisa ser entre 1 e 12. Insira novamente: ");
			mes = Leitura.lerInteiro();
		}
		return mes;
	}
	
	public static int validaRepeticao(int repeticao) {
		System.out.print("Se deseja escolher outra opcao digite 1 ou se deseja parar o programa digite 0: ");
		repeticao = Leitura.lerInteiro();
		while(repeticao<0 || repeticao>1) {
			System.out.print("ENTRADA INVALIDA. Digite 1 ou 2: ");
			repeticao = Leitura.lerInteiro();
		}
		return repeticao;
	}

}
