package com.tallerweb.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tallerweb.model.Mail;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;


/**
 * Created by gonza on 6/6/2017.
 */
public class MailAction extends ActionSupport implements ModelDriven<Mail>{

    @Override
    public Mail getModel(){
        return mail;
    }
    private Mail mail = new Mail();

    @Action(value ="Contacto", results = {
            @Result(name =SUCCESS,type = "dispatcher",location = "/jsp/Contacto.jsp")})
    public String IniciarFormulario(){
        System.out.println("Hemos pasado por aqui");
        addActionMessage("Rellene los campos");
        return SUCCESS;
    }

    @Action(value="VerificarFormulario",results = {
            @Result(name = SUCCESS,type="redirect",location="Home"),
            @Result(name = ERROR, type = "dispatcher", location ="/jsp/Contacto.jsp"),
            @Result(name = INPUT, type = "dispatcher", location ="/jsp/Contacto.jsp")})
    public String verificarUsuario(){
                String mensaje = null;
        System.out.println("LLege aca");

                if("".equals(mail.getAsuntoMail()) || "".equals(mail.getEmailMail())|| "".equals(mail.getNombreMail())){
                    System.out.printf("Ha ocurrido un error");
                    mensaje ="Debe rellenar todo los campos";
                    addActionMessage(mensaje);
                    return ERROR;
                }
                else{
                    System.out.println("Formulario completado correctamente");
                    return SUCCESS;
                }
            }

            public Mail getMail(){
                return mail;
            }

            public void setMail(Mail mail) {
            this.mail = mail;
    }
}


