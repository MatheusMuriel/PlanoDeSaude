package br.edu.unifil.lp1.consulta.modelo;

public class ConsultaOuro extends Consulta
{
    public ConsultaOuro(String nomeDoPaciente,
    String matricula, int numeroDeDependentes, int anoDeInclusaoNoPlano, float valorDaConsulta, int planoPaciente){
        super.setNomeDoPaciente(nomeDoPaciente);
        super.setMatricula(matricula);
        super.setNumeroDeDependentes(numeroDeDependentes);
        super.setAnoDeInclusaoNoPlano(anoDeInclusaoNoPlano);
        super.setValorDaConsulta(valorDaConsulta);
    }

    public float getValorDaConsulta(){
        //Ouro - 30 se o anos de cadastro for menor ou igual a 2000
        if ( super.anoDeInclusaoNoPlano <= 2000 ){
            float desconto = (super.valorDaConsulta * 30) / 100;
            return super.valorDaConsulta - desconto;
        }else{
            //Retorna sem desconto
            return super.valorDaConsulta;
        }
    }

}
