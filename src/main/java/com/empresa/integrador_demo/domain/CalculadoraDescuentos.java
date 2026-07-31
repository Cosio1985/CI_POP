package com.empresa.integrador_demo.domain;

public class CalculadoraDescuentos {

    public int calcularDescuento(int total, int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }

        if (total <= 0) {
            throw new IllegalArgumentException("El total debe ser mayor a cero");
        }

        if (edad >= 65) {
            return (int) Math.round(total * 0.20);
        }

        if (edad >= 18) {
            return (int) Math.round(total * 0.10);
        }

        return 0;
    }
}
