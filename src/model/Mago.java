package model;

public class Mago extends Personagem {

    private int poderMagico;


    public Mago(String nome, int vidaMaxima, int podderMagico) {
        super(nome, vidaMaxima);
        this.poderMagico = podderMagico;
    }

    @Override
    public int atacar() {
        System.out.println("🧙‍♂️ O Mago " +getNome()+ " lança uma bola de fogo explosiva!🔥");
        return this.poderMagico;
    }
}
