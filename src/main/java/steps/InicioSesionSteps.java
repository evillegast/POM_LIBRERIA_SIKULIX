package steps;

import net.thucydides.core.annotations.Step;
import org.sikuli.script.Screen;
import utilidades.DatosExcel;

import java.io.IOException;

public class InicioSesionSteps  {


    //InicioSesionPageObject inicioSesionPageObject = new InicioSesionPageObject();
    com.coeasy.utilidades.SikuliUtils sikuliUtils;
    Screen screen;
    DatosExcel datosExcel = new DatosExcel();
    private static final String NOMBRE_EXCEL="Datos.xlsx";
    private static final String NOMBRE_HOJA="UsuarioNomina";


    @Step
    public void abrirNavegador() {


//        InternetExplorerOptions options = new InternetExplorerOptions();
//        options.ignoreZoomSettings(); // Ignora la configuración de zoom
//        options.introduceFlakinessByIgnoringSecurityDomains(); // Ignora problemas de dominios de seguridad
//        WebDriver driver = new InternetExplorerDriver(options);
//        driver.manage().window().maximize();
//        driver.get("http://joker.corredor.local:8891/forms/frmservlet?config=coeasy");

    }

    @Step
    public void ingresarUsuario() throws IOException {


        sikuliUtils.esperarElemento("txtusuario.png", 4000);
        sikuliUtils.click();
        screen.getScreen(12).click();






    }

    @Step
    public void ingresarClave() throws IOException {





    }

}













