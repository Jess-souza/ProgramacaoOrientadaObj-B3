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

    public boolean getVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }

    public void voa() {
        System.out.printf("O %s é uma ave e pode voar!\n", getNome());
    }
}
