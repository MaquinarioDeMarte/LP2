package figurasGeometricasPlanas;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[7];

        figuras[0] = new Circulo(5);
        figuras[1] = new Retangulo(10, 4);
        figuras[2] = new Quadrado(6);
        figuras[3] = new Triangulo(8, 5, 8, 6, 7);
        figuras[4] = new Trapezio(12, 8, 4, 7, 9);
        figuras[5] = new Paralelogramo(9, 3, 6);
        figuras[6] = new Losango(10, 6, 5);

        for (Figura figura : figuras) {
            System.out.println("Figura: " + figura.getClass().getSimpleName());
            figura.exibirParametros();
            System.out.printf("Área: %.2f\n", figura.area());
            System.out.printf("Perímetro: %.2f\n", figura.perimetro());
            System.out.println("------");
        }

        Figura maiorArea = figuraMaiorArea(figuras);
        System.out.println("Figura com maior área: " + maiorArea.getClass().getSimpleName());
        System.out.printf("Área: %.2f\n", maiorArea.area());
    }

    public static Figura figuraMaiorArea(Figura[] figuras) {
        Figura maior = figuras[0];
        for (Figura f : figuras) {
            if (f.area() > maior.area()) {
                maior = f;
            }
        }
        return maior;
    }
}

