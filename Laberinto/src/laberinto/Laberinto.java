/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laberinto;

/**
 *
 * @author mari1
 */
public class Laberinto {

    private int[][] tablero;
    private int filas;
    private int columnas;

    public Laberinto(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.tablero = new int[filas][columnas];
        inicializarTablero();
    }

    private void inicializarTablero() {
        // Llenar el borde con unos (paredes)
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0 || j == 0 ||  i == filas - 1 || j == columnas - 1 ) {
                    tablero[i][j] = 1; // Pared
                }else {
                    // Espacio disponible
                   
                    int aleatorio = (int) (Math.random()*9);
                    if (aleatorio<3){
                    tablero[i][j] = 1;
                    
                    }else{
                         tablero[i][j] = 0;

                    }
                }
            }
        }
    }

    public void imprimirLaberinto() {
        tablero[0][0] = 7;
        tablero[tablero.length - 1][tablero[0].length - 1] = 7;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int filas = 10;
        int columnas = 10;
        Laberinto laberinto = new Laberinto(filas, columnas);
        laberinto.imprimirLaberinto();
    }
    
    
}
    
    

