package com.tallerweb.model;

/**
 * Created by gonza on 6/6/2017.
 */
public class Mail {
    private String cuerpoMail;
    private String asunto;
    private String nombreContacto;


    public Mail(){

    }

    public String getCuerpoMail() {
        return cuerpoMail;
    }


    public String getAsunto() {
        return asunto;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void setCuerpoMail(String cuerpoMail) {
            this.cuerpoMail = cuerpoMail;
    }



    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

}
