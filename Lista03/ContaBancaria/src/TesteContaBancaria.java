public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("12345-6",1000.00F);
        System.out.println("Saldo atual: R$ " + contaBancaria.getSaldo());

        contaBancaria.depositar(500.00F);
        System.out.println("Saldo atualizado, após depósito: R$ " + contaBancaria.getSaldo());

        contaBancaria.sacar(300.00F);
        System.out.println("Saldo atualizado, após saque: R$ " + contaBancaria.getSaldo());
    }
}
