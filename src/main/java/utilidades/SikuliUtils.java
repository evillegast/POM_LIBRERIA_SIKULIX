package com.coeasy.utilidades;

import net.serenitybdd.core.Serenity;
import org.sikuli.script.*;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SikuliUtils extends Screen {
    private static final File directory = new File("src\\main\\resources\\images\\");
    private static final String ABSOLUTE_PATH = directory.getAbsolutePath();
    private static final Screen screen = new Screen();
    private static Pattern pattern;
    public static final Logger LOG = Logger.getLogger("Ejecución");

    public static void clickElemento(String imagen) {
        Serenity.recordReportData().asEvidence().withTitle("Click al elemento " + imagen + " ");
        pattern = new Pattern(ABSOLUTE_PATH + "\\" + imagen + ".png");
        LOG.log(Level.INFO, () -> "******* " + pattern + "*******");
        try {
            if (screen.exists(pattern) != null) {
                screen.click(pattern);
                LOG.log(Level.INFO, () -> "******* Click exitoso: " + imagen + " ******");
            }
        } catch (FindFailed e) {
            e.printStackTrace();
        }

    }

    public static void dobleClickElemento(String imagen) {
        Serenity.recordReportData().asEvidence().withTitle("Doble Click al elemento " + imagen + " ");
        pattern = new Pattern(ABSOLUTE_PATH + "\\" + imagen + ".png");
        LOG.log(Level.INFO, () -> "******* " + pattern + "*******");
        try {
            if (screen.exists(pattern) != null) {
                screen.click(pattern);
                LOG.log(Level.INFO, () -> "******* Doble Click exitoso: " + imagen + " ********");
            }
        } catch (FindFailed e) {
            e.printStackTrace();
        }
    }

    public static boolean alertaEstaPresente(String imagen) {
        boolean estaPresente = screen.exists(pattern) != null;
        pattern = new Pattern(ABSOLUTE_PATH + "\\" + imagen + ".png").similar((float) (0.95));
        if (estaPresente) {
            Serenity.recordReportData().asEvidence().withTitle("Alerta Presente: " + imagen + " ");
            LOG.log(Level.INFO, () -> "******* Alerta encontrada: " + imagen + " *******");
        }
        return estaPresente;
    }

    public void esperarElemento(String imagen, int segundos) {
        Serenity.recordReportData().asEvidence().withTitle("Esperando elemento " + imagen + " ");
        pattern = new Pattern(ABSOLUTE_PATH + "\\" + imagen + ".png").exact();
        try {
            LOG.log(Level.INFO, () -> "******* Esperando elemento " + imagen + " " + segundos + " segundos *******");
            screen.wait(pattern, segundos);
        } catch (FindFailed e) {
            throw new RuntimeException(e);

        }
    }

    public void escribirTexto(String texto) {
        try {
            Serenity.recordReportData().asEvidence().withTitle("Escribiendo texto: " + texto + " ");
            LOG.log(Level.INFO, () -> "******* Escribiendo texto: " + texto + " *******");
            screen.type(texto);
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }

}
