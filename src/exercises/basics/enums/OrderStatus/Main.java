package exercises.basics.enums.OrderStatus;

/*
 * Objetivo:
 * Revisar o uso de enum em Java através do status de um pedido.
 */

public class Main {
    public static void main(String[] args) {

        OrderStatus status = OrderStatus.PENDING;
        System.out.println("Status atual: " + status);

        status = OrderStatus.PAID;
        System.out.println("Status atual: " + status);

        status = OrderStatus.SHIPPED;
        System.out.println("Status atual: " + status);

        status = OrderStatus.DELIVERED;
        System.out.println("Status atual: " + status);


    }
}
