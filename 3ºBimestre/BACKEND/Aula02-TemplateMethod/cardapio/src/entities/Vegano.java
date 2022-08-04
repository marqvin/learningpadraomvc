package entities;

public class Vegano extends Menu{
    public double valorEmbalagem;
    public double valorCondimento;

    public Vegano() {

    }

    public Vegano(String nomePrato, double valorPrato, double valorEmbalagem, double valorCondimento) {
        super(nomePrato, valorPrato);
        this.valorEmbalagem = valorEmbalagem;
        this.valorCondimento = valorCondimento;
        this.nomePrato= nomePrato;
        this.valorPrato= valorPrato;
    }


    @Override
    public void prepararPrato() {
        System.out.println("Preparando prato: " + this.nomePrato);
    }


    @Override
    public void montarMenu() {
        System.out.println("O cardápio vegano escolhido");
    }

    @Override
    public double obterPreco () {
        double preco;
        preco = valorPrato + valorEmbalagem + (valorCondimento * 0.01);
        System.out.println("O valor final foi: " + preco);
        return (preco);
    }
}