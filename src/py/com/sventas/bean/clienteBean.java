/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.sventas.bean;

import java.sql.Date;

/**
 *
 * @author usuarios1
 */
 public class clienteBean {
 private Integer cod_cliente;
 private Date fch_nacimiento;
 private Date desde_cliente;
 private String profesion_cliente;
 private String empresa_cliente;
 private String nom_cliente;
 private String tel_empresa;
 private Double renta_cliente; 
 private char tipo_cliente;
 private String ruc_cliente;
 private String ref_cliente;
 private String tel_referencia;
 private String email;

    /**
     * @return the cod_cliente
     */
    public Integer getCod_cliente() {
        return cod_cliente;
    }

    /**
     * @param cod_cliente the cod_cliente to set
     */
    public void setCod_cliente(Integer cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    /**
     * @return the fch_nacimiento
     */
    public Date getFch_nacimiento() {
        return fch_nacimiento;
    }

    /**
     * @param fch_nacimiento the fch_nacimiento to set
     */
    public void setFch_nacimiento(Date fch_nacimiento) {
        this.fch_nacimiento = fch_nacimiento;
    }

    /**
     * @return the desde_cliente
     */
    public Date getDesde_cliente() {
        return desde_cliente;
    }

    /**
     * @param desde_cliente the desde_cliente to set
     */
    public void setDesde_cliente(Date desde_cliente) {
        this.desde_cliente = desde_cliente;
    }

    /**
     * @return the profesion_cliente
     */
    public String getProfesion_cliente() {
        return profesion_cliente;
    }

    /**
     * @param profesion_cliente the profesion_cliente to set
     */
    public void setProfesion_cliente(String profesion_cliente) {
        this.profesion_cliente = profesion_cliente;
    }

    /**
     * @return the empresa_cliente
     */
    public String getEmpresa_cliente() {
        return empresa_cliente;
    }

    /**
     * @param empresa_cliente the empresa_cliente to set
     */
    public void setEmpresa_cliente(String empresa_cliente) {
        this.empresa_cliente = empresa_cliente;
    }

    /**
     * @return the nom_cliente
     */
    public String getNom_cliente() {
        return nom_cliente;
    }

    /**
     * @param nom_cliente the nom_cliente to set
     */
    public void setNom_cliente(String nom_cliente) {
        this.nom_cliente = nom_cliente;
    }

    /**
     * @return the tel_empresa
     */
    public String getTel_empresa() {
        return tel_empresa;
    }

    /**
     * @param tel_empresa the tel_empresa to set
     */
    public void setTel_empresa(String tel_empresa) {
        this.tel_empresa = tel_empresa;
    }

    /**
     * @return the renta_cliente
     */
    public Double getRenta_cliente() {
        return renta_cliente;
    }

    /**
     * @param renta_cliente the renta_cliente to set
     */
    public void setRenta_cliente(Double renta_cliente) {
        this.renta_cliente = renta_cliente;
    }

    /**
     * @return the tipo_cliente
     */
    public char getTipo_cliente() {
        return tipo_cliente;
    }

    /**
     * @param tipo_cliente the tipo_cliente to set
     */
    public void setTipo_cliente(char tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    /**
     * @return the ruc_cliente
     */
    public String getRuc_cliente() {
        return ruc_cliente;
    }

    /**
     * @param ruc_cliente the ruc_cliente to set
     */
    public void setRuc_cliente(String ruc_cliente) {
        this.ruc_cliente = ruc_cliente;
    }

    /**
     * @return the ref_cliente
     */
    public String getRef_cliente() {
        return ref_cliente;
    }

    /**
     * @param ref_cliente the ref_cliente to set
     */
    public void setRef_cliente(String ref_cliente) {
        this.ref_cliente = ref_cliente;
    }

    /**
     * @return the tel_referencia
     */
    public String getTel_referencia() {
        return tel_referencia;
    }

    /**
     * @param tel_referencia the tel_referencia to set
     */
    public void setTel_referencia(String tel_referencia) {
        this.tel_referencia = tel_referencia;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
