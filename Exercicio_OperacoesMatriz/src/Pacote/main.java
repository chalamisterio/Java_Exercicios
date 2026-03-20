package Pacote;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		int tamanhoMatriz = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite otamanho da Matriz Quadrada"));
		int[][] matriz = new int[tamanhoMatriz][tamanhoMatriz];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um Número Para a Matriz"));
			}
		}

		int count = 0;
		int soma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[0][0] == 0) {
					soma = 0;
					count++;
				} else if ((j == i)) {
					soma += matriz[i][count - j];
					count++;
				}

			}

		}
		int somaS = 0;
		int count2 = 0;

		for (int i = matriz.length - 1; i >= 0; i--) {
			for (int j = matriz[i].length - 1; j >= 0; j--) {
				if (matriz[i].length - 1 == tamanhoMatriz) {
					somaS = 0;
					count2++;
				} else if (i == j) {
					somaS += matriz[i][j + count2];
					count2++;
				}

			}
		}
		int multiplicacao = 1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j == i) {
					multiplicacao *= matriz[i][j];

				}

			}
		}

		String msg = "<html><center><table border='0' style='text-align: center;'>";

		for (int i = 0; i < matriz.length; i++) {
		    msg += "<tr>";
		    for (int j = 0; j < matriz[i].length; j++) {
		        msg += "<td style='padding: 5px; text-align: center;'>" + matriz[i][j] + "</td>";
		    }
		    msg += "</tr>";
		}

		
		msg += "</table></center>"; 
		msg += "<br><b>Soma abaixo da Diagonal Principal:</b> " + soma;
		msg += "<br><b>Soma acima da Diagonal Principal:</b> " + somaS;
		msg += "<br><b>Produto da Diagonal Principal:</b> " + multiplicacao;
		msg += "</html>";
		JOptionPane.showMessageDialog(null, msg);
	}

}
