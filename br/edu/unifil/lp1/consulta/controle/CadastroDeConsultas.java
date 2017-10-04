package br.edu.unifil.lp1.consulta.controle;
import br.edu.unifil.lp1.consulta.modelo.*; //importa tudo que esta na modelo

public class CadastroDeConsultas
{  
    CadastroDeConsultas[] listaConsultas = new CadastroDeConsultas[10];
    public void incluirConsulta(String nomeDoPaciente,
    int matricula, int numeroDeDependentes, int anoDeInclusaoNoPlano, float valorDaConsulta, int planoPaciente){
        //
        if (planoPaciente == 1){
            //Diamante //Diamante - 40%
            ConsultaDiamante cntD = new ConsultaDiamante (nomeDoPaciente,
                    matricula, numeroDeDependentes, anoDeInclusaoNoPlano, valorDaConsulta, planoPaciente);    
            for (int i = 0; i < this.listaConsultas.length; i++) {
              if (this.listaConsultas[i] == null) {
                //this.listaConsultas[i] = 
     
                System.out.println("Consulta: " + listaConsultas[i]);
                break;
              }
            }
        }
        if (planoPaciente == 2){
            ConsultaOuro cnt = new ConsultaOuro(nomeDoPaciente,
                    matricula, numeroDeDependentes, anoDeInclusaoNoPlano, valorDaConsulta);
        }
        if (planoPaciente == 3){
            ConsultaPrata cnt = new ConsultaPrata(nomeDoPaciente,
                    matricula, numeroDeDependentes, anoDeInclusaoNoPlano, valorDaConsulta);
        }
        if (planoPaciente == 4){
            ConsultaFamilia cnt = new ConsultaFamilia(nomeDoPaciente,
                    matricula, numeroDeDependentes, anoDeInclusaoNoPlano, valorDaConsulta);
        }
    }
    
    protected void consultasPorPlano(){
        Consulta auxCnt;
        for (int i = 0; i < listaConsultas.length; i++){
            
        }
    }
}

