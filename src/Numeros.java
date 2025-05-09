import java.util.Scanner;
import java.util.Arrays;

public class Numeros{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        //Ingresar 5 datos enteros entre 10 y 100
        int [] arrays = new int[5];
        System.out.println("Ingrese 5 números enteros entre el 10 y el 100: ");
        for (int i = 0; i < arrays.length; i++){
            arrays[i] = scanner.nextInt();
            if (arrays[i] < 10 || arrays[i] > 100){
                System.out.println("Número no permitido, intente nuevamente.");
                i--; // Decrementar el índice para volver a pedir el número
            }
        }
        System.out.println("Los numeros ingresados son: ");
        System.out.println(Arrays.toString(arrays));
        //Mostrar el menu
        int opcion = 0;
        while (opcion != 6){
            System.out.println("Gracias por ingresar los números. ¿Qué desea hacer ahora?");
            System.out.println("1. Buscar la posición del número ingresado");
            System.out.println("2. Mostrar el mayor y menor número ingresado");
            System.out.println("3. Mostrar los multiplos de un número X");
            System.out.println("4. Sumar todos los números ingresados");
            System.out.println("5. Creemos algo nuevo!");
            System.out.println("6. Salir");
            opcion = scanner.nextInt();


        switch (opcion){
            case 1:
                System.out.println("Ingrese el número que desea buscar: ");
                int numeroBuscar = scanner.nextInt();
                for (int i = 0; i < arrays.length; i++){
                    if (arrays[i] == numeroBuscar){
                    System.out.println("El número " + numeroBuscar + " se encuentra en la posición " + i);
                    } else {
                    System.out.println("El número " + numeroBuscar + " no se encuentra en el arreglo.");
                    }
                    break;
                }
                //Pendiente que me vuelva a preguntar si quiereo otra opción

            case 2:
                int mayor = arrays[0];
                int menor = arrays[0];
                for (int i = 1; i < arrays.length; i++){
                    if (arrays[i] > mayor){
                        mayor = arrays[i];
                    }
                    if (arrays[i] < menor){
                        menor = arrays[i];
                    }
                }
                System.out.println("El número mayor es: " + mayor);
                System.out.println("El número menor es: " + menor);
                break;
                //Pendiente que me vuelva a preguntar si quiereo otra opción

            case 3:
                System.out.println("Ingrese un número cualquiera para mostrar sus multiplos: )");
                int numeroX = scanner.nextInt();
                for (int i = 0; i < arrays.length; i++){
                    if (arrays[i] % numeroX == 0){
                        System.out.println("El numero " + numeroX + " es multiplo de " + arrays[i]);
                    } else {
                        System.out.println("El numero " + numeroX + " no es multiplo de ningún valor del arreglo");
                    }
                }
                break;

                    //Pendiente que me vuelva a preguntar si quiereo otra opción

            case 4:
                int resultado = arrays[0]+arrays[1]+arrays[2]+arrays[3]+arrays[4];
                System.out.println("La suma de todos los valores del arreglo es: " + resultado);
                break;
                //Pendiente que me vuelva a preguntar si quiereo otra opción

            case  5:
                //calcular el promedio de todos los arreglos
                int suma = arrays[0]+arrays[1]+arrays[2]+arrays[3]+arrays[4];
                int promedio = suma / arrays.length;
                System.out.println("El promedio de los números ingresados es: " + promedio);
                //crear un nuevo arreglo con los valores superiores del promedio
                int [] promedioArreglo = new int [promedio];
                //mostrar estos nuevos valores y cuantos son
                System.out.println("Los numeros mayores al promedio son: " + Arrays.toString(promedioArreglo));
                System.out.println("La cantidad de estos números son: " + promedioArreglo.length);
                //si no hay numeros mayores al promedio mostrar mensaje
                if (promedioArreglo.length == 0){
                    System.out.println("No hay números mayores al promedio.");
                }
                break;
                //Pendiente que me vuelva a preguntar si quiereo otra opción

            case 6:
                System.out.println("Eso es todo amigos \uD83E\uDEF6");
                break;
            }
        }
    }
}
