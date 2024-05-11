/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.elkynsamayoa.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;
import org.elkynsamayoa.dao.Conexion;
import org.elkynsamayoa.model.Producto;
import org.elkynsamayoa.system.Main;

/**
 * FXML Controller class
 *
 * @author elkynsamayoa
 */
public class MenuProductoController implements Initializable {
    private Main stage;    
    private int op;
        
    private static Connection conexion = null;
    private static PreparedStatement statement = null;
    private static ResultSet resultSet = null;
    private List<File> files = null;
    
    @FXML
    Button btnGuardar, btnBuscar;
    @FXML
    TextField tfProductoId, tfNombreProducto,tfUnidad, tfMayor, tfCompra, tfDistribuidor, tfCategoria ;
    @FXML
    TextArea taDescripcionProducto;
    @FXML
    ImageView imgCargar, imgMostrar;
    @FXML
    Label lblNombreProducto, lblUnitario, lblMayor, lblCompra;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void handleButtonAction(ActionEvent event){
        try{
            
            if(event.getSource() == btnGuardar){
                agregarProducto();
            }else if(event.getSource() == btnBuscar){
                Producto producto = buscarProducto();
                if(producto != null){
                    lblNombreProducto.setText(producto.getNombreProducto());
                    lblUnitario.setText(Double.toString(producto.getPrecioVentaUnitario()));
                    lblMayor.setText(Double.toString(producto.getPrecioVentaMayor()));
                    lblCompra.setText(Double.toString(producto.getPrecioCompra()));
                    InputStream file = producto.getImagenProducto().getBinaryStream();
                    Image image = new Image(file);
                    imgMostrar.setImage(image);
                }
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    
    @FXML
    public void handleOnDrag(DragEvent event){
        if(event.getDragboard().hasFiles()){
            event.acceptTransferModes(TransferMode.ANY);
        }
    }
    
    @FXML
    public void handleOnDrop(DragEvent event){
        try{
            files = event.getDragboard().getFiles();
            FileInputStream file = new  FileInputStream(files.get(0));
            Image image = new Image(file);    
            imgCargar.setImage(image);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public void agregarProducto(){
        try{
            conexion = Conexion.getInstance().obtenerConexion();
            String sql = "call sp_AgregarProducto(?,?,?,?,?,?,?,?)";
            statement = conexion.prepareStatement(sql);
            statement.setString(1, tfNombreProducto.getText());
            statement.setString(2, taDescripcionProducto.getText());
            statement.setString(3, tfUnidad.getText());
            statement.setString(4, tfMayor.getText());
            statement.setString(5, tfCompra.getText());
            InputStream img = new FileInputStream(files.get(0));
            statement.setBinaryStream(6,img);
            statement.setString(7, tfDistribuidor.getText());
            statement.setString(8, tfCategoria.getText());
            statement.execute();
            /*statement.setInt(6, Integer.parseInt(tfDistribuidor.getText()));
            InputStream img = new FileInputStream(files.get(0));
            statement.setBinaryStream(7,img);
            statement.setInt(8, Integer.parseInt(tfCategoria.getText()));*/
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public Producto buscarProducto(){
        Producto producto = null;
        try{
            conexion = Conexion.getInstance().obtenerConexion();
            String sql = "call sp_BuscarProducto";
            statement = conexion.prepareStatement(sql);
            statement.setInt(1, Integer.parseInt(tfProductoId.getText()));
            
            resultSet = statement.executeQuery();
            
            if(resultSet.next()){
               int productoId =  resultSet.getInt("productoId");
               String nombre = resultSet.getString("nombreProducto");
               double  unitario = resultSet.getDouble("precioVentaUnitario");
               double  mayor = resultSet.getDouble("precioVentaMayor");
               double  compra = resultSet.getDouble("precioCompra");
               Blob imagenProducto = resultSet.getBlob("imagenProducto");
               
               producto = new Producto(productoId, nombre,unitario,mayor,compra, imagenProducto);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                if(conexion != null){
                    conexion.close();
                }else if(statement != null){
                    statement.close();
                }
            }catch(SQLException e){
            }
        }
        return producto;
    }
    
    public Main getStage() {
        return stage;
    }
 
    public void setStage(Main stage) {
        this.stage = stage;
    }
 
    public void setOp(int op) {
        this.op = op;
    }
    
}
