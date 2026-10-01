
package Sistema;

import Model.Medicamento;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Medicamento> listaMedicamentos =
                new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n===== MEDCONTROL =====");
            System.out.println("1 - Cadastrar medicamento");
            System.out.println("2 - Listar medicamentos");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome do medicamento: ");
                    String nome = scanner.nextLine();

                    System.out.print("Dosagem: ");
                    String dosagem = scanner.nextLine();

                    System.out.print("Horário: ");
                    String horario = scanner.nextLine();

                    Medicamento medicamento =
                        new Medicamento(
                                listaMedicamentos.size() + 1,
                                nome,
                                "Sem descrição",
                                dosagem,
                                horario,
                                java.time.LocalDate.now()
                        );

                    listaMedicamentos.add(medicamento);

                    System.out.println(
                            "Medicamento cadastrado com sucesso!"
                    );

                    break;

                case 2:

                    if (listaMedicamentos.isEmpty()) {

                        System.out.println(
                                "Nenhum medicamento cadastrado."
                        );

                    } else {

                        for (Medicamento med :
                                listaMedicamentos) {

                            System.out.println(med);
                        }
                    }

                    break;

                case 3:

                    System.out.println(
                            "Saindo do sistema..."
                    );

                    break;

                default:

                    System.out.println(
                            "Opção inválida!"
                    );
            }

        } while (opcao != 3);

        scanner.close();
    }
}