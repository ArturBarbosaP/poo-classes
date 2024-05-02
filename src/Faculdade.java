public class Faculdade
{
    public int idFaculdade;
    public String nome;
    public String endereco;
    public String telefone;
    public String cursos;

    public Faculdade (int id, String nome, String endereco, String telefone, String cursos)
    {
        this.idFaculdade = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cursos = cursos;
    }

    public void imprimeCursos()
    {
        System.out.println(cursos);
    }

    public void imprimeNome()
    {
        System.out.println(nome);
    }
}