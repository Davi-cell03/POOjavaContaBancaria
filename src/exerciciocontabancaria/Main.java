
package exerciciocontabancaria;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        ArrayList<ContaBancaria> listaContaBancaria = new ArrayList<>();
        Object[] arrayvinculo = {"Salario", "Poupança"};
        ContaBancaria contaBancaria;
        String banco,agencia,conta,tipo,contaDesejada;
        double valorSaldo,valorLimite,valor;
        int opc=0;
        
        while(opc!=6){
            opc= Integer.parseInt(JOptionPane.showInputDialog("1-Abrir nova conta \n2-Sacar \n3-Depositar \n4-Extrato \n5-Aumentar Limite \n6-Sair"));
            
            switch(opc){
                case 1: 
                    banco = JOptionPane.showInputDialog("Banco");                    
                    agencia = JOptionPane.showInputDialog("agencia");
                    conta = JOptionPane.showInputDialog("conta");
                    tipo = JOptionPane.showInputDialog(null,"Selecione o tipo de conta","Selecione",JOptionPane.INFORMATION_MESSAGE,null,arrayvinculo,arrayvinculo[0]).toString();
                    valorSaldo = Double.parseDouble(JOptionPane.showInputDialog("Valor do saldo"));
                    valorLimite = Double.parseDouble(JOptionPane.showInputDialog("Valor do limite"));
                    listaContaBancaria.add(new ContaBancaria(banco,agencia,conta,tipo,valorSaldo,valorLimite));
                    break;
                case 2:
                    contaDesejada = JOptionPane.showInputDialog("Qual conta deseja sacar?");
                    
                    boolean encontrou = false;
                    for(ContaBancaria c : listaContaBancaria){
                        if(c.getConta().equals(contaDesejada)){
                            encontrou = true;
                            valor = Double.parseDouble(JOptionPane.showInputDialog("Valor a ser sacado"));
                            c.sacar(valor);
                        }                        
                    }
                    if(encontrou == false){
                            JOptionPane.showMessageDialog(null, "Nenhum funcionario encontrado");
                        }
                    break;
                case 3:
                    contaDesejada = JOptionPane.showInputDialog("Qual conta deseja Depositar?");
                    
                    encontrou = false;
                    for(ContaBancaria c : listaContaBancaria){
                        if(c.getConta().equals(contaDesejada)){
                            encontrou = true;
                            valor = Double.parseDouble(JOptionPane.showInputDialog("Valor a ser Depositado"));
                            c.depositar(valor);
                        }                        
                    }
                    if(encontrou == false){
                            JOptionPane.showMessageDialog(null, "Nenhum funcionario encontrado");
                        }
                    break;
                case 4: 
                    contaDesejada = JOptionPane.showInputDialog("Qual conta deseja ver o extrato"); 
                    encontrou = false;
                    for(ContaBancaria c : listaContaBancaria){
                        if(c.getConta().equals(contaDesejada)){
                            encontrou = true;
                            JOptionPane.showMessageDialog(null, c.verExtrato());
                        }
                    }
                    if(encontrou == false){
                            JOptionPane.showMessageDialog(null, "Nenhuma conta encontrada");
                        }
                    break;
                case 5:
                    contaDesejada = JOptionPane.showInputDialog("Qual conta deseja Depositar?");
                    
                    encontrou = false;
                    for(ContaBancaria c : listaContaBancaria){
                        if(c.getConta().equals(contaDesejada)){
                            encontrou = true;
                            valorLimite = Double.parseDouble(JOptionPane.showInputDialog("Qual o novo limite?"));
                            c.setValorLimite(valorLimite);
                        }                        
                    }
                    if(encontrou == false){
                            JOptionPane.showMessageDialog(null, "Nenhum funcionario encontrado");
                        }
                    break;
            }
        }
    }
    
}
