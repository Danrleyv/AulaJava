package gerenciadoravaliacoes;
        
import java.io.FileWriter;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;


public class GerenciadorAvaliacoes extends Application{

    public static void main(String[] args) throws IOException {
        //FileWriter listaAvaliacoes = new FileWriter("C:\\Users\\Acer E5-553G\\Desktop\\AulaJava\\AulaJava\\GerenciadorAvaliacoes\\listaAvaliacoes.csv");
        //listaAvaliacoes.flush();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)  {
        PrincipalFXMLController primeiraTela = new PrincipalFXMLController();
        GerenciadorJanela.obterInstancia().inicializaPalco(primaryStage, primeiraTela);
    }
    
}
