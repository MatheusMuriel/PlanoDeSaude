/**
 * 



package br.edu.unifil.lp1.consulta.visao;
import br.edu.unifil.lp1.consulta.modelo.*; //importa tudo que esta na modelo

public class CadastroDeConsulta
{
    
    public CadastroDeConsulta(){
        //Fazendo um Array de tamanho 10 com o nome "listaConsultas"
        //CadastroDeConsulta[] listaConsultas;
        //listaConsultas = new CadastroDeConsulta[10];
        
        CadastroDeConsulta[] listaConsultas = new CadastroDeConsulta[10];
    }
    
    protected void incluirConsulta(String nomeDoPaciente,
    int matricula, int numeroDeDependentes, int anoDeInclusaoNoPlano, float valorDaConsulta, int planoPaciente){
        
        if (planoPaciente == 1){
            ConsultaDiamante cnt = new ConsultaDiamante(nomeDoPaciente,
                    matricula, numeroDeDependentes, anoDeInclusaoNoPlano, valorDaConsulta);
            listaConsultas.add(cnt);
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
        
        //Empregado emp = new Empregado(nome,salario);
        //listEmp.add(emp);

    }
}

*/
