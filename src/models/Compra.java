package models;

public class Compra {
    private String nome;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getNome() {
        return this.nome;
    }
    public double getPreco() {
        return this.preco;
    }

    public Compra(String nome, double valor){
        this.setNome(nome);
        this.setPreco(valor);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "item "+this.getNome()+ ", está com o preço "+this.getPreco();
    }
}
