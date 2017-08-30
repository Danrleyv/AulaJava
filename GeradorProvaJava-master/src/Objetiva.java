public class Objetiva extends Questao{
    private String opcoes[] = new String[5];
    private int resposta;

    public int getResposta() {
        return resposta;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }
    
    public String[] getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(String[] opcoes) {
        this.opcoes = opcoes;
    }
    
    public String retornaQuestao(){
        String questao="";
        questao+=this.getPergunta()+"(Peso "+this.getPeso()+")\n";
        for(int j=0;j<5;j++){
            switch(j){
                case 0: questao+="a)";
                        break;
                case 1: questao+="b)";
                        break;
                case 2: questao+="c)";
                        break;
                case 3: questao+="d)";
                        break;
                case 4: questao+="e)";
                        break;
            }
            questao+=this.getOpcoes()[j]+"\n\n";
        }
        return questao;
    }
}
