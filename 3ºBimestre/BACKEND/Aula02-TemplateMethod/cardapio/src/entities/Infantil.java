package entities;

public class Infantil extends Menu{
    public double custoBrinquedoSupresa;
    public String nomeBrinquedo;

    public Infantil() {
    }

    public Infantil(String nomePrato, double valorPrato, double custoBrinquedoSupresa, String nomeBrinquedo) {
        super(nomePrato, valorPrato);
        this.custoBrinquedoSupresa = custoBrinquedoSupresa;
        this.nomeBrinquedo = nomeBrinquedo;
        this.nomePrato= nomePrato;
        this.valorPrato= valorPrato;
    }

    @Override
    public void prepararPrato() {
        System.out.println("Preparando prato: " + this.nomePrato);
        System.out.println("O Brinquedo: " + this.nomeBrinquedo + "foi separado ao cliente");
    }

    @Override
    public void montarMenu() {
        System.out.println("O cardápio infantil escolhido");
    }

    @Override
    public double obterPreco () {
        double preco;
        preco = valorPrato + custoBrinquedoSupresa;
        System.out.println("O valor final foi: " + preco);
        return preco;
    }
}