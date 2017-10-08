package br.edu.unifil.lp1.consulta.visao;

import br.edu.unifil.lp1.consulta.controle.*;
import java.util.Scanner;
public class SistemaDaClinica
{
    public static void main(String args[]){
        CadastroDeConsultas CdC = new CadastroDeConsultas();
        Scanner teclado = new Scanner(System.in);
        String nomeDoPaciente;
        int matricula;
        int numeroDeDependentes;
        int anoDeInclusaoNoPlano;
        float valorDaConsulta;
        int planoPaciente;
        int opcao = 0;

        while(opcao != 10){
            //Agendar uma consulta
            //Deve ser criado se informado os dados do paciente
            System.out.println("\n");
            System.out.println("1- Nova consulta"); //Antes disso cadastrar paciente
            System.out.println("2- Consultas cadastradas por plano");
            System.out.println("3- Total de consultas por plano");
            System.out.println("4- Total de renda por plano");
            System.out.println("9- Fim");
            opcao = teclado.nextInt();
            switch(opcao){
                case 1 :
                    System.out.print("Nome do paciente: ");
                                nomeDoPaciente = teclado.next();
                    System.out.print("Matricula: ");
                                matricula = teclado.nextInt();
                    System.out.print("Numero de Dependentes: ");
                                numeroDeDependentes = teclado.nextInt();
                    System.out.print("Ano de inclusão no Plano: ");
                                anoDeInclusaoNoPlano = teclado.nextInt();
                    System.out.print("Valor da Consulta: ");
                                valorDaConsulta = teclado.nextFloat();
                    System.out.print("Digite o numero do plano: \n");
                                System.out.println("1- Plano Diamante");
                                System.out.println("2- Plano Ouro");
                                System.out.println("3- Plano Prata");
                                System.out.println("4- Plano Familia");
                    planoPaciente = teclado.nextInt();
                    CdC.incluirConsulta(nomeDoPaciente, matricula, numeroDeDependentes,
                                    anoDeInclusaoNoPlano, valorDaConsulta, planoPaciente);
                    break;
                case 2 :
                    System.out.print("Digite o numero do plano: \n");
                                System.out.println("1- Plano Diamante");
                                System.out.println("2- Plano Ouro");
                                System.out.println("3- Plano Prata");
                                System.out.println("4- Plano Familia");
                    planoPaciente = teclado.nextInt();
                     CdC.consultasPorPlano(planoPaciente);
                    break;
                case 3 :
                    System.out.print("Digite o numero do plano: \n");
                                System.out.println("1- Plano Diamante");
                                System.out.println("2- Plano Ouro");
                                System.out.println("3- Plano Prata");
                                System.out.println("4- Plano Familia");
                    planoPaciente = teclado.nextInt();
                    break;
                case 4 :
                    System.out.print("Digite o numero do plano: \n");
                                System.out.println("1- Plano Diamante");
                                System.out.println("2- Plano Ouro");
                                System.out.println("3- Plano Prata");
                                System.out.println("4- Plano Familia");
                    planoPaciente = teclado.nextInt();
                    break;
            }
        }
    }
}
