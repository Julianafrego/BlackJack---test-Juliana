package main.test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import main.Embaralhador;
import main.cartas.Carta;
import main.cartas.CartaFactory;


public class BlackJackTest {
    @Test
    public void testarEmbaralhamento() {
        // Criar 2 baralhos, 1 cópia, ambos começam ordenados
        // Embaralhar um, e deixa o outro ordenado, no final, comparar esses dois
        // Assim ver se o embaralhamento deu certo
        //BlackJack B = new BlackJack();
        
        ArrayList<Carta> baralhoOrdenado = criarBaralho();

        ArrayList<Carta> copiaBaralhoOrdenado = new ArrayList<>(baralhoOrdenado);

        Embaralhador strategy = new Embaralhador();

        strategy.embaralhar(baralhoOrdenado);

        if (copiaBaralhoOrdenado.equals(baralhoOrdenado)) {
            System.out.println("O embaralhamento deu errado.");
        } else {
            System.out.println("O embaralhamento deu certo.");
        }
        
    }

    // Método auxiliar para criar um baralho ordenado
    private ArrayList<Carta> criarBaralho() {
        ArrayList<Carta> baralho = new ArrayList<>();
        String[] naipes = {"Ouros", "Paus", "Copas", "Espadas"};

        for (String naipe : naipes) {
            baralho.add(CartaFactory.criaCarta("A", naipe));
            baralho.add(CartaFactory.criaCarta("K", naipe));
            baralho.add(CartaFactory.criaCarta("Q", naipe));
            baralho.add(CartaFactory.criaCarta("J", naipe));
            baralho.add(CartaFactory.criaCarta("2", naipe));
            baralho.add(CartaFactory.criaCarta("3", naipe));
            baralho.add(CartaFactory.criaCarta("4", naipe));
            baralho.add(CartaFactory.criaCarta("5", naipe));
            baralho.add(CartaFactory.criaCarta("6", naipe));
            baralho.add(CartaFactory.criaCarta("7", naipe));
            baralho.add(CartaFactory.criaCarta("8", naipe));
            baralho.add(CartaFactory.criaCarta("9", naipe));
        }

        return baralho;
    }
}
