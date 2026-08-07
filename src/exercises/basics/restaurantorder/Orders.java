package exercises.basics.restaurantorder;

public class Orders {
    String name;
    double price;

    public void order(){
        System.out.println("Pedido feito: " + name);
        System.out.println("Preço do pedido: R$" + price);
    }
}
