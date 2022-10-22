/* Criar classe Ave
    - voa : boolean

    * Métodos
    - voar()
    - construtor
    - get e set

    * */

package Exercicio4;

public class Ave extends Animal {
    private boolean voa;

    public Ave(String nome, String cor, Ambiente ambiente, Double velocidadeMedia, boolean voa) {
        super(nome, cor, ambiente, velocidadeMedia);
        this.voa = voa;
    }

    public boolean isVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }

    public void voa() {
        if (voa == true) {
            System.out.printf("O %s é uma ave e pode voar!\n", getNome());
        } else {
            System.out.printf("Embora seja uma ave, %s não pode voar\n", getNome());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", voa=" + voa +
                '}';
    }
}
