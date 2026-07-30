package com.empresa.integrador_demo.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDescuentosTest {

    private final CalculadoraDescuentos calculadora = new CalculadoraDescuentos();

    @Test
    void debeAplicarDescuentoDeAdultosMayores() {
        int descuento = calculadora.calcularDescuento(100, 70);

        assertEquals(20, descuento);
    }

    @Test
    void debeAplicarDescuentoDeAdultos() {
        int descuento = calculadora.calcularDescuento(100, 25);

        assertEquals(10, descuento);
    }

    @Test
    void noDebeAplicarDescuentoAMenores() {
        int descuento = calculadora.calcularDescuento(100, 15);

        assertEquals(0, descuento);
    }

    @Test
    void debeRechazarEdadNegativa() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> calculadora.calcularDescuento(100, -1));

        assertEquals("La edad no puede ser negativa", exception.getMessage());
    }

    @Test
    void debeRechazarTotalInvalido() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> calculadora.calcularDescuento(0, 25));

        assertEquals("El total debe ser mayor a cero", exception.getMessage());
    }
}
