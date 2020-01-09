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
public class Principal {
    public static void main(String[] args) {
        Huffman h=new Huffman();
        System.out.println(h.contarLetras("Rosa Garcia JarA", 'a'));
    }
}
