/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadoravaliacoes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

/**
 *
 * @author Acer E5-553G
 */
public final class AddFXMLController extends InterfaceUsuario{
    
    ArrayList<Avaliacao> lista = new ArrayList();
    
    @FXML
    private TextField tfNome;
    
    @FXML
    private TextField tfPeso;
    
    @FXML
    private MenuButton menuDisciplinas = new MenuButton();
    
    @FXML
    private MenuButton menuMedia = new MenuButton();
    
    private final MenuItem item = new MenuItem();
    
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
    
    @FXML
    private MenuItem m1;
    @FXML
    private MenuItem m2;
    @FXML
    private MenuItem m3;
    
    @FXML
    private Label lb1;
    @FXML
    private Label lb2;
    @FXML
    private Label lb3;
    @FXML
    private Label lb4;
    
   
    /*public void criaMenuDisciplinas() throws FileNotFoundException, IOException{
        
        try (FileReader arq = new FileReader("C:\\Users\\Acer E5-553G\\Desktop\\AulaJava\\AulaJava\\GerenciadorAvaliacoes\\listaDisciplinas.txt")) {
            BufferedReader lerArq = new BufferedReader(arq);
            
            int x = 0;
            
            String linha = lerArq.readLine();
            while (linha != null) {
                this.item.setText(linha);
                this.menuDisciplinas.getItems().add(x, item);
                System.out.printf("%s\n", this.menuDisciplinas.getItems().get(x).getText());
                
                linha = lerArq.readLine();
                
                x++;
            }
            
            arq.close();
        }
        
        
    }*/
    
