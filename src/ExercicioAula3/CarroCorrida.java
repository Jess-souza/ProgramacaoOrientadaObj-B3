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
+ acelerar(float) - aumenta a velocidade em Km/h (Soma em Km/h a velocidade atual)
+ frear(float) - reduz a velocidade em Km/h (subtrai em Km/h a velocidade atual)
+ parar() - velocidade igual a 0 Km/h
+ ligar()
+ desligar()
*Observações:
*Não ultrapassar a velocidade máxima
*Frear e Acelerar só funcionam se o carro estiver ligado
*Desligar só funciona se o carro estiver parado
*/

package ExercicioAula3;

public class CarroCorrida {
    private Integer numeroCarro;
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

    public float acelerar() {
        if (ligado == false) {
            System.out.println("Não é possível acelerar um carro desligado!");
        } else if (getVelocidadeAtual() < getVelocidadeMaxima()) {
            float novaVelocidade = getVelocidadeAtual() + 10f;
            setVelocidadeAtual(novaVelocidade);
            if (getVelocidadeAtual() >= getVelocidadeMaxima()) {
                System.out.println("A velocidade máxima foi atingida");
                setVelocidadeAtual(getVelocidadeMaxima());
            }
        }
        return 0;
    }

    public float frear() {
        if (ligado == false) {
            System.out.println("Não é possível reduzir velocidade de um carro desligado!");
        } else if (getVelocidadeAtual() >= 0) {
            float novaVelocidade = getVelocidadeAtual() - 30f;
            setVelocidadeAtual(novaVelocidade);

            if (getVelocidadeAtual() < 0) {
                System.out.println("O veiculo já está parado");
                setVelocidadeAtual(0);
            }
        }
        return 0;
    }


    public boolean parar() {
        if (ligado == true) {
            setVelocidadeAtual(0f);
        } else {
            System.out.println("Não é possível parar um carro desligado!");
        }
        return false;
    }

    public void ligar() {
        if (getLigado() == false) {
            setLigado(true);
        } else {
            System.out.println("O carro já está ligado!");
        }
    }

    public void desligar() {
        if (getVelocidadeAtual() == 0f) {
            setLigado(false);
        } else {
            System.out.println("Não é possível desligar um veículo em movimento!");
        }
    }

    @Override
    public String toString() {
        return "CarroCorrida{" +
                "numeroCarro=" + numeroCarro +
                ", piloto=" + piloto +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", velocidadeAtual=" + velocidadeAtual +
                ", ligado=" + ligado + '}';
    }
}
