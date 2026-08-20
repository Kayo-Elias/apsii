public class Gerente extends FuncionarioClt ()
{
    private int tamanhoEquipe;
    private int percentualBonus;

    public Gerente()
    {
        super()
    }

    public CalcularDesconto(double salarioBase)
    {
        if (tamanhoEquipe > 10)
            super(salarioBase += 100);
    }
}