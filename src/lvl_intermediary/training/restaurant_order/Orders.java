package lvl_intermediary.training.restaurant_order;

public class Orders {
    String name;
    double price;

    public void order(){
        System.out.println("Pedido feito: " + name);
        System.out.println("Preço do pedido: R$" + price);
    }
}
