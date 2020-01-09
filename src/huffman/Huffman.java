/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffman;

/**
 *
 * @author infie
 */
public class Huffman {

    public int contarLetras(String cadena, char caracter) {
        //Los caracteres son distinguibles entre minuscula y mayuscula
        int posicion;
        int contador = 0;

        // Ubica la posición del char.
        posicion = cadena.indexOf(caracter);

        // Cuenta las veces que posee el char.
        while (posicion != -1) {

            contador++;
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
    }
    public void
}
