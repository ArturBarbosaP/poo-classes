public class Main
{
    public static void main(String[] args)
    {
        Aluno a1 = new Aluno(1, "Aluno 1", 18, 100);
        Escola e1 = new Escola(1, "Escola 1", "Rua 1", "1111-1111");
        Faculdade f1 = new Faculdade(1, "Faculdade 1", "Rua 2", "2222-2222", "Sistemas de Informacao");

        a1.imprimeInfo();
        a1.imprimeCurso();

        e1.imprimeNome();
        e1.imprimeContato();

        f1.imprimeCursos();
        f1.imprimeNome();

    }
}