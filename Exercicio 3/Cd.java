public class Cd extends Produto implements InfoGerais
{
    public int numFaixas;

    public int getNumFaixas()
    {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas)
    {
        this.numFaixas = numFaixas;
    }

    @Override
    public void ExibirInformacoes()
    {
        nome = "Scorpion";
        numFaixas = 2;
        preco = 10;
    }
}