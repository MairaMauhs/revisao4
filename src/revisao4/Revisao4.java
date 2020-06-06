package revisao4;

import java.util.Scanner;

/**
 *
 * @author AliraMaria
 */
public class Revisao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Elabore um algoritmo que calcule
        // o que deve ser pago por um produto, 
        //considerando o preço normal de etiqueta 
        //e a escolha da condição de pagamento. 
        //Utilize os códigos da tabela a seguir 
        //para ler qual a condição de pagamento 
        //escolhida e efetuar o cálculo adequado.
        //Código Condição de pagamento - Código: 
        //1 -> À vista em dinheiro ou cheque, 
        //recebe 10% de desconto;-Código: 2 -> 
        //À vista no cartão de crédito, recebe 15%
        //de desconto; - Código: 3 -> Em duas vezes,
        //preço normal de etiqueta sem juros; - Código: 
        //4 -> Em duas vezes, preço normal de etiqueta 
        //mais juros de 10%.
        
        
        
        double preçoPri, preçoEt;
        String x;

        preçoPri = double.parseDouble(JoptionPane.showInputDialog("Preço do produto:"));

        if ( x == 1 ){
        preçoF = preçoPri * 0.85;
        PerçoPri= "Você tem direito a 10% de credito";

        }else if( x==2 ){
        preçoF = preçoPri * 0.90;
        preçoF= "Você tem direito a 15% de credito";

        }else if ( x==3 ) {
        preçoF= "o.O";
        
        }else if ( x==4 ) {
        preçoF = preçoPri * 1.10;
        preçoF= "vc tem direito a 30% de credito";

        } else{
        preçoF= 0;
        preçoF= "Erro";
        }
        JoptionPane.showMessageDialog(null, "Valor Total: R$  "+preçoF);

        }
        }
    }
    
}
