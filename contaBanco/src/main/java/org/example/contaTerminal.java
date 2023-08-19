package org.example;

import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;
        Scanner input = new Scanner(System.in);


        System.out.println("Por favor, digite o número da Agência!");
        numero = input.nextInt();
        System.out.println("Por favor, digite a Agência!");
        agencia = input.next();
        input.nextLine();
        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = input.nextLine();
        System.out.println("Por favor, digite o saldo!");
        saldo = input.nextFloat();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}
