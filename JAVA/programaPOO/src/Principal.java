 //nome de classe primeira letra maiuscula
//de objeto e metodo, minuscula

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        //instanciar objeto
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("João", "Maculino", 24, 1.75);
        JOptionPane.showMessageDialog(null, "Objeto p1 " + p1.nome + "\n" + p1.idade + "\n" + p1.estatura);
        JOptionPane.showMessageDialog(null, "Objeto p2 " + p2.nome + "\n" + p2.idade + "\n" + p2.estatura);
        p1.estatura = 1.80;
    }

}
