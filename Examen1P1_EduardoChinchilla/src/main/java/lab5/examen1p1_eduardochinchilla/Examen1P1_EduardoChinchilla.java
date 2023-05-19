package lab5.examen1p1_eduardochinchilla;

import java.util.Scanner;

public class Examen1P1_EduardoChinchilla {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion = 0;

        while (opcion != 3) {

            System.out.println("Menu");
            System.out.println("1. Sumador Binario");
            System.out.println("2. Estrella de David");
            System.out.println("3. Salir");

            opcion = read.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el primer numero: ");
                    String binario = read.next();
                    System.out.println("Ingrese el segundo numero: ");
                    String binario2 = read.next();

                    boolean dif = true;
                    boolean dif1 = true;

                    if (binario.length() != binario2.length()) {
                        System.out.println("Error, los numeros deben tener la misma cantidad de bits");
                    }//validar el length de las dos cadenas

                    for (int i = 0; i < binario.length(); i++) {
                        char chara = binario.charAt(i);
                        if (chara != 48 && chara != 49) {
                            dif = false;
                            break;
                        }
                    }// recorrer la cadena y validar si son 1 o 0, luego si esto es cierto se le asigna true a una variable boolean
                    for (int i = 0; i < binario2.length(); i++) {
                        char chara2 = binario2.charAt(i);
                        if (chara2 != 48 && chara2 != 49) {
                            dif1 = false;
                            break;
                        }
                    }// lo mismo que el for pasado solo que para la segunda cadena
                    if (dif != true) {
                        System.out.println("Primera cadena mala");
                    } else if (dif1 != true) {
                        System.out.println("Segunda cadena mala");
                    }// valida con booleans si las dos cadenas solo contienen 1 y 0, si no imprime cual contiene un digito malo

                    String regla1 = "0+0=0";
                    String regla2 = "0+1=1";
                    String regla3 = "1+1=0";
                    String regla4 = "1+1+1=1";
                    String sfinal = "";
                    String sfinal2 = "";
                    String suma = "";

                    for (int i = binario.length() - 1; i >= 0; i--) {
                        char chara_num = binario.charAt(i);
                        sfinal += chara_num;

                    }
                    for (int j = binario2.length() - 1; j >= 0; j--) {
                        char chara_num2 = binario2.charAt(j);
                        sfinal2 += chara_num2;

                    }

                    System.out.println(sfinal);
                    System.out.println(sfinal2);

                    break;
                }
                case 2: {
                    System.out.println("Ingrese el tamaño: ");
                    int tam = read.nextInt();

                    while (tam % 2 != 1 || tam < 9) {
                        System.out.println("Error, Solo numeros impares y mayores a 9: ");
                        System.out.println("Ingrese el tamaño: ");
                        tam = read.nextInt();
                    }

                    for (int i = 0; i < tam; i++) {
                        for (int j = 0; j < tam; j++) {

                            if (j == tam / 2 - 1 && i == 0 || i == tam - 2) {
                                System.out.print("+");
                            } else if (i == 1) {
                                System.out.print("*");
                            } else if (i == 2 || i == 4 || i == 6 || i == 8) {
                                System.out.print(" ");
                            } else {
                                System.out.print("_");
                            }

//                             if(i==tam-3 || i==tam-5 || i==tam-7 ||i==tam-9){
//                                System.out.print(" ");
//                            }else if(i==3 && (j==3||j==7)){
//                                System.out.print(" ");
//                            }else if (i==3 && (j==1 || j ==5)){
//                                System.out.print("&");
//                            }
                        }
                        System.out.println(" ");
                    }

                    break;
                }
                case 3: {
                    System.out.println("Ha salido");
                    break;
                }

                default:
                    System.out.println("error vuelva a ingresar: ");
            }
        }
    }
}
