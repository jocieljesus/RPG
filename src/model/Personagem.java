package model;

import java.util.Random;

public abstract class Personagem {

    private String nome;
    private int vida;
    public static Random d20 = new Random();

    public Personagem(String nome, int vidaMaxima){
        this.nome = nome;
        this.vida = vidaMaxima;
    }

    public String getNome(){
        return this.nome;
    }

    public int getVida(){
        return  this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void receberDano(int dano){
        if( this.vida <= 0){
            System.out.println("Morreu!");
        }else{
            this.vida -= dano;
            System.out.printf(getNome()+" tomou %d de dano! Vida atual %d", dano, this.vida);
        }
    }

    public abstract int atacar();

}
