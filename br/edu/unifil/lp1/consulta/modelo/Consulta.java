package br.edu.unifil.lp1.consulta.modelo;

public class Consulta
{
    protected String    nomeDoPaciente;
    protected int       matricula; //Professor fez string
    protected int       numeroDeDependentes;
    protected int       anoDeInclusaoNoPlano;
    protected float     valorDaConsulta;
    protected int       planoPaciente;
    
    public String getNomeDoPaciente ()
    {
        return nomeDoPaciente;
    }

    public void setNomeDoPaciente (String nomeDoPaciente)
    {
        this.nomeDoPaciente = nomeDoPaciente;
    }

    public int getMatricula ()
    {
        return matricula;
    }

    public void setMatricula (int matricula)
    {
        this.matricula = matricula;
    }

    public int getNumeroDeDependentes ()
    {
        return numeroDeDependentes;
    }

    public void setNumeroDeDependentes (int numeroDeDependentes)
    {
        this.numeroDeDependentes = numeroDeDependentes; 
    }

    public int getAnoDeInclusaoNoPlano ()
    {
        return anoDeInclusaoNoPlano;
    }

    public void setAnoDeInclusaoNoPlano (int anoDeInclusaoNoPlano)
    {
        this.anoDeInclusaoNoPlano = anoDeInclusaoNoPlano;
    }

    public float getValorDaConsulta ()
    {
        return valorDaConsulta;
    }

    public void setValorDaConsulta (float valorDaConsulta)
    {
        this.valorDaConsulta = valorDaConsulta;
    }

    public int getPlanoPaciente ()
    {
        return planoPaciente;
    }
    
    public void setPlanoPaciente (int planoPaciente)
    {
        this.planoPaciente = planoPaciente;
    }
}
