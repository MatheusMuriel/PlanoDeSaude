package br.edu.unifil.lp1.consulta.modelo;


public class ConsultaDiamante extends Consulta
{
    public ConsultaDiamante(String nomeDoPaciente,
                int matricula, int numeroDeDependentes, int anoDeInclusaoNoPlano, float valorDaConsulta, int planoPaciente){
        super.setNomeDoPaciente(nomeDoPaciente);
        super.setMatricula(matricula);
        super.setNumeroDeDependentes(numeroDeDependentes);
        super.setAnoDeInclusaoNoPlano(anoDeInclusaoNoPlano);
        super.setValorDaConsulta(valorDaConsulta);
        
        
    }
    
    public float getValorConsulta(){
        //Diamante - 40%
        //this.valorDaConsulta = 654;
        float desconto = (super.valorDaConsulta * 40) /100;
        return super.valorDaConsulta - desconto;
    }
}
