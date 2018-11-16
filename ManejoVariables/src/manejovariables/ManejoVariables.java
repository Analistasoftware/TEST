/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejovariables;

/**
 *
 * @author jcarl
 */
public class ManejoVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //BOOLEAN
        boolean boll=true;
        System.out.println(boll);
        
        
        //byte
        byte b1=10;
        byte b2 = 0xa;
        
        System.out.println(b1);
        System.out.println(b2);
        
        //SHORT
        short s1=2;
         System.out.println(s1);
         
         //CHAR
         char ch1= 65;
         char ch2='A';
         System.out.println(ch1);
         System.out.println(ch2);
         
         
         //ENTERA
         int decimal=100;
         int octal= 0144;
         int hexa= 0x64;
         
          System.out.println(decimal);
         System.out.println(octal);
         System.out.println(hexa);
         
         //long
         long long1=10;
         long long2= 20L;
             System.out.println(long1);
         System.out.println(long2);
         
         
         
         //String
         String nombre="Rody";
          String Apellido="Rody";
         //System.out.println("El nombre es:\t"+nombre+"-"+Apellido);
         
         if ((!nombre.equals(Apellido))&& (Apellido.isEmpty())) {
            System.out.println("paso por aca");
             
                 Apellido="Julio";
                 System.out.println("Hola"+Apellido);
             
        }
    }
    
}
