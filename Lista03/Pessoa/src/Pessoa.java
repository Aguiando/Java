
public class Pessoa {
    private String nome;
    private Integer idade;
    private Float altura;

    public Pessoa(String nome, Integer idade, Float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if (idade != null && idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }

        public Float getAltura () {
            return altura;
        }

        public void setAltura (Float altura){
            if (altura != null && altura > 0) {
                this.altura = altura;
            } else {
                System.out.println("Altura inválida!");
            }
        }


        @Override
        public String toString () {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", altura=" + altura +
                    '}';
        }
    }
