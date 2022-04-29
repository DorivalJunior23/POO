public class NewClass {

    public static void main(String args[]) {
        Aluno a1 = new Aluno("Fulano", 18, 12345, "PO, AOO, Redes");
        System.out.println(a1.retornaDados());
    }
}
public class Pessoa {
    private String nome;
    private int idade; 

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String retornaDados(){
        return nome + " -- " + idade;
    }
    public void fazerAniversario(){
        idade++;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
}
public class Aluno extends Pessoa {
    int ra;
    String disciplina;

    Aluno(String nome, int idade, int ra, String disciplina) {
      super(nome,idade);
      this.ra = ra;
      this.disciplina = disciplina;
    }
    
    public String retornaDados(){
        return super.retornaDados() + " -- " + ra + " -- " + disciplina;
    }
}
