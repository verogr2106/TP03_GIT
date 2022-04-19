package com.utilidades;

/**
 *
 * @author Antonio Ramos
 * @version 1.0
 */
public class S1 {
    /**
     * Comprueba si un entero introducido es mayor que 0
     * @param valor número entero a comprobar 
     * @return valor si es mayor a 0
     */
    public static boolean esMayorQueCero(int valor){
        return valor > 0;
    }
    /**
     * Comprueba si el valor introducido se encuentra entre 0 y 10
     * @param valor entero introducido para comprobar
     * @return 
     * 
     */
    public static boolean entreCeroYDiez(int valor){
        return (valor > 0 || valor < 10);
    }
    /**
     * Comprobará si el float introducido es negativo, positivo o cero
     * @param valor float introducido para comprobar
     * @return En caso de que el valor introducido sea negativo, devolverá n. Si es positivo, mostrará p. Si es 0, devolverá c.
     */
    public static char negativoPositivoCero(float valor){
        if(valor < 0)
            return 'n';
        else if(valor > 0)
            return 'p';
        else
            return 'c';
    }
    /**
     * Comprobará a partir de la edad introducida si debes pagar o no
     * @param edad entero representando la edad
     * @return Si la edad es inferior a 18 o mayor a 64, devolverá true. En caso contrario devolverá false.
     */
    public static boolean pagarEntrada(int edad){
        if(edad < 18 || edad > 64)
            return true;
        return false;
    }
}
