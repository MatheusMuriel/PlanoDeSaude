package br.edu.unifil.lp1.consulta.visao;
import java.util.Scanner;
public class SistemaDaClinica
{
    public static void main(String args[]){
        CadastroDeConsulta CdC = new CadastroDeConsulta();
        Scanner teclado = new Scanner(System.in);
        String nomeDoPaciente;
        int matricula;
        int numeroDeDependentes;
        int anoDeInclusaoNoPlano;
        float valorDaConsulta;
        int opcao = 0;
        
        while(opcao != 10){
            //Agendar uma consulta
            //Deve ser criado se informado os dados do paciente
            System.out.println("\n");
            System.out.println("1- Nova consulta"); //Antes disso cadastrar paciente
            
            opcao = teclado.nextInt();
            switch(opcao){
                case 1 : System.out.print("Nome do paciente: ");
                            nomeDoPaciente = teclado.next();
                         System.out.print("Matricula: ");
                            matricula = teclado.nextInt();
                         System.out.print("Numero de Dependentes: ");
                            numeroDeDependentes = teclado.nextInt();
            }
        }
    }
}
