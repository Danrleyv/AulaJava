package gerenciadoravaliacoes;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import static javafx.scene.input.KeyCode.I;
import javafx.scene.layout.AnchorPane;


public class PrincipalFXMLController extends InterfaceUsuario{
    
    public Avaliacao av1 = new Avaliacao();
    public ArrayList<Avaliacao> avaliacoes = new ArrayList();
    public final ObservableList<AvaliacaoApoio> lista = FXCollections.observableArrayList(new AvaliacaoApoio("prova","POOII",7.5,"M1",0.0,0));
    
    @FXML
    TableView<AvaliacaoApoio> tbvTabela;
    @FXML
    TableColumn tbcNome;
    @FXML
    TableColumn tbcDisciplina;
    @FXML
    TableColumn tbcMedia;
    @FXML
    TableColumn tbcPeso;
    @FXML
    TableColumn tbcNota;
   

    public PrincipalFXMLController(){
        super("PrincipalFXML.fxml");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        tbcNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        tbcDisciplina.setCellValueFactory(new PropertyValueFactory<>("disciplina"));
        tbcMedia.setCellValueFactory(new PropertyValueFactory<>("media"));
        tbcPeso.setCellValueFactory(new PropertyValueFactory<>("peso"));
        tbcNota.setCellValueFactory(new PropertyValueFactory<>("nota"));
        
        tbvTabela.setItems(lista);
    }
    
    
    
    @FXML
    public void irParaTelaAdd(ActionEvent evento) throws IOException{
        AddFXMLController proximaTela = new AddFXMLController();
        proximaTela.recebeLista(avaliacoes);
        GerenciadorJanela.obterInstancia().abreJanela(proximaTela);
        System.out.println(avaliacoes.size());
        for(int i=0;i<avaliacoes.size();i++){
            System.out.println(avaliacoes.get(i).getNome());
        }
    }
    
    
    @FXML
    public void irParaTelaNota(ActionEvent evento){
        NotaFXMLController proximaTela = new NotaFXMLController();
        AvaliacaoApoio ava = this.tbvTabela.getSelectionModel().getSelectedItem();
        av1.setNome(ava.getNome());
        av1.setDisciplina(ava.getDisciplina());
        av1.setMedia(ava.getMedia().toCharArray());
        av1.setNota(ava.getNota());
        av1.setPeso(ava.getPeso());
        av1.setIdNoArquivo(ava.getId());
        proximaTela.recebeLista(avaliacoes,av1);
        GerenciadorJanela.obterInstancia().abreJanela(proximaTela);
        System.out.println(lista.get(lista.size()-1).getNota());
    }
    
    @FXML
    public void irParaTelaDesempenho(ActionEvent evento){
        DesempenhoFXMLController proximaTela = new DesempenhoFXMLController();
        proximaTela.recebeLista(avaliacoes);
        GerenciadorJanela.obterInstancia().abreJanela(proximaTela);
    }
    
}
