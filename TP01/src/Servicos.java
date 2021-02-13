import java.text.DecimalFormat;

public class Servicos {
	
	public static void mostraTempMin(int mes, int ano, int i, int dias, int diaMin, double tempMin, double[][][] temp, DecimalFormat mascara) {
		
		for(i=0; i<dias; i++) {
			if(i==0) {
				tempMin = temp[ano-2011][mes-1][i];
			}else {
				if(temp[ano-2011][mes-1][i]<tempMin) {
					tempMin = temp[ano-2011][mes-1][i];
					diaMin = i + 1;
				}	
			}
		}
		System.out.println("A temperatura mais baixa foi " + mascara.format(tempMin) + " graus e ocorreu na data de " + diaMin + "/" + mes + "/" + ano);
	}
	
	public static void mostraTempMax(int mes, int ano, int i, int dias, int diaMax, double tempMax, double[][][] temp, DecimalFormat mascara) {
		
		for(i=0; i < dias; i++) {
			if(i==0) {
				tempMax = temp[ano-2011][mes-1][i];
			}else {
				if(temp[ano-2011][mes-1][i] > tempMax) {
					tempMax = temp[ano-2011][mes-1][i];
					diaMax = i+1;
				}	
			}
		}
		System.out.println("A temperatura mais alta foi " + mascara.format(tempMax) + " graus e ocorreu na data de " + diaMax + "/" + mes + "/" + ano);
	}
	
	public static void mostraTempMedia(int mes, int ano, int i, int dias, double aux, double[][][] temp, DecimalFormat mascara) {
		
		for(i=0; i < dias; i++) {
			aux += temp[ano - 2011][mes-1][i];
		}
		System.out.println("A temperatura media dessa data foi: " + mascara.format((aux/dias)) + " graus");
	}
	
	public static void cadastraTemp(int mes, int ano, int i, int dias, double[][][] temp) {
		
		for(i=0; i < dias; i++) {
			temp[ano - 2011][mes - 1][i] = Leitura.lerTemp();
		}
	}
	
	public static void mostraTempDia(int mes, int ano, int i, int dias, double[][][] temp, DecimalFormat mascara) {
		
		for(i=0; i<dias;i++) {
			System.out.println("No dia " + (i+1) + " a temperatura media foi de " + mascara.format(temp[ano-2011][mes-1][i]) + " graus");
		}
	}
	
	public static void pulaLinha(int linhas) {
		for(int i=0; i<=linhas; i++) {
			System.out.println();
		}
	}

}
