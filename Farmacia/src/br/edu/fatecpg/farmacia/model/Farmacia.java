import java.util.Scanner;

public class Farmacia {
    public String[] nomeMedicamentos = new String[3];
    public int[] diasParaVencimento = new int[3];
    public double[] precos = new double[3];

    public boolean[] descontoAplicado = new boolean[3];

    static Scanner snorlax = new Scanner(System.in);

    public void Mostrar() {
        for (int i = 0; i < 3; i++) {
            if (nomeMedicamentos[i] != null) {
                System.out.println(
                    "Nome do Medicamento: " + nomeMedicamentos[i] +
                    "\nDias para Vencimento: " + diasParaVencimento[i] +
                    "\nPreço: R$ " + precos[i]
                );
            }
        }
    }

    public void CalcularMediaVencimento() {
        int soma = 0;
        int quantidade = 0;

        for (int i = 0; i < 3; i++) {
            if (nomeMedicamentos[i] != null) {
                soma += diasParaVencimento[i];
                quantidade++;
            }
        }

        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println(
                "Média de dias para vencimento: " + media
            );
        } else {
            System.out.println("Não há medicamentos cadastrados.");
        }
    }

    public void IdentificarVencimento() {
        for (int i = 0; i < 3; i++) {
            if (nomeMedicamentos[i] != null &&
                diasParaVencimento[i] < 5) {

                System.out.println(
                    "O medicamento " + nomeMedicamentos[i] +
                    " está perto do vencimento. Faltam " +
                    diasParaVencimento[i] + " dias."
                );

                if (!descontoAplicado[i]) {
                    precos[i] = precos[i] * 0.5;
                    descontoAplicado[i] = true;

                    System.out.println("Desconto de 50% aplicado!");
                    System.out.println("Novo preço: R$ " + precos[i]);
                } else {
                    System.out.println("O desconto já foi aplicado.");
                }
            }
        }
    }

    public void Vender() {
        System.out.println("Nome do medicamento que deseja vender:");
        String medicamentoVendido = snorlax.nextLine();

        for (int i = 0; i < 3; i++) {
            if (nomeMedicamentos[i] != null &&
                nomeMedicamentos[i].equalsIgnoreCase(medicamentoVendido)) {

                System.out.println(
                    "Medicamento vendido: " + nomeMedicamentos[i]
                );

                for (int j = i; j < 2; j++) {
                    nomeMedicamentos[j] = nomeMedicamentos[j + 1];
                    diasParaVencimento[j] = diasParaVencimento[j + 1];
                    precos[j] = precos[j + 1];
                    descontoAplicado[j] = descontoAplicado[j + 1];
                }

                nomeMedicamentos[2] = null;
                diasParaVencimento[2] = 0;
                precos[2] = 0.0;
                descontoAplicado[2] = false;

                return;
            }
        }

        System.out.println("Medicamento não encontrado.");
    }
}
