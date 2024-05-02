public class Escola
{
    public int idEscola;
    public String nome;
    public String endereco;
    public String telefone;
    public int qtdSalas;

    public Escola(int id, String nome, String endereco, String telefone)
    {
        this.idEscola = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void imprimeNome()
    {
        System.out.println(nome);
    }

    public void imprimeContato()
    {
        System.out.println("Endereco: " + endereco + "\nTelefone: " + telefone);
    }

}