package com.bardo.spring;
import org.springframework.context.ApplicationContext;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bardo.beans.*;
/**
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Por acá va el mambo de hello world!" );
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/bardo/xml/beans.xml");
        
        Mundo m = (Mundo) appContext.getBean("mundo");
      //Pais pais = (Pais) appContext.getBean("pais");
        System.out.println(m.getSaludo());
        System.out.println("Esto es del mundo");
        
        Persona per = (Persona) appContext.getBean("persona");
        
        System.out.println(per.getId()+ " / " +per.getNombre()+ " / " +per.getApodo()+ " / " + per.getPais().getNombre()+ " / " + per.getPais().getCiudad().getNombre());
        
        
        ((ConfigurableApplicationContext)appContext).close();
    }
}
