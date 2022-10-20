/*Classe Piloto
        *Atributos:
        - nome : String
        - idade : Integer
        - sexo : Enum
        - equipe : String
        *Métodos:
        + "Construtor"
        + set... (alterar atributos da Classe - "Modificadores")
        + get... (retorna valores dos atributos da Classe - "Acessores")
        */

package ExercicioAula3;

public class Piloto {
    private String nome;
    private Integer idade;
    private String equipe;
    private Enum Sexo;

    public Piloto(String nome, Integer idade, String equipe, Enum sexo) {
        this.nome = nome;
        this.idade = idade;
        this.equipe = equipe;
        Sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public Enum getSexo() {
        return Sexo;
    }

    public void setSexo(Enum sexo) {
        Sexo = sexo;
    }

    @Override
    public String toString() {
        return "Piloto{" + "nome:'" + nome + '\'' + ", idade:" + idade + ", equipe:'" + equipe + '\'' + ", Sexo:" + Sexo + '}';
    }
}
