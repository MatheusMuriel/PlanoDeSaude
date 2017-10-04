package br.edu.unifil.lp1.consulta.modelo;

public class ConsultaPrata extends Consulta
{
    public ConsultaPrata(String nomeDoPaciente,
                int matricula, int numeroDeDependentes, int anoDeInclusaoNoPlano, float valorDaConsulta){
        super.setNomeDoPaciente(nomeDoPaciente);
        super.setMatricula(matricula);
        super.setNumeroDeDependentes(numeroDeDependentes);
        super.setAnoDeInclusaoNoPlano(anoDeInclusaoNoPlano);
        super.setValorDaConsulta(valorDaConsulta);
    }
    
    public float getValorConsulta(){
        //Prata - 20%
        //this.valorDaConsulta = 654;
        float desconto = (super.valorDaConsulta * 20) /100;
        return super.valorDaConsulta - desconto;
    }
    
}
