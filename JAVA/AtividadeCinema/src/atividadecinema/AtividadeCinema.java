package atividadecinema;

import javax.swing.JOptionPane;

public class AtividadeCinema {

    public static void main(String[] args) {
        //*declaração de variaveis
        int idade;
        char op;
        int qtd_otimo = 0;
        int media = 0;
        int porcentagem = 0;
        //*colocando a estrutura de repetição
        for (int cont = 1; cont <= 10; cont++) {
            //*entrada de dados
            idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
            op = JOptionPane.showInputDialog("insira sua nota do filme, sendo A=otimo, B=bom, C=regular, D=ruim, E=péssimo ").charAt(0);
            op = Character.toUpperCase(op);
//*fazendo as comparações
            if (op == 'A') {

                qtd_otimo = qtd_otimo + 1;

            } else {
                if (op == 'D') {
                    media = media + idade;
                } else {
                    if (op == 'E') {
                        porcentagem = porcentagem + 1;
                    }

                }
            }
        }
        //*saída de dados
        media = media / 40;
        porcentagem = porcentagem * 100 / 40;

        JOptionPane.showMessageDialog(null, "A quantidade de respostas 'otimo', foi " + qtd_otimo);
        JOptionPane.showMessageDialog(null, "a média das idades de quem escolheu 'ruim' foi " + media);
        JOptionPane.showMessageDialog(null, "a porcentagem de pessoas que escolheram a nota 'pessimo' foi de " + porcentagem + "%");
    }

}
//*Erick Fernando
