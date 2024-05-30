package carrinho;

import java.util.ArrayList;
import java.util.List;

import models.Compra;

public class Carrinho {
    private List<Compra> listaDeCompras;

    public Carrinho(){
        this.listaDeCompras= new ArrayList<>();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void adicionarItem(Compra item){
        listaDeCompras.add(item);
    }

    public void removerItem(Compra item){
        ArrayList<Compra> listaRemover = new ArrayList<>();

        for (Compra itemRemove : listaDeCompras) {
            if (itemRemove.equals(item)) {
                listaRemover.add(itemRemove);
            }
        }
        listaDeCompras.removeAll(listaRemover);
        System.out.println("tarefa removida");
    }

    public void mostrarItens(){
        for(Compra itemCompra: this.listaDeCompras){
            System.out.println(itemCompra.toString());
        }
    }

}
