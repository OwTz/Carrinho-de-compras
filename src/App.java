import carrinho.Carrinho;
import models.Compra;

public class App {
    public static void main(String[] args) {
        Compra[] item = new Compra[3];
        Carrinho carrinho = new Carrinho();
      
        item[0] = new Compra("arroz",10.3f);
        item[1] = new  Compra("maquiagem",10.40f);
        item[2] = new Compra("óleo", 10.24f);
        System.out.println(item[1].getPreco());

        
        for(int i = 0; i < item.length; i++){
            carrinho.adicionarItem(item[i]);
        }
        
        carrinho.mostrarItens();
        carrinho.removerItem(item[1]);
        
        carrinho.mostrarItens();
    }
}
