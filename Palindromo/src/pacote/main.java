package pacote;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		String palavra = JOptionPane.showInputDialog(null, "Digite A Palvra a Ser Verificada");
		palavra = palavra.toLowerCase();
		char[] letras = palavra.toCharArray();
		String invertida = new StringBuilder(palavra).reverse().toString();
		char[] letras2 = invertida.toCharArray();

		boolean ehPali = true;
		for (int i = 0; i < letras.length; i++) {
			if (letras[i] != letras2[i]) {
				JOptionPane.showMessageDialog(null, "A Palavra Digitada NÃO é Um Palindromo \n  Palavra Digitada => "
						+ palavra + "\n" + "Palavra Invertida = > " + invertida);
				ehPali = false;
				break;

			}
		}

		if (ehPali) {

			JOptionPane.showMessageDialog(null, "A Palavra Digitada é Um Palindromo \n  Palavra Digitada => " + palavra
					+ "\n" + "Palavra Invertida = > " + invertida);

		}

	}
}
