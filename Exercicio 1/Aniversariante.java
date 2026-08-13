public class Aniversariante {
    private String nome;
    private DataAniversario dataAniversario;

    public Aniversariante(String nome, int dia, int mes) {
        this.nome = nome;
        this.dataAniversario = new DataAniversario(dia, mes);
    }

    public Aniversariante(String nome, DataAniversario dataAniversario) {
        this.nome = nome;
        this.dataAniversario = dataAniversario;
    }

    public String getNome() {
        return nome;
    }

    public DataAniversario getDataAniversario() {
        return dataAniversario;
    }

    public boolean equals(Object outroAniversariante) {
        if (outroAniversariante instanceof Aniversariante) {
            Aniversariante outro = (Aniversariante) outroAniversariante;
            return this.nome.equals(outro.nome)
                    && this.dataAniversario.equals(outro.dataAniversario);
        }
        return false;
    }
}
