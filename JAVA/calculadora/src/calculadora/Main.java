package calculadora;
import javax.swing.JOptionPane;
public class Main {
	
public static void main(String[] args) {
	int num1;
	int num2;
	int opcao=0;
	int result=0;
	num1=Integer.parseInt(JOptionPane.showInputDialog("escolha o numero 1"));
	num2=Integer.parseInt(JOptionPane.showInputDialog("escolha o numero 2"));
	opcao=Integer.parseInt(JOptionPane.showInputDialog("escolha a operação"
			+"\n 1 para soma"
			+"\n 2 para subtração"
			+"\n 3 para divisão"
			+"\n 4 para multiplicação"));
	if(opcao==1) {
		result=num1+num2;

	}
	else if(opcao==2) {
		result=num1-num2;
		
	}
	else if(opcao==3) {
		result=num1/num2;
	}
	else if(opcao==4) {
		result=num1*num2;
	}else {
		JOptionPane.showMessageDialog(null, "Opção invalida");

	}
  
	JOptionPane.showMessageDialog(null, "O resultado é " + result);


}
}