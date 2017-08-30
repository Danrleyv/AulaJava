public class Discursiva extends Questao {
    private String criterioCorrecao;

    public String getCriterioCorrecao() {
        return criterioCorrecao;
    }

    public void setCriterioCorrecao(String criterioCorrecao) {
        this.criterioCorrecao = criterioCorrecao;
    }
    
    public String retornaQuestao(){
        String questao="";
        questao += this.getPergunta()+"\n"+this.getCriterioCorrecao()+"(Peso "+this.getPeso()+")\n\n\n\n\n";
        return questao;
    }
}
