package br.edu.unifil.lp1.consulta.modelo;

public class ConsultaFamilia extends Consulta
{
    public ConsultaFamilia(String nomeDoPaciente,
                int matricula, int numeroDeDependentes, int anoDeInclusaoNoPlano, float valorDaConsulta, int planoPaciente){
        super.setNomeDoPaciente(nomeDoPaciente);
        super.setMatricula(matricula);
        super.setNumeroDeDependentes(numeroDeDependentes);
        super.setAnoDeInclusaoNoPlano(anoDeInclusaoNoPlano);
        super.setValorDaConsulta(valorDaConsulta);
    }
    
    public float getValorConsulta(){
        //Familia - 50 % se o número de dependentes for > 2
        if ( super.numeroDeDependentes > 2 ){
          float desconto = (valorDaConsulta * 50) / 100;
            return valorDaConsulta - desconto;
        }else{
            //Retorna sem desconto
            return valorDaConsulta;
        }
    }
}
