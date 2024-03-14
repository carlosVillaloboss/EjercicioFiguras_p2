package com.mycompany.ejerciciofiguras_p2;

public class EjercicioFiguras_p2 {
     public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(6, 4);
        Cuadrado cuadrado = new Cuadrado(5);
        TrianguloRectangulo triangulo = new TrianguloRectangulo(3, 4);
   
        System.out.println("Círculo:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
        System.out.println("\nRectángulo:");
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
        System.out.println("\nCuadrado:");
        System.out.println("Área: " + cuadrado.calcularArea());
        System.out.println("Perímetro: " + cuadrado.calcularPerimetro());
        System.out.println("\nTriángulo Rectángulo:");
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Hipotenusa: " + triangulo.calcularHipotenusa());
        System.out.println("Tipo: " + triangulo.determinarTipoTriangulo());
    }
}

