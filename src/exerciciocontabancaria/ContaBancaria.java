/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciocontabancaria;

/**
 *
 * @author aluno
 */
public class ContaBancaria {
    private String banco;
    private String agencia;
    private String conta;
    private String tipo;
    private double valorSaldo;
    private double valorLimite;

    public ContaBancaria() {
    }

    public ContaBancaria(String banco, String agencia, String conta, String tipo) {
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.tipo = tipo;
    }
     
    public ContaBancaria(String banco, String agencia, String conta, String tipo, double valorSaldo, double valorLimite) {
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.tipo = tipo;
        this.valorSaldo = valorSaldo;
        this.valorLimite = valorLimite;
    }
    
    public double depositar(double valor){
        return (valor + valorSaldo);
    }
    
    public boolean sacar(double valor){
        if(valor<=(valorSaldo+valorLimite)){
            valorSaldo = valorSaldo - valor;
           return true;
        }else{
            return false;
        }
    }
    
    public double verSaldo(){
        return valorSaldo + valorLimite;
    }
    
    public String verExtrato(){
        return "Banco: "+banco+"\nAg: "+agencia+"\nCC: "+conta+"\nTipo: "+tipo+"\nSaldo: "+
                valorSaldo+"\nLimite: "+valorLimite+"\nSaldo Total: "+verSaldo();
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorSaldo() {
        return valorSaldo;
    }

    public void setValorSaldo(double valorSaldo) {
        this.valorSaldo = valorSaldo;
    }

    public double getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(double valorLimite) {
        this.valorLimite = valorLimite;
    }   
}
