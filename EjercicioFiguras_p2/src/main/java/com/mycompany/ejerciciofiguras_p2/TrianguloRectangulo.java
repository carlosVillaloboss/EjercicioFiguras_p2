package com.mycompany.ejerciciofiguras_p2;


public class TrianguloRectangulo {
     private double base;
    private double altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return 0.5 * base * altura;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    public String determinarTipoTriangulo() {
        if (base == altura) {
            return "Equilátero";
        } else if (base == altura / 2 || altura == base / 2) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
    
}
