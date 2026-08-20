public class main {
    public static void main(String[] args){
        try{
            Gerente gerente = new Gerente("Carlos",101,5000,800);
            gerente.apresentarDados();
            double salarioGerente = gerente.calcularSalario();
            System.out.printf("Salario do gerente: %.2f%n", salarioGerente);
            gerente.realizarReuniao();
        }catch (IllegalArgumentException e){
            System.out.println("Erro ao criar gerente: " + e.getMessage());
        }
        try{
            Vendedor vendedor = new Vendedor("Rodrigo",123,2000,10000,
                    5);
            vendedor.apresentarDados();
            double salarioVendedor = vendedor.calcularSalario();
            System.out.printf("Salario do vendedor: %.2f%n", salarioVendedor);
            vendedor.registrarVendas();
        }catch (IllegalArgumentException e){
            System.out.println("Erro ao criar vendedor"+ e.getMessage());
        }
        try {

                Estagiario estagiario = new Estagiario("João Paulo",587,20000,
                        "Unifil");
                estagiario.apresentarDados();
                double bolsaEstagiario = estagiario.calcularSalario();
                System.out.printf("Bolsa do estagiario: %.2f%n",bolsaEstagiario);
                estagiario.realizarTreinamento();

        }catch (IllegalArgumentException e){
            System.out.println("Erro ao criar estagiario"+ e.getMessage());
        }
    }

}