

public class Main {
    public static void main(String[] args){
        // String saudacao = "Hello world";
        // System.out.println(saudacao.length());
        // System.out.println(saudacao.toUpperCase());
        // System.out.println(saudacao.toLowerCase());
        // System.out.println(saudacao.indexOf("w"));
        // System.out.println(saudacao.charAt(6));

        //padrão snake_case
        String aluno_1 = "Miranata";
        String aluno_2 = "Aeronauta";
        System.out.println(aluno_1.equals(aluno_2)); //false

        String mensagem = " Hello world ";
        System.out.println("-" + mensagem.trim() + "-");

        String nome = "Savalo";
        String sobrenome = "Horse";
        System.out.println(nome + " " + sobrenome);

        String aluno_3 = "Miguelito Cunha Batecostela";
        System.out.println(aluno_3.contains("Cunha"));

        String aluno_4 = "cuscuz";
        System.out.println(aluno_4.isEmpty());

        String frutas = String.join("-", "Laranja", "Banana");
        System.out.println(frutas);

        String nome_completo = "Miguel Luis Batista";
        System.out.println(nome_completo.replace("M", "P"));

        String texto = "Boa noitada";
        System.out.println(texto.substring(4, 9));

        String frase = "Repetição com \"correção\" leva à \"perfeição\"";
        System.out.println(frase);
    }
    
}
