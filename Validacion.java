
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Braulio Yail Palominos Patiño
 */

public class Validacion {

    // Variables de validación
    String sCadena;
    Pattern pExpRegular = Pattern.compile("[0-9]");

    // Contructor
    public Validacion() {
    }

    public void Arrancar() {

        try (// Variables locales
                Scanner sEntradaTexto = new Scanner(System.in)) {
            boolean nEjecutando = true;

            // Entramos en un bucle "white" para ejecucion del programa
            while (nEjecutando) {

                sCadena = sEntradaTexto.nextLine();

                VerificarCadena(sCadena);

                // Si colocamos fin ya sea en mayusculas o minusculas el programa finaliza
                if (sCadena.toLowerCase().contains("fin")) {
                    nEjecutando = false;
                }
            }
        }
    }

    public void VerificarCadena(String sCadena) {
        // Verifica la cadena , validando si cumple con las espesificaciones de la
        // expreción regular

        Matcher mValidacion = pExpRegular.matcher(sCadena);
        System.out.println(" Cadena a validar >> " + sCadena);

        if (mValidacion.find()) {
            System.out.println(" Cadena Valida -- Preparando");
            PrepararDatos(sCadena);
        } else {
            System.err.println(" Cadena Invalida (" + sCadena + ") -- Coloque una cadena valida");
        }

    }

    public void PrepararDatos(String sCadenaValida) {
        // Toma los datos de la cadena valida para poder dividirlos y enviarlos a
        // Ejecucion

        // Variables locales para enviar a Ejecucion
        int[] nPosX; // arreglo de Int con las cordenadas en x (0-99)
        int[] nPosY; // arreglo de Int con las cordenadas en y (0-99)

        int[] nGr; // arreglo de Int con el grosor (1-3)

        int[] nR; // arreglo de Int con el rango de color R Red(0-255)
        int[] nG; // arreglo de Int con el rango de color G Green(0-255)
        int[] nB; // arreglo de Int con el rango de color B Blue(0-255)

        // Separar la cadena con el uso de Split y convertirlo en enteros

    }

}