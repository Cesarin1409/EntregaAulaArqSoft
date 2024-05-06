
import Models.Cadastro;
import Models.Comissario;
import Models.Passageiro;
import Models.Piloto;

public class Sistema {

    public static void menuInicial() {
        int op;
        do {
            System.out.println("\nAVIAO VOO SYSTEM");
            System.out.println("\nProcedimetos: \n");
            System.out.println("Digite 1 para Cadastrar.\n");
            System.out.println("Digite 2 para Buscar.\n");
            System.out.println("Digite 3 para Listar.\n");
            System.out.println("Digite 4 para Excluir.\n");
            System.out.println("Digite 0 (zero) para finalizar / Sair");
            op = lendoOp();
            if (op != 0)
                menuSecundario(op);

        } while (op != 0);

        System.out.println("Programa Finalizado!");

    }

    private static void menuSecundario(int opcao) {
        String opmenuAlt;

        if (opcao == 1) {
            opmenuAlt = "Cadastrar";
        } else if (opcao == 2) {
            opmenuAlt = "Buscar";
        } else if (opcao == 3) {
            opmenuAlt = "Listar";
        } else {
            opmenuAlt = "Excluir";
        }

        int op2;
        do {
            System.out.println("\nAVIAO VOO SYSTEM");
            System.out.println("\nDeseja realizar procedimeto de " + opmenuAlt + " para qual categoria: \n");
            System.out.println("Digite 1 para Pilotos.\n");
            System.out.println("Digite 2 para Comissarios.\n");
            System.out.println("Digite 3 para Passageiros.\n");
            if (opcao != 1 && opcao != 2) {
                System.out.println("Digite 4 para Todos a bordo.\n");
            }
            System.out.println("Digite 5 para Voltar ao menu inicial.\n");
            op2 = lendoOp();
            if (op2 != 5)
                switchOpcao(opcao, op2);
            } while (op2 != 5);

            System.out.println("Voltando para o menu principal!");

    }

    private static void switchOpcao(int opcao1, int opcao2) {

        switch (opcao1) {
            case 1:

                if (opcao2 == 1) {
                    cadastrarPiloto();

                } else if (opcao2 == 2) {
                    cadastrarComissario();
                } else if (opcao2 == 3) {
                    cadastrarPassageiro();
                } else {
                    System.out.println("Opção invalida!");
                    return;
                }
                break;
            case 2:
                if (opcao2 == 1) {
                    buscarPiloto();
                } else if (opcao2 == 2) {
                    buscarComissario();
                } else if (opcao2 == 3) {
                    buscarPassageiro();
                } else {
                    System.out.println("Opção invalida!");
                    return;
                }
                break;
            case 3:
                if (opcao2 == 1) {
                    Cadastro.listarPiloto();
                } else if (opcao2 == 2) {
                    Cadastro.listarComissario();
                } else if (opcao2 == 3) {
                    Cadastro.listarPassageiro();
                } else if (opcao2 == 4) {
                    Cadastro.listarTodos();
                } else if (opcao2 == 5) {
                    menuInicial();
                } else {
                    System.out.println("Opção invalida!");
                    return;
                }
                break;
            case 4:
                if (opcao2 == 1) {
                    excluirPiloto();
                } else if (opcao2 == 2) {
                    excluirComissario();
                } else if (opcao2 == 3) {
                    excluirPassageiro();
                } else if (opcao2 == 4) {
                    Cadastro.excluirTodos();
                } else if (opcao2 == 5) {
                    menuInicial();
                } else {
                    System.out.println("Opção invalida!");
                    return;
                }
                break;
            default:
                System.out.println("Opção invalida!");
                break;
        }

    }

    private static int lendoOp() {
        int op = Console.lerInt();
        return op;
    }

    public static void cadastrarPiloto() {
        String funcaoVoo;
        int idbreve;
        long cpf;
        String telefone;
        String nome;

        System.out.print("Nome do piloto: \n");
        nome = Console.lerString();

        System.out.println("numero do cpf\n");
        cpf = Console.lerLong();

        System.out.println("numero do bres\n");
        idbreve = Console.lerInt();

        System.out.println("telefone\n");
        telefone = Console.lerString();

        System.out.println("Funçao no voo\n");
        funcaoVoo = Console.lerString();

        Piloto piloto1 = new Piloto(cpf, nome, telefone, idbreve, funcaoVoo);

        Cadastro.cadastrar(piloto1);

        System.out.println("Cadastro realizado com sucesso!!\n");

    }

