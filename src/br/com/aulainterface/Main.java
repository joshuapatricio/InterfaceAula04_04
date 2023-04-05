package br.com.aulainterface;

public class Main {
    public static void main(String[]args) {
        Funcionario f = new Funcionario();
        f.setNome("Maria");
        f.setCPF("123");
        f.setComissao(100);
        f.setSalario(400);
        System.out.println(f.getPagamento());
    }
}
