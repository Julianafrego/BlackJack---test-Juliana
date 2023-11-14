package main;
// Importar bibliotecas gráficas
import javax.swing.*;

import main.cartas.Carta;
import main.cartas.CartaFactory;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
//import java.util.Random;


// Criar classe, herda JFrame
public class BlackJack extends JFrame implements ActionListener {

  private ArrayList<Carta> baralho;
  private Embaralhador strategyEmbaralhador;
  public BlackJack(Embaralhador strategyEmbaralhador) {
    this.strategyEmbaralhador = strategyEmbaralhador;

    iniciarJogo();

  }

  public void iniciarJogo(){
    criarBaralho();
    embaralharBaralho();
  }

  public void criarBaralho(){
    baralho = new ArrayList<>();

    // array de string com os naipes possiveis
    String[] naipes = {"Ouros", "Paus", "Copas", "Espadas"};
    

    //esse loop percorre cada elemento do array naipe, acima
    for(String naipe : naipes) {
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
    // adiciona uma instancia da classe as/rei... ao baralho, array, 
    
  }

  public void embaralharBaralho() {
    strategyEmbaralhador.embaralhar(baralho);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    
    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
  }

}