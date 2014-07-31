/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javatutoriales.struts2.configuracion.acciones;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.*;
/**
 *
 * @author inmaculada.garcia
 */

@Namespace(value="/")
@Action(value="saludo",results=@Result(name="success", location="/saludo.jsp"))

public class SaludoAction extends ActionSupport{
    
    private String mensaje;
    
    @Override
    public String execute(){
        mensaje="Hola Mundo de Struts 2";
        return SUCCESS;
    }
    
    public String getMensaje(){
        return mensaje;
    }
}
