package br.edu.unifil.lp1.consulta.visao;

public class Paciente
{
    private String nome;
    private int matricula;
    private int dependentes;
    private int anoDeInclusao;
    private static int proximaMatricula = 1;

    public Paciente(String nome, double salario)
    {
        this.matricula = proximaMatricula;
        this.nome = nome;
        this.dependentes = dependentes;
        this.anoDeInclusao = anoDeInclusao;
        proximaMatricula++;
    }
    public String getNome()
    {
        return nome;
    }
    public int getMatricula()
    {
       return matricula;
    }
    public int getNumeroDependente()
    {
        return dependentes;
    }
    public int getAnoDeInclusao()
    {
        return anoDeInclusao;
    }
    
    public static int getProximaMatricula()
    {
        return proximaMatricula;
    }
}
