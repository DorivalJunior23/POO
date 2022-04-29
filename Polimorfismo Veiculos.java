public class NewClass {

    public static void main(String args[]) {
        Veiculo veiculos[] = new Veiculo[4];
        veiculos[0] = new Moto();
        veiculos[1] = new Carro();
        veiculos[2] = new Carro();
        veiculos[3] = new Moto();

        veiculos[0].setCor("Verde");
        veiculos[0].setPlaca("CCC-5566");

        veiculos[1].setCor("Prata");
        veiculos[1].setPlaca("BBB-2234");

        veiculos[2].setCor("Branco");
        veiculos[2].setPlaca("AAA-1234");

        veiculos[3].setCor("Azul");
        veiculos[3].setPlaca("DDD-9932");

        DetalheVeiculos detalhes = new DetalheVeiculos(veiculos);
        detalhes.printVeiculos();
    }
}
public class Veiculo {
    private String placa;
    private String cor;
    public String getCor() {
         return cor;
    }
    public void setCor(String cor) {
         this.cor = cor; 
    }
    public String getPlaca() {
         return placa;
    }
    public void setPlaca(String placa) {
         this.placa = placa; 
    } 
}

public class Carro extends Veiculo {
    private int rodas = 4;
    public int getRodas() {
        return rodas;
    }
}

public class Moto extends Veiculo {
    private int rodas = 2;
    public int getRodas() {
        return rodas;
    }
}
public class DetalheVeiculos {

    private Veiculo[] veiculo;

    public DetalheVeiculos(Veiculo[] v) {
        this.veiculo = v;
    }

    public void printVeiculos() {
        for (Veiculo veiculo : this.veiculo) {
            if (veiculo instanceof Moto) {
                System.out.println("Moto: " + ((Moto) veiculo).getPlaca() + " - " + ((Moto) veiculo).getCor() + " - 2");
            } else if (veiculo instanceof Carro) {
                System.out.println("Carro: " + ((Carro) veiculo).getPlaca() + " - " + ((Carro) veiculo).getCor() + " - 4");
            }
        }
    }
}
