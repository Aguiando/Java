public class Time {
    private String nome;
    private String tecnico;
    private Integer numJogadores;

    public Time(String nome, String tecnico, Integer numJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numJogadores = numJogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()){
            this.nome = nome;
        }else{
            System.out.println("Nome inválido!");
        }
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        if (tecnico != null && !tecnico.isEmpty()) {
            this.tecnico = tecnico;
        } else {
            System.out.println("Tecnico inválido!");
        }
    }

    public Integer getNumJogadores() {
        return numJogadores;
    }

    public void setNumJogadores(Integer numJogadores) {
        if (numJogadores > 0) {
            this.numJogadores = numJogadores;
        } else {
            System.out.println("Erro! Número de jogadores abaixo de zero");
        }
    }
    public void adicionar(Integer adicionar){
        if(adicionar >0){
            numJogadores += adicionar;
            System.out.println("O time teve um aumento de: " + adicionar + " jogadores");
        }else{
            System.out.println("Operação inválida!");
        }
    }
    public void remover(Integer remover){
        if(remover > 0){
            if(numJogadores >= remover){
                numJogadores -= remover;
                System.out.println("O time teve uma diminuição de: " + remover + " jogadores");
            }else{
                System.out.println("Operação inválida!");
            }
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "nome='" + nome + '\'' +
                ", tecnico='" + tecnico + '\'' +
                ", numJogadores=" + numJogadores +
                '}';
    }
}
