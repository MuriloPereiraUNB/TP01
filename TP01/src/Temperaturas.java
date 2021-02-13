import java.text.DecimalFormat;

public class Temperaturas {

	public static void main(String[] args) {
		int ano=0, mes=0, dias=31, i = 0, diaMin = 0, diaMax = 0, opcao = 0, repeticao =0;		
		double [][][]temp = new double[10][12][dias], media;
		double aux=0, tempMin = 0, tempMax = 0;
		DecimalFormat mascara = new DecimalFormat("0.0");
		
		temp[9][0][0] = 4;
		temp[9][0][1] = 31;
		temp[9][0][2] = 6;
		temp[9][0][3] = 29;
		temp[9][0][4] = 8;
		temp[9][0][5] = 27;
		temp[9][0][6] = 10;
		temp[9][0][7] = 25;
		temp[9][0][8] = 12;
		temp[9][0][9] = 23;
		temp[9][0][10] = 14;
		temp[9][0][11] = 21;
		temp[9][0][12] = 16;
		temp[9][0][13] = 19;
		temp[9][0][14] = 18;
		temp[9][0][15] = 17;
		temp[9][0][16] = 20;
		temp[9][0][17] = 15;
		temp[9][0][18] = 22;
		temp[9][0][19] = 13;
		temp[9][0][20] = 24;
		temp[9][0][21] = 11;
		temp[9][0][22] = 26;
		temp[9][0][23] = 9;
		temp[9][0][24] = 28;
		temp[9][0][25] = 7;
		temp[9][0][26] = 30;
		temp[9][0][27] = 5;
		temp[9][0][28] = 32;
		temp[9][0][29] = 3;
		temp[9][0][30] = 34;
		
		
		do {
		
			opcao = Validacao.validaOpcao(opcao);
		
			switch (opcao) {
			case 1:
				ano = Validacao.validaAno(ano);
				mes = Validacao.validaMes(mes);
				Servicos.cadastraTemp(mes, ano, i, dias, temp);
				Servicos.pulaLinha(4);
			
				break;
			
			case 2:
				ano = Validacao.validaAno(ano);
				mes = Validacao.validaMes(mes);
				Servicos.mostraTempMedia( mes, ano, i, dias, aux, temp, mascara);
				Servicos.pulaLinha(4);
			
				break;
			case 3:
				ano = Validacao.validaAno(ano);
				mes = Validacao.validaMes(mes);
				Servicos.mostraTempMin(mes, ano, i,  dias, diaMin, tempMin, temp, mascara);
				Servicos.pulaLinha(4);
			
				break;
			case 4:
				ano = Validacao.validaAno(ano);
				mes = Validacao.validaMes(mes);
				Servicos.mostraTempMax(mes, ano, i,  dias, diaMax, tempMax, temp, mascara);
				Servicos.pulaLinha(4);
			
				break;
			case 5:
				ano = Validacao.validaAno(ano);
				mes = Validacao.validaMes(mes);
				Servicos.pulaLinha(1);
				Servicos.mostraTempDia(mes, ano, i, dias, temp, mascara);
				Servicos.pulaLinha(1);
				Servicos.mostraTempMedia(mes, ano, i, dias, aux, temp, mascara);
				Servicos.pulaLinha(1);
				Servicos.mostraTempMin(mes, ano, i,  dias, diaMin, tempMin, temp, mascara);
				Servicos.pulaLinha(1);
				Servicos.mostraTempMax(mes, ano, i,  dias, diaMax, tempMax, temp, mascara);
				Servicos.pulaLinha(4);
			
				break;
		
			default:
				break;
			}
		}while(Validacao.validaRepeticao(repeticao) == 1);
		
		Servicos.pulaLinha(5);
		System.out.println("FIM DO PROGRAMA!");
		
	}	

}
