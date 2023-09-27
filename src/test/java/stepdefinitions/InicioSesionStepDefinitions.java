package stepdefinitions;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import models.usuario;
import net.thucydides.core.annotations.Steps;
import pageobject.MenuCruceGarantias;
import steps.InicioSesionSteps;

import java.io.IOException;
import java.util.List;

public class InicioSesionStepDefinitions {


    //InicioSesionPageObject inicioSesionPageObject = new InicioSesionPageObject();
    @Steps
    MenuCruceGarantias menuCruceGarantias;
    @Steps
    InicioSesionSteps inicioSesionSteps;



    @Dado("que ingreso a Coeasy")
    public void queIngresoACoeasy() {
       inicioSesionSteps.abrirNavegador();



    }

    @Y("digito las credenciales")
    public void digitoLasCredenciales(List<usuario> usuarioList) throws IOException {
        inicioSesionSteps.ingresarUsuario();
        inicioSesionSteps.ingresarClave();



    }


   @Cuando("realizo el proceso de cruce de garantias CTIMFO")
   public void realizoElProcesoDeCruceDeGarantiasCTIMFO() {




   }


   @Entonces("Cierro proceso porcentaje de compartimiento COCODI")
    public void cierroProcesoPorcentajeDeCompartimientoCOCODI() {

    }



}

