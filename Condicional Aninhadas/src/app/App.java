package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o preço do item");
        double valor = scan.nextDouble();

        if (valor <= 10){
            System.out.println("Barato!");
        } else if(valor > 10 && valor < 15){
            System.out.println("Pedir desconto!");
        } else if(valor >=15 && valor < 17){
            System.out.println("Pesquisar mais!");
        }else{
            System.out.println("Muito caro!");
        }

        
    }
}