package br.edu.unifil.lp1.consulta.modelo;

public class ConsultaPrata extends Consulta
{
    public float getValorConsulta(){
        //Prata - 20%
        //this.valorDaConsulta = 654;
        float desconto = (super.valorDaConsulta * 20) /100;
        return super.valorDaConsulta - desconto;
    }
    
}
