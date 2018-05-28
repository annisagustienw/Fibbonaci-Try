/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor1;

import java.util.Scanner;

/**
 *
 * @author Annisa Gustien W
 */
public class Nomor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 100; i++){
            if ((( i % 3)== 0) && (( i % 5)== 0)){
                System.out.println("FizzBuzz");
            }
            else if (( i % 3)== 0){
                System.out.println("Fizz");
            }
            else if (( i % 5)== 0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
   
 
