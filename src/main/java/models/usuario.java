package models;

public class usuario {

    String usuario;
    String contrasena;
    String dateBD;
    String txtFondo;

    public usuario(String usuario, String contrasena, String dateBD, String txtFondo) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.dateBD = dateBD;
        this.txtFondo = txtFondo;
    }

    public String getUsuario() {return usuario;}

    public String getContrasena() {return contrasena;}

    public String getDateBD() {return dateBD;}

    public String getTxtFondo() {return txtFondo;}
}
