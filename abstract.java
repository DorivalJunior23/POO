public class herança {
    public static void main(String[] args) {
  Aluno alunos[] = new Aluno[4];
alunos[0] = new AlunoGraduacao("Jonas", 1234, 7.8, 10.0); // nome, ra, notadisciplinas, notatcc
alunos[1] = new AlunoGraduacao("Maria", 5522, 9.8, 7.0);
alunos[2] = new AlunoMestrado("Pedro", 3311, 7.5, 8.5, 0); // nome, ra, notadisciplinas, notadissertacao, artigos
alunos[3] = new AlunoMestrado("Patricia", 7098, 9.5, 9.5, 3);
for (int i=0; i<alunos.length; i++){
    System.out.printf("Aluno(a): %s, Nota Final: %.2f\n", alunos[i].getNome(), alunos[i].getNotaFinal());
}
    }
}
public abstract class Pessoa {
    private String nome;
   public String getNome() {  return nome; }
   public void setNome(String nome) { this.nome = nome; }
}
public abstract class Aluno extends Pessoa {

    private int ra;
    private double notaDisciplinas;

    public abstract double getNotaFinal();

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public double getNotaDisciplinas() {
        return notaDisciplinas;
    }

    public void setNotaDisciplinas(double notaDisciplinas) {
        this.notaDisciplinas = notaDisciplinas;
    }

  
}
public class AlunoGraduacao extends Aluno {

    double notatcc;
    double notaFinal;

    AlunoGraduacao(String nome, int ra, double notadisciplina, double notatcc) {// nome, ra, notadisciplinas, notatcc
        super.setNome(nome);
        super.setRa(ra);
        super.setNotaDisciplinas(notadisciplina);
        this.notatcc = notatcc;
    }

    public void setNotaTcc(double notatcc) {
        this.notatcc = notatcc;
    }

    public double getNotaTcc() {
        return notatcc;
    }

    @Override
    public double getNotaFinal() {
        notaFinal = super.getNotaDisciplinas() + notatcc;
        return notaFinal / 2;
    }

}
public class AlunoMestrado extends Aluno{
double notadissertacao,notaFinal;
int artigos;
    AlunoMestrado(String nome,int ra, double notadisciplina, double notadissertacao, int artigos) {// nome, ra, notadisciplinas, notadissertacao, artigos
        super.setNome(nome);
        super.setRa(ra);
        super.setNotaDisciplinas(notadisciplina);
        this.notadissertacao=notadissertacao;
        this.artigos=artigos;
    }

    @Override
    public double getNotaFinal() {
      if(artigos==0){
      return 0.0;    
      }else{
          notaFinal =super.getNotaDisciplinas()+notadissertacao;
          return notaFinal/2;
      }
    }
    
}
