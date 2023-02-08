/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.reddit.entidades;

import java.util.Date;
import java.util.List;

/**
 * El post reunira la informacion de las otras clases
 * @author medin
 */
public class Post {
    
    private Usuario usuario;
    private String titulo;
    private String contenido;
    private Date fecha;
    private int puntos;
    private List<Comentario> comentarios;
    private Comunidad comunidad;

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the puntos
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    /**
     * @return the comentario
     */
    public List<Comentario> getComentarios() {
        return comentarios;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    /**
     * @return the comunidad
     */
    public Comunidad getComunidad() {
        return comunidad;
    }

    /**
     * @param comunidad the comunidad to set
     */
    public void setComunidad(Comunidad comunidad) {
        this.comunidad = comunidad;
    }

    public void setFecha(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
