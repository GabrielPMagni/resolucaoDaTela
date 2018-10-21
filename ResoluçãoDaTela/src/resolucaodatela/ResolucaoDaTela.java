package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {
	public static void main(String[] args){
		Toolkit reso = Toolkit.getDefaultToolkit();
		Dimension dime = reso.getScreenSize();
		System.out.print("A resolução da sua tela é: " + dime.width + "x" + dime.height);
	}
}