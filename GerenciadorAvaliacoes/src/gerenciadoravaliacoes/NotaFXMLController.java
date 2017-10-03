/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadoravaliacoes;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Acer E5-553G
 */
public class NotaFXMLController extends InterfaceUsuario{

    private ArrayList<Avaliacao> lista = new ArrayList();
    private Avaliacao avaliacao;
    
    public NotaFXMLController(){
        super("NotaFXML.fxml");
    }
    
    @FXML
    TextField tfNota;
    @FXML
    Label nome;
    @FXML
    Label disciplina;
    @FXML
    Label peso;
    @FXML
    Label media;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.nome.setText(this.nome.getText()+this.avaliacao.getNome());
        this.disciplina.setText(this.disciplina.getText()+this.avaliacao.getDisciplina());
        this.peso.setText(this.peso.getText()+this.avaliacao.getPeso());
        this.media.setText(this.media.getText()+this.avaliacao.getMedia());
    }
    
    public void recebeLista(ArrayList<Avaliacao> al, int pos){
        this.lista=al;
        this.avaliacao=this.lista.get(pos);
        
    }
    
    @FXML
    public void voltar(ActionEvent evento ){
        GerenciadorJanela.obterInstancia().voltar();
    }
    
    @FXML
    public void salvar(ActionEvent evento ) throws IOException{
        this.avaliacao.setNota(Double.parseDouble(this.tfNota.getText()));
        this.lista.set(this.avaliacao.getIdNoArquivo(), avaliacao);
        PrincipalFXMLController telaAnterior = new PrincipalFXMLController();
        telaAnterior.avaliacoes = this.lista;
        telaAnterior.salvarLista(telaAnterior.avaliacoes);
        GerenciadorJanela.obterInstancia().voltar();
    }
}
