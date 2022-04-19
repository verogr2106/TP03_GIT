package com.utilidades;

import static java.lang.Float.NaN;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Antonio Ramos
 */
public class S2Test {
    
    public S2Test() {
    }

    @Test
    public void testMesDelAnio() {
        assertAll(  () -> assertEquals("enero", S2.mesDelAnio(1), "mes 1: enero"),
                    () -> assertEquals("febrero", S2.mesDelAnio(2), "mes 2: febrero"),
                    () -> assertEquals("marzo", S2.mesDelAnio(3), "mes 3: marzo"),
                    () -> assertEquals("abril", S2.mesDelAnio(4), "mes 4: abril"),
                    () -> assertEquals("mayo", S2.mesDelAnio(5), "mes 5: mayo"),
                    () -> assertEquals("junio", S2.mesDelAnio(6), "mes 6: junio"),
                    () -> assertEquals("julio", S2.mesDelAnio(7), "mes 7: julio"),
                    () -> assertEquals("agosto", S2.mesDelAnio(8), "mes 8: agosto"),
                    () -> assertEquals("septiembre", S2.mesDelAnio(9), "mes 9: septiembre"),
                    () -> assertEquals("octubre", S2.mesDelAnio(10), "mes 10: octubre"),
                    () -> assertEquals("noviembre", S2.mesDelAnio(11), "mes 11: noviembre"),
                    () -> assertEquals("diciembre", S2.mesDelAnio(12), "mes 12: diciembre"),
                    () -> assertEquals("valor incorrecto", S2.mesDelAnio(0), "mes 0: valor incorrecto"),
                    () -> assertEquals("valor incorrecto", S2.mesDelAnio(13), "mes 13: valor incorrecto"));
    }

    @Test
    public void testDiasDelMes() {
        assertAll(  () -> assertEquals(31, S2.diasDelMes(1), "mes 1: 31 días"),
                    () -> assertEquals(28, S2.diasDelMes(2), "mes 2: 28 días"),
                    () -> assertEquals(31, S2.diasDelMes(3), "mes 3: 31 días"),
                    () -> assertEquals(30, S2.diasDelMes(4), "mes 4: 30 días"),
                    () -> assertEquals(31, S2.diasDelMes(5), "mes 5: 31 días"),
                    () -> assertEquals(30, S2.diasDelMes(6), "mes 6: 30 días"),
                    () -> assertEquals(31, S2.diasDelMes(7), "mes 7: 31 días"),
                    () -> assertEquals(31, S2.diasDelMes(8), "mes 8: 31 días"),
                    () -> assertEquals(30, S2.diasDelMes(9), "mes 9: 30 días"),
                    () -> assertEquals(31, S2.diasDelMes(10), "mes 10: 31 días"),
                    () -> assertEquals(30, S2.diasDelMes(11), "mes 11: 30 días"),
                    () -> assertEquals(31, S2.diasDelMes(12), "mes 12: 31 días"),
                    () -> assertEquals(-1, S2.diasDelMes(0), "mes 0: -1 (error)"),
                    () -> assertEquals(-1, S2.diasDelMes(13), "mes 13: -1 (error)"));
    }

    @Test
    public void testMedia() {
        float[][] valores = {
            {},
            {5f},
            {5f, 4f, 3f},
            {-1f, -4f, -1f, -10f},
            {4.5f, -10f, -0.5f, 30f, 11.5f}};
        
        assertAll(  () -> assertEquals(NaN, S2.media(valores[0]), "No ha valores: NaN"),
                    () -> assertEquals(5f, S2.media(valores[1]), "Media 5: 5"),
                    () -> assertEquals(4f, S2.media(valores[2]), "Media 5, 4, 3: 4"),
                    () -> assertEquals(-4f, S2.media(valores[3]), "Media -1 -4, -1, -10: -4"),
                    () -> assertEquals(7.1f, S2.media(valores[4]), "Media 4.5, -10, -0.5, 30, 11.5: 7.1"));
    }

    @Test
    public void testMayor() {
        int[][] valores = {
            {},
            {5},
            {5, 4, 3},
            {-10, -4, -1, -10},
            {4, -10, 0, 30, 11}};
        
        assertAll(  () -> assertEquals(0, S2.mayor(valores[0]), "No ha valores: NaN"),
                    () -> assertEquals(5, S2.mayor(valores[1]), "Mayor 5: 5"),
                    () -> assertEquals(5, S2.mayor(valores[2]), "Mayor 5, 4, 3: 5"),
                    () -> assertEquals(-1, S2.mayor(valores[3]), "Mayor -10 -4, -1, -10: -1"),
                    () -> assertEquals(30, S2.mayor(valores[4]), "Mayor 4, -10, 0, 30, 11: 30"));
    }
    
}
