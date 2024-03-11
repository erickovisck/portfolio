
import javax.swing.JOptionPane;

public class Agenda {

    int dia;
    int hora;
    String compromisso;
    String[][] agendamento;

    public Agenda() {

        dia = 0;
        hora = 0;
        compromisso = "";
        agendamento = new String[31][24];

    }

    public void agendar() {
        dia = Integer.parseInt(JOptionPane.showInputDialog("digite o dia"));
        if (dia <= 31 && dia > 0) {
            hora = Integer.parseInt(JOptionPane.showInputDialog("digite a hora"));
            if (hora < 24 && hora >= 0) {
                compromisso = JOptionPane.showInputDialog("digite seu compromisso");
                agendamento[dia][hora] = compromisso;
            } else {
                JOptionPane.showMessageDialog(null, "horario inválido.");

            }
        } else {
            JOptionPane.showMessageDialog(null, "dia inválido.");
        }

    }

    public void exibirtudo() {
        for (int linha = 0; linha < 31; linha++) {
            for (int coluna = 0; coluna < 24; coluna++) {
                if (agendamento[linha][coluna] != (null)) {
                    System.out.println("Agendamento dia: " + linha + " No horário:" + coluna + "hs");
                }
            }
        }
    }

    public void consultar() {
        dia = Integer.parseInt(JOptionPane.showInputDialog("digite qual dia quer consular"));
        int opc = JOptionPane.showConfirmDialog(null, "Consultar o dia inteiro?", "Consulta", JOptionPane.YES_NO_OPTION);
        if (opc == 0) {
            for (int coluna = 0; coluna < 24; coluna++) {
                if (agendamento[dia][coluna] != (null)) {
                    System.out.println("Horário " + coluna + "" + agendamento[dia][coluna]);
                }
            }
        } else {
            hora = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora que deseja consultar"));
            if (agendamento[dia][hora] != (null)) {
                System.out.println("Compromisso: " + agendamento[dia][hora]);
            } else {
                JOptionPane.showMessageDialog(null, "Agenda livre neste horário");
            }
        }
    }
}
