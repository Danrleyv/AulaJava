
package gerenciadoravaliacoes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

class Avaliacao {
    private String nome;
    private String disciplina;
    private Double nota;
    private Double peso;
    private char[] media;
    private int idNoArquivo;

    public void salvar() throws IOException{
        String dados;
        dados=this.disciplina;
        dados+=","+this.media.toString();
        dados+=","+this.nome;
        dados+=","+this.peso.toString();
        
        try (FileWriter listaAvaliacoes = new FileWriter("C:\\Users\\Acer E5-553G\\Desktop\\AulaJava\\AulaJava\\GerenciadorAvaliacoes\\listaAvaliacoes.csv")) {
            PrintWriter gravar = new PrintWriter(listaAvaliacoes);
            gravar.println();
            listaAvaliacoes.close();
        }
        
    }
    
    public Avaliacao(){}
    
    public Avaliacao(String nome, String disciplina, char[] media, Double peso, Double nota, int id){
        this.nome=nome;
        this.disciplina=disciplina;
        this.media=media;
        this.peso=peso;
        this.nota=nota;
        this.idNoArquivo=id;
    }
    
    
    public void atualizar(){
        
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the disciplina
     */
    public String getDisciplina() {
        return disciplina;
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    /**
     * @return the nota
     */
    public Double getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(Double nota) {
        this.nota = nota;
    }

    /**
     * @return the peso
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /**
     * @return the media
     */
    public char[] getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(char[] media) {
        this.media = media;
    }

    /**
     * @return the idNoArquivo
     */
    public int getIdNoArquivo() {
        return idNoArquivo;
    }

    /**
     * @param idNoArquivo the idNoArquivo to set
     */
    public void setIdNoArquivo(int idNoArquivo) {
        this.idNoArquivo = idNoArquivo;
    }

}