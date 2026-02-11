package lvl_intermediary.training.restaurant_order;

public class Main {
    public static void main(String[] args) {


        Client Pedro = new Client();
        Pedro.name = "Pedro";

        Orders Hamburger = new Orders();
        Hamburger.name = "Hamburger";
        Hamburger.price = 20;

        Orders Pizza = new Orders();
        Pizza.name = "Pizza";
        Pizza.price = 40;

        Pedro.realizarPedido(Hamburger);
        System.out.println("");
        Pedro.realizarPedido(Pizza);
    }

}
