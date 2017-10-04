
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sCanner = new Scanner(System.in);
        System.out.println("Determina el tamaño del arreglo: ");
        int TAMM_ARRE = sCanner.nextInt();
        //SE CREA UN ARREGLO CON EL TAMAÑO INGRESADO POR EL USUARIO
        int ArreBuscar[] = new int[TAMM_ARRE];

        // EL ARREGLO SE LLENA CON VALORES INGRESADOS POR EL USUARIO
        for (int i = 0; i < TAMM_ARRE; i++) {
            System.out.println("Llena los valores del arreglo [" + (i + 1) + "]");
            ArreBuscar[i] = sCanner.nextInt();
        }
        //SE IMPRIME EL ARREGLO CON UN FOR EACH
        for (int i : ArreBuscar) {
            System.out.println("Arreglo " + i);
        }
        // iUbic PARA GUARDAR LA UBICACION DEL VALOR
        int iUbic = 0;
        System.out.println("¿Que valor quieres encontrar? ");
        // iVal ES EL VALOR QUE EL USUARIO INGRESA PARA BUSCARLO
        int iVal = sCanner.nextInt();

        for (int i = 0; i < TAMM_ARRE; i++) {
            // SI EL VALOR QUE ESTA EN EL ARREGLO ES IGUAL A iVal SE GUARDA LA UBICACIÓN EN iUbic
            if (ArreBuscar[i] == iVal) {
                iUbic = i;
                //SE IMPRIME DONDE SE UBICA
                System.out.println("Se ubica este valor en la posicion: " + i);

            } else {
                // SE IMPRIME DONDE NO SE UBICA
                System.out.println("No se ha encontrado en la posicion: " + i);
            }
        }

    }

}
