/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import static biblioteca.GatoCorregido.hayEspacio;
import static biblioteca.GatoCorregido.hayGanador;
import static biblioteca.GatoCorregido.imprimirGato;
import static biblioteca.GatoCorregido.inicializarTablero;
import static biblioteca.GatoCorregido.registrarJugada;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 *
 * @author famil
 */
public class ClaseBiblioteca {

    private int tamaño;
    private int fila;
    private int columna;

    private int M = 1;
    private int min = -1;
    private int max = -1;
    
    private char[][] gato = new char[3][3];

    public int[] calcularModa() {

        Scanner sc = new Scanner(System.in);
        int moda = 0;
        int maxvecesrepetidas = 0;
        int[] M;
        int datos;

        System.out.println("¿Cual es el tamaño del arreglo?");
        datos = sc.nextInt();

        M = new int[datos];

        for (int i = 0; i < M.length; i++) {
            int vecesrepetido = 0;
            M[i] = sc.nextInt();

            for (int j = 0; j < M.length; j++) {
                if (M[i] == M[j]) {
                    vecesrepetido++;
                }

            }
            if (vecesrepetido > maxvecesrepetidas) {
                moda = M[i];
                maxvecesrepetidas = vecesrepetido;
            }

        }
        System.out.println("La moda es  " + moda + " Se repitio " + maxvecesrepetidas);

        return M;
    }

    public int[] elementoMayoryMenor() throws IOException {

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        System.out.println("Ingresar el tamaño deseado del arreglo: ");
        entrada = bufer.readLine();
        tamaño = Integer.parseInt(entrada);

        int[] arregloMayMe = new int[tamaño];

        //MayMe = Mayor_Y_Menor;
        for (int i = 0; i < arregloMayMe.length; i++) {
            System.out.println("Ingresar los numeros: " + (i + 1) + " : ");
            entrada = bufer.readLine();
            arregloMayMe[i] = Integer.parseInt(entrada);

        }
        int Mayor, Menor;
        Mayor = arregloMayMe[0];
        Menor = arregloMayMe[0];

        for (int i = 0; i < arregloMayMe.length; i++) {
            if (arregloMayMe[i] > Mayor) {
                Mayor = arregloMayMe[i];
            } else if (arregloMayMe[i] < Menor) {
                Menor = arregloMayMe[i];
            }
        }

        System.out.println("El elemento mayor es: " + Mayor);
        System.out.println("El elemento menor es: " + Menor);

        return arregloMayMe;
    }

    public int[] metodoInsercion() {

        Scanner entrada = new Scanner(System.in);
        int arreglo[], pos, aux = 0;
        //int nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de elementos: "));
        System.out.println("Ingrese el numero de elemntos: ");
        int nElementos = entrada.nextInt();
        arreglo = new int[nElementos];

        System.out.println("Ingrese los elementos a ordenar");

        for (int i = 0; i < nElementos; i++) {
            System.out.print((i + 1) + ". Ingrese un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        //metodo por inserción
        for (int i = 0; i < nElementos; i++) {
            pos = i;
            aux = arreglo[i];
            while ((pos > 0) && arreglo[pos - 1] > aux) {
                arreglo[pos] = arreglo[pos - 1];
                pos--;
            }
            arreglo[pos] = aux;
        }

        System.out.println("\nOrdenamiento ascendente");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }

        System.out.println("\nOrdenamiento descendetemente");
        for (int i = (nElementos - 1); i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }

        return arreglo;
    }

    public String[] ElimnarDatosDuplicados() {

        String datos[] = {"c", "4", "1", "2", "marina", "6", "7", "2", "2", "5", "5", "6", "2", "4", "2", "9", "a", "a", "b", "vannesa", "marina", "vannesa"};

        for (int a = 0; a < datos.length; a++) {

            for (int b = 0; b < datos.length - 1; b++) {

                if (a != b) {

                    if (!(datos[a] == null ? datos[b] == null : datos[a].equals(datos[b]))) {
                    } else {
                        // eliminamos datos repetidos

                        datos[a] = "";
                    }

                }

            }

        }

        // mostrar valores solo una  vez
        int n = datos.length;

        for (int i = 0; i <= n - 1; i++) {

            if (!"".equals(datos[i])) {

                System.out.println(datos[i]);

            }

        }

        return datos;
    }

    public int[][] sumarMatriz() throws IOException {

        String entrada;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingresar el tamaño de filas: ");
        entrada = bufer.readLine();
        fila = Integer.parseInt(entrada);

        System.out.println("Ingresar el valor de columnas: ");
        String entrada2 = bufer.readLine();
        columna = Integer.parseInt(entrada2);

        int[][] m1 = new int[fila][columna];

        System.out.println("Introduccion de datos: ");

        if (fila == columna) {
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    System.out.println("Escribe el valor de la casilla [" + i + "]" + "[" + j + "]: ");
                    entrada = bufer.readLine();
                    m1[i][j] = Integer.parseInt(entrada);

                }
            }
        }

