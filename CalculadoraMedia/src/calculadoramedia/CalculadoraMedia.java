package calculadoramedia;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculadoraMedia extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage){
        
        ArrayList<Avaliacao> notas = new ArrayList<Avaliacao>();
        VBox orquestrador = new VBox();
        orquestrador.setSpacing(10);
        
        HBox hb1 = new HBox();
        hb1.setSpacing(25);
        HBox hb2 = new HBox();
        hb2.setSpacing(200);
        HBox hb3 = new HBox();
        hb3.setSpacing(45);
                
        Label lbInsira = new Label("Insira as notas e seus respectivos pesos para calcular a média:");
        lbInsira.setTranslateX(40);
        lbInsira.setTranslateY(10);
        Label lbNota = new Label("Nota:");
        lbNota.setTranslateX(40);
        lbNota.setTranslateY(20);
        Label lbPeso = new Label("Peso:");
        lbPeso.setTranslateX(40);
        lbPeso.setTranslateY(20);
        Label lbMedia = new Label("Média Final:");
        lbMedia.setTranslateX(20);
        lbMedia.setTranslateY(50);
        
        Label lbQtd = new Label("Quantidade de notas a serem calculadas: 0");
        lbQtd.setTranslateX(20);
        lbQtd.setTranslateY(25);
        
        TextField tfNota = new TextField();
        tfNota.setTranslateX(40);
        tfNota.setTranslateY(10);
        TextField tfPeso = new TextField();
        tfPeso.setTranslateX(40);
        tfPeso.setTranslateY(10);
        
        Button btAdd = new Button("Inserir");
        btAdd.setTranslateX(20);
        btAdd.setTranslateY(20);
        btAdd.setOnAction( new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                Avaliacao av1 = new Avaliacao();
                av1.setNota(tfNota.getText());
                av1.setPeso(tfPeso.getText());
                
                notas.add(av1);
                
                tfNota.clear();
                tfPeso.clear();
                lbQtd.setText("Quantidade de notas a serem calculadas: "+notas.size());
            }
        } );
        
        Button btClear = new Button("Limpar");
        btClear.setTranslateX(20);
        btClear.setTranslateY(20);
        btClear.setOnAction( new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                notas.clear();
                lbQtd.setText("Quantidade de notas a serem calculadas: "+notas.size());
                lbMedia.setText( "Média Final: ");
            }
        } );
        
        Button btCalc = new Button("Calcular Média");
        btCalc.setTranslateX(185);
        btCalc.setTranslateY(40);
        btCalc.setOnAction( new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                
                double notaEmDouble = 0;
                double pesoEmDouble = 0;
                double pesoTotal = 0;
                double media = 0;
                
                for(int i=0;i<notas.size();i++){
                    notaEmDouble = Double.parseDouble(notas.get(i).getNota());
                    pesoEmDouble = Double.parseDouble(notas.get(i).getPeso());
                    media += notaEmDouble*pesoEmDouble;
                    pesoTotal += pesoEmDouble;
                }
                double numResultado = media/pesoTotal;
                
                lbMedia.setText( "Média Final: "+numResultado);
            }
        } );
        
        hb1.getChildren().add(btAdd);
        hb1.getChildren().add(lbQtd);
        hb1.getChildren().add(btClear);
        
        hb2.getChildren().add(lbNota);
        hb2.getChildren().add(lbPeso);
        
        hb3.getChildren().add(tfNota);
        hb3.getChildren().add(tfPeso);
        
        orquestrador.getChildren().add(lbInsira);
        orquestrador.getChildren().add(hb2);
        orquestrador.getChildren().add(hb3);
        orquestrador.getChildren().add(hb1);
        orquestrador.getChildren().add(btCalc);
        orquestrador.getChildren().add(lbMedia);
        
        Scene cena = new Scene(orquestrador, 500, 300);
        
        stage.setScene(cena);
        stage.setTitle("Calculadora de Médias");
        stage.show();
    }
    
}
