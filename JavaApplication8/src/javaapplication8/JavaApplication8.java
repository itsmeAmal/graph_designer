/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Amal
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //ax^2 +bx +c = o
        int a = 0;
        int b = 0;
        int c = 0;

        int x = 0;
        int y = 0;

        //formula 
        a = 3;
        b = -10;
        c = 8;

        for (int i = -50; i < 50; i++) {

            x = i;
            a = 3;
            b = -10;
            c = 8;
            y = a * (x * x) + b * x + c;
            System.out.println("( " + x + " , " + y + " )");
        }
    }

}
