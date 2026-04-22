package exercises.basics.restaurant_order;

public class Client {
    String name;

    public void realizarPedido(Orders newOrder) {
        System.out.println("Pedido realizado por: " + name);
        newOrder.order();
    }
}
