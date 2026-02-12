package lvl_intermediary.challanges.login_user;

import java.util.Scanner;

public class SystemConfig {

    // Validacao do login
    public void login(User user){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        int passInput = input.nextInt();

        if(passInput == user.passowrd){
            System.out.println("Login bem sucedido!");
            user.log = true;
        } else {
            System.out.println("Senha incorreta.");
        }
        input.close();
    }

    // Validacao do deslog
    public void logoff(User user){
        if (user.log == false){
            System.out.println("Você não está logado");
        } else {
            user.log = false;
            System.out.println("User " + user.name + " deslogado.");
        }
    }

}
