/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.elkynsamayoa.model;

import java.sql.Blob;

/**
 *
 * @author elkynsamayoa
 */
public class Producto {
    private int productoId;
    private String nombreProducto;
    private String descripcionProductos;
    private double precioVentaUnitario;
    private double precioVentaMayor;
    private double precioCompra;
    private Blob imagenProducto;
    private int distribuidorId;
    private String distribuidor;
    private int categoriaProductoId;
    private int categoriaProducto;

    public Producto() {
    }

    public Producto(int productoId, String nombreProducto, String descripcionProductos, double precioVentaUnitario, double precioVentaMayor, double precioCompra, Blob imagenProducto, String distribuidor, int categoriaProducto) {
        this.productoId = productoId;
        this.nombreProducto = nombreProducto;
        this.descripcionProductos = descripcionProductos;
        this.precioVentaUnitario = precioVentaUnitario;
        this.precioVentaMayor = precioVentaMayor;
        this.precioCompra = precioCompra;
        this.imagenProducto = imagenProducto;
        this.distribuidor = distribuidor;
        this.categoriaProducto = categoriaProducto;
    }

    public Producto(int productoId, String nombreProducto, String descripcionProductos, double precioVentaUnitario, double precioVentaMayor, double precioCompra, Blob imagenProducto, int distribuidorId, int categoriaProductoId) {
        this.productoId = productoId;
        this.nombreProducto = nombreProducto;
        this.descripcionProductos = descripcionProductos;
        this.precioVentaUnitario = precioVentaUnitario;
        this.precioVentaMayor = precioVentaMayor;
        this.precioCompra = precioCompra;
        this.imagenProducto = imagenProducto;
        this.distribuidorId = distribuidorId;
        this.categoriaProductoId = categoriaProductoId;
    }

    public Producto(int productoId, String nombreProducto, double precioVentaUnitario, double precioVentaMayor, double precioCompra, Blob imagenProducto) {
        this.productoId = productoId;
        this.nombreProducto = nombreProducto;
        this.precioVentaUnitario = precioVentaUnitario;
        this.precioVentaMayor = precioVentaMayor;
        this.precioCompra = precioCompra;
        this.imagenProducto = imagenProducto;
    }

    
    
    

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProductos() {
        return descripcionProductos;
    }

    public void setDescripcionProductos(String descripcionProductos) {
        this.descripcionProductos = descripcionProductos;
    }

    public double getPrecioVentaUnitario() {
        return precioVentaUnitario;
    }

    public void setPrecioVentaUnitario(double precioVentaUnitario) {
        this.precioVentaUnitario = precioVentaUnitario;
    }

    public double getPrecioVentaMayor() {
        return precioVentaMayor;
    }

    public void setPrecioVentaMayor(double precioVentaMayor) {
        this.precioVentaMayor = precioVentaMayor;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Blob getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(Blob imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

    public int getDistribuidorId() {
        return distribuidorId;
    }

    public void setDistribuidorId(int distribuidorId) {
        this.distribuidorId = distribuidorId;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public int getCategoriaProductoId() {
        return categoriaProductoId;
    }

    public void setCategoriaProductoId(int categoriaProductoId) {
        this.categoriaProductoId = categoriaProductoId;
    }

    public int getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(int categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "productoId=" + productoId + ", nombreProducto=" + nombreProducto + ", descripcionProductos=" + descripcionProductos + ", precioVentaUnitario=" + precioVentaUnitario + ", precioVentaMayor=" + precioVentaMayor + ", precioCompra=" + precioCompra + ", imagenProducto=" + imagenProducto + ", distribuidorId=" + distribuidorId + ", distribuidor=" + distribuidor + ", categoriaProductoId=" + categoriaProductoId + ", categoriaProducto=" + categoriaProducto + '}';
    }
    
    
    
        
    
    
}
