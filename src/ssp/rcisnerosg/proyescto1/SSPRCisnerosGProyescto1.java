/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssp.rcisnerosg.proyescto1;
import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class SSPRCisnerosGProyescto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int OPE;
        // Variable de Opcion
        double L,gal,cm,in,m,ft,km,mi,C,F,g,lb,R;
        //Variables 
        Scanner T = new Scanner (System.in);
        //Nombre del teclado 
        
        //Menu para escoger el tipo de sistema de conversion que deseas
        System.out.println("Calculadora de conversiones");
        System.out.println("1. Conversion del sistema metrico decimal a sistema ingles");
        System.out.println("2. Conversion del sistema ingles a sistema metrico decimal");
        OPE = T.nextInt();
        //Opciones de Switch
        switch (OPE){
            case 1:
                //Menu del Sistema metrico Decimal 
                System.out.println("Bienvenido al sistema metrico decimal");
                System.out.println("Selecciona que convercion deseas hacer:");
                System.out.println("1. Conversion de liquidos: Litros a Galones");
                System.out.println("2. Conversion de distancias: metros a ft, Km a milla y cm a in");
                System.out.println("3. Conversion de temperaturas: celsius a fahrenheit");
                System.out.println("4. Conversion de pesos: Gramos a Libras");
                OPE = T.nextInt();
                //Opciones de Switch del Sistema metrico decimal
                switch (OPE){
                    case 1: 
                        //Conversion de litros a Galones
                        System.out.println("Conversion de litros a galones");
                        System.out.println("Escribe los Litros:");
                        L = T.nextDouble();
                        R = L * .2641;
                        System.out.println("Los Galones son: " + R + "gal");
                        System.exit(0);
                        break;                   
                    case 2: 
                        //Conversion de distancias
                        System.out.println("Conversion de distancias");
                        System.out.println("Teclea que conversion deseas:");
                        System.out.println("1. Centimetros a Pulgada");
                        System.out.println("2. Metros a Pies");
                        System.out.println("3. Kilometros a Millas");
                        OPE = T.nextInt();   
                        //Opciones de switch para la conversion de distancias
                        switch (OPE){
                            case 1: 
                                //Conversion de Centimetros a Pulgadas 
                                System.out.println("Conversion de centimetro a Pulgada");
                                System.out.println("Escribe los centimetros");
                                cm = T.nextDouble(); 
                                R = cm * 2.54;
                                System.out.println("Las pulgadas son: " + R + "in");
                                System.exit(0);
                                break;
                            case 2: 
                                //Conversion de Metros a Pies
                                System.out.println("Conversion de metros a pies");
                                System.out.println("Escribe los metros");
                                m = T.nextDouble();
                                R = m * 3.28;
                                System.out.println("Los pies son: " + R + "ft");
                                System.exit(0);
                                break;
                            case 3: 
                                //Conversion de Kilometros a Millas
                                System.out.println("Conversion de Kilometros a Millas");
                                System.out.println("Escribe los Kilometros");
                                km = T.nextDouble();
                                R = km * .6213;
                                System.out.println("Las millas son: " + R + "mi");
                                System.exit(0);
                                break;
                            default:
                        }
                    case 3: 
                        //Conversion de Celsius a Farenheit
                        System.out.println("Conversion de Celsius a Fahrenheit");
                        System.out.println("Escribe los Celsius");
                        C = T.nextDouble();
                        R = 1.8 * C + 32;
                        System.out.println("Los Fahrenheit son: " + R + "F");
                        System.exit(0);
                        break;
                    case 4: 
                        //Conversion de Gramos a Libras
                        System.out.println("Conversion de Gramos a Libras");
                        System.out.println("Escribe los gramos");
                        g = T.nextDouble();
                        R = g * .0022;
                        System.out.println("Las libras son: " + R + "lb");
                        System.exit(0);
                        break;
                    default:
                }
            case 2:
                //Menu del Sistema Ingles
                System.out.println("Bienvenido al sistema Ingles");
                System.out.println("Selecciona que conversion deseas hacer:");
                System.out.println("1. Conversion de liquidos: Galones a Litros");
                System.out.println("2. Conversion de distancias: ft a metros, milla a km y pies a cm");
                System.out.println("3. Conversion de temperaturas: fahrenheit a Celcius");
                System.out.println("4. Conversion de pesos: Libras a Gramos");
                OPE = T.nextInt();
                switch (OPE){
                    case 1:
                        System.out.println("Conversion de Galones a Litros");
                        System.out.println("Escribe los Galones:");
                        gal = T.nextDouble();
                        R = gal * 3.7854;
                        System.out.println("Los Galones son: " + R + "gal");
                        System.exit(0);
                        break;
                    case 2: 
                        System.out.println("Conversion de distancias");
                        System.out.println("Teclea que conversion deseas:");
                        System.out.println("1. Pulgada a Centimetro");
                        System.out.println("2. Pies a Metros");
                        System.out.println("3. Millas a Kilometros");
                        OPE = T.nextInt();  
                        switch (OPE){
                            case 1: 
                                System.out.println("Conversion de Pulgada a Centimetro");
                                System.out.println("Escribe las Pulgadas:");
                                in = T.nextDouble();
                                R = in / 2.54;                              
                                System.out.println("Los cm son: " + R + "cm");
                                System.exit(0);
                                break;
                            case 2:
                                System.out.println("Conversion de Pies a Metros");
                                System.out.println("Escribe los Pies:");
                                ft = T.nextDouble();
                                R = ft * .3047;
                                System.out.println("Los metros son: " + R + "m");
                                System.exit(0);
                                break;
                            case 3:
                                System.out.println("Conversion de Millas a Kilometros");
                                System.out.println("Escribe las Millas:");
                                mi = T.nextDouble();
                                R = mi * 1.6093;
                                System.out.println("Los Kilometros son: " + R + "km");
                                System.exit(0);
                                break;  
                            default:
                        }
                    case 3:
                        System.out.println("Conversion de Fahrenheit a Celcius");
                        System.out.println("Escribe los Fahrenheit:");
                        F = T.nextDouble();
                        R = (F - 32) / 1.8;
                        System.out.println("Los Celcius son: " + R + "C");
                        System.exit(0);
                        break;
                    case 4:
                        System.out.println("Conversion de Llibras a Gramos");
                        System.out.println("Escribe las Libras");
                        lb = T.nextDouble();
                        R = lb * 453.592;
                        System.out.println("Los Gramos son: " + R + "g");
                        System.exit(0);
                        break; 
                    default:
                }
                break;
            default:
        }
    }
    
}
