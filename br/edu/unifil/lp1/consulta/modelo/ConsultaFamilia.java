package br.edu.unifil.lp1.consulta.modelo;

public class ConsultaFamilia extends Consulta
{
    //
    public float getValorConsulta(){
        //Familia - 50 % se o número de dependentes for > 2
        this.valorDaConsulta = 654;
        this.numeroDeDependentes = 3;
        if ( super.numeroDeDependentes > 2 ){
          float desconto = (super.valorDaConsulta * 50) / 100;
            return super.valorDaConsulta - desconto;
        }else{
            //Retorna sem desconto
            return super.valorDaConsulta;
        }
    }
}
