package br.com.treinaweb;

import br.com.treinaweb.classes.Atendimento;
import br.com.treinaweb.classes.Cliente;
import br.com.treinaweb.classes.Diarista;

public class App {
    public static void main(String[] args) {
        var diarista = new Diarista("Joao da Silva", "(11) 99877-7777", "Av Paulista, 1220", "123");

        System.out.println("Nome: " + diarista.getNome());
        System.out.println("Telefone: " + diarista.getTelefone());
        System.out.println("Endereco: " + diarista.getEndereco());
        System.out.println("Chave Pix: " + diarista.getChavePix());
        System.out.println("Saldo: " + diarista.getSaldo());
        diarista.depositar(100);
        System.out.println("Saldo: " + diarista.getSaldo());
        diarista.sacar(50);
        System.out.println("Saldo: " + diarista.getSaldo());
        diarista.atender("Neymar");

        var cliente = new Cliente("Maria da Silva", "(11) 99877-7777", "Av Paulista, 1221");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Endereco: " + cliente.getEndereco());
        System.out.println("Saldo: " + cliente.getSaldo());
        cliente.depositar(100);
        System.out.println("Saldo: " + cliente.getSaldo());
        cliente.sacar(50);
        System.out.println("Saldo: " + cliente.getSaldo());

        var atendimento = new Atendimento();
        atendimento.setHoras(6);
        System.out.println(atendimento.getHoras());

        var cliente2 = new Cliente("Nome Teste", "2767326", "ABC");
        var diarista2 = new Diarista("Nome Teste", "273672", "DEF", "123");

        cliente2.depositar(100);
        cliente2.transferir(diarista2, 50);

        System.out.println(cliente2.getSaldo());
        System.out.println(diarista2.getSaldo());

        diarista2.transferir(cliente2, 20);

        System.out.println(cliente2.getSaldo());
        System.out.println(diarista2.getSaldo());

        System.out.println(cliente);
        System.out.println(diarista);

        var diarista3 = new Diarista("Nome Teste", "123", "ABC", "123");
        var diarista4 = new Diarista("Nome Teste", "123", "ABC", "123");

        System.out.println(diarista3.equals(diarista4));

        var atendimento2 = new Atendimento();
        atendimento2.setData("01/02/2025");
        atendimento2.setHoras(10);
        atendimento2.setCliente(cliente);
        atendimento2.setDiarista(diarista);

        System.out.println(atendimento2.getData());
        System.out.println(atendimento2.getHoras());
        System.out.println(atendimento2.getCliente().getNome());
        System.out.println(atendimento2.getDiarista().getNome());
    }
}