/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.elkynsamayoa.system;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.Initializable;
import javafx.fxml.FXMLLoader;
import java.io.InputStream;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import org.elkynsamayoa.controller.FormularioCargoController;
import org.elkynsamayoa.controller.FormularioCategoriaProductoController;
import org.elkynsamayoa.controller.FormularioClienteController;
import org.elkynsamayoa.controller.FormularioCompraController;
import org.elkynsamayoa.controller.FormularioDistribuidorController;
import org.elkynsamayoa.controller.FormularioEmpleadoController;
import org.elkynsamayoa.controller.MenuCargoController;
import org.elkynsamayoa.controller.MenuCategoriaProductoController;
import org.elkynsamayoa.controller.MenuClienteController;
import org.elkynsamayoa.controller.MenuCompraController;
import org.elkynsamayoa.controller.MenuDistribuidorController;
import org.elkynsamayoa.controller.MenuEmpleadoController;
import org.elkynsamayoa.controller.MenuFacturaController;
import org.elkynsamayoa.controller.MenuPrincipalController;
import org.elkynsamayoa.controller.MenuProductoController;
import org.elkynsamayoa.controller.MenuTicketSoporteController;
/**
 *
 * @author elkynsamayoa
 */
public class Main extends Application {
    private Stage stage;
    private Scene scene;
    private final String URLVIEW = "/org/elkynsamayoa/view/";
    
    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        stage.setTitle("Super Kinal App");
        menuPrincipalView();
        stage.show();
    }
    
    public Initializable switchScene(String fxmlName, int width, int height)throws Exception{
        Initializable resultado;
        FXMLLoader loader = new FXMLLoader();
        
        InputStream file = Main.class.getResourceAsStream(URLVIEW + fxmlName);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(Main.class.getResource(URLVIEW + fxmlName));
        
        scene = new Scene((AnchorPane)loader.load(file), width, height);
        stage.setScene(scene);
        stage.sizeToScene();
        
        resultado = (Initializable)loader.getController();
        return resultado;
    }
    
    public void menuPrincipalView(){
        try{
            MenuPrincipalController menuPrincipalView = (MenuPrincipalController)switchScene("MenuPrincipalView.fxml",484,639);
            menuPrincipalView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void formClienteView(int op){
        try{
            FormularioClienteController formClienteView = (FormularioClienteController)switchScene("FormularioClienteView.fxml",380,520);
            formClienteView.setOp(op);
            formClienteView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
        
    public void menuClientesView(){
        try{
           MenuClienteController menuClientesView = (MenuClienteController)switchScene("MenuClienteView.fxml",1200,750); 
           menuClientesView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
     public void menuTickettSoporteView(){
        try{
            MenuTicketSoporteController menuTicketSoporteView = (MenuTicketSoporteController)switchScene("MenuTicketSoporteView.fxml",765,471);
            menuTicketSoporteView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
     
    public void formDistribuidoresView(int op){
        try{
            FormularioDistribuidorController formDistribuidoresView = (FormularioDistribuidorController)switchScene("FormularioDistribuidorView.fxml", 380, 520);
            formDistribuidoresView.setOp(op);
            formDistribuidoresView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuDistribuidorView(){
        try{
            MenuDistribuidorController menuDistribuidorView = (MenuDistribuidorController)switchScene("MenuDistribuidorView.fxml",1200,750);
            menuDistribuidorView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void formCargosView(int op){
        try{
            FormularioCargoController formCargosView = (FormularioCargoController)switchScene("FormularioCargoView.fxml", 380, 520);
            formCargosView.setOp(op);
            formCargosView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuCargoView(){
        try{
            MenuCargoController menuCargoView = (MenuCargoController)switchScene("MenuCargoView.fxml",1200,750);
            menuCargoView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void formEmpleadosView(int op){
        try{
            FormularioEmpleadoController formEmpleadosView = (FormularioEmpleadoController)switchScene("FormularioEmpleadoView.fxml", 580, 720);
            formEmpleadosView.setOp(op);
            formEmpleadosView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuEmpleadoView(){
        try{
            MenuEmpleadoController menuEmpleadoView = (MenuEmpleadoController)switchScene("MenuEmpleadoView.fxml",1200,750);
            menuEmpleadoView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuProductoView(){
        try{
            MenuProductoController menuProductoView = (MenuProductoController)switchScene("MenuProductoView.fxml",1280,870);
            menuProductoView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void formCategoriaProductos(int op){
        try{
            FormularioCategoriaProductoController formCategoriaProductos = (FormularioCategoriaProductoController)switchScene("FormularioCategoriaProductoView.fxml", 380, 520);
            formCategoriaProductos.setOp(op);
            formCategoriaProductos.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuCategoriaProductoView(){
        try{
            MenuCategoriaProductoController menuCategoriaProductoView = (MenuCategoriaProductoController)switchScene("MenuCategoriaProductoView.fxml",1200,750);
            menuCategoriaProductoView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void formComprasView(int op){
        try{
            FormularioCompraController formComprasView = (FormularioCompraController)switchScene("FormularioCompraView.fxml", 380, 520);
            formComprasView.setOp(op);
            formComprasView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuCompraView(){
        try{
            MenuCompraController menuCompraView = (MenuCompraController)switchScene("MenuCompraView.fxml",1200,750);
            menuCompraView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
      public void menuFacturaView(){
        try{
            MenuFacturaController menuFacturaView = (MenuFacturaController)switchScene("MenuFacturaView.fxml",765,471);
            menuFacturaView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
    

    
}
