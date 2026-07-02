import model.Curandeiro;
import model.Guerreiro;
import model.Mago;

import java.util.Random;

public class Arena {
    public static void main(String[] args) {

        System.out.println(" A Batalha  Vai Começar! ");

        Guerreiro ryu = new Guerreiro("Ryu", 100, 35);

        Mago gendai = new Mago("Gendai", 75, 40);

        Curandeiro salazar = new Curandeiro("Salazar", 36);


        int danoMago = gendai.atacar();
        ryu.receberDano(danoMago);
        System.out.println();
        int danoGuerreiro =  ryu.atacar();
        gendai.receberDano(danoGuerreiro);
        System.out.println();
        int danoCurandeiro = ryu.atacar();
        salazar.receberDano(danoCurandeiro);
        System.out.println();
        salazar.curar();


    }
}
