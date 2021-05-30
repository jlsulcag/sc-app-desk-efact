/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sulcacorp.efact.model;

import java.util.Date;

/**
 *
 * @author JLSG
 */
public class DocumentoCabBean {

    private Long idCabecera;/*Codigo del documento*/
    private String idExterno;/*De que empresa y sucursal viene el comprobante*/
 /*Datos de la empresa - emisor*/
    private String emprRazonsocial;
    private String emprUbigeo;//codigo de ubigeo
    private String emprNombrecomercial;
    private String emprDireccion;
    private String emprDepartamento;
    private String emprProvincia;
    private String emprDistrito;
    private String emprPais;
    private String emprNroruc;
    private String emprTipoComprobante;

    /*Datos del cliente*/
    private String clieNumeroDocIdentidad;
    private String clieTipoDocIdentidad;
    private String clieNombre;//Nombre / Razon Social del cliente

    /*Datos de comprobante*/
    private Date docuFecha;//FORMATO  yyyy-MM-DD
    private String docuHora;
    private String docuTipoComprobante;//01=Factura 03= Boleta
    private String docuNumeroComprobante;
    private String docuMoneda;
    private String docuGravada;
    private String docuInafecta;
    private String docuExonerada;
    private String docuGratuita;
    private String docuDescuento;
    private String docuSubtotal;
    private String docuTotal;
    private String docuIgv;
    private String tasaIgv;
    private String docuIsc;
    private String tasaIsc;
    private String docuOtrosTributos;
    private String tasaOtrosTributos;
    private String docuOtrosCargos;
    private String docuPercepcion;
    private String hashCode;//QR
    private String cdr;//Codigo de respuesta de la Sunat
    private String cdrNota;//Descripcion de respuesta cdr
    private String cdrObservacion;
    private String docuEnviaws;//S=Si envia N=Noenvio
    private String docuProceStatus;//N= No procesado P=proceso A=Aceptado
    private String docuProceFecha; //Fecha  y docuHora de recepcion de respuesta
    private String docuLinkPdf; //Generar link para pdf
    private String docuLinkCdr; //
    private String docuLinkXml;
    private String clieCorreoCpe1;
    private String clieCorreoCpe2;

    public Long getIdCabecera() {
        return idCabecera;
    }

    public void setIdCabecera(Long idCabecera) {
        this.idCabecera = idCabecera;
    }

    public String getIdExterno() {
        return idExterno;
    }

    public void setIdExterno(String idExterno) {
        this.idExterno = idExterno;
    }

    public String getEmprRazonsocial() {
        return emprRazonsocial;
    }

    public void setEmprRazonsocial(String emprRazonsocial) {
        this.emprRazonsocial = emprRazonsocial;
    }

    public String getEmprUbigeo() {
        return emprUbigeo;
    }

    public void setEmprUbigeo(String emprUbigeo) {
        this.emprUbigeo = emprUbigeo;
    }

    public String getEmprNombrecomercial() {
        return emprNombrecomercial;
    }

    public void setEmprNombrecomercial(String emprNombrecomercial) {
        this.emprNombrecomercial = emprNombrecomercial;
    }

    public String getEmprDireccion() {
        return emprDireccion;
    }

    public void setEmprDireccion(String emprDireccion) {
        this.emprDireccion = emprDireccion;
    }

    public String getEmprDepartamento() {
        return emprDepartamento;
    }

    public void setEmprDepartamento(String emprDepartamento) {
        this.emprDepartamento = emprDepartamento;
    }

    public String getEmprProvincia() {
        return emprProvincia;
    }

    public void setEmprProvincia(String emprProvincia) {
        this.emprProvincia = emprProvincia;
    }

    public String getEmprDistrito() {
        return emprDistrito;
    }

    public void setEmprDistrito(String emprDistrito) {
        this.emprDistrito = emprDistrito;
    }

    public String getEmprPais() {
        return emprPais;
    }

    public void setEmprPais(String emprPais) {
        this.emprPais = emprPais;
    }

    public String getEmprNroruc() {
        return emprNroruc;
    }

    public void setEmprNroruc(String emprNroruc) {
        this.emprNroruc = emprNroruc;
    }

    public String getEmprTipoComprobante() {
        return emprTipoComprobante;
    }

    public void setEmprTipoComprobante(String emprTipoComprobante) {
        this.emprTipoComprobante = emprTipoComprobante;
    }

    public String getClieNumeroDocIdentidad() {
        return clieNumeroDocIdentidad;
    }

    public void setClieNumeroDocIdentidad(String clieNumeroDocIdentidad) {
        this.clieNumeroDocIdentidad = clieNumeroDocIdentidad;
    }

    public String getClieTipoDocIdentidad() {
        return clieTipoDocIdentidad;
    }

    public void setClieTipoDocIdentidad(String clieTipoDocIdentidad) {
        this.clieTipoDocIdentidad = clieTipoDocIdentidad;
    }

    public String getClieNombre() {
        return clieNombre;
    }

    public void setClieNombre(String clieNombre) {
        this.clieNombre = clieNombre;
    }

    public Date getDocuFecha() {
        return docuFecha;
    }

    public void setDocuFecha(Date docuFecha) {
        this.docuFecha = docuFecha;
    }

    public String getDocuHora() {
        return docuHora;
    }

    public void setDocuHora(String docuHora) {
        this.docuHora = docuHora;
    }

    public String getDocuTipoComprobante() {
        return docuTipoComprobante;
    }

