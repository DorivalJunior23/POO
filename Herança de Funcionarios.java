public class NewClass {

    public static void main(String args[]) {
        Pessoa p1 = new Cliente("José", "Rua Centro", 1000.0);
        Pessoa p2 = new Funcionario("Maria", "Rua Principal", 3500.0);
        Pessoa p3 = new Dependente("Pedro", "Rua Principal", 9);
        Pessoa p4 = new Gerente("Carlos", "Rua Alfreda", 12000.0, "Vendas");

        Cliente c = (Cliente) p1;
        Funcionario f = (Funcionario) p2;
        Dependente d = (Dependente) p3;
        Gerente g = (Gerente) p4;

        System.out.println(c.getLimiteCompra());
        System.out.println(f.getSalario());
        System.out.println(d.getIdade());
        System.out.println(g.getDepartamento());
    }
}
public class Pessoa {
    String nome;
    String rua;
    public Pessoa(String nome,String rua){
        this.nome = nome;
        this.rua = rua;
    }
    
    String getEndereco(){
        return rua;
    }
    String getNome(){
        return nome;
    }
    void setNome(String nome){
        this.nome = nome;
    }
    void setEndereco(String rua){
        this.rua = rua;
    }
}
public class Cliente extends Pessoa {
    double limiteCompra;

    Cliente(String nome, String rua, double limiteCompra) {
        super(nome,rua);
        this.limiteCompra = limiteCompra;
    }
    
    void setLimitecompra(double limiteCompra){
        this.limiteCompra = limiteCompra;
    }
    double getLimiteCompra(){
        return limiteCompra;
    }
}
public class Funcionario extends Pessoa{
     double salario;

    Funcionario(String nome, String rua, double salario) {
        super(nome,rua);
        this.salario = salario;
    }
    
    void setSalario(double salario){
        this.salario = salario;
    }
    double getSalario(){
        return salario;
    }
}

public class Dependente extends Pessoa{
    int idade;

    Dependente(String nome, String rua, int idade) {
        super(nome,rua);
        this.idade =idade;
    }
    
    void setIdade(int idade){
        this.idade = idade;
    }
    int getIdade(){
        return idade;
    }
}

public class Gerente extends Funcionario{
    String departamento;
    Gerente(String nome, String rua, double salario,String departamento){
        super(nome,rua,salario);
        this.departamento = departamento;
    }
    
    void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    String getDepartamento(){
     return departamento;   
    }
}
