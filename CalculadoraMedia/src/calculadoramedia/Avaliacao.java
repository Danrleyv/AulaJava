
package calculadoramedia;

import java.util.ArrayList;

class Avaliacao {
    private String nome;
    private String disciplina;
    private Double nota;
    private Double peso;
    private char media[];
    private int idNoArquivo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public char[] getMedia() {
        return media;
    }

    public void setMedia(char[] media) {
        this.media = media;
    }

    public int getIdNoArquivo() {
        return idNoArquivo;
    }

    public void setIdNoArquivo(int idNoArquivo) {
        this.idNoArquivo = idNoArquivo;
    }
    
    public void salvar(){
    }
    
    public void atualizar(){
        
    }
    
    public ArrayList<Avaliacao> obterListaAvaliacoes(){
        
    }
    
    public Double calculaMediaDisciplina(String s, char[] c){
        
    }
}