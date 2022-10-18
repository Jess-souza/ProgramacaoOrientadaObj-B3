/*
Classe CarroCorrida
*Atributos:
- numeroCarro : int
- piloto : Piloto
- velocidadeMaxima : float
- velocidadeAtual : float
- ligado : boolean
*Métodos:
+ "Construtor"
+ set... (alterar atributos da Classe - "Modificadores")
+ get... (retorna valores dos atributos da Classe - "Acessores")
+ acelerar(float) - aumenta unidades em Km/h
+ frear(float) - reduz a velocidade em percentual (%) de frenagem
+ parar()
+ ligar()
+ desligar()
*Observações:
*Não ultrapassar a velocidade máxima
*Frear e Acelerar só funcionam se o carro estiver ligado
*Desligar só funciona se o carro estiver parado
*/

package ExercicioAula3;

public class CarroCorrida {
    private int numeroCarro;
    private Piloto piloto;
    private float velocidadeMaxima;
    private float velocidadeAtual;
    private boolean ligado;

    public CarroCorrida(int numeroCarro, Piloto piloto, float velocidadeMaxima, float velocidadeAtual, boolean ligado) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.ligado = ligado;
    }

    public CarroCorrida() {
    }

    public int getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(int numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

/*acelerar(float) - aumenta unidades em Km/h
+ frear(float) - reduz a velocidade em percentual (%) de frenagem
+ parar()
+ ligar()
+ desligar()
*Observações:
*Não ultrapassar a velocidade máxima
*Frear e Acelerar só funcionam se o carro estiver ligado
*Desligar só funciona se o carro estiver parado*/
}
