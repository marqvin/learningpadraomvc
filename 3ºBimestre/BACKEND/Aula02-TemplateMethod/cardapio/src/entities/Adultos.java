package entities;

public class Adultos extends Menu{

    public Adultos() {
    }

    public Adultos(String nomePrato, double valorPrato) {
        super(nomePrato, valorPrato);
        this.nomePrato= nomePrato;
        this.valorPrato= valorPrato;
    }

    @Override
    public void prepararPrato() {
        System.out.println("Preparando prato: " + this.nomePrato);
    }

    @Override
    public void montarMenu() {
        System.out.println("O cardápio adulto escolhido");
    }

    @Override
    public double obterPreco() {
        double preco;
        preco = valorPrato;
        System.out.println("O valor final foi: " + preco);
        return preco;
    }

}