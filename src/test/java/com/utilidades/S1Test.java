package com.utilidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Antonio Ramos
 */
public class S1Test {

    @Test
    public void testEsMayorQueCero() {
        /*
        boolean resultado;
        // Si es negativo -> false
        resultado = S1.esMayorQueCero(-1);
        assertFalse(!resultado);
        // Si es positivo -> true
        resultado = S1.esMayorQueCero(1);
        assertTrue(!resultado);
        // Si es cero -> false
        resultado = S1.esMayorQueCero(0);
        assertFalse(resultado);
        */
        
        assertAll(  () -> assertFalse(S1.esMayorQueCero(-1), "Valor -1: falso"),
                    () -> assertFalse(S1.esMayorQueCero(0), "Valor 1: falso"),
                    () -> assertTrue(S1.esMayorQueCero(1), "Valor 1: verdadero"));
        
        
    }

    @Test
    public void testEntreCeroYDiez() {
        assertAll(  () -> assertFalse(S1.entreCeroYDiez(-7), "Valor -7: falso"),
                    () -> assertTrue(S1.entreCeroYDiez(0), "Valor 0: verdadero"),
                    () -> assertTrue(S1.entreCeroYDiez(5), "Valor 5: verdadero"),
                    () -> assertTrue(S1.entreCeroYDiez(10), "Valor 10: verdadero"),
                    () -> assertFalse(S1.entreCeroYDiez(34), "Valor 34: falso"));
    }

    @Test
    public void testNegativoPositivoCero() {
        // Con assertEquals primero ponemos el valor experado y como segundo parámetro el valor que se obtiene
        assertAll(  () -> assertEquals('n',S1.negativoPositivoCero(-3.6f), "Valor -3.6: 'n'"),
                    () -> assertEquals('c',S1.negativoPositivoCero(0f), "Valor 0: 'c'"),
                    () -> assertEquals('p',S1.negativoPositivoCero(47.8f), "Valor 47.8: 'p'"));
    }

    @Test
    public void testPagarEntrada() {
        assertAll(  () -> assertFalse(S1.pagarEntrada(5), "Edad 5: falso"),
                    () -> assertTrue(S1.pagarEntrada(18), "Edad 18: verdadero"),
                    () -> assertTrue(S1.pagarEntrada(41), "Edad 41: verdadero"),
                    () -> assertFalse(S1.pagarEntrada(65),"Edad 65: falso"),
                    () -> assertFalse(S1.pagarEntrada(65),"Edad 80: falso"),
                    () -> assertNull(S1.pagarEntrada(-1), "Edad -1: nulo"));
    }

}
