package lvl_intermediary.challanges.login_user;

public class Main {
    public static void main(String[] args) {

        // Challange: Validacao do User no Sistema

        // Instaciacao do User
        User Marcos = new User();
        Marcos.name = "Marcos";
        Marcos.passowrd = 123;
        Marcos.log = false;

        // Instanciacao do Sistema
        SystemConfig systemConfig = new SystemConfig();

        // Entrada e Saida do Sistema
        Marcos.logar(systemConfig);
        Marcos.logout(systemConfig);
    }
}
