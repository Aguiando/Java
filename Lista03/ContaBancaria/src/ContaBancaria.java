public class ContaBancaria {
    private String numConta;
    private Float saldo;

    public ContaBancaria(String numConta, Float saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        if (numConta != null && !numConta.isEmpty()) {
            this.numConta = numConta;
        } else {
            System.out.println("Número da conta inválido!");
        }
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        if (saldo != null && saldo < 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo negativo");
        }
    }
    public void depositar(Float valor){
        if(valor>0){
            saldo += valor;
            System.out.println("Depósto de R$ " + valor + " realizado com sucesso");
        }else{
            System.out.println("O valor do depósito deve ser positivo");
        }
    }
    public void sacar(Float valor){
        if(valor>0){
            if(valor<=saldo){
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            }else {
                System.out.println("Saldo insuficiente");
            }
        }
    }
}
