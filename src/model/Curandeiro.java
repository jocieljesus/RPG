package model;

public class Curandeiro extends Personagem{

    public Curandeiro(String nome, int vidaMaxima) {
        super(nome, vidaMaxima);
    }

    @Override
    public int atacar() {
        System.out.println("⚕️️O curandeiro " + getNome() + "bate com o cajado na cabeça do oponente! 🩼");
        return 5;
    }

    public void curar(){
        int ervas= d20.nextInt(1,21);
        this.setVida(getVida()+ervas);
        System.out.println(getNome() + " usou suas ervas de cura e agora se sente mais forte. Nova vida " +  getVida());
    }
}
