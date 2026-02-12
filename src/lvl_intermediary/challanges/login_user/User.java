package lvl_intermediary.challanges.login_user;

public class User {

    // Data User
    String name;
    int passowrd;
    boolean log = false;

    // Metodo do user para logar
    public void logar(SystemConfig systemConfig) {
        systemConfig.login(this);
    }

    // Metodo do user para deslogar
    public void logout(SystemConfig systemConfig) {
        systemConfig.logoff(this);
    }
}
