import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String titular = "Maurilio Gonçalves Arantes";
        String tipoConta = "Conta Corrente";
        double saldoConta = 0;
        double valor = 0;
        int operacao = 0;

        System.out.println("""
                ------------------------------------------------------
                Bem vindo ao seu sistema de Conta Bancária!
                
                Dados iniciais:
                
                Nome do titular: %s
                Tipo de conta: %s
                Saldo da conta: $%.2f
                ------------------------------------------------------
                """.formatted(titular, tipoConta, saldoConta));

        while (operacao != 5) {
            System.out.println("""
                    
                    Operações:
                    
                    1 - Consultar saldo
                    2 - Depositar
                    3 - Sacar
                    4 - Transferir 
                    5 - Sair
                    
                    Informe qual operação você deseja realizar:""");
            operacao = scanner.nextInt();

            switch (operacao) {
                case 1:
                    System.out.printf("\nO saldo disponível na conta é de: $%.2f", saldoConta);
                    break;

                case 2:
                    System.out.printf("\nInforme o valor a ser depositado: ");
                    valor = scanner.nextDouble();
                    saldoConta += valor;

                    System.out.println("Depósito realizado!");
                    break;

                case 3:
                    System.out.printf("\nInforme o valor a ser sacado: ");
                    valor = scanner.nextDouble();

                    if (valor > saldoConta) {
                        System.out.println("Impossível finalizar operação! O saldo da conta é menor que o valor a ser sacado!");
                    } else {
                        saldoConta -= valor;
                        System.out.println("Saque realizado!");
                    }
                    break;

                case 4:
                    System.out.printf("\nInforme o valor a ser transferido: ");
                    valor = scanner.nextDouble();

                    if (valor > saldoConta) {
                        System.out.println("Impossível finalizar operação! O saldo da conta é menor que o valor a ser transferido!");
                    } else {
                        saldoConta -= valor;
                        System.out.println("Transferência realizada!");
                    }
                    break;

                case 5:
                    System.out.printf("\nVolte Sempre!");
                    break;

                default:
                    System.out.println("Operação inválida!");
            }
        }
    }
}
