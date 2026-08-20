public class Funcionario {
    protected String nome;
    protected int matricula;
    protected double salarioBase;

    public Funcionario(String nome, int matricula, double salarioBase) {
        if (nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("erro nome");
        }
        if (matricula <= 0){
            throw new IllegalArgumentException("erro matricula");
        }
        if (salarioBase <= 0){
            throw new IllegalArgumentException("erro salario");
        }
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if (nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("erro nome");
        }
        this.nome = nome;
    }
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        if (matricula <= 0){
            throw new IllegalArgumentException("erro matricula");
        }
        this.matricula = matricula;
    }
    public double getSalarioBase(){
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase){
        if (salarioBase <= 0){
            throw new IllegalArgumentException("erro salario");
        }
        this.salarioBase = salarioBase;
    }
    public double calcularSalario(){
        return salarioBase;
    }
    public void apresentarDados(){
        System.out.println("nome: "+ nome);
        System.out.println("salario Base:"+ salarioBase);
        System.out.println("matricula: "+ matricula);
    }
}
