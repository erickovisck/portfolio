
import javax.swing.JOptionPane;

public class Menu {

    Agenda agenda = new Agenda();
    int opcao = -1;

    public void escolha() {
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo a sua agenda de compromissos"
                    + "\n 1 - Cadastrar compromissos"
                    + "\n 2 - Consultar compromissos"
                    + "\n 3 - Exibir todos os compromissos do mês"
                    + "\n 0- Sair do sistema"));
            switch (opcao) {
                case 1:
                    agenda.agendar();
                    break;
                case 2:
                    agenda.consultar();
                    break;
                case 3:
                    agenda.exibirtudo();
                    break;
                case 0: 
                    JOptionPane.showMessageDialog(null, "Obrigado por usar nossa agenda");
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }

        } while (opcao != 0);

    }

}