    public AddFXMLController() throws FileNotFoundException, IOException{
        super("AddFXML.fxml");
        //criaMenuDisciplinas();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
    
    public void recebeLista(ArrayList<Avaliacao> av){
        this.lista=av;
    }
    
    @FXML
    public void voltar(ActionEvent evento ){
        GerenciadorJanela.obterInstancia().voltar();
    }
    
    @FXML
    public void salvar(ActionEvent evento ) throws FileNotFoundException, IOException{
        if(this.tfNome.getText().isEmpty()){
            lb1.setText("Por favor insira o nome da Avaliacao");
            return;
        }
        if(this.tfPeso.getText().isEmpty()){
            lb2.setText("Por favor insira o peso da Avaliacao");
            return;
        }
        if(this.menuDisciplinas.getText().equals("Disciplinas")){
            lb3.setText("Por favor selecione a disciplina da Avaliacao");
            return;
        }
        if(this.menuMedia.getText().equals("Medias")){
            lb4.setText("Por favor selecione a media da Avaliacao");
            return;
        }
        
        
        Avaliacao av = new Avaliacao();

        av.setDisciplina(this.menuDisciplinas.getText());
        av.setMedia(this.menuMedia.getText().toCharArray());
        av.setNome(this.tfNome.getText());
        av.setPeso(Double.parseDouble(this.tfPeso.getText()));
        av.setIdNoArquivo(this.lista.size());
        System.out.println(av.getMedia());
        
        av.salvar();
       
        this.lista.add(av);
        
        PrincipalFXMLController telaAnterior = new PrincipalFXMLController();
        telaAnterior.avaliacoes = this.lista;
        //telaAnterior.avaliacoes.salvar();
        telaAnterior.lista.add(new AvaliacaoApoio(av.getNome(),av.getDisciplina(),av.getPeso(),Arrays.toString(av.getMedia()),0.0,this.lista.size()-1));
        GerenciadorJanela.obterInstancia().voltar();
    }
    
    @FXML
    public void selecionar0(ActionEvent evento){
        this.menuDisciplinas.setText(this.item0.getText());
    }
    
    @FXML
    public void selecionar1(ActionEvent evento){
        this.menuDisciplinas.setText(this.item1.getText());
    }
    
    @FXML
    public void selecionar2(ActionEvent evento){
        this.menuDisciplinas.setText(this.item2.getText());
    }
    
    @FXML
    public void selecionar3(ActionEvent evento){
        this.menuDisciplinas.setText(this.item3.getText());
    }
    
    @FXML
    public void selecionar4(ActionEvent evento){
        this.menuDisciplinas.setText(this.item4.getText());
    }
    
    @FXML
    public void selecionar5(ActionEvent evento){
        this.menuDisciplinas.setText(this.item5.getText());
    }
    
    @FXML
    public void selecionar6(ActionEvent evento){
        this.menuDisciplinas.setText(this.item6.getText());
    }
    
    @FXML
    public void selecionar7(ActionEvent evento){
        this.menuDisciplinas.setText(this.item7.getText());
    }
    
    @FXML
    public void selecionar8(ActionEvent evento){
        this.menuDisciplinas.setText(this.item8.getText());
    }
    
    @FXML
    public void selecionar9(ActionEvent evento){
        this.menuDisciplinas.setText(this.item9.getText());
    }
    
    @FXML
    public void selecionar10(ActionEvent evento){
        this.menuDisciplinas.setText(this.item10.getText());
    }
    
    @FXML
    public void selecionar11(ActionEvent evento){
        this.menuDisciplinas.setText(this.item11.getText());
    }
    
    @FXML
    public void selecionar12(ActionEvent evento){
        this.menuDisciplinas.setText(this.item12.getText());
    }
    
    @FXML
    public void selecionar13(ActionEvent evento){
        this.menuDisciplinas.setText(this.item13.getText());
    }
    
    @FXML
    public void selecionar14(ActionEvent evento){
        this.menuDisciplinas.setText(this.item14.getText());
    }
    
    @FXML
    public void selecionar15(ActionEvent evento){
        this.menuDisciplinas.setText(this.item15.getText());
    }
    
    @FXML
    public void selecionar16(ActionEvent evento){
        this.menuDisciplinas.setText(this.item16.getText());
    }
    
    @FXML
    public void selecionar17(ActionEvent evento){
        this.menuDisciplinas.setText(this.item17.getText());
    }
    
    @FXML
    public void selecionar18(ActionEvent evento){
        this.menuDisciplinas.setText(this.item18.getText());
    }
    
    @FXML
    public void selecionar19(ActionEvent evento){
        this.menuDisciplinas.setText(this.item19.getText());
    }
    
    @FXML
    public void selecionar20(ActionEvent evento){
        this.menuDisciplinas.setText(this.item20.getText());
    }
    
    @FXML
    public void selecionar21(ActionEvent evento){
        this.menuDisciplinas.setText(this.item21.getText());
    }
    
    @FXML
    public void selecionar22(ActionEvent evento){
        this.menuDisciplinas.setText(this.item22.getText());
    }
    
    @FXML
    public void selecionar23(ActionEvent evento){
        this.menuDisciplinas.setText(this.item23.getText());
    }
    
    @FXML
    public void selecionar24(ActionEvent evento){
        this.menuDisciplinas.setText(this.item24.getText());
    }
    
    @FXML
    public void selecionar25(ActionEvent evento){
        this.menuDisciplinas.setText(this.item25.getText());
    }
    
    @FXML
    public void selecionar26(ActionEvent evento){
        this.menuDisciplinas.setText(this.item26.getText());
    }
    
    @FXML
    public void selecionar27(ActionEvent evento){
        this.menuDisciplinas.setText(this.item27.getText());
    }
    
    @FXML
    public void selecionar28(ActionEvent evento){
        this.menuDisciplinas.setText(this.item28.getText());
    }
    
    @FXML
    public void selecionar29(ActionEvent evento){
        this.menuDisciplinas.setText(this.item29.getText());
    }
    
    @FXML
    public void selecionar30(ActionEvent evento)
    {
        this.menuDisciplinas.setText(this.item30.getText());
    }
    
    @FXML
    public void selecionar31(ActionEvent evento){
        this.menuDisciplinas.setText(this.item31.getText());
    }
    
    @FXML
    public void selecionar32(ActionEvent evento){
        this.menuDisciplinas.setText(this.item32.getText());
    }
    
    @FXML
    public void selecionar33(ActionEvent evento){
        this.menuDisciplinas.setText(this.item33.getText());
    }
    
    @FXML
    public void selecionar34(ActionEvent evento){
        this.menuDisciplinas.setText(this.item34.getText());
    }
    
    @FXML
    public void selecionar35(ActionEvent evento){
        this.menuDisciplinas.setText(this.item35.getText());
    }
    
    @FXML
    public void selecionar36(ActionEvent evento){
        this.menuDisciplinas.setText(this.item36.getText());
    }
    
    @FXML
    public void selecionar37(ActionEvent evento){
        this.menuDisciplinas.setText(this.item37.getText());
    }
    
    @FXML
    public void selecionar38(ActionEvent evento){
        this.menuDisciplinas.setText(this.item38.getText());
    }
    
    @FXML
    public void selecionar39(ActionEvent evento){
        this.menuDisciplinas.setText(this.item39.getText());
    }
    
    @FXML
    public void selecionar40(ActionEvent evento){
        this.menuDisciplinas.setText(this.item40.getText());
    }
    
    @FXML
    public void selecionar41(ActionEvent evento){
        this.menuDisciplinas.setText(this.item41.getText());
    }
    
    @FXML
    public void selecionar42(ActionEvent evento){
        this.menuDisciplinas.setText(this.item42.getText());
    }
    
    @FXML
    public void selecionar43(ActionEvent evento){
        this.menuDisciplinas.setText(this.item43.getText());
    }
    
    @FXML
    public void selecionar44(ActionEvent evento){
        this.menuDisciplinas.setText(this.item44.getText());
    }
    
    @FXML
    public void selecionar45(ActionEvent evento){
        this.menuDisciplinas.setText(this.item45.getText());
    }
    
    @FXML
    public void selecionar46(ActionEvent evento){
        this.menuDisciplinas.setText(this.item46.getText());
    }
    
    @FXML
    public void selecionar47(ActionEvent evento){
        this.menuDisciplinas.setText(this.item47.getText());
    }
    
    @FXML
    public void selecionar48(ActionEvent evento){
        this.menuDisciplinas.setText(this.item48.getText());
    }
    
    @FXML
    public void selecionar49(ActionEvent evento){
        this.menuDisciplinas.setText(this.item49.getText());
    }
    
    @FXML
    public void selecionar50(ActionEvent evento){
        this.menuDisciplinas.setText(this.item50.getText());
    }
    
    @FXML
    public void selecionar51(ActionEvent evento){
        this.menuDisciplinas.setText(this.item51.getText());
    }
    
    @FXML
    public void selecionar52(ActionEvent evento){
        this.menuDisciplinas.setText(this.item52.getText());
    }
    
    @FXML
    public void selecionar53(ActionEvent evento){
        this.menuDisciplinas.setText(this.item53.getText());
    }
    
    @FXML
    public void selecionar54(ActionEvent evento){
        this.menuDisciplinas.setText(this.item54.getText());
    }
    
    @FXML
    public void selecionar55(ActionEvent evento){
        this.menuDisciplinas.setText(this.item55.getText());
    }
    
    @FXML
    public void selecionar56(ActionEvent evento){
        this.menuDisciplinas.setText(this.item56.getText());
    }
    
    @FXML
    public void selecionar57(ActionEvent evento){
        this.menuDisciplinas.setText(this.item57.getText());
    }
    
    @FXML
    public void selecionar58(ActionEvent evento){
        this.menuDisciplinas.setText(this.item58.getText());
    }
    
    @FXML
    public void selecionar59(ActionEvent evento){
        this.menuDisciplinas.setText(this.item59.getText());
    }
    
    @FXML
    public void selecionar60(ActionEvent evento){
        this.menuDisciplinas.setText(this.item60.getText());
    }
    
    @FXML
    public void selecionar61(ActionEvent evento){
        this.menuDisciplinas.setText(this.item61.getText());
    }
    
    @FXML
    public void selecionarM1(ActionEvent evento){
        this.menuMedia.setText(this.m1.getText());
    }
    
    @FXML
    public void selecionarM2(ActionEvent evento){
        this.menuMedia.setText(this.m2.getText());
    }
    
    @FXML
    public void selecionarM3(ActionEvent evento){
        this.menuMedia.setText(this.m3.getText());
    }
}
