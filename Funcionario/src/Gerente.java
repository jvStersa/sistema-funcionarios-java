public class Gerente extends Funcionario {
    private double valorBonus;
    public Gerente(String nome, int matricula, double salarioBase, double valorBonus) {
        super(nome, matricula, salarioBase);
        if (valorBonus < 0) {
            throw new IllegalArgumentException("erro bonus");
        }
        this.valorBonus = valorBonus;
    }
    public double getValorBonus(){
        return valorBonus;
    }
    public void setValorBonus(double valorBonus){
        if (valorBonus < 0) {
            throw new IllegalArgumentException("erro bonus");
        }
        this.valorBonus = valorBonus;
    }
    @Override
    public double calcularSalario(){
        return salarioBase + valorBonus;
    }
    public void realizarReuniao(){
        System.out.println(nome + " está realizando uma reunião.");
    }
}
