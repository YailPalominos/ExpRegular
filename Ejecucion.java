
//Libreria del color
import java.awt.Color;

/**
 * @author Braulio Yail Palominos Patiño
 */

public class Ejecucion {

    // Ejemplos
    // Circulo o Linea (1,3)(4,5)-(3)-(255,0,0)
    // Triangulo (88,45)(5,53)(10,10)-(3)-(255,0,0)
    // Cuadrado (1,1)(1,3)(3,3)(3,1)-(2)-(255,255,255)
    // Rectangulo (1,3)(3,1)(1,1)(3,1)-(1)-(255,255,255)

    // Constructor
    public Ejecucion() {

    }

    // Evalua todos los datos del objeto enviado "Figuras" para reconocer la figura
    public void Evaluar(Figuras oFiguras) {

        int nVectores = 0;
        for (int x = 0; x < oFiguras.nPosX.length - 1; x++) {
            nVectores++;
            System.out
                    .println("X" + (x + 1) + " " + oFiguras.nPosX[x] + " - " + "Y" + (x + 1) + " " + oFiguras.nPosY[x]);

        }

        // Evaluaciones de numero de vectores

        switch (nVectores) {

            // Circulo o Linea
            case 2: {

                // No hay posibles errores al graficar linea o triangulo
                System.out.println("Figura: Circulo o linea");
                break;
            }

            // Triangulo
            case 3: {

                // Falta verificar que los puntos no se topen en el mismo eje
                System.out.println("Triangulo");
                break;
            }

            // Cuadrado o Rectangulo
            case 4: {

                double dDistanciaLinea1 = Distancia(oFiguras.nPosX[0], oFiguras.nPosY[0], oFiguras.nPosX[1],
                        oFiguras.nPosY[1]);
                double dDistanciaLinea2 = Distancia(oFiguras.nPosX[1], oFiguras.nPosY[1], oFiguras.nPosX[2],
                        oFiguras.nPosY[2]);
                double dDistanciaLinea3 = Distancia(oFiguras.nPosX[2], oFiguras.nPosY[2], oFiguras.nPosX[3],
                        oFiguras.nPosY[3]);
                double dDistanciaLinea4 = Distancia(oFiguras.nPosX[3], oFiguras.nPosY[3], oFiguras.nPosX[0],
                        oFiguras.nPosY[0]);

                System.out.println("Calculos --------------------------------");
                System.out.println("Distancia de la linea 1 = " + dDistanciaLinea1);
                System.out.println("Distancia de la linea 2 = " + dDistanciaLinea2);
                System.out.println("Distancia de la linea 3 = " + dDistanciaLinea3);
                System.out.println("Distancia de la linea 4 = " + dDistanciaLinea4);
                System.out.println("-----------------------------------------");

                if (dDistanciaLinea1 == dDistanciaLinea2 && dDistanciaLinea2 == dDistanciaLinea3
                        && dDistanciaLinea3 == dDistanciaLinea4 && dDistanciaLinea4 == dDistanciaLinea1) {

                    System.out.println("Cuadrado");

                } else if (dDistanciaLinea1 == dDistanciaLinea4 && dDistanciaLinea2 == dDistanciaLinea3 ||
                        dDistanciaLinea1 == dDistanciaLinea3 && dDistanciaLinea4 == dDistanciaLinea2) {

                    System.out.println("Rectangulo");

                } else {

                    System.err.println("Las cordenadas no generan correctamente ninguna figura");

                }
                break;

            }

            // A ocurrido un error
            default:
                break;

        }

        System.out.println("Vectores = " + nVectores);
        System.out.println("Grosor = " + oFiguras.nGr);
        Color cFigura = new Color(oFiguras.nR, oFiguras.nG, oFiguras.nB);
        System.out.println("Color = " + cFigura);
    }

    public double Distancia(double nX1, double nY1, double nX2, double nY2) {

        // Realizamos el calculo de las distancias entre puntos

        double nDistancia = 0d;

        nDistancia = Math.sqrt((Math.pow((nX2 - nX1), 2) + Math.pow((nY2 - nY1), 2)));
        return nDistancia;
    }
}
