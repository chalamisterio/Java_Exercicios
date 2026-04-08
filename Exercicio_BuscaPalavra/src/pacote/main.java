package pacote;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog(null, "Digite o Texto a ser Examinado");
		String palavra = JOptionPane.showInputDialog(null, "Digite a palavra a ser averiguada no texto");

		int t = texto.length();
		int p = palavra.length();
		boolean encontrado = false;

		for (int i = 0; i <= t - p; i++) {
			int j;
			for (j = 0; j < p; j++) {
				if (texto.charAt(i + j) != palavra.charAt(j)) {
					break;
				}
			}

			if (j == p) {

				String resultado = texto.substring(i, i + p);
				JOptionPane.showMessageDialog(null, "A palavra encontrada no texto é => " + resultado);
				encontrado = true;

			}

		}
		if (!encontrado) {
			JOptionPane.showMessageDialog(null, "A palavra não encotrada");

		}
	}
}