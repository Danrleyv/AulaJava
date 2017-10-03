/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadoravaliacoes;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

/**
 *
 * @author Acer E5-553G
 */
public class DesempenhoFXMLController extends InterfaceUsuario {
    public ArrayList<Avaliacao> lista = new ArrayList();
    
    public DesempenhoFXMLController(){
        super("DesempenhoFXML.fxml");
    }
    
    @FXML
    private BarChart<String,Number> bcGrafico;
    @FXML
    private CategoryAxis media;
    @FXML
    private NumberAxis nota;
    
    @FXML
    private MenuButton menuDisciplinas = new MenuButton();
    
    @FXML
    private MenuItem item0;
    @FXML
    private MenuItem item1;
    @FXML
    private MenuItem item2;
    @FXML
    private MenuItem item3;
    @FXML
    private MenuItem item4;
    @FXML
    private MenuItem item5;
    @FXML
    private MenuItem item6;
    @FXML
    private MenuItem item7;
    @FXML
    private MenuItem item8;
    @FXML
    private MenuItem item9;
    @FXML
    private MenuItem item10;
    @FXML
    private MenuItem item11;
    @FXML
    private MenuItem item12;
    @FXML
    private MenuItem item13;
    @FXML
    private MenuItem item14;
    @FXML
    private MenuItem item15;
    @FXML
    private MenuItem item16;
    @FXML
    private MenuItem item17;
    @FXML
    private MenuItem item18;
    @FXML
    private MenuItem item19;
    @FXML
    private MenuItem item20;
    @FXML
    private MenuItem item21;
    @FXML
    private MenuItem item22;
    @FXML
    private MenuItem item23;
    @FXML
    private MenuItem item24;
    @FXML
    private MenuItem item25;
    @FXML
    private MenuItem item26;
    @FXML
    private MenuItem item27;
    @FXML
    private MenuItem item28;
    @FXML
    private MenuItem item29;
    @FXML
    private MenuItem item30;
    @FXML
    private MenuItem item31;
    @FXML
    private MenuItem item32;
    @FXML
    private MenuItem item33;
    @FXML
    private MenuItem item34;
    @FXML
    private MenuItem item35;
    @FXML
    private MenuItem item36;
    @FXML
    private MenuItem item37;
    @FXML
    private MenuItem item38;
    @FXML
    private MenuItem item39;
    @FXML
    private MenuItem item40;
    @FXML
    private MenuItem item41;
    @FXML
    private MenuItem item42;
    @FXML
    private MenuItem item43;
    @FXML
    private MenuItem item44;
    @FXML
    private MenuItem item45;
    @FXML
    private MenuItem item46;
    @FXML
    private MenuItem item47;
    @FXML
    private MenuItem item48;
    @FXML
    private MenuItem item49;
    @FXML
    private MenuItem item50;
    @FXML
    private MenuItem item51;
    @FXML
    private MenuItem item52;
    @FXML
    private MenuItem item53;
    @FXML
    private MenuItem item54;
    @FXML
    private MenuItem item55;
    @FXML
    private MenuItem item56;
    @FXML
    private MenuItem item57;
    @FXML
    private MenuItem item58;
    @FXML
    private MenuItem item59;
    @FXML
    private MenuItem item60;
    @FXML
    private MenuItem item61;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        bcGrafico.setCategoryGap(100);
    }
    
    public void recebeLista(ArrayList<Avaliacao> av){
        this.lista=av;
    }
    
    @FXML
    public void voltar(ActionEvent evento ){
        GerenciadorJanela.obterInstancia().voltar();
    }
    
    public void calculaMedia(String x){
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(x)){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=m1/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=m2/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=m3/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar0(ActionEvent evento){
        this.menuDisciplinas.setText(this.item0.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item0.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=this.lista.get(i).getNota()*this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=this.lista.get(i).getNota()*this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=this.lista.get(i).getNota()*this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar1(ActionEvent evento){
        this.menuDisciplinas.setText(this.item1.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item1.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar2(ActionEvent evento){
        this.menuDisciplinas.setText(this.item2.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item2.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar3(ActionEvent evento){
        this.menuDisciplinas.setText(this.item3.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item3.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar4(ActionEvent evento){
        this.menuDisciplinas.setText(this.item4.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item4.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar5(ActionEvent evento){
        this.menuDisciplinas.setText(this.item5.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item5.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar6(ActionEvent evento){
        this.menuDisciplinas.setText(this.item6.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item6.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar7(ActionEvent evento){
        this.menuDisciplinas.setText(this.item7.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item7.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar8(ActionEvent evento){
        this.menuDisciplinas.setText(this.item8.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item8.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar9(ActionEvent evento){
        this.menuDisciplinas.setText(this.item9.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item9.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar10(ActionEvent evento){
        this.menuDisciplinas.setText(this.item10.getText());Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item10.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar11(ActionEvent evento){
        this.menuDisciplinas.setText(this.item11.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item11.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar12(ActionEvent evento){
        this.menuDisciplinas.setText(this.item12.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item12.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar13(ActionEvent evento){
        this.menuDisciplinas.setText(this.item13.getText());Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item13.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar14(ActionEvent evento){
        this.menuDisciplinas.setText(this.item14.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item14.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar15(ActionEvent evento){
        this.menuDisciplinas.setText(this.item15.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item15.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar16(ActionEvent evento){
        this.menuDisciplinas.setText(this.item16.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item16.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar17(ActionEvent evento){
        this.menuDisciplinas.setText(this.item17.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item17.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar18(ActionEvent evento){
        this.menuDisciplinas.setText(this.item18.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item18.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar19(ActionEvent evento){
        this.menuDisciplinas.setText(this.item19.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item19.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar20(ActionEvent evento){
        this.menuDisciplinas.setText(this.item20.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item20.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar21(ActionEvent evento){
        this.menuDisciplinas.setText(this.item21.getText());Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item21.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
        
    }
    
    @FXML
    public void selecionar22(ActionEvent evento){
        this.menuDisciplinas.setText(this.item22.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item22.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar23(ActionEvent evento){
        this.menuDisciplinas.setText(this.item23.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item23.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar24(ActionEvent evento){
        this.menuDisciplinas.setText(this.item24.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item24.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar25(ActionEvent evento){
        this.menuDisciplinas.setText(this.item25.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item25.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar26(ActionEvent evento){
        this.menuDisciplinas.setText(this.item26.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item26.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar27(ActionEvent evento){
        this.menuDisciplinas.setText(this.item27.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item27.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar28(ActionEvent evento){
        this.menuDisciplinas.setText(this.item28.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item28.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
        
    }
    
    @FXML
    public void selecionar29(ActionEvent evento){
        this.menuDisciplinas.setText(this.item29.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item29.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar30(ActionEvent evento)
    {
        this.menuDisciplinas.setText(this.item30.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item30.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar31(ActionEvent evento){
        this.menuDisciplinas.setText(this.item31.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item31.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar32(ActionEvent evento){
        this.menuDisciplinas.setText(this.item32.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item32.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar33(ActionEvent evento){
        this.menuDisciplinas.setText(this.item33.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item33.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar34(ActionEvent evento){
        this.menuDisciplinas.setText(this.item34.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item34.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar35(ActionEvent evento){
        this.menuDisciplinas.setText(this.item35.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item35.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar36(ActionEvent evento){
        this.menuDisciplinas.setText(this.item36.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item36.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar37(ActionEvent evento){
        this.menuDisciplinas.setText(this.item37.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item37.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar38(ActionEvent evento){
        this.menuDisciplinas.setText(this.item38.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item38.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar39(ActionEvent evento){
        this.menuDisciplinas.setText(this.item39.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item39.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar40(ActionEvent evento){
        this.menuDisciplinas.setText(this.item40.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item40.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar41(ActionEvent evento){
        this.menuDisciplinas.setText(this.item41.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item41.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar42(ActionEvent evento){
        this.menuDisciplinas.setText(this.item42.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item42.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar43(ActionEvent evento){
        this.menuDisciplinas.setText(this.item43.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item43.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar44(ActionEvent evento){
        this.menuDisciplinas.setText(this.item44.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item44.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar45(ActionEvent evento){
        this.menuDisciplinas.setText(this.item45.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item45.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar46(ActionEvent evento){
        this.menuDisciplinas.setText(this.item46.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item46.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar47(ActionEvent evento){
        this.menuDisciplinas.setText(this.item47.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item47.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar48(ActionEvent evento){
        this.menuDisciplinas.setText(this.item48.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item48.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar49(ActionEvent evento){
        this.menuDisciplinas.setText(this.item49.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item49.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar50(ActionEvent evento){
        this.menuDisciplinas.setText(this.item50.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item50.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar51(ActionEvent evento){
        this.menuDisciplinas.setText(this.item51.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item51.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar52(ActionEvent evento){
        this.menuDisciplinas.setText(this.item52.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item52.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar53(ActionEvent evento){
        this.menuDisciplinas.setText(this.item53.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item53.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar54(ActionEvent evento){
        this.menuDisciplinas.setText(this.item54.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item54.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar55(ActionEvent evento){
        this.menuDisciplinas.setText(this.item55.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item55.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar56(ActionEvent evento){
        this.menuDisciplinas.setText(this.item56.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item56.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar57(ActionEvent evento){
        this.menuDisciplinas.setText(this.item57.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item57.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar58(ActionEvent evento){
        this.menuDisciplinas.setText(this.item58.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item58.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar59(ActionEvent evento){
        this.menuDisciplinas.setText(this.item59.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item59.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar60(ActionEvent evento){
        this.menuDisciplinas.setText(this.item60.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item60.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
    
    @FXML
    public void selecionar61(ActionEvent evento){
        this.menuDisciplinas.setText(this.item61.getText());
        Double m1=0.0;
        Double pesoM1=0.0;
        Double m2=0.0;
        Double pesoM2=0.0;
        Double m3=0.0;
        Double pesoM3=0.0;
        
        
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDisciplina().equals(this.item61.getText())){
                switch(this.lista.get(i).getMedia()){
                    case "M1":
                        m1+=10/this.lista.get(i).getPeso();
                        pesoM1+=this.lista.get(i).getPeso();
                        break;
                    case "M2":
                        m2+=6/this.lista.get(i).getPeso();
                        pesoM2+=this.lista.get(i).getPeso();
                        break;
                    case "M3":
                        m3+=5/this.lista.get(i).getPeso();
                        pesoM3+=this.lista.get(i).getPeso();
                        break;
                }
            }
        }
        
        m1=m1/pesoM1;
        m2=m2/pesoM2;
        m3=m3/pesoM3;
        Double mf=(m1+m2+m3)/3;
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("M1", m1));
        series1.getData().add(new XYChart.Data("M2", m2));
        series1.getData().add(new XYChart.Data("M3", m3));
        series1.getData().add(new XYChart.Data("MF", mf));
        
        bcGrafico.getData().addAll(series1);
    }
}
