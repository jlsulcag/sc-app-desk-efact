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
public class DocumentoLeyendaBean {
    
    private Long idLeyenda;
    private long docuCodigo;
    private String leyendaCodigo;
    private String leyendaTexto;

    public DocumentoLeyendaBean() {
    }

    public Long getIdLeyenda() {
        return idLeyenda;
    }

    public void setIdLeyenda(Long idLeyenda) {
        this.idLeyenda = idLeyenda;
    }

    public long getDocuCodigo() {
        return docuCodigo;
    }

    public void setDocuCodigo(long docuCodigo) {
        this.docuCodigo = docuCodigo;
    }

    public String getLeyendaCodigo() {
        return leyendaCodigo;
    }

    public void setLeyendaCodigo(String leyendaCodigo) {
        this.leyendaCodigo = leyendaCodigo;
    }

    public String getLeyendaTexto() {
        return leyendaTexto;
    }

    public void setLeyendaTexto(String leyendaTexto) {
        this.leyendaTexto = leyendaTexto;
    }
    
    
}
