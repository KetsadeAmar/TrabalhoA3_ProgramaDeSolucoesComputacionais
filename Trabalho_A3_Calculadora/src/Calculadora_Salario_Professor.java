
import java.util.Scanner;

public class Calculadora_Salario_Professor {
    public static void main(String[] args) throws Exception {
        
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Olá, informe o nome do professor: " );
        String nome = teclado.nextLine();

        
        System.out.println("Informe se você é CLT, Horista ou PJ: " );
        String RegimePag = teclado.nextLine();
        

        if (RegimePag.equalsIgnoreCase  ("CLT")){
            System.out.println("Informe salário mensal: " );
            double SalarioMensal = teclado.nextDouble();
            System.out.println(nome + ", O valor do seu salário é de R$" + SalarioMensal);

        } else if (RegimePag.equalsIgnoreCase ("Horista")){
            System.out.println("Informe número de horas trabalhadas: " );
            double HorasTrabalhadas = teclado.nextDouble();
            System.out.println("Informe o valor da hora trabalhada: " );
            double ValorHora = teclado.nextDouble();
            double SalarioFinal = HorasTrabalhadas * ValorHora;
            System.out.println(nome + ", o valor do seu salário é de R$" + SalarioFinal);
            

        }else if (RegimePag.equalsIgnoreCase ("PJ")){
            System.out.println("Informe o valor do contrato: " );
            double ValorContrato = teclado.nextDouble();
            System.out.println(nome + ", o valor do seu contrato é de R$" + ValorContrato);

        }else{
            System.out.println("Regime de pagamento incorreto");

        }
        teclado.close();
        
       
       
    }
}
