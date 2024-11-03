package ProjetoBanco;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, ContaBancaria> contas;

    public Banco() {
        contas = new HashMap<>();
    }

    public void adicionarConta(String numeroConta, double saldoInicial) {
        if (!contas.containsKey(numeroConta)) {
            contas.put(numeroConta, new ContaBancaria(numeroConta, saldoInicial));
            System.out.println("Conta " + numeroConta + " adicionada com sucesso.");
        } else {
            System.out.println("Conta com número " + numeroConta + " já existe.");
        }
    }

    public ContaBancaria buscarConta(String numeroConta) {
        return contas.get(numeroConta);
    }

    public void listarContas() {
        System.out.println("Contas no banco:");
        for (String numero : contas.keySet()) {
            ContaBancaria conta = contas.get(numero);
            System.out.println("Conta: " + conta.getNumeroConta() + " - Saldo: R$ " + conta.getSaldo());
        }
    }
}
