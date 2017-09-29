package br.edu.unifil.lp1.consulta.modelo;

public class ConsultaOuro extends Consulta
{
  public float getValorConsulta(){
        //Ouro - 30 se o anos de cadastro for menor ou igual a 2000
        this.valorDaConsulta      =  654;
        this.anoDeInclusaoNoPlano = 2000;
        if ( super.anoDeInclusaoNoPlano <= 2000 ){
            float desconto = (super.valorDaConsulta * 30) / 100;
            return super.valorDaConsulta - desconto;
        }else{
            //Retorna sem desconto
            return super.valorDaConsulta;
        }
    }

}
