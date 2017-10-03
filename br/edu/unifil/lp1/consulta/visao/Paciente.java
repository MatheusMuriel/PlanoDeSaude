package br.edu.unifil.lp1.consulta.visao;

public class Paciente
{
    private int matricula;
    private String nome;
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
    public double getSalario()
    {
        return 0;
    }
    public void setSalario(double salario)
    {
        
    }
    public void setSituacao(char situacao){
        //this.situacao = situacao;
    }
    public char getSituacao(){
        //return situacao;
    }
    public int getId()
    {
       return 0;
    }
    public static int getProximoId()
    {
        //return proximoId;
    }
}
