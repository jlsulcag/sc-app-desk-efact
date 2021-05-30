/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sulcacorp.efact.model;

/**
 *
 * @author JLSG
 */
public class DocumentoDetBean {
    
    private Long idDetalle;
    private long idCabecera;
    private String itemMoneda;
    private String itemOrden;
    private String itemUnidad;
    private String itemCantidad;
    private String itemCodproducto;
    private String itemDescripcion;
    private String itemTipoAfectacion;
    private String itemTipoPrecioVenta;
    private String itemValorVenta;
    private String itemPrecioVentaNoOnerosa  ;
    private String itemSubtotal;
    private String itemIgv;
    private String itemPvtaigv;

    public DocumentoDetBean() {
    }

    public Long getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Long idDetalle) {
        this.idDetalle = idDetalle;
    }
    
    public String getItemMoneda() {
        return itemMoneda;
    }

    public void setItemMoneda(String itemMoneda) {
        this.itemMoneda = itemMoneda;
    }

    public String getItemOrden() {
        return itemOrden;
    }

    public void setItemOrden(String itemOrden) {
        this.itemOrden = itemOrden;
    }

    public String getItemUnidad() {
        return itemUnidad;
    }

    public void setItemUnidad(String itemUnidad) {
        this.itemUnidad = itemUnidad;
    }

    public String getItemCantidad() {
        return itemCantidad;
    }

    public void setItemCantidad(String itemCantidad) {
        this.itemCantidad = itemCantidad;
    }

    public String getItemCodproducto() {
        return itemCodproducto;
    }

    public void setItemCodproducto(String itemCodproducto) {
        this.itemCodproducto = itemCodproducto;
    }

    public String getItemDescripcion() {
        return itemDescripcion;
    }

    public void setItemDescripcion(String itemDescripcion) {
        this.itemDescripcion = itemDescripcion;
    }

    public String getItemTipoAfectacion() {
        return itemTipoAfectacion;
    }

    public void setItemTipoAfectacion(String itemTipoAfectacion) {
        this.itemTipoAfectacion = itemTipoAfectacion;
    }

    public String getItemValorVenta() {
        return itemValorVenta;
    }

    public void setItemValorVenta(String itemValorVenta) {
        this.itemValorVenta = itemValorVenta;
    }

    public String getItemPrecioVentaNoOnerosa() {
        return itemPrecioVentaNoOnerosa;
    }

    public void setItemPrecioVentaNoOnerosa(String itemPrecioVentaNoOnerosa) {
        this.itemPrecioVentaNoOnerosa = itemPrecioVentaNoOnerosa;
    }

    public String getItemSubtotal() {
        return itemSubtotal;
    }

    public void setItemSubtotal(String itemSubtotal) {
        this.itemSubtotal = itemSubtotal;
    }

    public String getItemIgv() {
        return itemIgv;
    }

    public void setItemIgv(String itemIgv) {
        this.itemIgv = itemIgv;
    }

    public String getItemPvtaigv() {
        return itemPvtaigv;
    }

    public void setItemPvtaigv(String itemPvtaigv) {
        this.itemPvtaigv = itemPvtaigv;
    }

    public long getIdCabecera() {
        return idCabecera;
    }

    public void setIdCabecera(long idCabecera) {
        this.idCabecera = idCabecera;
    }
    
    public String getItemTipoPrecioVenta() {
        return itemTipoPrecioVenta;
    }

    public void setItemTipoPrecioVenta(String itemTipoPrecioVenta) {
        this.itemTipoPrecioVenta = itemTipoPrecioVenta;
    }
    
    
}
