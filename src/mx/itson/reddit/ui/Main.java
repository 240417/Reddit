/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.reddit.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.itson.reddit.entidades.*;

/**
 *
 * @author medin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        try{
        Post post = new Post();
        Usuario usuario = new Usuario();
        Comunidad comunidad = new Comunidad();
        
        SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
        
        usuario.setNombre("lilith67354k24");
        usuario.setPais("Mexico");
        usuario.setPassword("sdfghjkuj23");
        usuario.setKarma(34);
        usuario.setCorreo("lilith.martinez987654@gmail.com");
        
        comunidad.setNombre("lolas");
        
        Date fecha = sdf.parse("20-03-2003");
        post.setTitulo("Nuevo videojuego gratis");
        post.setContenido("bots 1");
        post.setUsuario(usuario);
        post.setFecha(fecha);
        post.setPuntos(3);
        post.setComunidad(comunidad);
        
       List<Comentario> comentarios = new ArrayList<>();
       Usuario usuario0 = new Usuario();
       Comentario comentario0 = new Comentario();
       usuario0.setNombre("pepe7890");
       comentario0.setUsuario(usuario0);
       Date fecha0 = sdf.parse("07-12-2003");
       comentario0.setFecha(fecha0);
       comentario0.setContenido("¿Cusndo es el lazamiento del juego?");
       comentario0.setPuntos(2);
       comentarios.add(comentario0);
       
       Usuario usuario1 = new Usuario();
       Comentario comentario1 = new Comentario();
       usuario1.setNombre("pepe7890");
       comentario1.setUsuario(usuario1);
       Date fecha1 = sdf.parse("07-12-2003");
       comentario1.setFecha(fecha1);
       comentario1.setContenido("¿Cusndo es el lazamiento del juego?");
       comentario1.setPuntos(2);
       comentarios.add(comentario1);
       
       Comentario comentario2 = new Comentario();
       Usuario usuario2 = new Usuario();
       usuario2.setNombre("Sahara45");
       comentario2.setUsuario(usuario2);
       Date fecha2 = sdf.parse("01-01-2004");
       comentario2.setFecha(fecha2);
       comentario2.setContenido("No se ve interesante");
       comentario2.setPuntos(1);
       comentarios.add(comentario2);
       
       Comentario comentario3 = new Comentario();
       Usuario usuario3 = new Usuario();
       usuario3.setNombre("coco34566");
       comentario3.setUsuario(usuario3);
       Date fecha3 = sdf.parse("22-05-2004");
       comentario3.setFecha(fecha3);
       comentario3.setContenido("Parece que no tendra mucha historia");
       comentario3.setPuntos(0);
       comentarios.add(comentario3);
       
       post.setComentario(comentarios);
       
       System.out.println("***REDDIT***");
        System.out.println("Subido por: "+post.getUsuario().getNombre());
        System.out.println(post.getFecha());
        System.out.println(post.getComunidad().getNombre());
        System.out.println(post.getTitulo());
        System.out.println(post.getContenido());
        System.out.println("puntos: "+post.getPuntos());
        
        System.out.println();
                
        System.out.println("---COMENTARIOS---");
        for(Comentario m : post.getComentarios()){
            System.out.println("-"+m.getUsuario().getNombre());
            System.out.println("-"+m.getFecha());
            System.out.println("-"+m.getContenido());
            System.out.println("puntos: "+m.getPuntos());
        }
        
        System.out.println();//----------------------------------------------------------------------------------------------------
        
        
        Post post2 = new Post();
        Usuario usuario4 = new Usuario();
        Comunidad comunidad2 = new Comunidad();
                
        usuario4.setNombre("lilith67354k24");
        usuario4.setPais("Mexico");
        usuario4.setPassword("sdfghjkuj23");
        usuario4.setKarma(34);
        usuario4.setCorreo("lilith.martinez987654@gmail.com");
        
        comunidad2.setNombre("lolas");
        fecha = sdf.parse("20-03-2003");
        post2.setTitulo("Nuevo videojuego gratis");
        post2.setContenido("bots 2");
        post2.setUsuario(usuario);
        post2.setFecha(fecha);
        post2.setPuntos(3);
        post2.setComunidad(comunidad2);
        
       List<Comentario> comentarios2 = new ArrayList<>();
       Usuario usuario5 = new Usuario();
       Comentario comentario4 = new Comentario();
       usuario5.setNombre("pepe7890");
       comentario4.setUsuario(usuario1);
       Date fecha4 = sdf.parse("07-12-2003");
       comentario4.setFecha(fecha1);
       comentario4.setContenido("¿Cusndo es el lazamiento del juego?");
       comentario4.setPuntos(4);
       comentarios.add(comentario4);
       
       Comentario comentario5 = new Comentario();
       Usuario usuario6 = new Usuario();
       usuario6.setNombre("Sahara45");
       comentario5.setUsuario(usuario2);
       Date fecha5 = sdf.parse("01-01-2004");
       comentario5.setFecha(fecha5);
       comentario5.setContenido("No se ve interesante");
       comentario5.setPuntos(1);
       comentarios2.add(comentario5);
       
       Comentario comentario6 = new Comentario();
       Usuario usuario7 = new Usuario();
       usuario7.setNombre("coco34566");
       comentario6.setUsuario(usuario3);
       Date fecha6 = sdf.parse("22-05-2004");
       comentario6.setFecha(fecha3);
       comentario6.setContenido("Parece que no tendra mucha historia");
       comentario6.setPuntos(0);
       comentarios2.add(comentario6);
       
       Comentario comentario7 = new Comentario();
       Usuario usuario8 = new Usuario();
       usuario8.setNombre("coco34566");
       comentario7.setUsuario(usuario3);
       Date fecha7 = sdf.parse("22-05-2004");
       comentario7.setFecha(fecha3);
       comentario7.setContenido("Parece que no tendra mucha historia");
       comentario7.setPuntos(0);
       comentarios2.add(comentario7);
       
       post2.setComentario(comentarios2);
       
       System.out.println("***REDDIT***");
        System.out.println("Subido por: "+post2.getUsuario().getNombre());
        System.out.println(post2.getFecha());
        System.out.println(post2.getComunidad().getNombre());
        System.out.println(post2.getTitulo());
        System.out.println(post2.getContenido());
        System.out.println("puntos: "+post2.getPuntos());
        
        System.out.println("---COMENTARIOS---");
        for(Comentario m : post2.getComentarios()){
            System.out.println("-"+m.getUsuario().getNombre());
            System.out.println("-"+m.getFecha());
            System.out.println("-"+m.getContenido());
            System.out.println("puntos: "+m.getPuntos());
        }
        
        System.out.println();//-------------------------------------------------------------------------------------------------------
        
        Post post3 = new Post();

        fecha = sdf.parse("20-04-2003");
        post3.setTitulo("Nuevo videojuego gratis");
        post3.setContenido("bots 3");
        post3.setUsuario(usuario);
        post3.setFecha(fecha);
        post3.setPuntos(5);
        post3.setComunidad(comunidad2);
       List<Comentario> comentarios3 = new ArrayList<>();
       Usuario usuario9 = new Usuario();
       Comentario comentario8 = new Comentario();
       usuario9.setNombre("pepe7890");
       comentario8.setUsuario(usuario1);
       Date fecha8 = sdf.parse("07-12-2003");
       comentario8.setFecha(fecha8);
       comentario8.setContenido("¿Cusndo es el lazamiento del juego?");
       comentario8.setPuntos(2);
       comentarios3.add(comentario8);
       
       Comentario comentario9 = new Comentario();
       Usuario usuario10 = new Usuario();
       usuario10.setNombre("Sahara45");
       comentario9.setUsuario(usuario2);
       Date fecha9 = sdf.parse("01-04-2004");
       comentario9.setFecha(fecha9);
       comentario9.setContenido("No se ve interesante");
       comentario9.setPuntos(1);
       comentarios3.add(comentario9);
       
       Comentario comentario10 = new Comentario();
       Usuario usuario11 = new Usuario();
       usuario11.setNombre("coco34566");
       comentario10.setUsuario(usuario3);
       Date fecha10 = sdf.parse("22-08-2004");
       comentario10.setFecha(fecha3);
       comentario10.setContenido("Parece que no tendra mucha historia");
       comentario10.setPuntos(0);
       comentarios3.add(comentario10);
       
       post3.setComentario(comentarios3);
       
       System.out.println("***REDDIT***");
        System.out.println("Subido por: "+post3.getUsuario().getNombre());
        System.out.println(post3.getFecha());
        System.out.println(post3.getComunidad().getNombre());
        System.out.println(post3.getTitulo());
        System.out.println(post3.getContenido());
        System.out.println("puntos: "+post3.getPuntos());
        
        System.out.println();
        
        System.out.println("---COMENTARIOS---");
        for(Comentario m : post3.getComentarios()){
            System.out.println("-"+m.getUsuario().getNombre());
            System.out.println("-"+m.getFecha());
            System.out.println("-"+m.getContenido());
            System.out.println("puntos: "+m.getPuntos());
        }
        }catch(Exception e){
            System.err.println(e);
    }
        }
    
}
