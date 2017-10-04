package br.edu.unifil.lp1.consulta.visao;
import br.edu.unifil.lp1.consulta.modelo.*; //importa tudo que esta na modelo

public class CadastroDeConsulta
{
    public CadastroDeConsulta(){
        //Fazendo um Array de tamanho 10 com o nome "listaConsultas"
        CadastroDeConsulta[] listaConsultas;
        listaConsultas = new CadastroDeConsulta[10];
        
    }
    // Fazer um Metodo para incluir uma nova Consulta na array
    protected void incluirConsulta(String nomeDoPaciente,
    int matricula, int numeroDeDependentes, int anoDeInclusaoNoPlano, float valorDaConsulta, int planoPaciente){
        //Vai ser pedido na Classe Main
        switch (planoPaciente){
            case 1 : 
                ConsultaDiamante diamante = new ConsultaDiamante(nomeDoPaciente,
                    matricula, numeroDeDependentes, anoDeInclusaoNoPlano, valorDaConsulta);
            case 2 : 
                ConsultaOuro ouro = new ConsultaDiamante(nomeDoPaciente,
                    matricula, numeroDeDependentes, anoDeInclusaoNoPlano, valorDaConsulta);
            case 3 : 
                ConsultaDiamante diamante = new ConsultaDiamante(nomeDoPaciente,
                    matricula, numeroDeDependentes, anoDeInclusaoNoPlano, valorDaConsulta);
            case 4 : 
                ConsultaDiamante diamante = new ConsultaDiamante(nomeDoPaciente,
                    matricula, numeroDeDependentes, anoDeInclusaoNoPlano, valorDaConsulta);
        }
        //1 -Diamante
        //2 -Ouro
        //3 -Prata
        //4 -Familia
        
        //fazer referencia a uma clase para consultar paciente
        //Empregado emp = new Empregado(nome,salario);
        //listEmp.add(emp);

    }
}
