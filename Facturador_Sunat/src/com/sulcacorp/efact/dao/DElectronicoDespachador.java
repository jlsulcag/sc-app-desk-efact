package com.sulcacorp.efact.dao;

import com.sulcacorp.efact.model.DocumentoCabBean;
import com.sulcacorp.efact.model.DocumentoDetBean;
import com.sulcacorp.efact.model.DocumentoLeyendaBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DElectronicoDespachador {
    private static Log log = LogFactory.getLog(DElectronicoDespachador.class);

    public static DocumentoCabBean cargarDocElectronico(Long idCabecera, Connection conn) {
        DocumentoCabBean b = null;

//        Connection conn = null;
        try {
//            conn = ConnectionPool.obtenerConexionMysql();
            String sql = "SELECT ID_CABECERA,";
            sql += " EMPR_RAZONSOCIAL,";
            sql += " EMPR_UBIGEO,";
            sql += " EMPR_NOMBRE_COMERCIAL,";
            sql += " EMPR_DIRECCION,";
            sql += " EMPR_PROVINCIA,";
            sql += " EMPR_DEPARTAMENTO,";
            sql += " EMPR_DISTRITO,";
            sql += " EMPR_PAIS,";
            sql += " EMPR_NRO_RUC,";
            sql += " EMPR_TIPO_COMPROBANTE,";
            sql += " CLIE_NUMERO_DOC_IDENTIDAD,";
            sql += " CLIE_TIPO_DOC,";
            sql += " CLIE_NOMBRE,";
            sql += " DOCU_FECHA,";
            sql += " DOCU_HORA,";
            sql += " DOCU_TIPO_COMPROBANTE,";
            sql += " DOCU_NUMERO_COMPROBANTE,";
            sql += " DOCU_MONEDA,";
            sql += " DOCU_GRAVADA  as  DOCU_GRAVADA,";
            sql += " DOCU_INAFECTA  as  DOCU_INAFECTA,";
            sql += " DOCU_EXONERADA  as  DOCU_EXONERADA,";
            sql += " DOCU_GRATUITA  as  DOCU_GRATUITA,";
            sql += " DOCU_DESCUENTO  as  DOCU_DESCUENTO,";
            sql += " DOCU_SUBTOTAL  as  DOCU_SUBTOTAL,";
            sql += " DOCU_TOTAL  as  DOCU_TOTAL,";
            sql += " DOCU_IGV  as  DOCU_IGV,";
            sql += " TASA_IGV,";
            sql += " DOCU_ISC,";
            sql += " TASA_ISC,";
            sql += " DOCU_OTROS_TRIBUTOS  as  DOCU_OTROS_TRIBUTOS,";
            sql += " TASA_OTROS_TRIBUTOS,";
            sql += " DOCU_OTROS_CARGOS  as  DOCU_OTROS_CARGOS,";
            sql += " DOCU_PERCEPCION  as  DOCU_PERCEPCION,";
            sql += " DOCU_ENVIA_WS, ";
            sql += " ID_EXTERNO, ";
            sql += " CLIE_CORREO_CPE1, ";
            sql += " CLIE_CORREO_CPE2 ";
            
            
            sql += " FROM CABECERA";
            sql += " WHERE  ID_CABECERA = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, idCabecera);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                b = new DocumentoCabBean();
                b.setIdCabecera(rs.getLong("ID_CABECERA"));
                b.setEmprRazonsocial(rs.getString("EMPR_RAZONSOCIAL"));
                b.setEmprUbigeo(rs.getString("EMPR_UBIGEO"));
                b.setEmprNombrecomercial(rs.getString("EMPR_NOMBRE_COMERCIAL"));
                b.setEmprDireccion(rs.getString("EMPR_DIRECCION"));
                b.setEmprProvincia(rs.getString("EMPR_PROVINCIA"));
                b.setEmprDepartamento(rs.getString("EMPR_DEPARTAMENTO"));
                b.setEmprDistrito(rs.getString("EMPR_DISTRITO"));
                b.setEmprPais(rs.getString("EMPR_PAIS"));
                b.setEmprNroruc(rs.getString("EMPR_NRO_RUC"));
                b.setEmprTipoComprobante(rs.getString("EMPR_TIPO_COMPROBANTE"));
                b.setClieNumeroDocIdentidad(rs.getString("CLIE_NUMERO_DOC_IDENTIDAD"));
                b.setClieTipoDocIdentidad(rs.getString("CLIE_TIPO_DOC"));
                b.setClieNombre(rs.getString("CLIE_NOMBRE"));
                b.setDocuFecha(rs.getDate("DOCU_FECHA"));
                b.setDocuHora(rs.getString("DOCU_HORA"));
                b.setDocuTipoComprobante(rs.getString("DOCU_TIPO_COMPROBANTE"));
                b.setDocuNumeroComprobante(rs.getString("DOCU_NUMERO_COMPROBANTE"));
                b.setDocuMoneda(rs.getString("DOCU_MONEDA"));
                b.setDocuGravada(rs.getString("DOCU_GRAVADA"));
                b.setDocuInafecta(rs.getString("DOCU_INAFECTA"));
                b.setDocuExonerada(rs.getString("DOCU_EXONERADA"));
                b.setDocuGratuita(rs.getString("DOCU_GRATUITA"));
                b.setDocuDescuento(rs.getString("DOCU_DESCUENTO"));
                b.setDocuSubtotal(rs.getString("DOCU_SUB_TOTAL"));
                b.setDocuTotal(rs.getString("DOCU_TOTAL"));
                b.setDocuIgv(rs.getString("DOCU_TOTAL"));
                b.setTasaIgv(rs.getString("TASA_IGV"));
                b.setDocuIsc(rs.getString("DOCU_ISC"));
                b.setTasaIsc(rs.getString("TASA_ISC"));
                b.setDocuOtrosTributos(rs.getString("DOCU_OTROS_TRIBUTOS"));
                b.setTasaOtrosTributos(rs.getString("TASA_OTROS_TRIBUTOS"));
                b.setDocuOtrosCargos(rs.getString("DOCU_OTROS_CARGOS"));
                b.setDocuPercepcion(rs.getString("DOCU_PERCEPCION"));
                b.setDocuEnviaws(rs.getString("DOCU_ENVIA_WS"));
                b.setIdExterno(rs.getString("ID_EXTERNO"));
                b.setClieCorreoCpe1(rs.getString("CLIE_CORREO_CPE1"));
                b.setClieCorreoCpe2(rs.getString("CLIE_CORREO_CPE2"));

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
//            ConnectionPool.closeConexion(conn);
        }
        return b;
    }

    public static List<DocumentoDetBean> cargarDetDocElectronico(Long idCabecera, Connection conn) throws SQLException {
        List<DocumentoDetBean> detalle = new ArrayList<DocumentoDetBean>();
//        Connection conn = null;
        try {
//            conn = ConnectionPool.obtenerConexionMysql();
            String sql = "SELECT  ID_CABECERA,";
            sql += " ITEM_ORDEN,";
            sql += " ITEM_UNIDAD,";
            sql += " ITEM_CANTIDAD,";
            sql += " ITEM_COD_PRODUCTO,";
            sql += " ITEM_DESCRIPCION,";
            sql += " ITEM_TIPO_AFECTACION,";
            sql += " ITEM_TIPO_PRECIO_VENTA, ";
            sql += " ITEM_VALOR_VENTA, ";
            sql += " ITEM_PRECIO_VENTA_NO_HONEROSA,";
            sql += " ITEM_SUBTOTAL,";
            sql += " ITEM_IGV, ";

            sql += " FROM DETALLE";
            sql += " WHERE ID_CABECERA = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, idCabecera);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DocumentoDetBean cdetalle = new DocumentoDetBean();
                cdetalle.setIdCabecera(rs.getLong("ID_CABECERA"));
                cdetalle.setItemOrden(rs.getString("ITEM_ORDEN"));
                cdetalle.setItemUnidad(rs.getString("ITEM_UNIDAD"));
                cdetalle.setItemCantidad(rs.getString("ITEM_CANTIDAD"));
                cdetalle.setItemCodproducto(rs.getString("ITEM_COD_PRODUCTO"));
                cdetalle.setItemDescripcion(rs.getString("ITEM_DESCRIPCION"));
                cdetalle.setItemTipoAfectacion(rs.getString("ITEM_TIPO_AFECTACION"));
                cdetalle.setItemTipoPrecioVenta(rs.getString("ITEM_TIPO_PRECIO_VENTA"));
                cdetalle.setItemValorVenta(rs.getString("ITEM_VALOR_VENTA"));                
                cdetalle.setItemPrecioVentaNoOnerosa(rs.getString("ITEM_PRECIO_VENTA_NO_HONEROSA"));
                cdetalle.setItemSubtotal(rs.getString("ITEM_SUBTOTAL"));
                cdetalle.setItemIgv(rs.getString("ITEM_IGV"));

                detalle.add(cdetalle);
            }
        } catch (Exception ex) {
            throw new SQLException(ex);
        } finally {
//            ConnectionPool.closeConexion(conn);
        }
        return detalle;
    }

    public static List<DocumentoLeyendaBean> cargarDetDocElectronicoLeyenda(Long idCabecera, Connection conn) throws SQLException {
        List<DocumentoLeyendaBean> detalle = new ArrayList<DocumentoLeyendaBean>();

        try {

            String sql = "SELECT  ID_LEYENDA, "
                    + "LEYENDA_TEXTO ";
            sql += " FROM LEYENDA ";
            sql += " WHERE ID_CABECERA = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, idCabecera);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DocumentoLeyendaBean leyenda = new DocumentoLeyendaBean();
                leyenda.setLeyendaCodigo(rs.getString("LEYENDA_CODIGO"));
                leyenda.setLeyendaTexto(rs.getString("LEYENDA_TEXTO"));                
                detalle.add(leyenda);
            }
        } catch (Exception ex) {
            throw new SQLException(ex);
        } finally {
        }
        return detalle;
    }

    public static DocumentoCabBean pendienteDocElectronico(Connection conn) {
        DocumentoCabBean b = null;

//        Connection conn = null;
        try {
//            conn = ConnectionPool.obtenerConexionMysql();
            String sql = "SELECT * ";
            sql += " FROM CABECERA";
            sql += " WHERE  DOCU_PROCE_STATUS = 'N' ";
            sql += " order by ID_CABECERA LIMIT 1 ";

            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                b = new DocumentoCabBean();
                b.setIdCabecera(rs.getLong("ID_CABECERA"));
                b.setEmprRazonsocial(rs.getString("EMPR_RAZONSOCIAL"));
                b.setEmprUbigeo(rs.getString("EMPR_UBIGEO"));
                b.setEmprNombrecomercial(rs.getString("EMPR_NOMBRE_COMERCIAL"));
                b.setEmprDireccion(rs.getString("EMPR_DIRECCION"));
                b.setEmprProvincia(rs.getString("EMPR_PROVINCIA"));
                b.setEmprDepartamento(rs.getString("EMPR_DEPARTAMENTO"));
                b.setEmprDistrito(rs.getString("EMPR_DISTRITO"));
                b.setEmprPais(rs.getString("EMPR_PAIS"));
                b.setEmprNroruc(rs.getString("EMPR_NRO_RUC"));
                b.setEmprTipoComprobante(rs.getString("EMPR_TIPO_COMPROBANTE"));
                b.setClieNumeroDocIdentidad(rs.getString("CLIE_NUMERO_DOC_IDENTIDAD"));
                b.setClieTipoDocIdentidad(rs.getString("CLIE_TIPO_DOC"));
                b.setClieNombre(rs.getString("CLIE_NOMBRE"));
                b.setDocuFecha(rs.getDate("DOCU_FECHA"));
                b.setDocuHora(rs.getString("DOCU_HORA"));
                b.setDocuTipoComprobante(rs.getString("DOCU_TIPO_COMPROBANTE"));
                b.setDocuNumeroComprobante(rs.getString("DOCU_NUMERO_COMPROBANTE"));
                b.setDocuMoneda(rs.getString("DOCU_MONEDA"));
                b.setDocuGravada(rs.getString("DOCU_GRAVADA"));
                b.setDocuInafecta(rs.getString("DOCU_INAFECTA"));
                b.setDocuExonerada(rs.getString("DOCU_EXONERADA"));
                b.setDocuGratuita(rs.getString("DOCU_GRATUITA"));
                b.setDocuDescuento(rs.getString("DOCU_DESCUENTO"));
                b.setDocuSubtotal(rs.getString("DOCU_SUB_TOTAL"));
                b.setDocuTotal(rs.getString("DOCU_TOTAL"));
                b.setDocuIgv(rs.getString("DOCU_TOTAL"));
                b.setTasaIgv(rs.getString("TASA_IGV"));
                b.setDocuIsc(rs.getString("DOCU_ISC"));
                b.setTasaIsc(rs.getString("TASA_ISC"));
                b.setDocuOtrosTributos(rs.getString("DOCU_OTROS_TRIBUTOS"));
                b.setTasaOtrosTributos(rs.getString("TASA_OTROS_TRIBUTOS"));
                b.setDocuOtrosCargos(rs.getString("DOCU_OTROS_CARGOS"));
                b.setDocuPercepcion(rs.getString("DOCU_PERCEPCION"));
                b.setDocuEnviaws(rs.getString("DOCU_ENVIA_WS"));
                b.setIdExterno(rs.getString("ID_EXTERNO"));
                b.setClieCorreoCpe1(rs.getString("CLIE_CORREO_CPE1"));
                b.setClieCorreoCpe2(rs.getString("CLIE_CORREO_CPE2"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
//            ConnectionPool.closeConexion(conn);
        }
        return b;
    }

    public static DocumentoCabBean noPendienteDocElectronico(Connection conn) {
        DocumentoCabBean b = null;

//        Connection conn = null;
        try {
//            conn = ConnectionPool.obtenerConexionMysql();
            String sql = "SELECT * ";
            sql += " FROM CABECERA";
            sql += " WHERE  DOCU_PROCE_STATUS in ('B','P','E','X') and DOCU_PROCE_FECHA <=  DATE_SUB(NOW(), INTERVAL 10 MINUTE)";
            sql += " order by ID_CABECERA LIMIT 1 ";

            PreparedStatement ps = conn.prepareStatement(sql);
            //ps.setString(1, proceso);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                b = new DocumentoCabBean();
                b.setIdCabecera(rs.getLong("ID_CABECERA"));
                b.setEmprRazonsocial(rs.getString("EMPR_RAZONSOCIAL"));
                b.setEmprUbigeo(rs.getString("EMPR_UBIGEO"));
                b.setEmprNombrecomercial(rs.getString("EMPR_NOMBRE_COMERCIAL"));
                b.setEmprDireccion(rs.getString("EMPR_DIRECCION"));
                b.setEmprProvincia(rs.getString("EMPR_PROVINCIA"));
                b.setEmprDepartamento(rs.getString("EMPR_DEPARTAMENTO"));
                b.setEmprDistrito(rs.getString("EMPR_DISTRITO"));
                b.setEmprPais(rs.getString("EMPR_PAIS"));
                b.setEmprNroruc(rs.getString("EMPR_NRO_RUC"));
                b.setEmprTipoComprobante(rs.getString("EMPR_TIPO_COMPROBANTE"));
                b.setClieNumeroDocIdentidad(rs.getString("CLIE_NUMERO_DOC_IDENTIDAD"));
                b.setClieTipoDocIdentidad(rs.getString("CLIE_TIPO_DOC"));
                b.setClieNombre(rs.getString("CLIE_NOMBRE"));
                b.setDocuFecha(rs.getDate("DOCU_FECHA"));
                b.setDocuHora(rs.getString("DOCU_HORA"));
                b.setDocuTipoComprobante(rs.getString("DOCU_TIPO_COMPROBANTE"));
                b.setDocuNumeroComprobante(rs.getString("DOCU_NUMERO_COMPROBANTE"));
                b.setDocuMoneda(rs.getString("DOCU_MONEDA"));
                b.setDocuGravada(rs.getString("DOCU_GRAVADA"));
                b.setDocuInafecta(rs.getString("DOCU_INAFECTA"));
                b.setDocuExonerada(rs.getString("DOCU_EXONERADA"));
                b.setDocuGratuita(rs.getString("DOCU_GRATUITA"));
                b.setDocuDescuento(rs.getString("DOCU_DESCUENTO"));
                b.setDocuSubtotal(rs.getString("DOCU_SUB_TOTAL"));
                b.setDocuTotal(rs.getString("DOCU_TOTAL"));
                b.setDocuIgv(rs.getString("DOCU_TOTAL"));
                b.setTasaIgv(rs.getString("TASA_IGV"));
                b.setDocuIsc(rs.getString("DOCU_ISC"));
                b.setTasaIsc(rs.getString("TASA_ISC"));
                b.setDocuOtrosTributos(rs.getString("DOCU_OTROS_TRIBUTOS"));
                b.setTasaOtrosTributos(rs.getString("TASA_OTROS_TRIBUTOS"));
                b.setDocuOtrosCargos(rs.getString("DOCU_OTROS_CARGOS"));
                b.setDocuPercepcion(rs.getString("DOCU_PERCEPCION"));
                b.setDocuEnviaws(rs.getString("DOCU_ENVIA_WS"));
                b.setIdExterno(rs.getString("ID_EXTERNO"));
                b.setClieCorreoCpe1(rs.getString("CLIE_CORREO_CPE1"));
                b.setClieCorreoCpe2(rs.getString("CLIE_CORREO_CPE2"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
//            ConnectionPool.closeConexion(conn);
        }
        return b;
    }
}