    public static void cadastrarComissario() {
        String nome;
        long cpf;
        String telefone;
        int idCarteiraComissario;
        String funcaoVoo;

        System.out.print("Nome do Comissario: \n");
        nome = Console.lerString();

        System.out.println("Numero do cpf\n");
        cpf = Console.lerLong();

        System.out.println("telefone\n");
        telefone = Console.lerString();

        System.out.println("Numero de identificaçao do comissario\n");
        idCarteiraComissario = Console.lerInt();

        System.out.println("Funçao no voo\n");

        funcaoVoo = Console.lerString();

        Comissario comissario1 = new Comissario(cpf, nome, telefone, idCarteiraComissario, funcaoVoo);
        Cadastro.cadastrar(comissario1);

        System.out.println("Cadastro realizado com sucesso!!\n");

    }

    public static void cadastrarPassageiro() {
        long cpf;
        String nome;
        String telefone;
        String numeroPoltrona;
        String numeroCartaoEmbarque;

        System.out.print("Nome do passageiro: \n");
        nome = Console.lerString();

        System.out.println("numero do cpf\n");
        cpf = Console.lerLong();

        System.out.println("telefone\n");
        telefone = Console.lerString();

        System.out.println("numero poltrona\n");
        numeroPoltrona = Console.lerString();

        System.out.println("Numero do cartao de embarque\n");
        numeroCartaoEmbarque = Console.lerString();

        System.out.println("Cadastro realizado com sucesso!!\n");

        Passageiro passageiro1 = new Passageiro(cpf, nome, telefone, numeroPoltrona, numeroCartaoEmbarque);
        Cadastro.cadastrar(passageiro1);
    }

    public static void buscarPiloto() {

        System.out.println("Informe o cpf do Piloto que deseja buscar:");
        long cpf = Console.lerLong();
        Cadastro.buscarPiloto(cpf);
        if (Cadastro.buscarPiloto(cpf) != null) {
            System.out.println("Piloto encontrado!!" + Cadastro.buscarPiloto(cpf));
        } else {
            System.out.println("Piloto " + cpf + " Nao encontrado!!");
        }

    }

    public static void buscarPassageiro() {

        System.out.println("Informe o cpf do Passageiro que deseja buscar:");
        long cpf = Console.lerLong();
        Cadastro.buscarPassageiro(cpf);
        if (Cadastro.buscarPassageiro(cpf) != null) {
            System.out.println("Passageiro encontrado!!" + Cadastro.buscarPassageiro(cpf));
        } else {
            System.out.println("Passageiro " + cpf + " Nao encontrado!!");
        }

    }

    public static void buscarComissario() {

        System.out.println("Informe o cpf do comissario que deseja buscar:");
        long cpf = Console.lerLong();
        Cadastro.buscarComissario(cpf);
        if (Cadastro.buscarComissario(cpf) != null) {
            System.out.println("Comissario encontrado!!" + Cadastro.buscarComissario(cpf));
        } else {
            System.out.println("Comissario " + cpf + " Nao encontrado!!");
        }
    }

    public static void excluirPiloto() {
        System.out.println("informe o cpf a se r excluido ");
        long cpf = Console.lerLong();
        Cadastro.excluirPiloto(cpf);
        // listinha zeradinha , zero bala tem nada kkkkkk
        System.out.println(
                "AEEEEEEEEEE vc ferrou com o trabalho alheio e agora todos os dados do voo foram perdidos mane!!!");

    }

    public static void excluirComissario() {
        System.out.println("informe o cpf a se r excluido ");
        long cpf = Console.lerLong();
        Cadastro.excluirComissario(cpf);

    }

    public static void excluirPassageiro() {
        System.out.println("informe o cpf a se r excluido ");
        long cpf = Console.lerLong();
        Cadastro.excluirPassageiro(cpf);
    }

}
