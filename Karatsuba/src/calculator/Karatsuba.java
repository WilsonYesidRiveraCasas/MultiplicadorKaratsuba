/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import Exceptions.ExceptionValores;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author wilson
 */
public class Karatsuba {
    
    
    
    public static BigInteger preKaratsuba(String valor1, String valor2)throws ExceptionValores{
        
        int longitudValor1=valor1.length();
        int longitudValor2=valor2.length();
        
        
        if(longitudValor1== longitudValor2){//si las longitudes de los valores son iguales
            
            if(longitudValor1%2==0&&longitudValor2%2==0){//sin las longitudes corresponde a un número par
                
                 Pattern expresion = Pattern.compile("/d{2,19}");
                 Matcher m = expresion.matcher(valor1);
                 Matcher m2= expresion.matcher(valor2);
                 if (m.find()&&m2.find()){
                     try{
                        long numero1=Long.parseLong(valor1);
                        long numero2=Long.parseLong(valor2);

                        if(numero1>0&&numero2>0){

                               BigInteger v1=BigInteger.valueOf(numero1);
                               BigInteger v2=BigInteger.valueOf(numero2);
                               return karatsuba(v1,v2);

                        }else{
                            throw new ExceptionValores("Los valores no deben ser negativos");
                        }

                    }catch(NumberFormatException  e){
                        throw new ExceptionValores("Ocurrió un ERROR al parsear los valores a Numeros");
                    }
                 }else{
                     throw new ExceptionValores("Los valores deben ser numéricos y de longitud mínima 2 y máxima 19 o no deben ser negativos");
                 }
                
                 
                
            }else{
                throw new ExceptionValores("La cantidad de Dígitos debe ser un número Par");
            }
        }else{
            throw new ExceptionValores("La Longitud de los Valores No Coinciden. Deber usar valores con igual número de dígitos");
        }
        
    }//end method preKaratsuba
    
    private static BigInteger karatsuba(BigInteger u, BigInteger v) {
        
        int posiciones = Math.max(u.bitLength(), v.bitLength());
        
        if (posiciones <= 2){
            return u.multiply(v);
        }
        
        posiciones = posiciones / 2;
        
        BigInteger w = u.shiftRight(posiciones);
        BigInteger x = u.subtract(w.shiftLeft(posiciones));
        BigInteger y = v.shiftRight(posiciones);
        BigInteger z = v.subtract(y.shiftLeft(posiciones));
        
        BigInteger p = karatsuba(w, y);
        BigInteger q = karatsuba(x, z);
        BigInteger r = karatsuba(x.add(w), z.add(y));
        BigInteger z1 = r.subtract(p).subtract(q);
        
        //se unen los resultados parciales para obtener el resultado global.
        return p.shiftLeft(2 * posiciones).add(z1.shiftLeft(posiciones)).add(q);
  }//end method karatsuba
    
}
