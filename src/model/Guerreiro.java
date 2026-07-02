package model;

public class Guerreiro extends Personagem{

    private int forcaFisica;

    public Guerreiro(String nome, int vidaMaxima, int forcaFisica ) {
        super(nome, vidaMaxima);
        this.forcaFisica = forcaFisica;
    }

    @Override
    public int atacar() {
        System.out.println("🤺O Guerreiro " + getNome()+ " ataca com sua pesada espada de aço!⚔️");
        return this.forcaFisica;
    }
}
