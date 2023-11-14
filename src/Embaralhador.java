package cartas;
import java.util.ArrayList;
import java.util.Collections;

//import main.cartas.Carta;

public class Embaralhador {
    
    public void embaralhar(ArrayList <Carta> baralho) {
        // padrao collections será o responsável por embaralhar a lista
       Collections.shuffle(baralho);
    }
}