package br.edu.unifil.lp1.consulta.modelo;

public class TestePorcentagem
{
    //
    public static void main (String args[]) {
        TestePorcentagem chefe = new TestePorcentagem ("Luiz", 8000, 500);
        Consulta[ ] equipe = new Consulta[3];
        equipe[0] = chefe;
        equipe[1] = new Empregado("Fatima", 5000);
        equipe[2] = new Empregado("Geraldo", 4000);
        for (int i = 0; i < equipe.length; i++) {
            System.out.println("nome =" + equipe[i].getNome( ) +", salario =" + equipe[i].getSalario( ) + " - " 
                + equipe[i].getClass().toString( ));
        }
    }
}
//Teste1asasad
