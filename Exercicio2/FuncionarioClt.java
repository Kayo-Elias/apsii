public class FuncionarioClt extends Funcionario
{
    private double valeTransporte;
    private double valeAlimentacao;

    public FuncionarioClt(double valeAlimentacao, double valeTransporte)
    {
        this.valeTransporte = valeTransporte;
        this.valeAlimentacao = valeAlimentacao;
    }

    public CalcularDesconto(double salarioBase)
    {
        salarioBase += 50;
    }
}