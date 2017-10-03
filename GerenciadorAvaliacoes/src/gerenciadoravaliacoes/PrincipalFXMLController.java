package gerenciadoravaliacoes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import static javafx.scene.input.KeyCode.I;
import javafx.scene.layout.AnchorPane;


public class PrincipalFXMLController extends InterfaceUsuario{
    
    public Avaliacao av1 = new Avaliacao();
    public ArrayList<Avaliacao> avaliacoes = new ArrayList();
    public ArrayList<AvaliacaoApoio> apoio = new ArrayList();

    
    @FXML
    public TableView<AvaliacaoApoio> tbvTabela;
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
        
        tbvTabela.setItems(FXCollections.observableArrayList(apoio));
    }
    
    
    
    @FXML
    public void irParaTelaAdd(ActionEvent evento) throws IOException{
        AddFXMLController proximaTela = new AddFXMLController();
        proximaTela.recebeLista(avaliacoes);
        GerenciadorJanela.obterInstancia().abreJanela(proximaTela);
    }
    
    
    @FXML
    public void irParaTelaNota(ActionEvent evento){
        
        NotaFXMLController proximaTela = new NotaFXMLController();
        proximaTela.recebeLista(avaliacoes,this.tbvTabela.getSelectionModel().getSelectedItem().getId());
        GerenciadorJanela.obterInstancia().abreJanela(proximaTela);
    }
    
    @FXML
    public void irParaTelaDesempenho(ActionEvent evento){
        DesempenhoFXMLController proximaTela = new DesempenhoFXMLController();
        proximaTela.recebeLista(avaliacoes);
        GerenciadorJanela.obterInstancia().abreJanela(proximaTela);
    }
    
    public void populaLista(ArrayList<Avaliacao> av){
        this.apoio.clear();
        for(int i=0;i<av.size();i++){
            AvaliacaoApoio ap = new AvaliacaoApoio(av.get(i).getNome(), av.get(i).getDisciplina(), av.get(i).getPeso(), av.get(i).getMedia().toString(), av.get(i).getNota().doubleValue(), i);
            this.apoio.add(ap);
        }
    }
    
    @FXML
    public void atualizarTabela(ActionEvent evento){
        populaLista(this.avaliacoes);
        tbvTabela.setItems(FXCollections.observableArrayList(apoio));
    }
    
    public void salvarLista(ArrayList<Avaliacao> av) throws IOException{        
        try (FileWriter listaAvaliacoes = new FileWriter("C:\\Users\\Acer E5-553G\\Desktop\\AulaJava\\AulaJava\\GerenciadorAvaliacoes\\listaAvaliacoes.csv")) {
            PrintWriter gravar = new PrintWriter(listaAvaliacoes);
            for(int i=0;i<av.size();i++){
                gravar.println(av.get(i).salvar());
            }
            
            listaAvaliacoes.close();
        }
    }
    
}
