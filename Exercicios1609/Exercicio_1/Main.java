

public class Main {
    static void funcao(int valor){
        if(valor>0){
            System.out.println("O valor " + valor + " e maior que zero");
        }
        else if(valor==0){
            System.out.println("O valor " + valor + "  e igual a zero");
        }
        else if(valor<0){
            System.out.println("O valor " + valor + "  e menor que zero");
        }
    }
    public static void main(String[]args){
    funcao(-2);

    }
}
