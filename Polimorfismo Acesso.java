public class teste {

    public static void main(String[] args) {
        Gerente g1 = new Gerente("joao", "123", 12000, 3000);
        Autenticador autenticador = new Autenticador();

        if (autenticador.autenticar(g1, false)) {
            System.out.println("Usuário autenticado!");
        } else {
            System.out.println("Login ou password incorretos!");
        }
    }
}
public class Usuario {

    private String login;
    private String password;

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
public class Gerente extends Usuario {

    double salario, bonus;

    Gerente(String login, String password, double salario, double bonus) {
        super.setLogin(login);
        super.setPassword(password);
        this.salario = salario;
        this.bonus = bonus;
    }

    double getSalario() {
        return salario;
    }

    void setSalario(double salario) {
        this.salario = salario;
    }

    double getBonus() {
        return bonus;
    }

    void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
public class Vendedor extends Usuario {

    double comissao;

    Vendedor(String login, String password, double comissao) {
        super.setLogin(login);
        super.setPassword(password);
        this.comissao = comissao;
    }

    double getComissao() {
        return comissao;
    }

    void setComissao(double comissao) {
        this.comissao = comissao;
    }

}
public class Autenticador {
String[][] senha = {{"joao", "123"}, { "maria","abc"},{"raul","xyz"}};
    public Autenticador() {
       
    }
     boolean autenticar(Usuario usuario, boolean entrada) {
        if (usuario instanceof Gerente) {
            for (int i = 0; i < 3; i++) {
                if (usuario.getLogin().equals(senha[i][0])) {
                    if (usuario.getPassword().equals(senha[i][1])) {
                        return true;
                    }
                }
            }
        } else if (usuario instanceof Vendedor) {
            if (entrada == true) {
                return false;
            }
            for (int i = 0; i < 3; i++) {
                if (usuario.getLogin().equals(senha[i][0])) {
                    if (usuario.getPassword().equals(senha[i][1])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
