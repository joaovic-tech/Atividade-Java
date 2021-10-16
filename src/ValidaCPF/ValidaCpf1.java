/*
 * To change this license header, choose License Headers in Project Properties. o CPF é um numero formado por 11 digitos
 * To change this template file, choose Tools | Templates                       e os ultimos dois numeros são chamos de DV
 * and open the template in the editor.                                         e é esse DV que usamos para validar o CPF
 */                                                                        //   e para validar o CPF precissamos calcular esses DV
package ValidaCPF;

import java.util.Scanner;                                                       // aqui é as importações
import java.util.InputMismatchException;
public class ValidaCpf1 {

        
    public static boolean isCPF(String CPF) {                                   // identifica se o numero é negativo ou seja aqui
        // considera-se erro CPF's formados por uma sequencia de numeros iguais     aqui ele possui um if com o metodo equals 
        if (CPF.equals("00000000000") ||                                        // que é utilizado para comparaçoes
            CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
            (CPF.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

                                                                                // "try" - protege o codigo para eventuais erros de 
        try {                                                                   // conversao de tipo (int)
            
        // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {                                               // esse é o primeiro calculo do DV que está dentro
        // converte o i-esimo caractere do CPF em um numero:                        do for
        // por exemplo, transforma o caractere '0' no inteiro 0                 esse calculo vai possuir um peso de 10
        // (48 eh a posicao de '0' na tabela ASCII)                             que é usado para calcular
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';                                                    // e dentro desse if 
            else dig10 = (char)(r + 48);                                        // ele vai converte o caractere numerico

        // Calculo do 2o. Digito Verificador                                    aqui já é o segundo calculo 
                                                                                // quase a mesma coisa do primeiro calculo
            sm = 0;                                                             // porem tem o peso de 11
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
             peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);

        // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
                 return(true);
            else return(false);
                } catch (InputMismatchException erro) {
                return(false);
            }
        }

        public static String imprimeCPF(String CPF) {
            return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
            CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
        }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                                    // deixa eu já rodar o programa
        
         Scanner ler = new Scanner(System.in);                                  // e aqui em baixo nós vamos colocar os numeros do
                                                                                // do cpf 
            String CPF;

            System.out.printf("Informe um CPF: ");
            CPF = ler.next();

            System.out.printf("\nResultado: ");
                // usando os metodos isCPF() e imprimeCPF() da classe "ValidaCpf1"
            if (ValidaCpf1.isCPF(CPF) == true){
                System.out.printf("%s\n", ValidaCpf1.imprimeCPF(CPF));
                System.out.println("O CPF é Valido...");          
               
            }else {
                System.out.printf("Erro, CPF invalido !!!\n");
                System.out.println("O CPF não Valido...");
           
            }
          }
    }