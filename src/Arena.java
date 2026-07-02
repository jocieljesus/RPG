import model.Guerreiro;
import model.Mago;

import java.util.Random;

public class Arena {
    public static void main(String[] args) {

        Random d20 = new Random();

        double numeroGerado = d20.nextInt(1,21);


        System.out.println(" A Batalha  Vai Começar! ");

        Guerreiro ryu = new Guerreiro("Ryu", 100, 35);

        Mago gendai = new Mago("Gendai", 75, 40);

        int danoMago = gendai.atacar();
        ryu.receberDano(danoMago);
        System.out.println();
        int danoGuerreiro =  ryu.atacar();
        gendai.receberDano(danoGuerreiro);






    }
}
