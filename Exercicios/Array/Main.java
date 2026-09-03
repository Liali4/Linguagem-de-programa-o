


public class Main {
    
    public static void main (String[] args){
        // String[] alunos = {"Miranata", "Savalo", "Aeronauta"};
        // alunos[0] = "Mariazinha";
        // System.out.println("Qntde de alunos:" + alunos.length);

        // for(String estudante : alunos){
        //     System.out.println(estudante);



        // }

    //     //lista com 5 produtos usando foreach e for
    // //     String[] produtos = {"Pão", "leite", "acucar", "alface", "feijao", "azeite"};
    // //     for(String lista : produtos){
    // //    for(int i = 0; i<=4; i++){
    // //     System.out.println(produtos[i]);


    //    }

    //     }


    //5 numeros foreach para exibir se cada numero é positivo, neg, ou 0
    int[] numeros = {1, 20, -3, 0, 2};
    for(int item : numeros){
        if (item >0)
            System.out.println("o valor de " + item + " e positivo");
        if (item ==0)
              System.out.println("o valor de " + item + " e igual a zero");
        if (item <0)
                System.out.println("O valor de " + item + " e negativo");

        

      
        //     System.out.println(estudante);
    }
}
}