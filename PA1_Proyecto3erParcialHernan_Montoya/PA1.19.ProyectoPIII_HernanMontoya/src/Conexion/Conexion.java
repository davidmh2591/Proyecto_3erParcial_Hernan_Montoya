/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Controladores.UsuarioJpaController;
import Entidades.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;




/**
 *
 * @author Jose David
 */


public class Conexion {
    
    private Usuario usuario = new Usuario();
    private UsuarioJpaController usuarioJpaC = new UsuarioJpaController();
    
    public boolean InicioSesion(String usuario, String contrasenia){
        EntityManager em = usuarioJpaC.getEntityManager();
        boolean valor;
        try{
           Query query =em.createQuery("SELECT u.USUARIO, u.CONTRASENIA FROM usuario u WHERE u.USUARIO = 'usuario' AND u.CONTRASENIA = 'contrasenia'");
           query.setParameter("USUARIO", usuario);
           query.setParameter("CONTRASENIA", contrasenia);
           List resultado = query.getResultList();
                if (!resultado.isEmpty()){
                    valor = true;
                }else{
                    valor = false;
                
                }
        }catch(Exception e){
           valor = false;
        }
           return valor;
        
        
        
    }
 
    
  

}
