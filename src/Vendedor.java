public class Vendedor extends Funcionario {
    private double valorVendas;
    private double percentualComissao;
    public Vendedor(String nome, int matricula, double salarioBase,double valorVendas, double percentualComissao) {
        super(nome, matricula, salarioBase);
        if(valorVendas < 0){
            throw new IllegalArgumentException("erro vendas");
        }
        this.valorVendas = valorVendas;
        if (percentualComissao < 0 || percentualComissao > 100){
            throw new IllegalArgumentException("erro comssão");
        }
       this.percentualComissao = percentualComissao;
    }
    public double getValorVendas(){
        return valorVendas;
    }
    public void setValorVendas(double valorVendas){
        if(valorVendas < 0){
            throw new IllegalArgumentException("erro vendas");
        }
        this.valorVendas = valorVendas;
    }
    public double getPercentualComissao(){
        return percentualComissao;
    }
    public void setPercentualComissao(double percentualComissao){
        if (percentualComissao < 0 || percentualComissao > 100){
            throw new IllegalArgumentException("erro comssão");
        }
        this.percentualComissao = percentualComissao;
    }
    @Override
    public double calcularSalario(){
        double comissao = valorVendas * percentualComissao / 100;
        return salarioBase + comissao;
    }
    public void registrarVendas(){
        System.out.println(nome + " registrou uma venda.");
    }
}