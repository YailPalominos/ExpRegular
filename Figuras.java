public class Figuras {

    /**
     * @author Braulio Yail Palominos Patiño
     */

    int[] nPosX; // arreglo de Int con las cordenadas en x (0-99)
    int[] nPosY; // arreglo de Int con las cordenadas en y (0-99)

    int nGr; // numero Int con el grosor (1-3)

    int nR; // Int Int con el rango de color R Red(0-255)
    int nG; // Int de Int con el rango de color G Green(0-255)
    int nB; // Int de Int con el rango de color B Blue(0-255)

    public Figuras() {

        // Inicializamos todos las variables
        nPosX = new int[1];
        nPosY = new int[1];
        nGr = 1;
        nR = 0;
        nG = 0;
        nB = 0;

    }
}
