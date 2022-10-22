/*
    * Cria classe animal
    * Atributos
    - nome : String
    - cor : String
    - ambiente: String
    - velocidade média : Double
*   * Métodos
*   - Comer*/
package Exercicio4;

public class Animal {
    private String nome;
    private String cor;
    private Ambiente ambiente;
    private Double velocidadeMedia;

    public Animal(String nome, String cor, Ambiente ambiente, Double velocidadeMedia) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public Double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(Double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", ambiente=" + ambiente +
                ", velocidadeMedia=" + velocidadeMedia +
                '}';
    }
}
