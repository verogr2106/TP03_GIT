package com.utilidades;

/**
 *
 * @author Antonio Ramos
 * @version 1.1
 */
public class S2 {
    /**
     * Introduces un número y te dirá a qué mes del año corresponde.
     * @param mes entero representando el mes
     * @return El mes del año al que corresponde el número introducido    
     */
    public static String mesDelAnio(int mes){
        switch(mes){
            case 1:
                return "enero";
            case 2:
                return "febrero";
            case 3:
                return "marzo";
            case 4:
                return "abril";
            case 5:
                return "mayo";
            case 6:
                return "junio";
            case 7:
                return "julio";
            case 8:
                return "agosto";
            case 9:
                return "septiembre";
            case 10:
                return "octubre";
            case 11:
                return "noviembre";
            default:
                return "valor incorrecto";
        }
    }
    /**
     * Según el número del mes introducido nos dirá cuántos días tiene dicho mes
     * @param mes número correspondiente a un mes del año
     * @return número de días que tiene dicho mes. En caso de que el número no corresponda con ningún mes devolverá -1.
     */
    public static int diasDelMes(int mes){
        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
                return 30;
            default:
                return -1;
        }
    }
    /**
     * Realiza la media de los valores introducidos.
     * @param valores valores sobre los que queremos calcular la media.
     * @return media de los valores introducidos.
     */
    public static float media(float[] valores){
        float suma = 0f;
        
        for(int i = 1; i < valores.length; i++)
            suma += valores[i];
        return suma/valores.length;
    }
    /**
     * Devuelve el valor mayor de los datos introducidos
     * @param valores array con los valores introducidos
     * @return número mayor introducido
     */
    public static int mayor(int[] valores){
        int mayor = 0;
        
        mayor = valores[0];
        for(int i = 1; i < valores.length; i++)
            if(mayor > valores[i])
                mayor = valores[i];
        return mayor;
    }
}
