package br.com.treinaweb.classes;

public class Cliente extends Pessoa {

    public Cliente(String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
    }

    @Override
    public void depositar(double valor) {
        var saldoAtual = this.getSaldo();
        var novoSaldo = saldoAtual + valor + (valor * 0.1);
        this.setSaldo(novoSaldo);
    }

    @Override
    public void sacar(double valor) {
        var saldoAtual = this.getSaldo();
        var novoSaldo = saldoAtual - valor;
        this.setSaldo(novoSaldo);
    }

    @Override
    public String toString() {
        return "Cliente: " + this.getNome();
    }
    
}
