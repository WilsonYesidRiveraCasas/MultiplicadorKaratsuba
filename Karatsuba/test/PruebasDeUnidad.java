/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Exceptions.ExceptionValores;
import calculator.Karatsuba;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wilson
 */
public class PruebasDeUnidad {
    
    public PruebasDeUnidad() {
    }
    
    @Test
    public void casoPrueba1(){
        System.out.println("\nCaso de Prueba 1: Probar Si los Valores son String o tiene caracteres especiales");
        String valor1 = "132uy&34";
        String valor2="2345$$23";
        int resultadoEsperado = 1;
        int resultadoObtenido=0;
        String mensaje="";
        try{
            Karatsuba.preKaratsuba(valor1, valor2);
        }catch(ExceptionValores e){
            mensaje=e.getMessage();
            resultadoObtenido=1;
        }
               
        System.out.println("cifras evaluadas: "+valor1+" y "+valor2+"\nresultado: "+mensaje);
        Assert.assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void casoPrueba2(){
        System.out.println("\nCaso de Prueba 2: Probar valores de diferentes tamaños");
        String valor1 = "187451";
        String valor2="23448754";
        int resultadoEsperado = 1;
        int resultadoObtenido=0;
        String mensaje="";
        try{
            Karatsuba.preKaratsuba(valor1, valor2);
        }catch(ExceptionValores e){
            mensaje=e.getMessage();
            resultadoObtenido=1;
        }
               
        System.out.println("cifras evaluadas: "+valor1+" y "+valor2+"\nresultado: "+mensaje);
        Assert.assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void casoPrueba3(){
        System.out.println("\nCaso de Prueba 3: Números de tamaño impar");
        String valor1 = "13244";
        String valor2="23423";
        int resultadoEsperado = 1;
        int resultadoObtenido=0;
        String mensaje="";
        try{
            Karatsuba.preKaratsuba(valor1, valor2);
        }catch(ExceptionValores e){
            mensaje=e.getMessage();
            resultadoObtenido=1;
        }
               
        System.out.println("cifras evaluadas: "+valor1+" y "+valor2+"\nresultado: "+mensaje);
        Assert.assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void casoPrueba4(){
        System.out.println("\nCaso de Prueba 4: Probar Enteros Grandes");
        String valor1 = "875487548754587458745874789586";
        String valor2=  "784585698745874125469853265897";
        int resultadoEsperado = 1;
        int resultadoObtenido=0;
        String mensaje="";
        try{
            Karatsuba.preKaratsuba(valor1, valor2);
        }catch(ExceptionValores e){
            mensaje=e.getMessage();
            resultadoObtenido=1;
        }
               
        System.out.println("cifras evaluadas: "+valor1+" y "+valor2+"\nresultado: "+mensaje);
        Assert.assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
    
}
