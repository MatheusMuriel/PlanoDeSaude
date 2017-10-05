package br.edu.unifil.lp1.consulta.controle;
import br.edu.unifil.lp1.consulta.modelo.*; //importa tudo que esta na modelo

public class CadastroDeConsultas
{  
    //CadastroDeConsultas[] listaConsultas = new CadastroDeConsultas[10];
    private Consulta listaConsultas[];//Array do tipo Consulta
    private int nunConsultas = 0; //vai fazer indexar as consultas

    public void incluirConsulta(String nomeDoPaciente,
    int matricula, int numeroDeDependentes, int anoDeInclusaoNoPlano, float valorDaConsulta, int planoPaciente){
        listaConsultas = new Consulta[10];
        Consulta cnt = new Consulta (nomeDoPaciente,
                matricula, numeroDeDependentes, anoDeInclusaoNoPlano, valorDaConsulta, planoPaciente);

        this.listaConsultas[nunConsultas] = cnt;
        nunConsultas++;
    }

    public void consultasPorPlano(int planoPaciente){

        for (int i = 0; i < listaConsultas.length; i++){
            System.out.println("nome = " + listaConsultas[i].getNomeDoPaciente( ) + ", matricula: "  + 
                listaConsultas[i].getMatricula( ));
        }
    }
}

