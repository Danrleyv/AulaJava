package javaapplication3;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaApplication3 extends Application {
 
    private final TableView<Person> table = new TableView<>();
    private final ObservableList<Person> data =
            FXCollections.observableArrayList();
    final HBox hb = new HBox();
 
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setWidth(450);
        stage.setHeight(550);
 
 
        TableColumn nomeCol = new TableColumn("Nome");
        nomeCol.setMinWidth(100);
        nomeCol.setCellValueFactory(
                new PropertyValueFactory<>("nome"));
 
        TableColumn lastNameCol = new TableColumn("Disciplina");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<>("disciplina"));
        
        TableColumn mediaCol = new TableColumn("Media");
        mediaCol.setMinWidth(100);
        mediaCol.setCellValueFactory(
                new PropertyValueFactory<>("media"));
        
        TableColumn pesoCol = new TableColumn("Peso");
        pesoCol.setMinWidth(100);
        pesoCol.setCellValueFactory(
                new PropertyValueFactory<>("peso"));
        
        TableColumn notaCol = new TableColumn("Nota");
        notaCol.setMinWidth(100);
        notaCol.setCellValueFactory(
                new PropertyValueFactory<>("nota"));
 
        table.setItems(data);
        table.getColumns().addAll(nomeCol, lastNameCol, mediaCol, pesoCol, notaCol);
 
        final Button addButton = new Button("Add");
        addButton.setOnAction((ActionEvent e) -> {
            data.add(new Person("asd","asdI",3.0,"M1",5.0));
         });
 
        hb.getChildren().addAll(addButton);
        hb.setSpacing(3);
 
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(table, hb);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
 
        stage.setScene(scene);
        stage.show();
    }
} 
