/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.elkynsamayoa.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import org.elkynsamayoa.system.Main;

/**
 *
 * @author 
 */
public class MenuPrincipalController implements Initializable {
    private Main stage;
    @FXML
    MenuItem btnMenuClientes, btnTicketSoporte;

    public Main getStage() {
        return stage;
    }

    public void setStage(Main stage) {
        this.stage = stage;
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    
    }    
    
    @FXML
    public void handleButtonAction(ActionEvent event){
        if(event.getSource()== btnMenuClientes){
            stage.MenuClientesView();
        }else if(event.getSource() == btnTicketSoporte){
            stage.MenuTicketSoporteView();
        }
    }
    
}
