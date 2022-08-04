package tests;

import entities.Adultos;
import entities.Infantil;
import entities.Vegano;
import entities.Menu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCardapio {

    Menu adultos, infantil, vegano;

    @BeforeEach
    void doBefore() {
        adultos = new Adultos("Bolo de Cenoura",53.93);
        infantil = new Infantil("Purê de Batata",35.30,11.39, "Pernalonga");
        vegano = new Vegano("Alface de Carne de Jaca", 31.99, 30.99,3);
    }
    @Test
    void tests() {
        adultos.montarMenu();
        adultos.prepararPrato();
        adultos.obterPreco();

        infantil.montarMenu();
        infantil.prepararPrato();
        infantil.obterPreco();

        vegano.montarMenu();
        vegano.prepararPrato();
        vegano.obterPreco();
    }

}