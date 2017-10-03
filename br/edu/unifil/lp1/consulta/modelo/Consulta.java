package br.edu.unifil.lp1.consulta.modelo;

public class Consulta
{
    protected String nomeDoPaciente;
    protected int matricula;
    protected int numeroDeDependentes;
    protected int anoDeInclusaoNoPlano;
    protected float valorDaConsulta;
    
    
    public String getNomeDoPaciente ()
    {
       return nomeDoPaciente;
    }
    
    public void setNomeDoPaciente (String NomeDoPaciente)
    {
        this.nomeDoPaciente = NomeDoPaciente;
    }
    
    public int getMatricula ()
    {
       return matricula;
    }
    
    public void setMatricula (int Matricula)
    {
        this.matricula = Matricula;
    }
    
     public int getNumeroDeDependentes ()
    {
       return numeroDeDependentes;
    }
    
    public void setNumeroDeDependetes (int NumeroDeDependentes)
    {
        this.numeroDeDependentes = NumeroDeDependentes; 
    }
    
    public int getAnoDeInclusaoNoPlano ()
    {
        return anoDeInclusaoNoPlano;
    }
    
    public void setAnoDeInclusaoNoPlano (int AnoDeInclusaoNoPlano)
    {
        this.anoDeInclusaoNoPlano = AnoDeInclusaoNoPlano;
    }
    
    public float getValorDaConsulta ()
    {
        return valorDaConsulta;
    }
    
    public void setValorDaConsulta (float ValorDaConsulta)
    {
        this.valorDaConsulta = ValorDaConsulta;
    }
}
