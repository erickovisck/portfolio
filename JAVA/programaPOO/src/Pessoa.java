
public class Pessoa {

    //atributos
    String nome;
    String sexo;
    int idade;
    double estatura;

    public Pessoa() {
        this("", "", 0, 0.0);

    }

    public Pessoa(String nome, String sexo, int idade, double estatura) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.estatura = estatura;
    }

}
