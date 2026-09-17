
public class Main {
    static void alunoNota(String aluno, double nota){
        if(nota>=7){
            System.out.println(aluno + " Aprovado");
        }
        else{
            System.out.println(aluno + " Reprovado");
        }

    }
    public static void main(String[]args){
        alunoNota("Renato", 8);
    }
    
}
