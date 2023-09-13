package pinkod;

import java.util.Scanner;

public class Pinkod {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        pinFal();
        bekerPIN();
    }

    private static int ujPIN() {
        System.out.print("Új PIN: ");
        int PIN = sc.nextInt();
        while(Integer.toString(PIN).length() > 6 || Integer.toString(PIN).length() < 4){
            System.out.println("Minimum 4 maximum 6 számjegy");
            System.out.print("Új PIN: ");
            PIN = sc.nextInt();
        }
        System.out.println("Pin elmentve");
        return PIN;
    }

    private static void bekerPIN() {
        int PIN = ujPIN();
        int i = 1;
        System.out.printf("Adja meg a pinkódját(%d/3): ", i);
        int joPIN = sc.nextInt();
        
        while(joPIN != PIN && i < 3){
            i++;
            System.out.println("Hibás pin");
            System.out.printf("Adja meg a pinkódját(%d/3): ", i);
            joPIN = sc.nextInt(); 
        }
            System.out.println("Sikeres belépés");
    }

    private static void pinFal(){
        
        int[] lista = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i=0;i<lista.length;i++){
            if(i%3==0){
                System.out.println("");
            }
            System.out.print(lista[i] + " ");
        }
        
        System.out.println("");
        
    }
    
    
}