    public void setDocuTipoComprobante(String docuTipoComprobante) {
        this.docuTipoComprobante = docuTipoComprobante;
    }

    public String getDocuNumeroComprobante() {
        return docuNumeroComprobante;
    }

    public void setDocuNumeroComprobante(String docuNumeroComprobante) {
        this.docuNumeroComprobante = docuNumeroComprobante;
    }

    public String getDocuMoneda() {
        return docuMoneda;
    }

    public void setDocuMoneda(String docuMoneda) {
        this.docuMoneda = docuMoneda;
    }

    public String getDocuGravada() {
        return docuGravada;
    }

    public void setDocuGravada(String docuGravada) {
        this.docuGravada = docuGravada;
    }

    public String getDocuInafecta() {
        return docuInafecta;
    }

    public void setDocuInafecta(String docuInafecta) {
        this.docuInafecta = docuInafecta;
    }

    public String getDocuExonerada() {
        return docuExonerada;
    }

    public void setDocuExonerada(String docuExonerada) {
        this.docuExonerada = docuExonerada;
    }

    public String getDocuGratuita() {
        return docuGratuita;
    }

    public void setDocuGratuita(String docuGratuita) {
        this.docuGratuita = docuGratuita;
    }

    public String getDocuDescuento() {
        return docuDescuento;
    }

    public void setDocuDescuento(String docuDescuento) {
        this.docuDescuento = docuDescuento;
    }

    public String getDocuSubtotal() {
        return docuSubtotal;
    }

    public void setDocuSubtotal(String docuSubtotal) {
        this.docuSubtotal = docuSubtotal;
    }

    public String getDocuTotal() {
        return docuTotal;
    }

    public void setDocuTotal(String docuTotal) {
        this.docuTotal = docuTotal;
    }

    public String getDocuIgv() {
        return docuIgv;
    }

    public void setDocuIgv(String docuIgv) {
        this.docuIgv = docuIgv;
    }

    public String getTasaIgv() {
        return tasaIgv;
    }

    public void setTasaIgv(String tasaIgv) {
        this.tasaIgv = tasaIgv;
    }

    public String getDocuIsc() {
        return docuIsc;
    }

    public void setDocuIsc(String docuIsc) {
        this.docuIsc = docuIsc;
    }

    public String getTasaIsc() {
        return tasaIsc;
    }

    public void setTasaIsc(String tasaIsc) {
        this.tasaIsc = tasaIsc;
    }

    public String getDocuOtrosTributos() {
        return docuOtrosTributos;
    }

    public void setDocuOtrosTributos(String docuOtrosTributos) {
        this.docuOtrosTributos = docuOtrosTributos;
    }

    public String getTasaOtrosTributos() {
        return tasaOtrosTributos;
    }

    public void setTasaOtrosTributos(String tasaOtrosTributos) {
        this.tasaOtrosTributos = tasaOtrosTributos;
    }

    public String getDocuOtrosCargos() {
        return docuOtrosCargos;
    }

    public void setDocuOtrosCargos(String docuOtrosCargos) {
        this.docuOtrosCargos = docuOtrosCargos;
    }

    public String getDocuPercepcion() {
        return docuPercepcion;
    }

    public void setDocuPercepcion(String docuPercepcion) {
        this.docuPercepcion = docuPercepcion;
    }

    public String getHashCode() {
        return hashCode;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    public String getCdr() {
        return cdr;
    }

    public void setCdr(String cdr) {
        this.cdr = cdr;
    }

    public String getCdrNota() {
        return cdrNota;
    }

    public void setCdrNota(String cdrNota) {
        this.cdrNota = cdrNota;
    }

    public String getCdrObservacion() {
        return cdrObservacion;
    }

    public void setCdrObservacion(String cdrObservacion) {
        this.cdrObservacion = cdrObservacion;
    }

    public String getDocuEnviaws() {
        return docuEnviaws;
    }

    public void setDocuEnviaws(String docuEnviaws) {
        this.docuEnviaws = docuEnviaws;
    }

    public String getDocuProceStatus() {
        return docuProceStatus;
    }

    public void setDocuProceStatus(String docuProceStatus) {
        this.docuProceStatus = docuProceStatus;
    }

    public String getDocuProceFecha() {
        return docuProceFecha;
    }

    public void setDocuProceFecha(String docuProceFecha) {
        this.docuProceFecha = docuProceFecha;
    }

    public String getDocuLinkPdf() {
        return docuLinkPdf;
    }

    public void setDocuLinkPdf(String docuLinkPdf) {
        this.docuLinkPdf = docuLinkPdf;
    }

    public String getDocuLinkCdr() {
        return docuLinkCdr;
    }

    public void setDocuLinkCdr(String docuLinkCdr) {
        this.docuLinkCdr = docuLinkCdr;
    }

    public String getDocuLinkXml() {
        return docuLinkXml;
    }

    public void setDocuLinkXml(String docuLinkXml) {
        this.docuLinkXml = docuLinkXml;
    }

    public String getClieCorreoCpe1() {
        return clieCorreoCpe1;
    }

    public void setClieCorreoCpe1(String clieCorreoCpe1) {
        this.clieCorreoCpe1 = clieCorreoCpe1;
    }

    public String getClieCorreoCpe2() {
        return clieCorreoCpe2;
    }

    public void setClieCorreoCpe2(String clieCorreoCpe2) {
        this.clieCorreoCpe2 = clieCorreoCpe2;
    }

    public DocumentoCabBean() {
    }

}
