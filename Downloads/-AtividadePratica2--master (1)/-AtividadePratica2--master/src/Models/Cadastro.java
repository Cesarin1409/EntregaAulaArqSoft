package Models;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private static List<Pessoa> listaPessoa = new ArrayList<Pessoa>();

    public static void cadastrar(Pessoa Pessoa) {
        listaPessoa.add(Pessoa);
    }

    public static List<Pessoa> getListaPessoa() {
        return listaPessoa;

    }

    public static void listarPiloto() {
        // esse array de pessoas( que tem nome piloto) so pra imprimir.
        ArrayList<Pessoa> pilotos = new ArrayList<Pessoa>();

        for (int i = 0; i < listaPessoa.size(); i++) {
            // eu verifico se em array pessoa, a pessoa é do tipo piloto? se sim eu pego
            // e adiciono em outro array para imprimir, isso foi uma gambi, espremi que nem
            // pedra e nao saiu nada melhor.
            if (listaPessoa.get(i) instanceof Piloto) {
                pilotos.add(listaPessoa.get(i));
            }
        }

        for (int i = 0; i < pilotos.size(); i++) {
            pilotos.get(i).toString();
        }

    }

    public static void listarPassageiro() {

        ArrayList<Pessoa> passageiros = new ArrayList<Pessoa>();

        for (int i = 0; i < listaPessoa.size(); i++) {

            if (listaPessoa.get(i) instanceof Passageiro) {
                passageiros.add(listaPessoa.get(i));
            }
        }

        for (int i = 0; i < passageiros.size(); i++) {
            System.out.println(passageiros.get(i).toString());
        }
    }

    public static void listarComissario() {
        ArrayList<Pessoa> comissarios = new ArrayList<Pessoa>();

        for (int i = 0; i < listaPessoa.size(); i++) {

            if (listaPessoa.get(i) instanceof Comissario) {
                comissarios.add(listaPessoa.get(i));
            }
        }

        for (int i = 0; i < comissarios.size(); i++) {
            System.out.println(comissarios.get(i).toString());
        }
    }

    public static void listarTodos() {

        System.out.println(listaPessoa.toString());

    }

    public static Pessoa buscarPiloto(long cpf) {

        // percorrer a lista de pessoas
        for (Pessoa piloto : listaPessoa) {

            if (piloto.getCpf() == cpf) {

                // se for verdade, retornamos o tripulante;
                return piloto;
            }

        }
        return null;
    }

    public static Pessoa buscarComissario(long cpf) {

        for (Pessoa comissario : listaPessoa) {

            if (comissario.getCpf() == cpf) {

                return comissario;
            }

        }
        return null;
    }

    public static Pessoa buscarPassageiro(long cpf) {

        for (Pessoa passageiro : listaPessoa) {

            if (passageiro.getCpf() == cpf) {

                return passageiro;
            }

        }
        return null;
    }

    public static void excluirPiloto(long cpf) {
        // primeiro eu procuro
        ArrayList<Pessoa> pilotos = new ArrayList<Pessoa>();

        for (int i = 0; i < listaPessoa.size(); i++) {
            if (listaPessoa.get(i) instanceof Piloto) {
                pilotos.add(listaPessoa.get(i));
            }
        }

        int indexPiloto = -1;
        for (int i = 0; i < pilotos.size(); i++) {

            if (pilotos.get(i).getCpf() == cpf) {
                indexPiloto = i;
            }
        }

        if (indexPiloto != -1) {
            listaPessoa.remove(indexPiloto);

        } else {
            System.out.println("Piloto " + cpf + " Nao encontrado!!");
        }

    }

    public static void excluirComissario(long cpf) {
        // primeiro eu procuro
        ArrayList<Pessoa> comissario = new ArrayList<Pessoa>();

        for (int i = 0; i < listaPessoa.size(); i++) {
            if (listaPessoa.get(i) instanceof Comissario) {
                comissario.add(listaPessoa.get(i));
            }
        }

        int indexComissario = -1;
        for (int i = 0; i < comissario.size(); i++) {

            if (comissario.get(i).getCpf() == cpf) {
                indexComissario = i;
            }
        }

        if (indexComissario != -1) {
            listaPessoa.remove(indexComissario);
        } else {
            System.out.println("Piloto " + cpf + " Nao encontrado!!");
        }

    }

    public static void excluirPassageiro(long cpf) {
        // primeiro eu procuro
        ArrayList<Pessoa> passageiro = new ArrayList<Pessoa>();

        for (int i = 0; i < listaPessoa.size(); i++) {
            if (listaPessoa.get(i) instanceof Passageiro) {
                passageiro.add(listaPessoa.get(i));
            }
        }

        int indexPassageiro = -1;
        for (int i = 0; i < passageiro.size(); i++) {

            if (passageiro.get(i).getCpf() == cpf) {
                indexPassageiro = i;
            }
        }

        if (indexPassageiro != -1) {
            listaPessoa.remove(indexPassageiro);
        }

    }

    public static void excluirTodos() {
        // listinha zeradinha , zero bala tem nada kkkkkk
        listaPessoa = new ArrayList<Pessoa>();

    }
}
