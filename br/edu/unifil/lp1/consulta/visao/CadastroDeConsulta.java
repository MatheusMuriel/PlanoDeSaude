package br.edu.unifil.lp1.consulta.visao;
import br.edu.unifil.lp1.consulta.modelo.*; //importa tudo que esta na modelo

public class CadastroDeConsulta
{
    
    public CadastroDeConsulta(){
        //Fazendo um Array de tamanho 10 com o nome "listaConsultas"
        CadastroDeConsulta[] listaConsultas;
        listaConsultas = new CadastroDeConsulta[10];
        
    }
    
    protected void incluirConsulta(String nomeDoPaciente,
    int matricula, int numeroDeDependentes, int anoDeInclusaoNoPlano, float valorDaConsulta, int planoPaciente){
        switch (planoPaciente){
            case 1 : 
                ConsultaDiamante diamante = new ConsultaDiamante(nomeDoPaciente,
                    matricula, numeroDeDependentes, anoDeInclusaoNoPlano, valorDaConsulta);
            case 2 : 
                ConsultaOuro ouro = new ConsultaOuro(nomeDoPaciente,
                    matricula, numeroDeDependentes, anoDeInclusaoNoPlano, valorDaConsulta);
            case 3 : 
                ConsultaPrata prata = new ConsultaPrata(nomeDoPaciente,
                    matricula, numeroDeDependentes, anoDeInclusaoNoPlano, valorDaConsulta);
            case 4 : 
                ConsultaFamilia familia = new ConsultaFamilia(nomeDoPaciente,
                    matricula, numeroDeDependentes, anoDeInclusaoNoPlano, valorDaConsulta);
        }

        //Empregado emp = new Empregado(nome,salario);
        //listEmp.add(emp);

    }
}
