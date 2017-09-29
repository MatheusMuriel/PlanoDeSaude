package br.edu.unifil.lp1.consulta.modelo;


public class ConsultaDiamante extends Consulta
{
    public float getValorConsulta(){
        //Diamante - 40%
        //this.valorDaConsulta = 654;
        float desconto = (super.valorDaConsulta * 40) /100;
        return super.valorDaConsulta - desconto;
    }
}
