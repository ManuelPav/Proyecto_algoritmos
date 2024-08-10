
import java.util.Scanner;

/**
 * esta es la clase convercion y nos permite 
 * hacer la convercion de litros a galones.
 * @author Manuel Mansilla
 * @since 02/08/2024
 */
public class convercion 
{

    /**
     * Este es el metodo principal que 
     * ejecuta los datos ingresados.
     * @param args representa un listado 
     *              de valores al momento de ejecutar las variables 
     */
    public static void main(String[] args) 
    {
    
        //  se declara la variable scan para ingresar datos 
        Scanner entrada = new Scanner (System.in);

        // ingreso de litros 
        double litros;
        litros = entrada.nextDouble();

        // comprovando que los datos no sean negativos 
        if (litros < 0)
        {
            System.out.println("Datos invalidos");
        }
        else
        {
            // ejecuta el proceso de litros a galones 
            double galones = litros / 3.785;

            System.out.println(galones);
        }
    }
}
