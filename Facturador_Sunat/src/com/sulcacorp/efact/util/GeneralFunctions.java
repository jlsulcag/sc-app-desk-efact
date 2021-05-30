/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sulcacorp.efact.util;

import com.sulcacorp.efact.model.DocumentoCabBean;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class GeneralFunctions {

    private static Log log = LogFactory.getLog(LecturaXML.class);


    public static String crearZip(DocumentoCabBean items, String unidadEnvio, File signatureFile) {
        String resultado = "";
        try {
            //Mandar a zip
            log.info("generarXMLZipiadoFactura - Crear ZIP ");
            String inputFile = signatureFile.toString();
            FileInputStream in = new FileInputStream(inputFile);
            FileOutputStream out = new FileOutputStream(unidadEnvio + items.getEmprNroruc() + "-" + items.getDocuTipoComprobante() + "-" + items.getDocuNumeroComprobante() + ".zip");

            byte b[] = new byte[2048];
            try (ZipOutputStream zipOut = new ZipOutputStream(out)) {
                ZipEntry entry2 = new ZipEntry(items.getEmprNroruc() + "-" + items.getDocuTipoComprobante() + "-" + items.getDocuNumeroComprobante() + ".xml");
                zipOut.putNextEntry(entry2);
                System.out.println("==>Zip generado: " + items.getEmprNroruc() + "-" + items.getDocuTipoComprobante() + "-" + items.getDocuNumeroComprobante() + ".zip");
                int len = 0;
                while ((len = in.read(b)) != -1) {
                    zipOut.write(b, 0, len);
                }
                zipOut.closeEntry();
            }
            out.close();
            in.close();
            log.info("generarXMLZipiadoFactura - Zip creado " + unidadEnvio + items.getEmprNroruc() + "-" + items.getDocuTipoComprobante() + "-" + items.getDocuNumeroComprobante() + ".zip");

        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("generarXMLZipiadoFactura - error  " + ex.toString());

        }
        return resultado;
    }
}