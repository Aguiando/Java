public class TesteEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Celesc", "0000000",20);
        System.out.println("Empresa: " + empresa.getNome() +
                "\nCNPJ: " + empresa.getCnpj() +
                "\nNúmero de funcionários: " + empresa.getNumeroFuncionarios());
        empresa.contratar(2);
        System.out.println("Número atual de funcionários: " + empresa.getNumeroFuncionarios());
        empresa.demitir(5);
        System.out.println("Número atual de funcionários: " + empresa.getNumeroFuncionarios());
    }
}
