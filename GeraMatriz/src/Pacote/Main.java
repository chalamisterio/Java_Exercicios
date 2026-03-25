package Pacote;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int N = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o númerode Linhas Para a Matriz"));
		int M = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o númerode Colunas Para a Matriz"));

		int matriz[][] = new int[N][M];
		int matriz2[][] = new int[N][M];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Integer.parseInt(
						JOptionPane.showInputDialog(null, "Digite um Número Inteiro para posição " + i + " " + j));

			}
		}

		int vetor[] = new int[N];

		int soma = 0;
		for (int i = 0; i < matriz.length; i++) {

			soma = 0;
			for (int j = 0; j < matriz[i].length; j++) {

				soma = matriz[i][j];

			}
			vetor[i] += soma;
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz2[i][j] = matriz[i][j] * vetor[i];

			}
		}

		String msg = "<html><center><table border='0' style='text-align: center;'>";

		for (int i = 0; i < matriz2.length; i++) {
			msg += "<tr>";
			for (int j = 0; j < matriz2[i].length; j++) {
				msg += "<td style='padding: 5px; text-align: center;'>" + matriz2[i][j] + "</td>";
			}
			msg += "</tr>";
		}
		msg += "</table></center>";
		msg += "<br><b>Resultado Multiplicação Das Somas dos Elemetos de Cada Linha da Matriz </b> ";

		String msg1 = "<html><center><table border='0' style='text-align: center;'>";

		for (int z = 0; z < matriz2.length; z++) {
			msg1 += "<tr>";
			for (int j = 0; j < matriz2[z].length; j++) {
				msg1 += "<td style='padding: 5px; text-align: center;'>" + matriz[z][j] + "</td>";
			}
			msg1 += "</tr>";
		}

		msg1 += "</table></center>";
		msg1 += "<br><b>Resultado Matriz Original </b> ";
		JOptionPane.showMessageDialog(null, msg + "\n" + msg1);
	}
}