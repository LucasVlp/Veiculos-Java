//Lucas Volpe, Edson Fernando e Eduardo Franco

package main;

import java.util.Scanner;
import model.Veiculo;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Veiculo veiculo = new Veiculo();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Exibir veículo");
            System.out.println("3 - Calcular desconto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Modelo: ");
                    veiculo.setModelo(sc.nextLine());

                    System.out.print("Marca: ");
                    veiculo.setMarca(sc.nextLine());

                    System.out.print("Ano: ");
                    veiculo.setAno(sc.nextInt());

                    System.out.print("Valor: ");
                    veiculo.setValor(sc.nextDouble());

                    System.out.println("Veículo cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println(veiculo.toString());
                    break;

                case 3:
                    System.out.print("Digite a porcentagem de desconto: ");
                    double desconto = sc.nextDouble();

                    double novoValor = veiculo.calcularDesconto(desconto);

                    System.out.println("Valor com desconto: R$ " + novoValor);
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}