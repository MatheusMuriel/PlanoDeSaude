package br.edu.unifil.lp1.consulta.controle;
import br.edu.unifil.lp1.consulta.modelo.*; //importa tudo que esta na modelo

public class CadastroDeConsultas
{
    private Consulta[] listaConsultas = new Consulta[10];
    //private Consulta listaConsultas[];//Array do tipo Consulta
    private int numConsulta = 0; //vai fazer a contagem para indexar as consultas

    public void incluirConsulta(String nomeDoPaciente,
    int matricula, int numeroDeDependentes, int anoDeInclusaoNoPlano, float valorDaConsulta, int planoPaciente){
        //
        Consulta cnt = null;
        if(planoPaciente == 1){
            //Diamante
            cnt = new ConsultaDiamante(nomeDoPaciente, matricula, numeroDeDependentes,
                anoDeInclusaoNoPlano, valorDaConsulta, planoPaciente);                      
            //this.listaConsultas[ numConsulta ] = cnt;
        }else if(planoPaciente == 2){
            //Ouro
            cnt = new ConsultaOuro(nomeDoPaciente, matricula, numeroDeDependentes,
                anoDeInclusaoNoPlano, valorDaConsulta, planoPaciente);
        }else if(planoPaciente == 3){
            //Prata
            cnt = new ConsultaPrata(nomeDoPaciente, matricula, numeroDeDependentes,
                anoDeInclusaoNoPlano, valorDaConsulta, planoPaciente);
        }else if(planoPaciente == 4){
            //Familia
            cnt = new ConsultaFamilia(nomeDoPaciente, matricula, numeroDeDependentes,
                anoDeInclusaoNoPlano, valorDaConsulta, planoPaciente);
        }
        cnt.setNomeDoPaciente(nomeDoPaciente);
        cnt.setMatricula(matricula); 
        cnt.setNumeroDeDependentes(numeroDeDependentes);
        cnt.setAnoDeInclusaoNoPlano(anoDeInclusaoNoPlano);
        cnt.setValorDaConsulta(valorDaConsulta);
        cnt.setPlanoPaciente(planoPaciente);

        System.out.print("Nome: " + cnt.getNomeDoPaciente() 
            + "\n" + "Matricula: " + cnt.getMatricula() 
            + "\n" + "Nº de Dependentes: " + cnt.getNumeroDeDependentes()
            + "\n" + "Ano do Plano: " + cnt.getAnoDeInclusaoNoPlano() 
            + "\n" + "Valor da Consulta: " + cnt.getValorDaConsulta());
        listaConsultas[ numConsulta++ ] = cnt;
    }

    public void consultasPorPlano(int planoPaciente){
        for (int i = 0; i < listaConsultas.length; i++){

            /**
             *
             *System.out.println("nome = " + listaConsultas[i].getNomeDoPaciente( ) + ", matricula: "  +
             *listaConsultas[i].getMatricula( ));
             *O tipo declarado de equipe[0]é Empregado, e o método setBonus
             *  não é um método da classe Empregado
             */
        }
    }   
}
