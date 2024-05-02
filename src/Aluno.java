public class Aluno
{
    public int idAluno;
    public String nome;
    public int idade;
    public int matricula;
    public String curso;

    public Aluno (int id, String nome, int idade, int matricula)
    {
        this.idAluno = id;
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public void imprimeInfo()
    {
        System.out.println("Nome do aluno: " + nome + "\nIdade: " + idade + "\nMatricula: " + matricula);
    }

    public void imprimeCurso()
    {
        if (curso == null)
        {
            System.out.println("Aluno sem curso");
        }
        else
        {
            System.out.println(curso);
        }
    }
}