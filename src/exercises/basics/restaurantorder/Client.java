package exercises.basics.restaurantorder;

public class Client {
    String name;

    public void realizarPedido(Orders newOrder) {
        System.out.println("Pedido realizado por: " + name);
        newOrder.order();
    }
}
