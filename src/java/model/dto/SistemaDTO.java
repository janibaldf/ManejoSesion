/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dto;

/**
 *
 * @author DIAZF.JORGE
 */
public class SistemaDTO {
    private int idSistema;
    private String pais;
    private String codigoCMDB;
    private String dbName;
    private String nombreCorto;
    private String nombreCompleto;
    private int usuarioEstandar;
    private int tipoUsuario;
    private int tipoPass;
    private int estado;
    private String URLSistema;

    public SistemaDTO() {
    }

    public SistemaDTO(int idSistema, String pais, String codigoCMDB, String dbName, String nombreCorto, String nombreCompleto, int usuarioEstandar, int tipoUsuario, int tipoPass, int estado, String URLSistema) {
        this.idSistema = idSistema;
        this.pais = pais;
        this.codigoCMDB = codigoCMDB;
        this.dbName = dbName;
        this.nombreCorto = nombreCorto;
        this.nombreCompleto = nombreCompleto;
        this.usuarioEstandar = usuarioEstandar;
        this.tipoUsuario = tipoUsuario;
        this.tipoPass = tipoPass;
        this.estado = estado;
        this.URLSistema = URLSistema;
    }

    public SistemaDTO(int idSistema) {
        this.idSistema = idSistema;
    }

    
    public int getIdSistema() {
        return idSistema;
    }

    public void setIdSistema(int idSistema) {
        this.idSistema = idSistema;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigoCMDB() {
        return codigoCMDB;
    }

    public void setCodigoCMDB(String codigoCMDB) {
        this.codigoCMDB = codigoCMDB;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getUsuarioEstandar() {
        return usuarioEstandar;
    }

    public void setUsuarioEstandar(int usuarioEstandar) {
        this.usuarioEstandar = usuarioEstandar;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getTipoPass() {
        return tipoPass;
    }

    public void setTipoPass(int tipoPass) {
        this.tipoPass = tipoPass;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public String getURLSistema() {
        return URLSistema;
    }

    public void setURLSistema(String URLSistema) {
        this.URLSistema = URLSistema;
    }

    
}