        System.out.println("-----------------------------------------------------");

        System.out.println("Ingresar el tamaño de filas: ");
        entrada = bufer.readLine();
        fila = Integer.parseInt(entrada);

        System.out.println("Ingresar el valor de columnas: ");
        entrada2 = bufer.readLine();
        columna = Integer.parseInt(entrada2);

        int[][] m2 = new int[fila][columna];

        if (fila == columna) {
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    System.out.println("Escribe el valor de la casilla [" + i + "]" + "[" + j + "]: ");
                    entrada = bufer.readLine();
                    m2[i][j] = Integer.parseInt(entrada);

                }
            }
        }

        int[][] matriz1 = new int[fila][columna];
        if (fila == columna) {

            //sumar
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    matriz1[i][j] = m1[i][j] + m2[i][j];
                }
            }

            //imprimir
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    System.out.print(matriz1[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Ingresar una matriz cuadrada");
        }

        return matriz1;

    }

    public int[][] MultiplicarMatriz() throws IOException {

        String entrada;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingresar el tamaño de filas: ");
        entrada = bufer.readLine();
        fila = Integer.parseInt(entrada);

        System.out.println("Ingresar el valor de columnas: ");
        String entrada2 = bufer.readLine();
        columna = Integer.parseInt(entrada2);

        int[][] m1 = new int[fila][columna];

        System.out.println("Introduccion de datos: ");

        if (fila == columna) {
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    System.out.println("Escribe el valor de la casilla [" + i + "]" + "[" + j + "]: ");
                    entrada = bufer.readLine();
                    m1[i][j] = Integer.parseInt(entrada);

                }
            }
        }

        System.out.println("-----------------------------------------------------");

        System.out.println("Ingresar el tamaño de filas: ");
        entrada = bufer.readLine();
        fila = Integer.parseInt(entrada);

        System.out.println("Ingresar el valor de columnas: ");
        entrada2 = bufer.readLine();
        columna = Integer.parseInt(entrada2);

        int[][] m2 = new int[fila][columna];

        if (fila == columna) {
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    System.out.println("Escribe el valor de la casilla [" + i + "]" + "[" + j + "]: ");
                    entrada = bufer.readLine();
                    m2[i][j] = Integer.parseInt(entrada);

                }
            }
        }

        int[][] matriz2 = new int[m1.length][m2[0].length];
        if (m1[2].length == m2.length) {

            //multiplicacion//multiplicacion
            for (int i = 0; i < matriz2.length; i++) {
                for (int j = 0; j < matriz2[0].length; j++) {
                    for (int k = 0; k < m2.length; k++) {
                        matriz2[i][j] = matriz2[i][j] + m1[i][k] * m2[k][j];
                    }
                }
            }
            //imprimir
            for (int i = 0; i < matriz2.length; i++) {
                for (int j = 0; j < matriz2.length; j++) {
                    System.out.print(matriz2[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Ingresar  una matriz cuadrada");
        }

        return matriz2;
    }

    public int DeterminarColumna() throws IOException {

        String entrada;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresar el tamaño del arreglo: ");
        entrada = bufer.readLine();
        tamaño = Integer.parseInt(entrada);

        int[] arreglo = new int[tamaño];

        System.out.println("Introduccion de Datos: ");
        for (int i = 0; i < arreglo.length; i++) {
            entrada = bufer.readLine();
            arreglo[i] = Integer.parseInt(entrada);
        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Datos del arreglo: " + (i + 1) + " :\t " + arreglo[i]);
        }

        System.out.println("---------------------------------------------------");

        System.out.println("Empieza la matriz");
        System.out.println("Ingresar el tamaño de filas: ");
        entrada = bufer.readLine();
        fila = Integer.parseInt(entrada);

        System.out.println("Ingresar el valor de columnas: ");
        entrada = bufer.readLine();
        columna = Integer.parseInt(entrada);

        int[][] matriz3 = new int[fila][columna];

        System.out.println("Introduccion de Datos: ");

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.println("Escribe el valor de la casilla [" + i + "]" + "[" + j + "]: ");
                entrada = bufer.readLine();
                matriz3[i][j] = Integer.parseInt(entrada);
            }
        }
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.print(matriz3[i][j] + "\t");
            }
            System.out.println();
        }

        //determinar indice
        int contador;
        for (int i = 0; i < matriz3[i].length; i++) {
            contador = 0;
            for (int j = 0; j < matriz3.length; j++) {
                if (matriz3[j][i] == arreglo[j]) {
                    contador++;
                }
            }
            if (contador == arreglo.length) {
                return i;
            }
        }
        return -1;
    }

    public void matrizInversa() {
        Scanner entrada = new Scanner(System.in);
        //Declaramos variables
        double determinante, x00, x01, x02, x10, x11, x12, x20, x21, x22;
        // Declaramos nuestra matriz principal
        double[][] B = new double[3][3];
        // Matriz inversa
        double[][] C = new double[3][3];
        // Pedimos valores de la matriz
        System.out.println("Ingrese los valores de la matriz :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = entrada.nextByte();
            }
        }
        System.out.println();
        // Mostramos la matriz principal
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + B[i][j] + "|");
            }
            System.out.println();
        }
        //Hallamos determinante de nuestra matriz principal
        determinante = (B[0][0] * ((B[1][1] * B[2][2]) - (B[1][2] * B[2][1]))) - (B[0][1] * ((B[1][0] * B[2][2]) - (B[2][0] * B[1][2]))) + (B[0][2] * ((B[1][0] * B[2][1]) - (B[2][0] * B[1][1])));
        System.out.println();
        System.out.println("Determinate:" + determinante);
        System.out.println();
        // Calculamos los valores de la matriz inversa ya dividido entre la determinante
        if (determinante != 0) {
            x00 = ((B[1][1] * B[2][2] - B[2][1] * B[1][2])) / determinante;
            x01 = (-(B[1][0] * B[2][2] - B[2][0] * B[1][2])) / determinante;
            x02 = ((B[1][0] * B[2][1] - B[2][0] * B[1][1])) / determinante;
            x10 = (-(B[0][1] * B[2][2] - B[2][1] * B[0][2])) / determinante;
            x11 = ((B[0][0] * B[2][2] - B[2][0] * B[0][2])) / determinante;
            x12 = (-(B[0][0] * B[2][1] - B[2][0] * B[0][1])) / determinante;
            x20 = ((B[0][1] * B[1][2] - B[1][1] * B[0][2])) / determinante;
            x21 = (-(B[0][0] * B[1][2] - B[1][0] * B[0][2])) / determinante;
            x22 = ((B[0][0] * B[1][1] - B[1][0] * B[0][1])) / determinante;
            // Hacemos el intercambio de que las filas pasen como columnas
            C[0][0] = x00;
            C[0][1] = x10;
            C[0][2] = x20;
            C[1][0] = x01;
            C[1][1] = x11;
            C[1][2] = x21;
            C[2][0] = x02;
            C[2][1] = x12;
            C[2][2] = x22;
            // Mostramos la matriz inversa
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("|" + C[i][j] + "|");
                }
                System.out.println();
            }
        } else {
            System.out.print("Error la matriz no tiene inversa");
        }
    }

    public void IntercambioMinimoyMaximo() throws IOException {

        int[][] matriz;
        int[][] matriz2;
        //int[][] m1;

        int R; // numero de renglones
        int C; // numero de columnas
        String PriSeg;

        if (M == 1) {
            PriSeg = "primera";
        } else {
            PriSeg = "segunda";
        }

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        System.out.println("Ingresa el numero de renglones de la " + PriSeg + " matriz:");
        entrada = bufer.readLine();
        R = Integer.parseInt(entrada);

        System.out.println("Ingresa el numero de columnas de la " + PriSeg + " matriz:");
        entrada = bufer.readLine();
        C = Integer.parseInt(entrada);

        matriz = new int[R][C];
        M = 2;

        matriz = new int[matriz.length][matriz[0].length];
        System.out.println("Introduccion de datos");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Escribe el valor para la casilla [" + i + "][" + j + "]:");
                entrada = bufer.readLine();
                matriz[i][j] = Integer.parseInt(entrada);
            }
        }

        //segunda matriz
        System.out.println("Ingresa el numero de renglones de la " + PriSeg + " matriz:");
        entrada = bufer.readLine();
        R = Integer.parseInt(entrada);

        System.out.println("Ingresa el numero de columnas de la " + PriSeg + " matriz:");
        entrada = bufer.readLine();
        C = Integer.parseInt(entrada);

        matriz2 = new int[R][C];
        M = 2;

        //matriz2 = new int [matriz2.length][matriz2[0].length];
        System.out.println("Introduccion de datos");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                System.out.println("Escribe el valor para la casilla [" + i + "][" + j + "]:");
                entrada = bufer.readLine();
                matriz2[i][j] = Integer.parseInt(entrada);
            }
        }

        //imprimir las matrices como tal
        // renlones(i) son del mismo valor
        for (int i = 0; i < matriz.length; i++) {
            // pero las columnas(j)(k) no lo tienen que ser

            // m1
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            // espacio
            System.out.print("   ");

            // m2
            for (int k = 0; k < matriz2[0].length; k++) {
                System.out.print(matriz2[i][k] + " ");
            }
            System.out.println();
        }

        //empieza el intercambio
        int R1 = 0;
        int C1 = 0;
        int R2 = 0;
        int C2 = 0;

        for (int i = 0; i < matriz.length; i++) {
            //busca minimo en a
            for (int j = 0; j < matriz[0].length; j++) {
                if (j == 0) {
                    min = matriz[i][j];
                    R1 = i;
                    C1 = j;
                } else if (min > matriz[i][j]) {
                    min = matriz[i][j];
                    R1 = i;
                    C1 = j;
                }

            }

            System.out.print("   "); //espacio entre matrices

            //busca maximo en b
            for (int k = 0; k < matriz2[0].length; k++) {
                if (k == 0) {
                    max = matriz2[i][k];
                    R2 = i;
                    C2 = k;
                } else if (max < matriz2[i][k]) {
                    max = matriz2[i][k];
                    R2 = i;
                    C2 = k;
                }
            }

            matriz[R1][C1] = max;
            matriz2[R2][C2] = min;
//            System.out.println(R1 +""+ C1 +""+ R2 +""+ C2 +" "+ max +""+ min);

            System.out.println(); //brinco de linea
        }

        //se imprime la matriz de los cambios
        // renlones(i) son del mismo valor
        for (int i = 0; i < matriz.length; i++) {
            // pero las columnas(j)(k) no lo tienen que ser

            // m1
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            // espacio
            System.out.print("   ");

            // m2
            for (int k = 0; k < matriz2[0].length; k++) {
                System.out.print(matriz2[i][k] + " ");
            }
            System.out.println();

        }
    }

    public void matrizEspiral() {

        Scanner in = new Scanner(System.in);
        System.out.print("Dimesión De La Matriz: ");
        int n = in.nextInt();

        int[][] M = new int[n + 1][n + 1];
        int x = 0;
        for (int a = 1; a <= n / 2; a++) {
            for (int i = a; i <= n - a; i++) {
                M[a][i] = x;
                x++;
            }
            for (int i = a; i <= n - a; i++) {
                M[i][n - a + 1] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {
                M[n - a + 1][i] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {
                M[i][a] = x;
                x++;
            }
        }
        if (n % 2 == 1) {
            M[n / 2 + 1][n / 2 + 1] = x;
        }

        //imprimir
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("\t" + M[i][j]);
            }
            System.out.println();
        }

    }

    public int[][] sumaColumnasyFilas() {
        Scanner sc = new Scanner(System.in);
        int [][]matriz;
        int filas, colum;
        
        System.out.println("Ingrese las filas de la matriz");
        filas=sc.nextInt();
        System.out.println("Ingrese las columnas de la matriz?");
        colum=sc.nextInt();
        matriz=new int [filas][colum];
        
        for(int i=0; i<filas; i++){
            for (int x=0; x<colum; x++){
                System.out.println("Ingrese los datos de la posición ["+i+"]["+x+"]");
                matriz[i][x]=sc.nextInt();
            }
        } 
        System.out.println();
        System.out.println("Matriz: ");
        for (int[] A1 : matriz) {
            for (int j = 0; j < A1.length; j++) {
                System.out.print(A1[j] + " ");
            }
            System.out.println();//Salto de linea
        }
        System.out.println();
        
        int [] B = new int[filas];
        int sumaFilas=0;
        for (int i = 0; i < filas; i++) {
            for (int x = 0; x < colum; x++) {
                if (x < colum) {
                    sumaFilas += matriz[i][x];
                }
            }
            B[i]=sumaFilas;
            sumaFilas = 0;
        }
        System.out.println("Suma de las Filas");
        for(int i = 0; i < B.length; i++){ 
                System.out.print(B[i] + " ");
                System.out.println();
        }
        System.out.println();
        //columnas
        int [] C = new int[colum];
        int sumaCol=0;
        for(int i=0; i<colum; i++){
            for(int x=0; x<filas; x++){
                if(x<filas){   
                    sumaCol += matriz [x][i];
                }   
            }
            C[i]=sumaCol;
            sumaCol = 0;   
        }   
        System.out.println("Suma de las Columnas");
        for(int i = 0; i < C.length; i++){ 
                System.out.print(C[i] + " ");
        }
        System.out.println();
        return matriz;
    }

    ////////////////////////////////////////////////////////////////////////////
    public void juegoGato() throws IOException {
        
        GatoCorregido gatito = new GatoCorregido();
                char jugadorActual = 'X';
                boolean terminar = false;
                inicializarTablero();
                do {
                    registrarJugada(jugadorActual);
                    imprimirGato();
                    if (hayGanador(jugadorActual)) {
                        System.out.println("Felicidades jugador " + jugadorActual);
                        System.out.println("Has ganado el juego");
                        terminar = true;
                    } else {
                        if (!hayEspacio()) {
                            // Ya no hay casillas disponibles, el juego se empató
                            System.out.println("El juego termina en empate");
                            terminar = true;
                        } else if (jugadorActual == 'X') {
                            jugadorActual = 'O';
                        } else {
                            jugadorActual = 'X';
                        }
                    }
                } while (!terminar);
    }

    ////////////////////////////////////////////////////////////////////////////
}
