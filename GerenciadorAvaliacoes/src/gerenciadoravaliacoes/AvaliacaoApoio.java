/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadoravaliacoes;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Acer E5-553G
 */
public class AvaliacaoApoio {
    private SimpleStringProperty nome;
    private SimpleStringProperty disciplina;
    private SimpleDoubleProperty nota;
    private SimpleDoubleProperty peso;
    private SimpleStringProperty media;
    private SimpleIntegerProperty id;
    
    public AvaliacaoApoio(String nome, String disciplina, Double peso, String media, Double nota, int id){
        this.nome = new SimpleStringProperty(nome);
        this.disciplina = new SimpleStringProperty(disciplina);
        this.peso = new SimpleDoubleProperty(peso);
        this.media = new SimpleStringProperty(media);
        this.nota = new SimpleDoubleProperty(nota);
        this.id = new SimpleIntegerProperty(id);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome.get();
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome.set(nome);
    }

    /**
     * @return the disciplina
     */
    public String getDisciplina() {
        return disciplina.get();
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(String disciplina) {
        this.disciplina.set(disciplina);
    }

    /**
     * @return the nota
     */
    public Double getNota() {
        return nota.get();
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(Double nota) {
        this.nota.set(nota);
    }

    /**
     * @return the peso
     */
    public Double getPeso() {
        return peso.get();
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso.set(peso);
    }

    /**
     * @return the media
     */
    public String getMedia() {
        return media.get();
    }

    /**
     * @param media the media to set
     */
    public void setMedia(String media) {
        this.media.set(media);
    }

    /**
     * @return the id
     */
    public int getId() {
        return id.get();
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id.set(id);
    }
}
