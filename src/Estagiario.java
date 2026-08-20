public class Estagiario extends Funcionario {
    private String instituicaoEnsino;
    public Estagiario(String nome, int matricula, double salarioBase,String instituicaoEnsino) {
        super(nome, matricula, salarioBase);
        if (instituicaoEnsino == null || instituicaoEnsino.trim().isEmpty()){
            throw new IllegalArgumentException("Erro instituição");
        }
        this.instituicaoEnsino = instituicaoEnsino;

    }
    public String getInstituicaoEnsino(){
        return instituicaoEnsino;
    }
    public void setInstituicaoEnsino(String instituicaoEnsino){
        if (instituicaoEnsino == null || instituicaoEnsino.trim().isEmpty()){
            throw new IllegalArgumentException("Erro instituição");
        }
        this.instituicaoEnsino = instituicaoEnsino;
    }
    @Override
    public double calcularSalario(){
        return salarioBase;
    }
    public void realizarTreinamento(){
        System.out.println(nome + " esta em treinamento.");
    }
}
