public class Estagiario extends Funcionario
{
    private double valorBolsaAuxilio;
    private double cargaHorariaSemanal;

    public Estagiario(String nome, String matricula, double salarioBase, String dataAdmissao,
                      double valorBolsaAuxilio, double cargaHorariaSemanal)
    {
        super(nome, matricula, salarioBase, dataAdmissao);
        this.valorBolsaAuxilio = valorBolsaAuxilio;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    @Override
    public double calcularSalario()
    {
        return valorBolsaAuxilio;
    }

    @Override
    public double calcularDesconto()
    {
        return 0;
    }
}