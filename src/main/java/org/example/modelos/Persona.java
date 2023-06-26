package org.example.modelos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {

    private Integer id;
    private String documento;
    private String nombres;
    private String correo;
    private Integer ubicacion;

    public Persona() {
    }

    public Persona(Integer id, String documento, String nombres, String correo, Integer ubicacion) {
        this.id = id;
        this.documento = documento;
        this.nombres = nombres;
        this.correo = correo;
        this.ubicacion = ubicacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) throws Exception {

        if(nombres.length()<10){
            throw new Exception("Revisa el nombre ingresado");
        }else{
            this.nombres = nombres;
        }


    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) throws Exception {
        String patronCorreo = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(patronCorreo);
        Matcher matcher = pattern.matcher(correo);
        if(matcher.matches()){
            this.correo = correo;
        }else{
            throw new Exception("Revisa, el correo no es valido");
        }
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }
}
