
// public class Main {
//     static void parametro(String nome, int idade){
//         System.out.println(nome + " possui " + idade + " anos");
//     }
//     public static void main(String[]args){

//     parametro("Julia",  15);
//     }
    
// }

//return
public class Main {
    static boolean ligarInterruptor(){//muda o void
        if(passarEletricidade() == true){
            if(acenderLampada() == true){
                System.out.println("Lampada acendeu!");
                return true;
            }else{
                    System.out.println("Lampada queimou!");
                    return false;
                }
            }else{
                System.out.println("Problema no circuito");
                return false;
            }

        }
            
        
    
static boolean passarEletricidade(){
    return true;
}
    static boolean acenderLampada(){
        return true;
    }
    public static void main(String[]args){
        if(ligarInterruptor()== true){
            System.out.println("processo funcionou");}
            else{
                System.out.println("Processo falhou!");
            }
        }

   
    
    }
    

