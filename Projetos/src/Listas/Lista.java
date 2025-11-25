package Listas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Lista {
    public void run(){
        List<String> cores = new ArrayList<>();
        cores.add("Azul");
        cores.add("Vermelho");
        cores.add("Amarelo");
        cores.add("Verde");
        cores.add("Roxo");


        System.out.println("Numero de cores: " + cores.size());

        System.out.printf("Primeira cor: " + cores.get(0));

        System.out.println("\nUltima cor: " + cores.get(4));
    }

}
