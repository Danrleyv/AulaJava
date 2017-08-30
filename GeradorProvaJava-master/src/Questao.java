abstract class Questao {
    private String Pergunta;
    private double peso;

    
    public abstract String retornaQuestao();   
    
    public String getPergunta() {
        return Pergunta;
    }

    public void setPergunta(String Pergunta) {
        this.Pergunta = Pergunta;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
