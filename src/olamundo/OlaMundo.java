/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olamundo;

/**
 *
 * @author 35196
 */
public class OlaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // executa isto
        // TODO code application logic here
        System.out.println(" Olá Prog07. Bem vindos ao mundo Java!!");
        
       int soma= 0;
       
       
       for (int i = 0;i<=100;i=i+5){
           soma = soma + i;
           System.out.print("\nacumulador: "+soma+"\t"+"contador: "+i);
       }
        
    
    }
    
} // apagar linha - CTRL + E (rase)
