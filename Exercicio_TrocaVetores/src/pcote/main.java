package pcote;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		int n = 0;
		while (true) {
			n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Quatidade de Posiçôes do Vetor"));
			if (n % 2 == 0) {
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Erro Digite número Par");

			}
		}

		int[][] vetorApresenta = preemcheTrocaOrdem(n);
		int[] vetorApresenta1 = calcularSomaeProduto(vetorApresenta);
		apresentarDados(vetorApresenta, vetorApresenta1);

	}

	private static void apresentarDados(int[][] vetorApresenta, int[] vetorApresenta1) {
		int[] vetorOriginal = vetorApresenta[0];
		int[] vetorTroca = vetorApresenta[1];
		int auxi = vetorApresenta1[0];
		int auxi2 = vetorApresenta1[1];

		String vetorA = Arrays.toString(vetorOriginal);
		String resultado1 = vetorA.replace("[", "").replace("]", "").replace(", ", " ");
		String vetorB = Arrays.toString(vetorTroca);
		String resultado2 = vetorB.replace("[", "").replace("]", "").replace(", ", " ");

		JOptionPane.showMessageDialog(null,
				"Os Valores Preenchidos do Vetor Original => " + resultado1 + "\n"
						+ "Valores do começo Trocados os dois Ultimos => " + resultado2 + "\n"
						+ "Soma dos dos Valores Pares do Vetor Original => " + auxi + "\n"
						+ "O Produto Dos Valres Impares do Vetr Original => " + auxi2);
	}

	private static int[] calcularSomaeProduto(int[][] vetorApresenta) {

		int[] vetorResultado = new int[2];
		int soma = 0;
		int multiplicacao =1;

		for (int j = 0; j < vetorApresenta[0].length; j++) {
			int auxi = vetorApresenta[0][j];
			if (auxi % 2 == 0) {
				soma += auxi;
			}

		}
		for (int j = 0; j < vetorApresenta[0].length; j++) {
			int auxi = vetorApresenta[0][j];
			if (auxi % 2 == 1) {
				multiplicacao *= auxi;
			}
		}
		vetorResultado[0] = soma;
		vetorResultado[1] = multiplicacao;
		return vetorResultado;
	}

	public static int[][] preemcheTrocaOrdem(int n) {
		int[] vetor = new int[n];
		int[] vetorTrocado = new int[n];
		int var1 = 0;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um Número para Posição " + i));

		}
		var1 = vetor[0];
		var2 = vetor[1];

		var3 = vetor[vetor.length - 2];
		var4 = vetor[vetor.length - 1];

		vetorTrocado[0] = var3;
		vetorTrocado[1] = var4;
		
		for(int i=2;i < vetorTrocado.length-2;i++) {
			vetorTrocado[i] = vetor[i];
		}
		
		vetorTrocado[vetorTrocado.length-2]=var1;
		vetorTrocado[vetorTrocado.length-1] =var2;

		return new int[][] { vetor, vetorTrocado };
	}

}
